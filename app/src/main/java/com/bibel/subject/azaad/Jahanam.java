package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jahanam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jahanam);

        Button btn_jahanam01=findViewById(R.id.btn_jahanam01);
        Button btn_jahanam02=findViewById(R.id.btn_jahanam02);



        btn_jahanam01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/DAN.12.TPV"));
                startActivity(browserIntent);

            }
        });

        btn_jahanam02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/2TH.1.TPV"));
                startActivity(browserIntent);

            }
        });

    }
}