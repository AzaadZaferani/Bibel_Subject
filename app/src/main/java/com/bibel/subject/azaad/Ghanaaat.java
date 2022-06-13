package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ghanaaat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghanaaat);

        Button btn_ghanaaat01 = findViewById(R.id.btn_ghanaaat01);
        Button btn_ghanaaat02 = findViewById(R.id.btn_ghanaaat02);
        Button btn_ghanaaat03 = findViewById(R.id.btn_ghanaaat03);
        Button btn_ghanaaat04 = findViewById(R.id.btn_ghanaaat04);
        Button btn_ghanaaat05 = findViewById(R.id.btn_ghanaaat05);
        Button btn_ghanaaat06 = findViewById(R.id.btn_ghanaaat06);
        Button btn_ghanaaat07 = findViewById(R.id.btn_ghanaaat07);
        Button btn_ghanaaat08 = findViewById(R.id.btn_ghanaaat08);




        btn_ghanaaat01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.37.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_ghanaaat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.90.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_ghanaaat03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/181/DEU.11.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_ghanaaat04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.13.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_ghanaaat05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.30.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_ghanaaat06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.30.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_ghanaaat07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/JOS.23.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_ghanaaat08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/1CO.13.nmv"));
                startActivity(browserIntent);

            }
        });



    }
}