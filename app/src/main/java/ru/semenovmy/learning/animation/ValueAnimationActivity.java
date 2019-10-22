package ru.semenovmy.learning.animation;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ValueAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animation);

        final ImageView imageView = findViewById(R.id.value);

        ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0f, 1f);
        configureAnimation(alphaAnimator);
        alphaAnimator.addUpdateListener(animation -> imageView.setAlpha((Float) animation.getAnimatedValue()));
        alphaAnimator.start();

        final float length = (-1f) * getResources().getDimension(R.dimen.y_length);
        ValueAnimator translationYAnimator = ValueAnimator.ofFloat(0f, length);
        configureAnimation(translationYAnimator);
        translationYAnimator.addUpdateListener(animation -> imageView.setTranslationY((Float) animation.getAnimatedValue()));
        translationYAnimator.start();
    }

    private void configureAnimation(ValueAnimator animator) {
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setRepeatCount(20);
        animator.setDuration(3000);
    }
}
