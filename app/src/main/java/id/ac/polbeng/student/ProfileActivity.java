package id.ac.polbeng.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import id.ac.polbeng.student.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {
    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.tvToolbar);

        Glide.with(this)
            .load("https://i.pinimg.com/originals/ca/44/4e/ca444ed6505f7778532108490513ecbd.jpg")
            .apply(new RequestOptions().override(100, 100))
            .into(binding.tvPhoto);
        binding.tvName.setText("Emil Jamel Mahmuda");
        binding.tvEmail.setText("memiljamel@gmail.com");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}