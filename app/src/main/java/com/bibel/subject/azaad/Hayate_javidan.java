package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hayate_javidan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayate_javidan);

        Button btn_hayateJavidan01 = findViewById(R.id.btn_hayateJavidan01);
        Button btn_hayateJavidan02 = findViewById(R.id.btn_hayateJavidan02);


        btn_hayateJavidan01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.23.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_hayateJavidan02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/JHN.17.nmv"));
                startActivity(browserIntent);

            }
        });







    }
}