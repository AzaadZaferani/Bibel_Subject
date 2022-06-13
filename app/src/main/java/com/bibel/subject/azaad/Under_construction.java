package com.bibel.subject.azaad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Under_construction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_construction);

        Button btn_under_return_F=findViewById(R.id.btn_under_return_F);
        Button btn_under_return_E=findViewById(R.id.btn_under_return_E);
        Button btn_under_return_home=findViewById(R.id.btn_under_return_home);

        btn_under_return_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Under_construction.this, ScrollingActivity.class));

            }
        });

        btn_under_return_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Under_construction.this, ScrollingActivity.class));

            }
        });

        btn_under_return_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Under_construction.this, ScrollingActivity.class));

            }
        });




    }
}