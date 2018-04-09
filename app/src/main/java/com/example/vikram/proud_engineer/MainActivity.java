package com.example.vikram.proud_engineer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(),"WELCOME GEEKS",Toast.LENGTH_LONG);
        toast.show();
    }

    public void navigate(View view)
    {
        Intent i = new Intent(MainActivity.this, options.class);
        startActivity(i);
    }

}
