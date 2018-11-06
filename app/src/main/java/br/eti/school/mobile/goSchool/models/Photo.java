package br.eti.school.mobile.goSchool.models;

import android.graphics.Bitmap;

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
