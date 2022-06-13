package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Raasti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raasti);

        Button btn_raasti01=findViewById(R.id.btn_raasti01);
        Button btn_raasti02=findViewById(R.id.btn_raasti02);
        Button btn_raasti03=findViewById(R.id.btn_raasti03);
        Button btn_raasti04=findViewById(R.id.btn_raasti04);




        btn_raasti01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PSA.1.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_raasti02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PRO.12.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_raasti03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/EPH.4.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_raasti04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/COL.3.NMV"));
                startActivity(browserIntent);

            }
        });


    }
}