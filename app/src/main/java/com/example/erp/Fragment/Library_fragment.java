package com.example.erp.Fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.erp.R;
import com.example.erp.databinding.ActivityCanteenFragmentBinding;
import com.example.erp.databinding.ActivityLibraryFragmentBinding;

public class Library_fragment extends Fragment {

    public Library_fragment(){

    }
    ActivityLibraryFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = ActivityLibraryFragmentBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}