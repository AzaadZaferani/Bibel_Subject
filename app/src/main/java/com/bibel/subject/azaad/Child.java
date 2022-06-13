package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Child extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Button btn_child01 = findViewById(R.id.btn_child01);
        Button btn_child02 = findViewById(R.id.btn_child02);
        Button btn_child03 = findViewById(R.id.btn_child03);
        Button btn_child04 = findViewById(R.id.btn_child04);
        Button btn_child05 = findViewById(R.id.btn_child05);
        Button btn_child06 = findViewById(R.id.btn_child06);



        btn_child01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/EXO.20.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_child02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/LEV.19.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_child03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PRO.1.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_child04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PRO.22.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_child05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/MAT.15.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_child06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/EPH.6.NMV"));
                startActivity(browserIntent);

            }
        });


    }
}