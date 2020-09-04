package com.example.tehnicdataauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tehnicdataauto.R;

public class AlfaGiulia extends AppCompatActivity {

    private Button alfa20awd280;

    //butonul declarat anterior va fi folosit pentru a trece in pagina urmatoare

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfa_giulia);


        alfa20awd280 = (Button) findViewById(R.id.alfa20awd280);
        alfa20awd280.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openalfa20awd280();
            }
        });



    }

    //se deschide pagina cu pricina in functie de butonul apasat

    public void openalfa20awd280()
    {
        Intent intent = new Intent(this, AlfaGiulia20awd280.class);
        startActivity(intent);
    }


}

