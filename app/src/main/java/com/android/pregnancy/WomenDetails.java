package com.android.pregnancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WomenDetails extends AppCompatActivity {

    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_details);

        sub = (Button)findViewById(R.id.submitdet);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WomenDetails.this,"Successfully Registered",Toast.LENGTH_LONG).show();
                startActivity(new Intent(WomenDetails.this,Main3Activity.class));
                finish();
            }
        });

    }
}
