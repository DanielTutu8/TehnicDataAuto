package com.example.tehnicdataauto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Embleme extends AppCompatActivity {

    private Button auudi, alfa, bmw, bugatti, dacia, ferarri, fiat, ford, jeep, mazda, mercedes, opel, renault, skoda, tesla, vw, volvo;
    @Override
    //am declarat butoanele necesare trecerii in paginile urmatoare
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embleme);



        auudi = (Button) findViewById(R.id.auudi);
        auudi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openModel();
        }
    });

        alfa = (Button) findViewById(R.id.alfa);
        alfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlfa();
            }
        });

        bmw = (Button) findViewById(R.id.bmw);
        bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBmw();
            }
        });

        dacia = (Button) findViewById(R.id.dacia);
        dacia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDacia();
            }
        });

}

    //se deschide pagina cu pricina in functie de butonul apasat

    public void openModel()
    {
        Intent intent = new Intent(this, model.class);
        startActivity(intent);
    }

    public void openAlfa()
    {
        Intent intent = new Intent(this, Alfa.class);
        startActivity(intent);
    }

    public void openBmw()
    {
        Intent intent = new Intent(this, Bmw.class);
        startActivity(intent);
    }

    public void openDacia()
    {
        Intent intent = new Intent(this, Dacia.class);
        startActivity(intent);
    }
}

