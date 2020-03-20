package com.sainoxsa.final_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ParamoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paramo);
        //extraemos el drawable en un bitmap
        Drawable originalDrawable = getResources().getDrawable(R.drawable.paramo);
        Bitmap originalBitmap = ((BitmapDrawable) originalDrawable).getBitmap();

        //creamos el drawable redondeado
        RoundedBitmapDrawable roundedDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), originalBitmap);

        //asignamos el CornerRadius
        roundedDrawable.setCornerRadius(originalBitmap.getHeight());

        ImageView imageView = (ImageView) findViewById(R.id.paramo);

        imageView.setImageDrawable(roundedDrawable);
    }
}
