
package com.prueba.juvee.marvel.Objetos.Comics;


import com.google.gson.annotations.SerializedName;

public class Url {

    @SerializedName("type")
    private String mType;
    @SerializedName("url")
    private String mUrl;

    public String getType() {
        return mType;
    }

    public String getUrl() {
        return mUrl;
    }

    public static class Builder {

        private String mType;
        private String mUrl;

        public Url.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Url.Builder withUrl(String url) {
            mUrl = url;
            return this;
        }

        public Url build() {
            Url url = new Url();
            url.mType = mType;
            url.mUrl = mUrl;
            return url;
        }

    }

}
