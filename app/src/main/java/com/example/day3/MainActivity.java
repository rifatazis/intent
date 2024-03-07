package com.example.day3;

import static com.example.day3.moveData.KEY_DATA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1){
            Intent intent = new Intent(this, moveActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btn2) {
            Intent intent = new Intent(this, moveData.class);
            intent.putExtra(KEY_DATA,"Fulan");
            startActivity(intent);
        }else if (v.getId() == R.id.btn3) {
            marvel Marvel = new marvel();
            Marvel.setName("WonderWoman");
            Marvel.setType("mummy");
            Marvel.setAge(1000);
            Intent intent = new Intent(this, moveObjectActivity.class);
            intent.putExtra(KEY_DATA,Marvel);
            startActivity(intent);
        }else if (v.getId() == R.id.btn4) {
            String phone = "085363612396";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
            startActivity(intent);
        }
    }
}