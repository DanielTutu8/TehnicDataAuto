package com.example.tehnicdataauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tehnicdataauto.R;

public class Alfa extends AppCompatActivity {

    private Button alfagiulia;

    //butonul declarat anterior va fi folosit pentru a trece in pagina urmatoare

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfa);


        alfagiulia = (Button) findViewById(R.id.alfagiulia);
        alfagiulia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openalfagiulia();
            }
        });



    }

    //se deschide pagina cu pricina in functie de butonul apasat

    public void openalfagiulia()
    {
        Intent intent = new Intent(this, AlfaGiulia.class);
        startActivity(intent);
    }


}

