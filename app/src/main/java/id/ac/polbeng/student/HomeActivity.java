package id.ac.polbeng.student;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import id.ac.polbeng.student.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;
    private RecyclerView rvStudents;
    private final ArrayList<Student> studentsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.tvToolbar);

        rvStudents = findViewById(R.id.rv_students);
        rvStudents.setHasFixedSize(true);

        studentsList.addAll(ListOfStudents.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                showRecyclerList();
                return true;
            case R.id.action_grid:
                showRecyclerGrid();
                return true;
            case R.id.action_card:
                showRecyclerCard();
                return true;
            case R.id.action_profile:
                showProfileActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showRecyclerList() {
        rvStudents.setLayoutManager(new LinearLayoutManager(this));
        StudentsListAdapter studentListAdapter = new StudentsListAdapter(studentsList);
        rvStudents.setAdapter(studentListAdapter);

        studentListAdapter.setOnItemClickCallback(new StudentsListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Student student) {
                showDetailActivity(student);
            }
        });
    }

    private void showRecyclerGrid() {
        rvStudents.setLayoutManager(new GridLayoutManager(this, 2));
        StudentsGridAdapter studentsGridAdapter = new StudentsGridAdapter(studentsList);
        rvStudents.setAdapter(studentsGridAdapter);

        studentsGridAdapter.setOnItemClickCallback(new StudentsGridAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Student student) {
                showDetailActivity(student);
            }
        });
    }

    private void showRecyclerCard() {
        rvStudents.setLayoutManager(new LinearLayoutManager(this));
        StudentsCardAdapter studentsCardAdapter = new StudentsCardAdapter(studentsList);
        rvStudents.setAdapter(studentsCardAdapter);

        studentsCardAdapter.setOnItemClickCallback(new StudentsCardAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Student student) {
                showDetailActivity(student);
            }
        });
    }

    private void showDetailActivity(Student student) {
        Toast.makeText(this, "You selected " + student.getName(), Toast.LENGTH_SHORT).show();

        Intent moveDetailIntent = new Intent(HomeActivity.this, DetailActivity.class);
        moveDetailIntent.putExtra(DetailActivity.EXTRA_STUDENTS, student);
        startActivity(moveDetailIntent);
    }

    private void showProfileActivity() {
        Intent moveProfileIntent = new Intent(HomeActivity.this, ProfileActivity.class);
        startActivity(moveProfileIntent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}