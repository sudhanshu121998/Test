package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvView,textView1,textView2,textView3,textView4,textView5,textView6,
            textView7,textView8,textView9,textView10,textView11,textView12,
            textView13,textView14,textView15,textView16,textView17,textView18,
            textView19,textView20,textView21,textView22,textView23,textView24,
            textView25,textView26,textView27,textView28,textView29,textView30,
            textView31,textView32,textView33,textView34,textView35,textView36,
            textView37,textView38,textView39,textView40,textView41,textView42;
    EditText etID;
    Button btnSubmit;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Connecting all IDs with XML
        tvView=findViewById(R.id.tvView);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        textView13=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);
        textView15=findViewById(R.id.textView15);
        textView16=findViewById(R.id.textView16);
        textView17=findViewById(R.id.textView17);
        textView18=findViewById(R.id.textView18);
        textView19=findViewById(R.id.textView19);
        textView20=findViewById(R.id.textView20);
        textView21=findViewById(R.id.textView21);
        textView22=findViewById(R.id.textView22);
        textView23=findViewById(R.id.textView23);
        textView24=findViewById(R.id.textView24);
        textView25=findViewById(R.id.textView25);
        textView26=findViewById(R.id.textView26);
        textView27=findViewById(R.id.textView27);
        textView28=findViewById(R.id.textView28);
        textView29=findViewById(R.id.textView29);
        textView30=findViewById(R.id.textView30);
        textView31=findViewById(R.id.textView31);
        textView32=findViewById(R.id.textView32);
        textView33=findViewById(R.id.textView33);
        textView34=findViewById(R.id.textView34);
        textView35=findViewById(R.id.textView35);
        textView36=findViewById(R.id.textView36);
        textView37=findViewById(R.id.textView37);
        textView38=findViewById(R.id.textView38);
        textView39=findViewById(R.id.textView39);
        textView40=findViewById(R.id.textView40);
        textView41=findViewById(R.id.textView41);
        textView42=findViewById(R.id.textView42);


        etID=findViewById(R.id.etID);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idnumber=etID.getText().toString().trim();

                //Converting data to integer
                int x=Integer.parseInt(idnumber);

                String t1=textView1.getText().toString();
                String t2=textView2.getText().toString();
                String t3=textView3.getText().toString();
                String t4=textView4.getText().toString();
                String t5=textView5.getText().toString();
                String t6=textView6.getText().toString();
                String t7=textView7.getText().toString();
                String t8=textView8.getText().toString();
                String t9=textView9.getText().toString();
                String t10=textView10.getText().toString();
                String t11=textView11.getText().toString();
                String t12=textView12.getText().toString();
                String t13=textView13.getText().toString();
                String t14=textView14.getText().toString();
                String t15=textView15.getText().toString();
                String t16=textView16.getText().toString();
                String t17=textView17.getText().toString();
                String t18=textView18.getText().toString();
                String t19=textView19.getText().toString();
                String t20=textView20.getText().toString();
                String t21=textView21.getText().toString();
                String t22=textView22.getText().toString();
                String t23=textView23.getText().toString();
                String t24=textView24.getText().toString();
                String t25=textView25.getText().toString();
                String t26=textView26.getText().toString();
                String t27=textView27.getText().toString();
                String t28=textView28.getText().toString();
                String t29=textView29.getText().toString();
                String t30=textView30.getText().toString();
                String t31=textView31.getText().toString();
                String t32=textView32.getText().toString();
                String t33=textView33.getText().toString();
                String t34=textView34.getText().toString();
                String t35=textView35.getText().toString();
                String t36=textView36.getText().toString();
                String t37=textView37.getText().toString();
                String t38=textView38.getText().toString();
                String t39=textView39.getText().toString();
                String t40=textView40.getText().toString();
                String t41=textView41.getText().toString();
                String t42=textView42.getText().toString();


                if(t1.equals(idnumber))
                {
                    textView1.setText(" ");
                    etID.setText(" ");
                }
                if(t2.equals(idnumber))
                {
                    textView2.setText(" ");
                    etID.setText(" ");
                }
                if(t3.equals(idnumber))
                {
                    textView3.setText(" ");
                    etID.setText(" ");
                }
                if(t4.equals(idnumber))
                {
                    textView4.setText(" ");
                    etID.setText(" ");
                }
                if(t5.equals(idnumber))
                {
                    textView5.setText(" ");
                    etID.setText(" ");
                }
                if(t6.equals(idnumber))
                {
                    textView6.setText(" ");
                    etID.setText(" ");
                }
                //ROW 2

                if(t7.equals(idnumber))
                {
                    textView7.setText(" ");
                    etID.setText(" ");
                }
                if(t8.equals(idnumber))
                {
                    textView8.setText(" ");
                    etID.setText(" ");
                }
                if(t9.equals(idnumber))
                {
                    textView9.setText(" ");
                    etID.setText(" ");
                }
                if(t10.equals(idnumber))
                {
                    textView10.setText(" ");
                    etID.setText(" ");
                }
                if(t11.equals(idnumber))
                {
                    textView11.setText(" ");
                    etID.setText(" ");
                }
                if(t12.equals(idnumber))
                {
                    textView12.setText(" ");
                    etID.setText(" ");
                }
                //ROW 3

                if(t13.equals(idnumber))
                {
                    textView13.setText(" ");
                    etID.setText(" ");
                }
                if(t14.equals(idnumber))
                {
                    textView14.setText(" ");
                    etID.setText(" ");
                }
                if(t15.equals(idnumber))
                {
                    textView15.setText(" ");
                    etID.setText(" ");
                }
                if(t16.equals(idnumber))
                {
                    textView16.setText(" ");
                    etID.setText(" ");
                }
                if(t17.equals(idnumber))
                {
                    textView17.setText(" ");
                    etID.setText(" ");
                }
                if(t18.equals(idnumber))
                {
                    textView18.setText(" ");
                    etID.setText(" ");
                }
                //ROW 4

                if(t19.equals(idnumber))
                {
                    textView19.setText(" ");
                    etID.setText(" ");
                }
                if(t20.equals(idnumber))
                {
                    textView20.setText(" ");
                    etID.setText(" ");
                }
                if(t21.equals(idnumber))
                {
                    textView21.setText(" ");
                    etID.setText(" ");
                }
                if(t22.equals(idnumber))
                {
                    textView22.setText(" ");
                    etID.setText(" ");
                }
                if(t23.equals(idnumber))
                {
                    textView23.setText(" ");
                    etID.setText(" ");
                }
                if(t24.equals(idnumber))
                {
                    textView24.setText(" ");
                    etID.setText(" ");
                }
                //ROW 5

                if(t25.equals(idnumber))
                {
                    textView25.setText(" ");
                    etID.setText(" ");
                }
                if(t26.equals(idnumber))
                {
                    textView26.setText(" ");
                    etID.setText(" ");
                }
                if(t27.equals(idnumber))
                {
                    textView27.setText(" ");
                    etID.setText(" ");
                }
                if(t28.equals(idnumber))
                {
                    textView28.setText(" ");
                    etID.setText(" ");
                }
                if(t29.equals(idnumber))
                {
                    textView29.setText(" ");
                    etID.setText(" ");
                }
                if(t30.equals(idnumber))
                {
                    textView30.setText(" ");
                    etID.setText(" ");
                }
                //ROW 6
                if(t31.equals(idnumber))
                {
                    textView31.setText(" ");
                    etID.setText(" ");
                }
                if(t32.equals(idnumber))
                {
                    textView32.setText(" ");
                    etID.setText(" ");
                }
                if(t33.equals(idnumber))
                {
                    textView33.setText(" ");
                    etID.setText(" ");
                }
                if(t34.equals(idnumber))
                {
                    textView34.setText(" ");
                    etID.setText(" ");
                }
                if(t35.equals(idnumber))
                {
                    textView35.setText(" ");
                    etID.setText(" ");
                }
                if(t36.equals(idnumber))
                {
                    textView36.setText(" ");
                    etID.setText(" ");
                }
                //ROW 7

                if(t37.equals(idnumber))
                {
                    textView37.setText(" ");
                    etID.setText(" ");
                }
                if(t38.equals(idnumber))
                {
                    textView38.setText(" ");
                    etID.setText(" ");
                }
                if(t39.equals(idnumber))
                {
                    textView39.setText(" ");
                    etID.setText(" ");
                }
                if(t40.equals(idnumber))
                {
                    textView40.setText(" ");
                    etID.setText(" ");
                }
                if(t41.equals(idnumber))
                {
                    textView41.setText(" ");
                    etID.setText(" ");
                }
                if(t42.equals(idnumber))
                {
                    textView42.setText(" ");
                    etID.setText(" ");
                }

                //Logic to move data if space is there without disturbing its shape


            }

        });


    }

}
