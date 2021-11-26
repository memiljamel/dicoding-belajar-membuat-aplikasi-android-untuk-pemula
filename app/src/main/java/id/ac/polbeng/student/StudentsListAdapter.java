package id.ac.polbeng.student;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.ac.polbeng.student.databinding.ItemListStudentsBinding;

public class StudentsListAdapter extends RecyclerView.Adapter<StudentsListAdapter.ListViewHolder> {
    private final ArrayList<Student> studentsList;
    private OnItemClickCallback onItemClickCallback;

    public StudentsListAdapter(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListStudentsBinding binding = ItemListStudentsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Student student = studentsList.get(position);

        holder.binding.tvName.setText(student.getName());
        holder.binding.tvNim.setText(student.getNim());

        Glide.with(holder.itemView.getContext())
            .load(student.getPhoto())
            .apply(new RequestOptions().override(55, 55))
            .into(holder.binding.tvPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(studentsList.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {
        private ItemListStudentsBinding binding;

        public ListViewHolder(@NonNull ItemListStudentsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Student student);
    }
}
