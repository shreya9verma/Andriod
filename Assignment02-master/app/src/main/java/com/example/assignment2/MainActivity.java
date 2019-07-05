package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    ImageView imageView,imageView2;
    Switch sw;
    CheckBox ch;
    ImageButton imageButton;
    RadioButton rb,rb1;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView2=findViewById(R.id.imageView2);
        imageView=findViewById(R.id.imageView);
        sw=(Switch)findViewById(R.id.switch1);
        imageButton=findViewById(R.id.imageButton1);
        ch=findViewById(R.id.checkBox);
        ch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ch.isChecked())
                {
                    imageView.setVisibility(View.VISIBLE);
                    imageButton.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageView.setVisibility(View.INVISIBLE);
                    imageButton.setVisibility(View.INVISIBLE);
                }
            }
        });
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(sw.isChecked())
                {
                    imageView2.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageView2.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
    public void onRadioButtonPress(View view)
    {
        rg=findViewById(R.id.radioGroup);
        int i=0,r=0;
        while(i<=10) {
            r = rg.getCheckedRadioButtonId();
            rb = findViewById(r);
            if (rb.getText().toString().equals("Disabled")) {
                imageButton.setClickable(false);
            } else {
                imageButton.setClickable(true);
            }
            i++;
        }
    }
    public void onRefresh(View view)
    {
        imageButton.setClickable(true);
        imageButton.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        rb1=findViewById(R.id.radioButton1);
        rb1.setChecked(true);
        sw.setChecked(true);
        ch.setChecked(true);
    }
}
