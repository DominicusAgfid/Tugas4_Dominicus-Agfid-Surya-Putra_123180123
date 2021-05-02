package com.example.daftaranime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUsername;
    Button btnSimpan, btnBatal;

    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mysharedpref";
    private static final String KEY_USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        setContentView(R.layout.activity_edit);

        etUsername = findViewById(R.id.et_username);
        btnSimpan = findViewById(R.id.btn_save);
        btnBatal = findViewById(R.id.btn_batal);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String sUsername = sharedPreferences.getString(KEY_USERNAME,null);

        if (sUsername != null){
            etUsername.setText(sUsername);
        }

        btnSimpan.setOnClickListener(this);
        btnBatal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_save:
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_USERNAME,etUsername.getText().toString());
                Toast.makeText(getApplicationContext(),"Successfully Updated Profile",Toast.LENGTH_SHORT).show();
                editor.apply();
                finish();
                break;

            case R.id.btn_batal:
                finish();
                break;
        }
    }
}