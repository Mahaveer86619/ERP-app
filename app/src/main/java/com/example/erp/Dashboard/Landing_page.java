package com.example.erp.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.erp.Adapters.FragmentAdapter;
import com.example.erp.R;
import com.example.erp.databinding.ActivityLandingPageBinding;

public class Landing_page extends AppCompatActivity {

    ActivityLandingPageBinding binding;
    ProgressBar progressBar;

    int progress_status_attendance = 0, progress_status_fees = 0;
    TextView attendance_percent, fees_percent;

    Handler handler = new Handler();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLandingPageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        progressBar = (ProgressBar) findViewById(R.id.progressBar_attandance);

        binding.viewpager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        binding.tablayout.setupWithViewPager(binding.viewpager);

    }
}