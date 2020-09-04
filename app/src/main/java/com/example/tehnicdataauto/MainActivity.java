package com.example.tehnicdataauto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button, button3;

    //am declarat butoanele necesare trecerii in paginile urmatoare
    //pentru cautare simpla sau prin filtre


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmbleme();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSearch();
            }
        });
    }

    //se deschide pagina cu pricina in functie de butonul apasat



    public void openEmbleme()
    {
        Intent intent = new Intent(this, Embleme.class);
        startActivity(intent);
    }

    public void openSearch()
    {
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }
}
