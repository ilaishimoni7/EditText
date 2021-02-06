package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView TV1, TV4, TV5, TV3, TV6, TV2;
    EditText ET1, ET2, ET3;
    ImageView IV, IV3, IV4;
    int num1, num2, num3, num4, num5, num6;
    int x, y, z, f, j, k;
    int mone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET3 = findViewById (R.id.ET3);
        IV4 = findViewById(R.id.IV4);
        TV6 = findViewById(R.id.TV6);
       TV3 = findViewById(R.id.TV3);
        ET2 = findViewById(R.id.ET2);
        TV2 = findViewById(R.id.TV2);
        TV5 = findViewById(R.id.TV5);
        TV1 = findViewById(R.id.TV1);
       TV4 = findViewById(R.id.TV4);
       ET1 = findViewById(R.id.ET1);
       IV = findViewById(R.id.IV);
       IV3 = findViewById(R.id.IV3);

        TV1.setText(((int) (Math.random() * 89) + 10)+ "");
        TV4.setText(((int)(Math.random() * 89) + 10)+"");

        String st = TV1.getText().toString();
        num1 = Integer.parseInt(st);

        String st1 = TV4.getText().toString();
        num2 = Integer.parseInt(st1);

    }



    public void Compare(View view) {
        String st2 = ET1.getText().toString();
        y = Integer.parseInt(st2);
        x = num1 + num2;
        if (x==y){
            IV.setImageResource(R.drawable.correct);
            TV5.setText(((int) (Math.random() * 89) + 10)+ "");
            TV2.setText (x+"");
            mone++;
        }

        else{
            IV.setImageResource(R.drawable.wrong);
            TV5.setText(((int) (Math.random() * 89) + 10)+ "");
            TV2.setText (x+"");
        }


    }


    public void Compare2(View view) {
        String st3 = ET2.getText().toString();
        z = Integer.parseInt(st3);

        String st4 = TV2.getText().toString();
        num3 = Integer.parseInt(st4);

        String st5 = TV5.getText().toString();
        num4 = Integer.parseInt(st5);

        f = num3+num4;



        if (z==f){
            IV3.setImageResource(R.drawable.correct);
            TV3.setText(z+"");
            mone++;
            TV6.setText(((int) (Math.random() * 89) + 10)+ "");


        }
        else{
            IV3.setImageResource(R.drawable.wrong);
            TV3.setText(f+"");
            TV6.setText(((int) (Math.random() * 89) + 10)+ "");



        }



    }

    public void lmeit(View view) {

        String st6 = TV3.getText().toString();
        num5 = Integer.parseInt(st6);

        String st7 = TV6.getText().toString();
        num6 = Integer.parseInt(st7);
        j = num5+num6;

        String st8 = ET3.getText().toString();
        k = Integer.parseInt(st8);

        if (j==k){
            IV4.setImageResource(R.drawable.correct);
            mone++;

        }
        else{
            IV4.setImageResource(R.drawable.wrong);


        }




    }




    public void newAndToast(View view) {
        Toast.makeText(this, "you got " + mone + " answear/s right", Toast.LENGTH_SHORT).show();

    }
}

