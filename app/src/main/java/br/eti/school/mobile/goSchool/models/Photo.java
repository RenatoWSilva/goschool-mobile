package br.eti.school.mobile.goSchool.models;

import android.graphics.Bitmap;

/**
 * Created by bruno on 29/08/18.
 */

class Photo {

    private Bitmap content;

    public Photo(Bitmap content) {
        this.content = content;
    }

    public Bitmap getContent() {
        return content;
    }

    public void setContent(Bitmap content) {
        this.content = content;
    }
}
