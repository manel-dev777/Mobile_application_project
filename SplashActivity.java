package com.example.umbb_mobguide;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        View icon = findViewById(R.id.splashIcon);
        View title = findViewById(R.id.splashTitle);
        View sub = findViewById(R.id.splashSub);
        View progress = findViewById(R.id.splashProgress);

        fadeIn(icon, 0);
        fadeIn(title, 300);
        fadeIn(sub, 600);
        fadeIn(progress, 900);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 2500);
    }

    private void fadeIn(View view, long delay) {
        ObjectAnimator anim = ObjectAnimator.ofFloat(view, "alpha", 0f, 1f);
        anim.setDuration(800);
        anim.setStartDelay(delay);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.start();
    }
}