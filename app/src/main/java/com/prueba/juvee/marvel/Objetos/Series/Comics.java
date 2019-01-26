
package com.prueba.juvee.marvel.Objetos.Series;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Comics {

    @SerializedName("available")
    private Long mAvailable;
    @SerializedName("collectionURI")
    private String mCollectionURI;
    @SerializedName("items")
    private List<Item> mItems;
    @SerializedName("returned")
    private Long mReturned;

    public Long getAvailable() {
        return mAvailable;
    }

    public String getCollectionURI() {
        return mCollectionURI;
    }

    public List<Item> getItems() {
        return mItems;
    }

    public Long getReturned() {
        return mReturned;
    }

    public static class Builder {

        private Long mAvailable;
        private String mCollectionURI;
        private List<Item> mItems;
        private Long mReturned;

        public Comics.Builder withAvailable(Long available) {
            mAvailable = available;
            return this;
        }

        public Comics.Builder withCollectionURI(String collectionURI) {
            mCollectionURI = collectionURI;
            return this;
        }

        public Comics.Builder withItems(List<Item> items) {
            mItems = items;
            return this;
        }

        public Comics.Builder withReturned(Long returned) {
            mReturned = returned;
            return this;
        }

        public Comics build() {
            Comics comics = new Comics();
            comics.mAvailable = mAvailable;
            comics.mCollectionURI = mCollectionURI;
            comics.mItems = mItems;
            comics.mReturned = mReturned;
            return comics;
        }

    }

}
