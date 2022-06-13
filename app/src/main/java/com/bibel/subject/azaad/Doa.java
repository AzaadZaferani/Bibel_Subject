package com.bibel.subject.azaad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Doa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        Button btn_doa01 = findViewById(R.id.btn_doa01);
        Button btn_doa02 = findViewById(R.id.btn_doa02);
        Button btn_doa03 = findViewById(R.id.btn_doa03);
        Button btn_doa04 = findViewById(R.id.btn_doa04);
        Button btn_doa05 = findViewById(R.id.btn_doa05);
        Button btn_doa06 = findViewById(R.id.btn_doa06);
        Button btn_doa07 = findViewById(R.id.btn_doa07);
        Button btn_doa08 = findViewById(R.id.btn_doa08);



        btn_doa01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/2CH.7.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_doa02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PSA.116.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_doa03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PSA.145.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_doa04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/JER.33.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_doa05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/LUK.11.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_doa06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/JHN.14.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_doa07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/JAS.5.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_doa08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/1JN.5.NMV"));
                startActivity(browserIntent);

            }
        });


    }
}