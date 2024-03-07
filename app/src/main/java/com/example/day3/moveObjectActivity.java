package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class moveObjectActivity extends AppCompatActivity {

    public static final String KEY_DATA = "key_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvType = findViewById(R.id.tvType);
        TextView tvAge = findViewById(R.id.tvAge);

        marvel Marvel;
        if (Build.VERSION.SDK_INT >= 33){
            Marvel = getIntent().getParcelableExtra(KEY_DATA, marvel.class);
        }else {
            Marvel = getIntent().getParcelableExtra(KEY_DATA);
        }

        String name = Marvel.getName();
        String type = Marvel.getType();
        int age = Marvel.getAge();
        String umur = Integer.toString(age);
        tvName.setText(name);
        tvType.setText(type);
        tvAge.setText(umur);

    }
}