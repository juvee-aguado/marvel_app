
package com.prueba.juvee.marvel.Objetos.Comics;


import com.google.gson.annotations.SerializedName;


public class Date {

    @SerializedName("date")
    private String mDate;
    @SerializedName("type")
    private String mType;

    public String getDate() {
        return mDate;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private String mDate;
        private String mType;

        public Date.Builder withDate(String date) {
            mDate = date;
            return this;
        }

        public Date.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Date build() {
            Date date = new Date();
            date.mDate = mDate;
            date.mType = mType;
            return date;
        }

    }

}
