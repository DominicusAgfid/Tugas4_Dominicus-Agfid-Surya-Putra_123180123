package com.example.daftaranime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private TextView tvName,tvDetail,tvGenre ;
    private ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.tv_name);
        ivPhoto = findViewById(R.id.iv_photo);
        tvDetail = findViewById(R.id.tv_detail);
        tvGenre = findViewById(R.id.tv_genre);

        tvName.setText(getIntent().getStringExtra("name"));
        tvDetail.setText(getIntent().getStringExtra("detail"));
        tvGenre.setText(getIntent().getStringExtra("genre"));
        int iPhoto = getIntent().getIntExtra("photo",0);

        Glide.with(this).load(iPhoto).into(ivPhoto);

    }
}