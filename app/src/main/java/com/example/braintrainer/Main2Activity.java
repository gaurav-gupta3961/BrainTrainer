package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
int a,b,w,fin=0,totalq=0,score=0;
 Intent k;
Random r;
String c,d;
CountDownTimer cdt;
TextView t1,t2,t3,t4,t5;
Button b1,b2,b3,b4,b5,bc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1= (TextView)findViewById(R.id.textview1);
        t2= (TextView)findViewById(R.id.textView3);
        t3= (TextView)findViewById(R.id.textView4);
        t4= (TextView)findViewById(R.id.textView);
        t5= (TextView)findViewById(R.id.textView2);
        b1= (Button)findViewById(R.id.button2);
        b2= (Button)findViewById(R.id.button3);
        b3= (Button)findViewById(R.id.button4);
        b4= (Button)findViewById(R.id.button5);
        b5= (Button)findViewById(R.id.button6);
        r = new Random();
        k= new Intent(Main2Activity.this,Main2Activity.class);
        t4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);
         cdt=new CountDownTimer(30000,1000){
             @Override
             public void onTick(long l) {
                 t1.setText(l/1000+"s");

             }

             @Override
             public void onFinish() {
                 fin=1;
                 t5.setVisibility(View.INVISIBLE);
                 t4.setText("Your Score : "+score+"/"+totalq);
                 t4.setVisibility(View.VISIBLE);
                 b5.setVisibility(View.VISIBLE);



             }

         };
         cdt.start();
         a=r.nextInt(61)+20;
         b=r.nextInt(71)+60;
         w= r.nextInt(4)+1;
        c= String.valueOf(a);
        d= String.valueOf(b);
        t3.setText(c+"+"+d);
        if(w==1)
        {
            b1.setText(a+b+"");
            b2.setText(2*a+"");
            b3.setText(a+b+3+"");
            b4.setText(a+b+a/b+1+"");
        }
        else if(w==2)
        {
            b1.setText(a*5+"");
            b2.setText(a+b+"");
            b3.setText(a+b+3+"");
            b4.setText(a+b+a/b+15+"");
        }
        else if(w==3)
        {
            b1.setText(a+b+11+"");
            b2.setText(3*a+"");
            b3.setText(a+b+"");

            b4.setText(2*b+"");
        }
        else if(w==4)
        {
            b1.setText(a+b+8+"");
            b2.setText(2*a+"");
            b3.setText(a+b+3+"");
            b4.setText(a+b+"");
        }


    


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(k);
            }
        });


    }
    public void click(View view){
        if (fin != 1) {
            bc = (Button)view;
            if (Integer.parseInt(bc.getText().toString()) == a + b) {
                t5.setText("RIGHT!");
                score++;
                totalq++;
            } else {
                t5.setText("WRONG!");
                totalq++;
            }
            t2.setText(score + "/" + totalq);
            a = r.nextInt(61) + 20;
            b = r.nextInt(71) + 60;
            w = r.nextInt(4) + 1;
            c = String.valueOf(a);
            d = String.valueOf(b);
            t3.setText(c + "+" + d);
            if(w==1)
            {
                b1.setText(a+b+"");
                b2.setText(2*a+"");
                b3.setText(a+b+3+"");
                b4.setText(a+b+a/b+1+"");
            }
            else if(w==2)
            {
                b1.setText(a*5+"");
                b2.setText(a+b+"");
                b3.setText(a+b+3+"");
                b4.setText(a+b+a/b+15+"");
            }
            else if(w==3)
            {
                b1.setText(a+b+11+"");
                b2.setText(3*a+"");
                b3.setText(a+b+"");

                b4.setText(2*b+"");
            }
            else if(w==4)
            {
                b1.setText(a+b+8+"");
                b2.setText(2*a+"");
                b3.setText(a+b+3+"");
                b4.setText(a+b+"");
            }
        }
    }

    }
  
