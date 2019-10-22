package ru.semenovmy.learning.animation;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ObjectAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation);

        ImageView imageView = findViewById(R.id.object);

        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 0.3f, 0.5f, 0.3f, 1f, 0.3f);
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(imageView, "scaleY", 0.3f, 0.5f, 0.3f, 1f, 0.3f);
        configure(scaleXAnimator).start();
        configure(scaleYAnimator).start();
    }

    private Animator configure(ObjectAnimator animator) {
        animator.setDuration(1000);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        return animator;
    }
}
