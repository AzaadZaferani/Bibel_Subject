package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mohabat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohabat);

        Button btn_mohabat01 = findViewById(R.id.btn_mohabat01);
        Button btn_mohabat02 = findViewById(R.id.btn_mohabat02);
        Button btn_mohabat03 = findViewById(R.id.btn_mohabat03);
        Button btn_mohabat04 = findViewById(R.id.btn_mohabat04);
        Button btn_mohabat05 = findViewById(R.id.btn_mohabat05);
        Button btn_mohabat06 = findViewById(R.id.btn_mohabat06);
        Button btn_mohabat07 = findViewById(R.id.btn_mohabat07);
        Button btn_mohabat08 = findViewById(R.id.btn_mohabat08);
        Button btn_mohabat09 = findViewById(R.id.btn_mohabat09);




        btn_mohabat01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/181/DEU.6.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/181/DEU.10.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/181/DEU.11.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.13.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.30.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.30.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/JOS.23.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/1CO.13.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_mohabat09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/1JN.4.nmv"));
                startActivity(browserIntent);

            }
        });


    }
}