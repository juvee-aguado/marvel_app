
package com.prueba.juvee.marvel.Objetos.Comics;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("characters")
    private Characters mCharacters;
    @SerializedName("collectedIssues")
    private List<Object> mCollectedIssues;
    @SerializedName("collections")
    private List<Object> mCollections;
    @SerializedName("creators")
    private Creators mCreators;
    @SerializedName("dates")
    private List<Date> mDates;
    @SerializedName("description")
    private Object mDescription;
    @SerializedName("diamondCode")
    private String mDiamondCode;
    @SerializedName("digitalId")
    private Long mDigitalId;
    @SerializedName("ean")
    private String mEan;
    @SerializedName("events")
    private Events mEvents;
    @SerializedName("format")
    private String mFormat;
    @SerializedName("id")
    private Long mId;
    @SerializedName("images")
    private List<Object> mImages;
    @SerializedName("isbn")
    private String mIsbn;
    @SerializedName("issn")
    private String mIssn;
    @SerializedName("issueNumber")
    private Long mIssueNumber;
    @SerializedName("modified")
    private String mModified;
    @SerializedName("pageCount")
    private Long mPageCount;
    @SerializedName("prices")
    private List<Price> mPrices;
    @SerializedName("resourceURI")
    private String mResourceURI;
    @SerializedName("series")
    private Series mSeries;
    @SerializedName("stories")
    private Stories mStories;
    @SerializedName("textObjects")
    private List<Object> mTextObjects;
    @SerializedName("thumbnail")
    private Thumbnail mThumbnail;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("upc")
    private String mUpc;
    @SerializedName("urls")
    private List<Url> mUrls;
    @SerializedName("variantDescription")
    private String mVariantDescription;
    @SerializedName("variants")
    private List<Object> mVariants;

    public Characters getCharacters() {
        return mCharacters;
    }

    public List<Object> getCollectedIssues() {
        return mCollectedIssues;
    }

    public List<Object> getCollections() {
        return mCollections;
    }

    public Creators getCreators() {
        return mCreators;
    }

    public List<Date> getDates() {
        return mDates;
    }

    public Object getDescription() {
        return mDescription;
    }

    public String getDiamondCode() {
        return mDiamondCode;
    }

    public Long getDigitalId() {
        return mDigitalId;
    }

    public String getEan() {
        return mEan;
    }

    public Events getEvents() {
        return mEvents;
    }

    public String getFormat() {
        return mFormat;
    }

    public Long getId() {
        return mId;
    }

    public List<Object> getImages() {
        return mImages;
    }

    public String getIsbn() {
        return mIsbn;
    }

    public String getIssn() {
        return mIssn;
    }

    public Long getIssueNumber() {
        return mIssueNumber;
    }

    public String getModified() {
        return mModified;
    }

    public Long getPageCount() {
        return mPageCount;
    }

    public List<Price> getPrices() {
        return mPrices;
    }

    public String getResourceURI() {
        return mResourceURI;
    }

    public Series getSeries() {
        return mSeries;
    }

    public Stories getStories() {
        return mStories;
    }

    public List<Object> getTextObjects() {
        return mTextObjects;
    }

    public Thumbnail getThumbnail() {
        return mThumbnail;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUpc() {
        return mUpc;
    }

    public List<Url> getUrls() {
        return mUrls;
    }

    public String getVariantDescription() {
        return mVariantDescription;
    }

    public List<Object> getVariants() {
        return mVariants;
    }

    public static class Builder {

        private Characters mCharacters;
        private List<Object> mCollectedIssues;
        private List<Object> mCollections;
        private Creators mCreators;
        private List<Date> mDates;
        private Object mDescription;
        private String mDiamondCode;
        private Long mDigitalId;
        private String mEan;
        private Events mEvents;
        private String mFormat;
        private Long mId;
        private List<Object> mImages;
        private String mIsbn;
        private String mIssn;
        private Long mIssueNumber;
        private String mModified;
        private Long mPageCount;
        private List<Price> mPrices;
        private String mResourceURI;
        private Series mSeries;
        private Stories mStories;
        private List<Object> mTextObjects;
        private Thumbnail mThumbnail;
        private String mTitle;
        private String mUpc;
        private List<Url> mUrls;
        private String mVariantDescription;
        private List<Object> mVariants;

        public Result.Builder withCharacters(Characters characters) {
            mCharacters = characters;
            return this;
        }

        public Result.Builder withCollectedIssues(List<Object> collectedIssues) {
            mCollectedIssues = collectedIssues;
            return this;
        }

        public Result.Builder withCollections(List<Object> collections) {
            mCollections = collections;
            return this;
        }

        public Result.Builder withCreators(Creators creators) {
            mCreators = creators;
            return this;
        }

        public Result.Builder withDates(List<Date> dates) {
            mDates = dates;
            return this;
        }

        public Result.Builder withDescription(Object description) {
            mDescription = description;
            return this;
        }

        public Result.Builder withDiamondCode(String diamondCode) {
            mDiamondCode = diamondCode;
            return this;
        }

        public Result.Builder withDigitalId(Long digitalId) {
            mDigitalId = digitalId;
            return this;
        }

        public Result.Builder withEan(String ean) {
            mEan = ean;
            return this;
        }

        public Result.Builder withEvents(Events events) {
            mEvents = events;
            return this;
        }

        public Result.Builder withFormat(String format) {
            mFormat = format;
            return this;
        }

        public Result.Builder withId(Long id) {
            mId = id;
            return this;
        }

        public Result.Builder withImages(List<Object> images) {
            mImages = images;
            return this;
        }

        public Result.Builder withIsbn(String isbn) {
            mIsbn = isbn;
            return this;
        }

        public Result.Builder withIssn(String issn) {
            mIssn = issn;
            return this;
        }

        public Result.Builder withIssueNumber(Long issueNumber) {
            mIssueNumber = issueNumber;
            return this;
        }

        public Result.Builder withModified(String modified) {
            mModified = modified;
            return this;
        }

        public Result.Builder withPageCount(Long pageCount) {
            mPageCount = pageCount;
            return this;
        }

        public Result.Builder withPrices(List<Price> prices) {
            mPrices = prices;
            return this;
        }

        public Result.Builder withResourceURI(String resourceURI) {
            mResourceURI = resourceURI;
            return this;
        }

        public Result.Builder withSeries(Series series) {
            mSeries = series;
            return this;
        }

        public Result.Builder withStories(Stories stories) {
            mStories = stories;
            return this;
        }

        public Result.Builder withTextObjects(List<Object> textObjects) {
            mTextObjects = textObjects;
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

        public Result.Builder withUpc(String upc) {
            mUpc = upc;
            return this;
        }

        public Result.Builder withUrls(List<Url> urls) {
            mUrls = urls;
            return this;
        }

        public Result.Builder withVariantDescription(String variantDescription) {
            mVariantDescription = variantDescription;
            return this;
        }

        public Result.Builder withVariants(List<Object> variants) {
            mVariants = variants;
            return this;
        }

        public Result build() {
            Result result = new Result();
            result.mCharacters = mCharacters;
            result.mCollectedIssues = mCollectedIssues;
            result.mCollections = mCollections;
            result.mCreators = mCreators;
            result.mDates = mDates;
            result.mDescription = mDescription;
            result.mDiamondCode = mDiamondCode;
            result.mDigitalId = mDigitalId;
            result.mEan = mEan;
            result.mEvents = mEvents;
            result.mFormat = mFormat;
            result.mId = mId;
            result.mImages = mImages;
            result.mIsbn = mIsbn;
            result.mIssn = mIssn;
            result.mIssueNumber = mIssueNumber;
            result.mModified = mModified;
            result.mPageCount = mPageCount;
            result.mPrices = mPrices;
            result.mResourceURI = mResourceURI;
            result.mSeries = mSeries;
            result.mStories = mStories;
            result.mTextObjects = mTextObjects;
            result.mThumbnail = mThumbnail;
            result.mTitle = mTitle;
            result.mUpc = mUpc;
            result.mUrls = mUrls;
            result.mVariantDescription = mVariantDescription;
            result.mVariants = mVariants;
            return result;
        }

    }

}
