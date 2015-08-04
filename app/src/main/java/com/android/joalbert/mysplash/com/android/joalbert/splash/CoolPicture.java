package com.android.joalbert.mysplash.com.android.joalbert.splash;

import com.android.joalbert.mysplash.R;

import java.util.Random;

/**
 * Created by Joalbert on 03-08-2015.
 * clase que asigna la imagen que aparece en el splash
 */
public class CoolPicture {

    // para identificar la posición de la imagen dentro del arreglo
    private int coolPicIndex = 0;

    // arreglo de imagenes
    private int[] coolPicturesRes = new int[]{R.mipmap.cool1, R.mipmap.cool2, R.mipmap.cool3,
            R.mipmap.cool4, R.mipmap.cool5};

    // constructor donde se asigna un número aleatorio entre 0-4, ya que el arreglo es de 5
    public CoolPicture() {
        Random rand = new Random();

        coolPicIndex = rand.nextInt(coolPicturesRes.length);
    }

    public int getCoolPicIndex() {
        return coolPicIndex;
    }

    public void setCoolPicIndex(int coolPicIndex) {
        this.coolPicIndex = coolPicIndex;
    }

    public int[] getCoolPicturesRes() {
        return coolPicturesRes;
    }

    public void setCoolPicturesRes(int[] coolPicturesRes) {
        this.coolPicturesRes = coolPicturesRes;
    }

    // retorna el id de la imagen correspondiente a la posición dentro del arreglo
    public int getImageResource()
    {
        return getCoolPicturesRes()[getCoolPicIndex()];
    }
}
