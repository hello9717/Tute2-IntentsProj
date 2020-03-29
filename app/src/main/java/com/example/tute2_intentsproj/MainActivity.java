package com.example.tute2_intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    EditText Number1;
    EditText Number2;
    Button OK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Number1 = findViewById(R.id.editText4);
        Number2 = findViewById(R.id.editText5);
        OK = findViewById(R.id.button2);

        OK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=
                        new Intent(MainActivity.this,FristActivity.class);
                intent.putExtra("name",Number1.getText().toString());
                intent.putExtra("name",Number2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
