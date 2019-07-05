package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText field1,field2;
    TextView result;
    Button calculate,mode;
    String f1,f2,res;
    double a,b,sum;
    int c=0,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        field1=findViewById(R.id.field1);
        field2=findViewById(R.id.field2);
        result=findViewById(R.id.result);
    }
    public void onModePressed(View view)
    {
        c++;
        mode=findViewById(R.id.mode);
        if(c%4==1)
        {
            mode.setText("Add");
        }
        else if(c%4==2)
        {
            mode.setText("Sub");

        }
        else if(c%4==3)
        {
            mode.setText("Mul");
        }
        else
        {
            mode.setText("Div");
        }

    }
    public void onCalculatePressed(View view)
    {
     f1=field1.getText().toString();
     f2=field2.getText().toString();
     a=Double.parseDouble(f1);
     b=Double.parseDouble(f2);
     if(mode.getText().toString()=="Add")
     {
         sum=a+b;
     }
     else if(mode.getText().toString()=="Sub")
     {
         sum=a-b;
     }
     else if(mode.getText().toString()=="Mul")
     {
         sum=a*b;
     }
     else if(mode.getText().toString()=="Div")
     {
         if(b==0)
         {

             result.setText("DivideByZero Error");
             return;
         }
         else
         {
             sum=a/b;
         }
     }
     d=(int)sum;
     if((sum-d)==0) {
         res=String.valueOf(d);
     }
     else
     {
         res=String.valueOf(sum);
     }

     result.setText(res, TextView.BufferType.NORMAL);

    }
}
