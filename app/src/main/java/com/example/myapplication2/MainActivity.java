package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        TextView tv =(TextView) findViewById(R.id.t1);




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Fragment f1=(Fragment) findViewById() ;
        Button btnOne = (Button) findViewById(R.id.button);
        Button btnTwo = (Button) findViewById(R.id.button2);
       Button btnThi = (Button) findViewById(R.id.button3);
       Button btnFor = (Button) findViewById(R.id.button4);
        btnOne.setOnClickListener(new View.OnClickListener() {

@Override
            public void onClick(View v) {

            }});
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }});
        btnThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }});
        btnFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }});








    }
}