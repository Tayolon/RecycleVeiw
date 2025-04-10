package com.example.recycleveiw;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailMakanan extends AppCompatActivity {

    TextView tvNamaMakananDetail;
    TextView tvHargaMakananDetail;
    ImageView ivAsalMakananDetail;
    TextView tvInfoMakananDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        tvHargaMakananDetail = findViewById(R.id.tvHargaMakananDetail);
        ivAsalMakananDetail = findViewById(R.id.ivAsalMakananDetail);
        tvInfoMakananDetail = findViewById(R.id.tvInfoMakanan);

        Intent intent = getIntent();
        String namaMakanan = intent.getStringExtra("namaMakanan");
        String hargaMakanan = intent.getStringExtra("hargaMakanan");
        int asalMakanan = getIntent().getIntExtra("asalMakanan", 0);
        String infoMakanan = intent.getStringExtra("infoMakanan");
        tvNamaMakananDetail.setText(namaMakanan);
        tvHargaMakananDetail.setText(hargaMakanan);
        ivAsalMakananDetail.setImageResource(asalMakanan);
        tvInfoMakananDetail.setText(infoMakanan);



    }
}