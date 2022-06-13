package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Omid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omid);

        Button btn_omid01 = findViewById(R.id.btn_omid01);
        Button btn_omid02 = findViewById(R.id.btn_omid02);
        Button btn_omid03 = findViewById(R.id.btn_omid03);
        Button btn_omid04 = findViewById(R.id.btn_omid04);
        Button btn_omid05 = findViewById(R.id.btn_omid05);
        Button btn_omid06 = findViewById(R.id.btn_omid06);
        Button btn_omid07 = findViewById(R.id.btn_omid07);
        Button btn_omid08 = findViewById(R.id.btn_omid08);
        Button btn_omid09 = findViewById(R.id.btn_omid09);

        btn_omid01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.31.nmv"));
                startActivity(browserIntent);

            }
        });
        btn_omid02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.33.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_omid03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.39.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_omid04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.33.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_omid05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/ISA.40.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_omid06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/JER.29.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_omid07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/2CO.1.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_omid08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/1PE.1.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_omid09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/1JN.3.nmv"));
                startActivity(browserIntent);

            }
        });

    }
}