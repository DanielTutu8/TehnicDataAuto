package com.example.tehnicdataauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tehnicdataauto.R;

public class model extends AppCompatActivity {

    private Button A3,A4;
    //am declarat butoanele necesare trecerii in paginile urmatoare
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);


        A3 = (Button) findViewById(R.id.A3);
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipA3();
            }
        });

        A4 = (Button) findViewById(R.id.A4);
        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipA4();
            }
        });

    }

    //se deschide pagina cu pricina in functie de butonul apasat

    public void openTipA3()
    {
        Intent intent = new Intent(this, tipA3.class);
        startActivity(intent);
    }

    public void openTipA4()
    {
        Intent intent = new Intent(this, tipA4.class);
        startActivity(intent);
    }
}

