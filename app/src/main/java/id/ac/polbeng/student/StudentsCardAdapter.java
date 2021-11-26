package id.ac.polbeng.student;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.ac.polbeng.student.databinding.ItemCardStudentsBinding;

public class StudentsCardAdapter extends RecyclerView.Adapter<StudentsCardAdapter.CardViewHolder> {
    private final ArrayList<Student> studentsList;
    private OnItemClickCallback onItemClickCallback;

    public StudentsCardAdapter(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCardStudentsBinding binding = ItemCardStudentsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CardViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Student student = studentsList.get(position);

        holder.binding.tvName.setText(student.getName());
        holder.binding.tvNim.setText(student.getNim());

        Glide.with(holder.itemView.getContext())
            .load(student.getPhoto())
            .apply(new RequestOptions().override(125, 180))
            .into(holder.binding.tvPhoto);

        holder.binding.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Favorite " + studentsList.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.binding.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Share " + studentsList.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
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

    public class CardViewHolder extends RecyclerView.ViewHolder {
        private ItemCardStudentsBinding binding;

        public CardViewHolder(@NonNull ItemCardStudentsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Student student);
    }
}
