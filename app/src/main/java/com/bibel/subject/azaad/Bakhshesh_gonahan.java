package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bakhshesh_gonahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakhshesh_gonahan);


        Button btn_bakhshesh_gonahan01=findViewById(R.id.btn_bakhshesh_gonahan01);
        Button btn_bakhshesh_gonahan02=findViewById(R.id.btn_bakhshesh_gonahan02);



        btn_bakhshesh_gonahan01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/PSA.130.TPV"));
                startActivity(browserIntent);

            }
        });

        btn_bakhshesh_gonahan02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/1JN.1.TPV"));
                startActivity(browserIntent);

            }
        });


    }
}