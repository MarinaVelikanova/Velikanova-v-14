package com.example.velikanova_v_14;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity2 extends Activity implements OnClickListener {
    Button btnMap;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);
        btnMap = (Button) findViewById(R.id.button3);
        btnMap.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent map;
        map = new Intent();
        map.setAction(Intent.ACTION_VIEW);
        map.setData(Uri.parse("geo:54.289534,35.53527"));
        startActivity(map);

    }
}