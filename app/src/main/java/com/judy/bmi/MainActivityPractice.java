package com.judy.bmi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityPractice extends AppCompatActivity {

    private EditText edweight;
    private EditText edheight;
    private Button edhelp;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivityPractice","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivityPractice","onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivityPractice","onDestory");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivityPractice","onPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivityPractice","onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivityPractice","onRestart");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_practice);
        findViews();

    }

    private void findViews() {
        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);
        edhelp = findViewById(R.id.ed_helpp);
        edhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivityPractice.this)
                        .setMessage("bmi is weight/(height*height)")
                        .setTitle("Help")
                        .setPositiveButton("Ok",null)
                        .show();

                ;
            }
        });

    }

    public void bmi(View view){
        Log.d("MainAcitivtyPractice","bmi");
        String w = edweight.getText().toString();
        String h = edheight.getText().toString();
        Log.d("MainActivityPractice",w+"/"+h);
        final float ed_weightp = Float.parseFloat(w);
        final float ed_heightp =Float.parseFloat(h);
        float bmi = ed_weightp/(ed_heightp*ed_heightp);
        Log.d("MainActivityPractice",bmi+"");

        Intent intent =new Intent(this,ResultActivityPractice.class);
        intent.putExtra("resultp",bmi);
        startActivity(intent);

//        Toast.makeText(this,"Your bmi is "+bmi,Toast.LENGTH_LONG).show();
//        new AlertDialog.Builder(this)
//                .setMessage("Your bmi is "+bmi).setTitle("BMI").
///                setPositiveButton("OK",null).
//                setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
 ///                   @Override
//                    public void onClick(DialogInterface dialog, int which) {
 //                       edheight.setText(" ");
//                        edweight.setText(" ");
//                    }
 //               }).show();

    }

}

