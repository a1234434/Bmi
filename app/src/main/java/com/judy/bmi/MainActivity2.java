package com.judy.bmi;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText edAge;
    private EditText edWeight;
    private  EditText edHeight;

    //@Override
    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edAge =findViewById(R.id.age);
        edWeight=findViewById(R.id.ed_weight);
        edHeight =findViewById(R.id.ed_height);

    }

    public void bmi(View view) {
        Log.d("MainActivity2","bmi");
        String a=edAge.getText().toString();
        String w =edWeight.getText().toString();
        String h=edHeight.getText().toString();
        Log.d("MainActivity2",w+"/"+h);
        float weight =Float.parseFloat(w);
        float height=Float.parseFloat(h);
        float bmi =weight/(height*height);
        Log.d("MainActivity2",bmi+"");
        Toast.makeText(this,"Your bmi is "+bmi,Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this).setMessage("Your bmi is "+bmi).setTitle("BMI").
                setPositiveButton("OK",null).
                setNegativeButton("Clear", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                edWeight.setText("");
                edHeight.setText("");
            }
        }).show();
    }
}
