package com.judy.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivityPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_practice);
        Intent intent = getIntent();
        float bmi = getIntent().getFloatExtra("resultp",0);
        TextView resultp = findViewById(R.id.resultp);
        resultp.setText("Your bmi is "+bmi);

    }
}
