package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Tobe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tobe);

        Button btn_tobe01=findViewById(R.id.btn_tobe01);
        Button btn_tobe02=findViewById(R.id.btn_tobe02);



        btn_tobe01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/EZK.18.TPV"));
                startActivity(browserIntent);

            }
        });

        btn_tobe02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/MRK.1.TPV"));
                startActivity(browserIntent);

            }
        });


    }
}