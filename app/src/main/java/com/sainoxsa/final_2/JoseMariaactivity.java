package com.sainoxsa.final_2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.util.Timer;
import java.util.TimerTask;

public class JoseMariaactivity extends AppCompatActivity {

    private RatingBar ratingBar;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_jose_mariaactivity);

       ratingBar = (RatingBar)findViewById(R.id.calificacion);
       ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
           @Override
           public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               Toast.makeText(JoseMariaactivity.this, "Nos has calificado con"+rating,Toast.LENGTH_LONG).show();
           }
       });

   }
}
