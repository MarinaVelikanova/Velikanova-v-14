package com.example.velikanova_v_14;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog);
        button = findViewById(R.id.button2);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        i=new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }


}