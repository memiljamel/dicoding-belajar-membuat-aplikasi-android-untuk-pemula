package id.ac.polbeng.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import id.ac.polbeng.student.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;
    public static final String EXTRA_STUDENTS = "extra_students";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.tvToolbar);

        Student student = getIntent().getParcelableExtra(EXTRA_STUDENTS);
        binding.tvName.setText(student.getName());
        binding.tvNim.setText(student.getNim());
        Glide.with(this)
            .load(student.getPhoto())
            .apply(new RequestOptions().override(100, 100))
            .into(binding.tvPhoto);
        binding.tvStudyProgram.setText(student.getStudyProgram());
        binding.tvMajors.setText(student.getMajors());
        binding.tvAcamedicEntryYear.setText(student.getAcademicEntryYear());
        binding.tvAddress.setText(student.getAddress());
        binding.tvPhoneNumber.setText(student.getPhoneNumber());
        binding.tvPlaceOfBirth.setText(student.getPlaceOfBirth());
        binding.tvDateOfBirth.setText(student.getDateOfBirth());
        binding.tvGender.setText(student.getGender());
        binding.tvReligion.setText(student.getReligion());
        binding.tvBloodGroup.setText(student.getBloodGroup());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}