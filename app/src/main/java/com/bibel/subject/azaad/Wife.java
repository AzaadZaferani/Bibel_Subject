package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wife);

        Button btn_wife01 = findViewById(R.id.btn_wife01);
        Button btn_wife02 = findViewById(R.id.btn_wife02);
        Button btn_wife03 = findViewById(R.id.btn_wife03);
        Button btn_wife04 = findViewById(R.id.btn_wife04);
        Button btn_wife05 = findViewById(R.id.btn_wife05);


        btn_wife01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/GEN.2.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_wife02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PRO.12.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_wife03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/ECC.9.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_wife04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/EPH.5.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_wife05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/HEB.13.NMV"));
                startActivity(browserIntent);

            }
        });









    }
}