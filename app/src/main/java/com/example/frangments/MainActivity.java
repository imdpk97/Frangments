package com.example.frangments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button firstFragmentBtn, secondFragmentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();
    }

    private void initView() {
        firstFragmentBtn = findViewById(R.id.button1);
        secondFragmentBtn = findViewById(R.id.button2);
    }

    private void setListener() {
        firstFragmentBtn.setOnClickListener(this);
        secondFragmentBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                showFirstFragment();
                break;
            case R.id.button2:
                showSecondFragment();
                break;
                default:
                break;
        }
    }

    private void showFirstFragment() {
        Fragment fragment = new FragmentOne();
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
//        Bundle args = new Bundle();
//        args.putString("YourKey", "YourValue");
//        fragment.setArguments(args);
        ft.replace(R.id.fragment_place1, fragment);
        ft.commit();
    }
    private void showSecondFragment() {
        Fragment fragment = new FragmentTwo();
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_place1, fragment);
        ft.commit();
    }

}