package com.bindu.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    float numOne, numTwo;
    boolean simpleAddition, simpleSubtraction,simpleMultiplication, simpleDivision;
    int pressedButtonNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1=(Button)findViewById(R.id.button1);
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn3=(Button)findViewById(R.id.button3);
        Button btn4=(Button)findViewById(R.id.button4);
        Button btn5=(Button)findViewById(R.id.button5);
        Button btn6=(Button)findViewById(R.id.button6);
        Button btn7=(Button)findViewById(R.id.button7);
        Button btn8=(Button)findViewById(R.id.button8);
        Button btn9=(Button)findViewById(R.id.button9);
        Button btn0=(Button)findViewById(R.id.button10);
        Button btn11=(Button)findViewById(R.id.button11);
        Button btn12=(Button)findViewById(R.id.button12);
        Button btn13=(Button)findViewById(R.id.button13);
        Button btn14=(Button)findViewById(R.id.button14);
        final EditText editText=(EditText)findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(" ");
            }
        });

        pressedButtonNumber=getIntent().getExtras().getInt("details");
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        switch(pressedButtonNumber){

            case 1:

                if (editText == null) {
                    editText.setText("");
                } else {
                    numOne = Float.parseFloat(editText.getText() + "");
                    simpleAddition = true;
                    editText.setText(null);
                }

                break;

            case 2:
                numOne = Float.parseFloat(editText.getText() + "");
                simpleSubtraction=true;
                editText.setText(null);

                break;


            case 3:
                numOne = Float.parseFloat(editText.getText() + "");
                simpleMultiplication=true;
                editText.setText(null);


                break;
            case 4:
                numOne = Float.parseFloat(editText.getText() + "");
                simpleDivision=true;
                editText.setText(null);

                break;
        }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numTwo = Float.parseFloat(editText.getText() + "");
                if (simpleAddition ) {
                    editText.setText(numOne + numTwo + "");
                    simpleAddition = false;
                }

                else if (simpleSubtraction ) {
                    editText.setText(numOne - numTwo + "");
                    simpleSubtraction = false;
                }

                else if (simpleMultiplication ) {
                    editText.setText(numOne * numTwo + "");
                    simpleMultiplication = false;
                }

                else if (simpleDivision) {
                    editText.setText(numOne / numTwo + "");
                    simpleDivision = false;
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });




    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(MainActivity2.this,MainActivity.class));
        finish();
    }


          }
