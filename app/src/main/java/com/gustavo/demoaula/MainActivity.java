package com.gustavo.demoaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_shared_pref).setOnClickListener(click -> {
            Intent it = new Intent(this, SharedPrefs.class);
            startActivity(it);
        });

        findViewById(R.id.btn_sqlite).setOnClickListener(click -> {
            Intent it = new Intent(this, Sqlite.class);
            startActivity(it);
        });
    }
}