package com.android.pregnancy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button log,sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = (Button) findViewById(R.id.login);
        sign = (Button) findViewById(R.id.signup);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent1);
                finish();

            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new  Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent2);
                finish();
            }
        });

    }
}
