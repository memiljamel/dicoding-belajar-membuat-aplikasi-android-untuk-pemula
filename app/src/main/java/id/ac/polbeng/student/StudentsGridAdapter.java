package id.ac.polbeng.student;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.ac.polbeng.student.databinding.ItemGridStudentsBinding;

public class StudentsGridAdapter extends RecyclerView.Adapter<StudentsGridAdapter.GridViewHolder> {
    private final ArrayList<Student> studentsList;
    private OnItemClickCallback onItemClickCallback;

    public StudentsGridAdapter(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemGridStudentsBinding binding = ItemGridStudentsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new GridViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Student student = studentsList.get(position);

        Glide.with(holder.itemView.getContext())
            .load(student.getPhoto())
            .apply(new RequestOptions().override(350, 250))
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

    public class GridViewHolder extends RecyclerView.ViewHolder {
        private ItemGridStudentsBinding binding;

        public GridViewHolder(@NonNull ItemGridStudentsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Student student);
    }
}
