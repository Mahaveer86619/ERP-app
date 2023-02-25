package com.example.erp.Dashboard;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.erp.databinding.ActivityLandingPageBinding;

public class Landing_page extends AppCompatActivity {

    ActivityLandingPageBinding binding;

    int progress_status_attendance = 0, progress_status_fees = 0;
    TextView attendance_percent, fees_percent;

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLandingPageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }
}