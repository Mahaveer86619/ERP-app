package com.example.erp.Fragment;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.erp.databinding.ActivityCanteenFragmentBinding;

public class Canteen_fragment extends Fragment {

    public Canteen_fragment(){

    }
    ActivityCanteenFragmentBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = ActivityCanteenFragmentBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}