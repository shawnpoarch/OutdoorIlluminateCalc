package com.example.outdoorilluminatecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    int EditText eHeight
    eHieght= new eHeight.findViewById(R.id.etHeight);
    private EditText eLength = findViewById(R.id.etLength);
    private RadioButton eSquare = findViewById(R.id.rbSquare);
    private RadioButton eRectangle = findViewById(R.id.rbRectangle);
    private Spinner eFixtures = findViewById(R.id.spFixtures);
    private Button eCalculate = findViewById(R.id.btnCalculate);
class Calculations{
    
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }
}