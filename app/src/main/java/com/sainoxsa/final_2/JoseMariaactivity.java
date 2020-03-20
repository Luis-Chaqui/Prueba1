package com.sainoxsa.final_2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import java.util.Timer;
import java.util.TimerTask;

public class JoseMariaactivity extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;
    private int[] galeria={R.drawable.pesca,R.drawable.acampar};

    private Integer imageLength= galeria.length;
    private Integer counter =-1;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_jose_mariaactivity);

   }
}
