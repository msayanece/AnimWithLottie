package com.sample.sayan.secondanimwithlotte;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickClose(View view) {
        LottieAnimationView animationView = (LottieAnimationView) view;
        animationView.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.d("sayanOnAnimationUpdate", ": " + animation.getAnimatedFraction());
            }
        });
        if (animationView.isAnimating()) {
            animationView.pauseAnimation();
        } else {
            animationView.playAnimation(0.3f, 0.45f);
        }
    }
}
