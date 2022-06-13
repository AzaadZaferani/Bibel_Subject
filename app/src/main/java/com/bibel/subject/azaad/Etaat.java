package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Etaat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etaat);

        Button btn_etaat01=findViewById(R.id.btn_etaat01);
        Button btn_etaat02=findViewById(R.id.btn_etaat02);
        Button btn_etaat03=findViewById(R.id.btn_etaat03);
        Button btn_etaat04=findViewById(R.id.btn_etaat04);
        Button btn_etaat05=findViewById(R.id.btn_etaat05);
        Button btn_etaat06=findViewById(R.id.btn_etaat06);
        Button btn_etaat07=findViewById(R.id.btn_etaat07);
        Button btn_etaat08=findViewById(R.id.btn_etaat08);
        Button btn_etaat09=findViewById(R.id.btn_etaat09);
        Button btn_etaat10=findViewById(R.id.btn_etaat10);
        Button btn_etaat11=findViewById(R.id.btn_etaat11);


        btn_etaat01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.8.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/bible/118/DEU.13.nmv"));
                startActivity(browserIntent);

            }
        });
        btn_etaat03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.30.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/1SA.15.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.25.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.119.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/MAT.7.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/JHN.15.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/ROM.13.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/JAS.1.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_etaat11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/1PE.2.nmv"));
                startActivity(browserIntent);

            }
        });

    }
}