package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hekmat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hekmat);



        Button btn_hekmat01=findViewById(R.id.btn_hekmat01);
        Button btn_hekmat02=findViewById(R.id.btn_hekmat02);



        btn_hekmat01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/PRO.1.TPV"));
                startActivity(browserIntent);

            }
        });

        btn_hekmat02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bible.com/fa/bible/181/1CO.1.TPV"));
                startActivity(browserIntent);

            }
        });





    }
}