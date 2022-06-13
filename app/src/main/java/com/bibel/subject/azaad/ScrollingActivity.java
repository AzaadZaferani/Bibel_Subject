package com.bibel.subject.azaad;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bibel.subject.azaad.databinding.ActivityScrollingBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class ScrollingActivity extends AppCompatActivity {

    private ActivityScrollingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        Button btn_etaat=findViewById(R.id.btn_etaat) ;
        Button btn_entegham=findViewById(R.id.btn_entegham);
        Button btn_omid=findViewById(R.id.btn_omid);
        Button btn_raasti=findViewById(R.id.btn_raasti);
        Button btn_ravabet_zoj=findViewById(R.id.btn_ravabete_zoj);
        Button btn_ravabet_farzand=findViewById(R.id.btn_ravabete_farzandan);
        Button btn_doa=findViewById(R.id.btn_doa);
        Button btn_davari=findViewById(R.id.btn_davari);
        Button btn_hayate_vaafer=findViewById(R.id.btn_hayatevafer);
        Button btn_hayate_javidan=findViewById(R.id.btn_hayatejavidan);
        Button btn_tobe=findViewById(R.id.btn_tobe);
        Button btn_hekmat=findViewById(R.id.btn_hekmat);
        Button btn_bakhshesh_gonahan=findViewById(R.id.btn_bakhshesh);
        Button btn_jahanam=findViewById(R.id.btn_jahanam);
        Button btn_iman=findViewById(R.id.btn_iman);
        Button btn_mohabat=findViewById(R.id.btn_mohabat) ;
        Button btn_ghanaaat=findViewById(R.id.btn_ghanaaat) ;








        Button btn_website=findViewById(R.id.btn_website);






        btn_etaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Etaat.class));

                                           }
                                    });

                FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                System.exit(1);

            }
        });


        btn_entegham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Entegham.class));

            }
        });


        btn_omid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Omid.class));

            }
        });

        btn_raasti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Raasti.class));

            }
        });

        btn_ravabet_zoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Wife.class));

            }
        });

        btn_ravabet_farzand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Child.class));

            }
        });

        btn_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Doa.class));

            }
        });

        btn_davari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Davari.class));

            }
        });

        btn_hayate_vaafer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, HayateVaafer.class));

            }
        });

        btn_hayate_javidan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Hayate_javidan.class));

            }
        });

        btn_tobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Tobe.class));

            }
        });

        btn_hekmat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Hekmat.class));

            }
        });

        btn_bakhshesh_gonahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Bakhshesh_gonahan.class));

            }
        });

        btn_jahanam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Jahanam.class));

            }
        });

        btn_iman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Iman.class));

            }
        });

        btn_mohabat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Mohabat.class));

            }
        });

        btn_ghanaaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollingActivity.this, Ghanaaat.class));

            }
        });




        btn_website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.zaferani.com"));
                startActivity(browserIntent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.Website) {

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://zaferani.com"));
            startActivity(browserIntent);

            return true;
        }


        if (id == R.id.Exit) {

            System.exit(1);

            return true;
        }

        if (id == R.id.bibel_download) {

            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://zaferani.com/wp-content/uploads/2021/03/انجیل-ترجمه-هزاره-نو.pdf"));
            startActivity(browserIntent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    //  int id = item.getItemId();

        //noinspection SimplifiableIfStatement
    //   if (id == R.id.bibel_download) {

    //      System.exit(1);

    //      return true;
    //  }
    //   return super.onOptionsItemSelected(item);
    //}
}