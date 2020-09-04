package com.example.tehnicdataauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tehnicdataauto.R;

public class tipA3 extends AppCompatActivity {

    private Button hatchback, cabrio,brek;
    //am declarat butoanele necesare trecerii in paginile urmatoare


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_a3);


        cabrio = (Button) findViewById(R.id.cabrio);
        cabrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaroserieCabrio();
            }
        });

        brek = (Button) findViewById(R.id.brek);
        brek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaroserieBrek();
            }
        });

        hatchback = (Button) findViewById(R.id.hatchback);
        hatchback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencaroserieH();
            }
        });

    }

    public void opencaroserieCabrio()
    {
        Intent intent = new Intent(this, caroserieCabrio.class);
        startActivity(intent);
    }

    public void opencaroserieBrek()
    {
        Intent intent = new Intent(this, caroserieBreak.class);
        startActivity(intent);
    }

    public void opencaroserieH()
    {
        Intent intent = new Intent(this, caroserieH.class);
        startActivity(intent);
    }
}

