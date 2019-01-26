
package com.prueba.juvee.marvel.Objetos.Comics;


import com.google.gson.annotations.SerializedName;

public class Series {

    @SerializedName("name")
    private String mName;
    @SerializedName("resourceURI")
    private String mResourceURI;

    public String getName() {
        return mName;
    }

    public String getResourceURI() {
        return mResourceURI;
    }

    public static class Builder {

        private String mName;
        private String mResourceURI;

        public Series.Builder withName(String name) {
            mName = name;
            return this;
        }

        public Series.Builder withResourceURI(String resourceURI) {
            mResourceURI = resourceURI;
            return this;
        }

        public Series build() {
            Series series = new Series();
            series.mName = mName;
            series.mResourceURI = mResourceURI;
            return series;
        }

    }

}
