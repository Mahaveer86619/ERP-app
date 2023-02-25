package com.example.erp.Fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.erp.R;
import com.example.erp.databinding.ActivityAcademicsFragmentBinding;
import com.example.erp.databinding.ActivityCanteenFragmentBinding;

public class Academics_fragment extends Fragment {

    public Academics_fragment(){
    }
    ActivityAcademicsFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = ActivityAcademicsFragmentBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}