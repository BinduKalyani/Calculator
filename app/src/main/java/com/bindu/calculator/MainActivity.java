package com.bindu.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        final RadioButton addBtn=(RadioButton)findViewById(R.id.addBtn);
        RadioButton subBtn=(RadioButton)findViewById(R.id.subBtn);
        RadioButton mulBtn=(RadioButton)findViewById(R.id.mulBtn);
        RadioButton divBtn=(RadioButton)findViewById(R.id.divBtn);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);

                if(checkedId==R.id.addBtn)
                {



                    intent.putExtra("details",1);
                    startActivity(intent);
                }
                else if(checkedId==R.id.subBtn)
                {


                    intent.putExtra("details",2);

                    startActivity(intent);
                }
                else if(checkedId==R.id.mulBtn){



                    intent.putExtra("details",3);
                    startActivity(intent);
                }
                else
                {


                    intent.putExtra("details",4);
                    startActivity(intent);
                }
            }
        });

    }
    @Override
    public void onBackPressed(){

        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit").setMessage("Are You Sure?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=  new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();

            }
        }).setNegativeButton("No",null).show();
    }

}

