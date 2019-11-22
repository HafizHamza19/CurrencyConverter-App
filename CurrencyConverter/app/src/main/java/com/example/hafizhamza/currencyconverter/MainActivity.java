package com.example.hafizhamza.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void PKRtoDOLLAR(View view)
{
    EditText e=(EditText) findViewById(R.id.editText);
    String get=e.getText().toString();
    Double PKR=Double.parseDouble(get);
    Double cal=PKR/138.80;
    Toast toast=Toast.makeText(this,get+" PKR ="+Double.toString(cal)+" $",Toast.LENGTH_SHORT);
    toast.show();
}
    public void DOLLARtoPKR(View view)
    {
        EditText pkr=(EditText)findViewById(R.id.editText);
        String get=pkr.getText().toString();
        Double conv=Double.parseDouble(get);
        Double Cal=conv*138.80;

        Toast toast=Toast.makeText(this,get+" Dollar ="+Double.toString(Cal)+"PKR",Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
