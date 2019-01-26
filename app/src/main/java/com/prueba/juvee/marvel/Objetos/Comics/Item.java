
package com.prueba.juvee.marvel.Objetos.Comics;


import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("name")
    private String mName;
    @SerializedName("resourceURI")
    private String mResourceURI;
    @SerializedName("role")
    private String mRole;
    @SerializedName("type")
    private String mType;

    public String getName() {
        return mName;
    }

    public String getResourceURI() {
        return mResourceURI;
    }

    public String getRole() {
        return mRole;
    }

    public String getType() {
        return mType;
    }

    public static class Builder {

        private String mName;
        private String mResourceURI;
        private String mRole;
        private String mType;

        public Item.Builder withName(String name) {
            mName = name;
            return this;
        }

        public Item.Builder withResourceURI(String resourceURI) {
            mResourceURI = resourceURI;
            return this;
        }

        public Item.Builder withRole(String role) {
            mRole = role;
            return this;
        }

        public Item.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Item build() {
            Item item = new Item();
            item.mName = mName;
            item.mResourceURI = mResourceURI;
            item.mRole = mRole;
            item.mType = mType;
            return item;
        }

    }

}
