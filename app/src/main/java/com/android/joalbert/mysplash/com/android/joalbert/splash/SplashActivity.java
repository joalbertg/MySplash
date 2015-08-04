package com.android.joalbert.mysplash.com.android.joalbert.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.android.joalbert.mysplash.MainActivity;
import com.android.joalbert.mysplash.R;

/**
 * Created by Joalbert on 03-08-2015.
 */
public class SplashActivity extends Activity {

    // duración en milisegundos que se mostrará el splash
    private final int DURACION_SPLASH = 2000; // 2 segundos

    private ImageView imageView = null;
    // objeto para manejar las imagenes aleatorias
    private CoolPicture coolPicture = new CoolPicture();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);

        imageView = (ImageView) findViewById(R.id.IV_Splash);
        // se asigna la imagen correspondiente
        imageView.setImageResource(coolPicture.getImageResource());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);

                startActivity(intent);
                // para eliminar la actividad
                finish();
            }
        }, DURACION_SPLASH);
    }
}
