package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Iman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iman);


        Button btn_iman01=findViewById(R.id.btn_iman01);
        Button btn_iman02=findViewById(R.id.btn_iman02);



        btn_iman01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/GEN.15.TPV"));
                startActivity(browserIntent);

            }
        });

        btn_iman02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/HEB.11.TPV"));
                startActivity(browserIntent);

            }
        });




    }
}