package com.android.pregnancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ClinicalExam extends AppCompatActivity {

    Button subexm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinical_exam);

        subexm = (Button) findViewById(R.id.submitexam);

        subexm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ClinicalExam.this,"Submitted Successfully",Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
