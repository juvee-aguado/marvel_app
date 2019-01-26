
package com.prueba.juvee.marvel.Objetos.Comics;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Characters {

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

        public Characters.Builder withAvailable(Long available) {
            mAvailable = available;
            return this;
        }

        public Characters.Builder withCollectionURI(String collectionURI) {
            mCollectionURI = collectionURI;
            return this;
        }

        public Characters.Builder withItems(List<Item> items) {
            mItems = items;
            return this;
        }

        public Characters.Builder withReturned(Long returned) {
            mReturned = returned;
            return this;
        }

        public Characters build() {
            Characters characters = new Characters();
            characters.mAvailable = mAvailable;
            characters.mCollectionURI = mCollectionURI;
            characters.mItems = mItems;
            characters.mReturned = mReturned;
            return characters;
        }

    }

}
