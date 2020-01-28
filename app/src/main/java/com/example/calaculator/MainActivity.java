package com.example.calaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, button_add, button_sub, button_div,
            button_mul, button_dot, button_c, button_eql;

    EditText text;

    float num1, num2, num3;

    boolean Add, Sub, Mul, Div;

   String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button0 =  findViewById(R.id.button0);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        button_dot =  findViewById(R.id.button_dot);
        button_add =  findViewById(R.id.button_add);
        button_sub =  findViewById(R.id.button_sub);
        button_mul =  findViewById(R.id.button_mul);
        button_div =  findViewById(R.id.button_div);
        button_c =  findViewById(R.id.button_c);
        button_eql =  findViewById(R.id.button_eql);
        text =  findViewById(R.id.edit1);


        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "0");
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               text.setText(text.getText().toString() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "5");
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "6");
            }
        });



        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "7");
            }
        });




        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "8");
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setText(text.getText().toString() + "9");
            }
        });


         button_add.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                     num1 = Float.parseFloat(text.getText().toString());
                     Add = true;
                     text.setText(null);

             }
         });

        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(text.getText().toString());
                Sub = true;
                text.setText(null);
            }
        });



        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(text.getText().toString());
                Div = true;
                text.setText(null);
            }
        });



        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num1 = Float.parseFloat(text.getText().toString());
                Mul = true;
                text.setText(null);
            }
        });



        button_eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                num2 = Float.parseFloat(text.getText().toString());

                if(Add){
                    num3 = num1+num2;
                    s = Float.toString(num3);
                    text.setText(s);//"" is used so that add is taken as string addition
                    Add = false;

                }

                if(Sub){
                    num3 = num1-num2;
                    s = Float.toString(num3);
                    text.setText(s);
                    Sub = false;
                }

                if(Mul){
                    num3 = num1*num2;
                    s = Float.toString(num3);
                    text.setText(s);
                    Mul = false;

                }

                if(Div){
                    num3 = num1/num2;
                    s = Float.toString(num3);
                    text.setText(s);
                    Div = false;

                }

            }
        });





          button_c.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  text.setText("");
              }
          });



         button_dot.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 text.setText(text.getText() + ".");
             }
         });



    }
}
