package com.example.vikram.proud_engineer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jokeoption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokeoption);
        Button but=(Button) findViewById(R.id.buttoni1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(jokeoption.this, joketxt.class);
                startActivity(intent);

            }
        });

        Button button=(Button) findViewById(R.id.buttoni2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(jokeoption.this, jokeimg.class);
                startActivity(intent1);
            }
        });
    }
}
