package com.example.tehnicdataauto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tehnicdataauto.R;

public class caroserieBreak extends AppCompatActivity {

    private Button anii2008_2013;
    //am declarat butoanele necesare trecerii in paginile urmatoare
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caroserie_break);


        anii2008_2013 = (Button) findViewById(R.id.anii2008_2013);
        anii2008_2013.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnii2008_2013();
            }
        });


    }


    //se deschide pagina cu pricina in functie de butonul apasat


    public void openAnii2008_2013()
    {
        Intent intent = new Intent(this, Anii2008_2013.class);
        startActivity(intent);
    }


}

