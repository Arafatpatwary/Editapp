package com.example.editapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private EditText edit,edit2;
    private Button addbtn,subbtn,multibtn,divibtn;
    private TextView resut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.Edit2);
        addbtn=(Button) findViewById(R.id.btn1);
        subbtn=(Button) findViewById(R.id.btn2);
        multibtn=(Button)findViewById(R.id.btn3);
        divibtn=(Button)findViewById(R.id.btn4);
        resut=(TextView)findViewById(R.id.Text);

        addbtn.setOnClickListener(this);
        subbtn.setOnClickListener(this);
        multibtn.setOnClickListener(this);
        divibtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        try{
            String Number1= edit.getText().toString();
            String numberr2=  edit2.getText().toString();

            double num1= Double.parseDouble(Number1);
            double num2= Double.parseDouble(numberr2);

            if (v.getId()==R.id.btn1){
                double sum=  num1+num2;
                resut.setText("Result = "+sum);

            }
            if (v.getId()==R.id.btn2){

                double sum=  num1-num2;
                resut.setText("Result = "+sum);
            }

            if (v.getId()==R.id.btn3){

                double sum=  num1*num2;
                resut.setText("Result = "+sum);
            }
            if (v.getId()==R.id.btn4){

                double sum=  num1/num2;
                resut.setText("Result = "+sum);
            }




        }catch (Exception e){
            Toast.makeText(MainActivity.this,"Please Kindly Number",Toast.LENGTH_LONG).show();

        }


    }
}
