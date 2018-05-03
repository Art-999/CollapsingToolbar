package com.example.arturmusayelyan.collapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
    private ImageView splashImageView;
    private TextView splashTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashImageView = findViewById(R.id.splash_image_view);
        splashTextView = findViewById(R.id.splash_text_view);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mytransition);
        splashTextView.startAnimation(myanim);
        splashImageView.startAnimation(myanim);

        final Intent goToMainActivityIntent = new Intent(this, MainActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(goToMainActivityIntent);
                    //overridePendingTransition(R.anim.mytransition,R.anim.mytransition);
                    finish();
                }
            }
        };
        timer.start();
    }


}
