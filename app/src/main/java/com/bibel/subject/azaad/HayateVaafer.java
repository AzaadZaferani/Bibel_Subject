package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HayateVaafer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayate_vaafer);


        Button btn_hayatevaafer01 = findViewById(R.id.btn_hayatevaafer01);
        Button btn_hayatevaafer02 = findViewById(R.id.btn_hayatevaafer02);


        btn_hayatevaafer01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/PSA.96.nmv"));
                startActivity(browserIntent);

            }
        });

        btn_hayatevaafer02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/REV.20.nmv"));
                startActivity(browserIntent);

            }
        });



    }
}