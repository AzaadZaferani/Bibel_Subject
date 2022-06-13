package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Entegham extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entegham);



    Button btn_entegham01=findViewById(R.id.btn_entegham01);
    Button btn_entegham02=findViewById(R.id.btn_entegham02);
    Button btn_entegham03=findViewById(R.id.btn_entegham03);
    Button btn_entegham04=findViewById(R.id.btn_entegham04);
    Button btn_entegham05=findViewById(R.id.btn_entegham05);
    Button btn_entegham06=findViewById(R.id.btn_entegham06);





        btn_entegham01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/1SA.24.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_entegham02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/2SA.16.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_entegham03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/JOB.31.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_entegham04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/PRO.20.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_entegham05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/ISA.35.NMV"));
                startActivity(browserIntent);

            }
        });

        btn_entegham06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/118/MAT.5.NMV"));
                startActivity(browserIntent);

            }
        });

    }
}