package com.example.tehnicdataauto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Search extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }





    public void onLookUp(View view) {

        //access the edit field from layout
        EditText word = (EditText) findViewById(R.id.word);
        String theword = word.getText().toString();

        //find definition of the word
        String definition = findDefinition(theword);


        TextView thedef = findViewById(R.id.def);

        if(definition!=null)
            thedef.setText(definition);
        else
            thedef.setText("NU exista rezultate cu aceste filtre!!!");
    }

    private String findDefinition(String theword) {

        //open raw resource
        InputStream input = getResources().openRawResource(R.raw.bazadedate);
        Scanner scan = new Scanner(input);


        //reading line by line
        while(scan.hasNext())
        {
            String line = scan.nextLine();//the full line
            String[] pieces = line.split("=");

            //if(pieces[0].equalsIgnoreCase(theword))
            if(pieces[0].contains(theword))
            {
                //findDefinition(line);
                 return pieces[1];
            }
        }
        return null;
    }
}
