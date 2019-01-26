
package com.prueba.juvee.marvel.Objetos.Series;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("characters")
    private Characters mCharacters;
    @SerializedName("comics")
    private Comics mComics;
    @SerializedName("creators")
    private Creators mCreators;
    @SerializedName("description")
    private Object mDescription;
    @SerializedName("endYear")
    private Long mEndYear;
    @SerializedName("events")
    private Events mEvents;
    @SerializedName("id")
    private Long mId;
    @SerializedName("modified")
    private String mModified;
    @SerializedName("next")
    private Object mNext;
    @SerializedName("previous")
    private Object mPrevious;
    @SerializedName("rating")
    private String mRating;
    @SerializedName("resourceURI")
    private String mResourceURI;
    @SerializedName("startYear")
    private Long mStartYear;
    @SerializedName("stories")
    private Stories mStories;
    @SerializedName("thumbnail")
    private Thumbnail mThumbnail;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;
    @SerializedName("urls")
    private List<Url> mUrls;

    public Characters getCharacters() {
        return mCharacters;
    }

    public Comics getComics() {
        return mComics;
    }

    public Creators getCreators() {
        return mCreators;
    }

    public Object getDescription() {
        return mDescription;
    }

    public Long getEndYear() {
        return mEndYear;
    }

    public Events getEvents() {
        return mEvents;
    }

    public Long getId() {
        return mId;
    }

    public String getModified() {
        return mModified;
    }

    public Object getNext() {
        return mNext;
    }

    public Object getPrevious() {
        return mPrevious;
    }

    public String getRating() {
        return mRating;
    }

    public String getResourceURI() {
        return mResourceURI;
    }

    public Long getStartYear() {
        return mStartYear;
    }

    public Stories getStories() {
        return mStories;
    }

    public Thumbnail getThumbnail() {
        return mThumbnail;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getType() {
        return mType;
    }

    public List<Url> getUrls() {
        return mUrls;
    }

    public static class Builder {

        private Characters mCharacters;
        private Comics mComics;
        private Creators mCreators;
        private Object mDescription;
        private Long mEndYear;
        private Events mEvents;
        private Long mId;
        private String mModified;
        private Object mNext;
        private Object mPrevious;
        private String mRating;
        private String mResourceURI;
        private Long mStartYear;
        private Stories mStories;
        private Thumbnail mThumbnail;
        private String mTitle;
        private String mType;
        private List<Url> mUrls;

        public Result.Builder withCharacters(Characters characters) {
            mCharacters = characters;
            return this;
        }

        public Result.Builder withComics(Comics comics) {
            mComics = comics;
            return this;
        }

        public Result.Builder withCreators(Creators creators) {
            mCreators = creators;
            return this;
        }

        public Result.Builder withDescription(Object description) {
            mDescription = description;
            return this;
        }

        public Result.Builder withEndYear(Long endYear) {
            mEndYear = endYear;
            return this;
        }

        public Result.Builder withEvents(Events events) {
            mEvents = events;
            return this;
        }

        public Result.Builder withId(Long id) {
            mId = id;
            return this;
        }

        public Result.Builder withModified(String modified) {
            mModified = modified;
            return this;
        }

        public Result.Builder withNext(Object next) {
            mNext = next;
            return this;
        }

        public Result.Builder withPrevious(Object previous) {
            mPrevious = previous;
            return this;
        }

        public Result.Builder withRating(String rating) {
            mRating = rating;
            return this;
        }

        public Result.Builder withResourceURI(String resourceURI) {
            mResourceURI = resourceURI;
            return this;
        }

        public Result.Builder withStartYear(Long startYear) {
            mStartYear = startYear;
            return this;
        }

        public Result.Builder withStories(Stories stories) {
            mStories = stories;
            return this;
        }

        public Result.Builder withThumbnail(Thumbnail thumbnail) {
            mThumbnail = thumbnail;
            return this;
        }

        public Result.Builder withTitle(String title) {
            mTitle = title;
            return this;
        }

        public Result.Builder withType(String type) {
            mType = type;
            return this;
        }

        public Result.Builder withUrls(List<Url> urls) {
            mUrls = urls;
            return this;
        }

        public Result build() {
            Result result = new Result();
            result.mCharacters = mCharacters;
            result.mComics = mComics;
            result.mCreators = mCreators;
            result.mDescription = mDescription;
            result.mEndYear = mEndYear;
            result.mEvents = mEvents;
            result.mId = mId;
            result.mModified = mModified;
            result.mNext = mNext;
            result.mPrevious = mPrevious;
            result.mRating = mRating;
            result.mResourceURI = mResourceURI;
            result.mStartYear = mStartYear;
            result.mStories = mStories;
            result.mThumbnail = mThumbnail;
            result.mTitle = mTitle;
            result.mType = mType;
            result.mUrls = mUrls;
            return result;
        }

    }

}
