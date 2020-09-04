package com.example.tehnicdataauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tehnicdataauto.R;

public class Anii2008_2013 extends AppCompatActivity {

    private Button tdi20hp140;

    //butonul declarat anterior va fi folosit pentru a trece in pagina urmatoare

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anii2008_2013);


        tdi20hp140 = (Button) findViewById(R.id.tdi20hp140);
        tdi20hp140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentdi20hp140();
            }
        });



    }

    //se deschide pagina cu pricina in functie de butonul apasat

    public void opentdi20hp140()
    {
        Intent intent = new Intent(this, Tdi20hp140.class);
        startActivity(intent);
    }


}

