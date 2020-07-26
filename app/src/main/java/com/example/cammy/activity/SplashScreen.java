package com.example.cammy.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cammy.R;

public class SplashScreen extends AppCompatActivity {
    Animation topAnim,bottomAnim;
    TextView textView;
    ImageView logo,img1,img2;

    private static int SPLASH_SCREEN= 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        textView = findViewById(R.id.text);


        logo = findViewById(R.id.logo);

        logo.setAnimation(topAnim);

        textView.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
            }
        },SPLASH_SCREEN);

    }
}
