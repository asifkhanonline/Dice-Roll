package com.lco.dicerollar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2;
    private Random random=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDices =  findViewById(R.id.rollDices);
        imageView1 =  findViewById(R.id.imageView1);
        imageView2 =  findViewById(R.id.imageView2);

        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animate();
                roll1();
                roll2();


            }
        });
    }

    public void animate(){
        //set two pivot points
        int pivotY=imageView1.getHeight()/2;
        int pivotX=imageView2.getWidth()/2;
        int first;
        int last;
        Random r;
        r=new Random();
        int a=r.nextInt(3600);
        last=0;
        first=a;
        Animation rotate=new RotateAnimation(first,last,pivotX,pivotY);
        rotate.setDuration(2000);
        rotate.setFillAfter(true);
        imageView1.startAnimation(rotate);
        imageView2.startAnimation(rotate);

    }
    public void roll1(){
        int number =random.nextInt(6)+1;
        if(number==1){
            imageView2.setImageResource(R.drawable.d1);

        }
        else if(number==2){
            imageView2.setImageResource(R.drawable.d2);
        }
        else if(number==3){
            imageView2.setImageResource(R.drawable.d3);
        }
        else if(number==4){
            imageView2.setImageResource(R.drawable.d4);
        }
        else if(number==5){
            imageView2.setImageResource(R.drawable.d5);
        }
        else if(number==6){
            imageView2.setImageResource(R.drawable.d9);
        }


    }
    public void roll2(){
        int number =random.nextInt(6)+1;
        if(number==1){
            imageView1.setImageResource(R.drawable.d1);

        }
        else if(number==2){
            imageView1.setImageResource(R.drawable.d2);
        }
        else if(number==3){
            imageView1.setImageResource(R.drawable.d3);
        }
        else if(number==4){
            imageView1.setImageResource(R.drawable.d4);
        }
        else if(number==5){
            imageView1.setImageResource(R.drawable.d5);
        }
        else if(number==6){
            imageView1.setImageResource(R.drawable.d9);
        }


    }

}


