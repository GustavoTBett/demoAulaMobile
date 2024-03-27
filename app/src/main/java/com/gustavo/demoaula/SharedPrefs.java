package com.gustavo.demoaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPrefs extends AppCompatActivity {

    private EditText editTextName;

    private EditText editTextEmail;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefs);

        sharedPreferences = getSharedPreferences("com.gustavo.demoaula", 0);
        editTextName = findViewById(R.id.edit_text_name);
        editTextEmail = findViewById(R.id.edit_text_email);

        findViewById(R.id.btn_salvar).setOnClickListener(click -> {
            save();
        });

        load();
    }

    public void save(){
        Toast.makeText(this, "Salvo com shared prefs", Toast.LENGTH_SHORT).show();

        sharedPreferences.edit().putString("name", editTextName.getText().toString()).commit();
        sharedPreferences.edit().putString("email", editTextEmail.getText().toString()).commit();
    }

    public void load() {
        Toast.makeText(this, "Dados carregados com shared prefs", Toast.LENGTH_SHORT).show();

        editTextName.setText(sharedPreferences.getString("name", ""));
        editTextEmail.setText(sharedPreferences.getString("email", ""));
    }
}