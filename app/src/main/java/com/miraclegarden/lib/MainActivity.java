package com.miraclegarden.lib;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.miraclegarden.lib.databinding.ActivityMainBinding;
import com.miraclegarden.library.app.MiracleGardenActivity;

public class MainActivity extends MiracleGardenActivity<ActivityMainBinding> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.text.setText("MiracleGarden");
    }
}
