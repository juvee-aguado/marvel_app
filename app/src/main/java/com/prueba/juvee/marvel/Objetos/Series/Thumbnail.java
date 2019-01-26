
package com.prueba.juvee.marvel.Objetos.Series;

import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("extension")
    private String mExtension;
    @SerializedName("path")
    private String mPath;

    public String getExtension() {
        return mExtension;
    }

    public String getPath() {
        return mPath;
    }

    public static class Builder {

        private String mExtension;
        private String mPath;

        public Thumbnail.Builder withExtension(String extension) {
            mExtension = extension;
            return this;
        }

        public Thumbnail.Builder withPath(String path) {
            mPath = path;
            return this;
        }

        public Thumbnail build() {
            Thumbnail thumbnail = new Thumbnail();
            thumbnail.mExtension = mExtension;
            thumbnail.mPath = mPath;
            return thumbnail;
        }

    }

}
