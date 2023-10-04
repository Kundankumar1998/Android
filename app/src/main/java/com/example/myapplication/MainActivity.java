package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }
    private void init()
    {
        btn1=findViewById(R.id.btn1);
        btn1=findViewById(R.id.btn2);
        btn1=findViewById(R.id.btn3);
        btn1=findViewById(R.id.btn4);
        btn1=findViewById(R.id.btn5);
        btn1=findViewById(R.id.btn6);
        btn1=findViewById(R.id.btn7);
        btn1=findViewById(R.id.btn8);
        btn1=findViewById(R.id.btn9);

    }
    public void check(View view)
    {
        Button btncurrent = (Button) view;
        if(flag==0)
        {
            btncurrent.setText("X");
            flag=1;
        }else {
            btncurrent.setText("O");
            flag=0;
        }
    }

}