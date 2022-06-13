package com.bibel.subject.azaad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Sabr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabr);

        Button btn_raasti01=findViewById(R.id.btn_raasti01);



        btn_raasti01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.bible.com/fa/bible/118/DEU.8.nmv"));
                startActivity(browserIntent);


            }
        });


    }
}