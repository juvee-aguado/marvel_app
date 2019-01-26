
package com.prueba.juvee.marvel.Objetos.Comics;


import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("price")
    private String mPrice;
    @SerializedName("type")
    private String mType;

    public String getPrice() {
        return mPrice;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private String mPrice;
        private String mType;

        public Price.Builder withPrice(String price) {
            mPrice = price;
            return this;
        }

        public Price.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Price build() {
            Price price = new Price();
            price.mPrice = mPrice;
            price.mType = mType;
            return price;
        }

    }

}
