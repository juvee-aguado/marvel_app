
package com.prueba.juvee.marvel.Objetos.Comics;

import com.google.gson.annotations.SerializedName;

public class ResultadoComic {

    @SerializedName("attributionHTML")
    private String mAttributionHTML;
    @SerializedName("attributionText")
    private String mAttributionText;
    @SerializedName("code")
    private Long mCode;
    @SerializedName("copyright")
    private String mCopyright;
    @SerializedName("data")
    private Data mData;
    @SerializedName("etag")
    private String mEtag;
    @SerializedName("status")
    private String mStatus;

    public String getAttributionHTML() {
        return mAttributionHTML;
    }

    public String getAttributionText() {
        return mAttributionText;
    }

    public Long getCode() {
        return mCode;
    }

    public String getCopyright() {
        return mCopyright;
    }

    public Data getData() {
        return mData;
    }

    public String getEtag() {
        return mEtag;
    }

    public String getStatus() {
        return mStatus;
    }

    public static class Builder {

        private String mAttributionHTML;
        private String mAttributionText;
        private Long mCode;
        private String mCopyright;
        private Data mData;
        private String mEtag;
        private String mStatus;

        public ResultadoComic.Builder withAttributionHTML(String attributionHTML) {
            mAttributionHTML = attributionHTML;
            return this;
        }

        public ResultadoComic.Builder withAttributionText(String attributionText) {
            mAttributionText = attributionText;
            return this;
        }

        public ResultadoComic.Builder withCode(Long code) {
            mCode = code;
            return this;
        }

        public ResultadoComic.Builder withCopyright(String copyright) {
            mCopyright = copyright;
            return this;
        }

        public ResultadoComic.Builder withData(Data data) {
            mData = data;
            return this;
        }

        public ResultadoComic.Builder withEtag(String etag) {
            mEtag = etag;
            return this;
        }

        public ResultadoComic.Builder withStatus(String status) {
            mStatus = status;
            return this;
        }

        public ResultadoComic build() {
            ResultadoComic resultadoComic = new ResultadoComic();
            resultadoComic.mAttributionHTML = mAttributionHTML;
            resultadoComic.mAttributionText = mAttributionText;
            resultadoComic.mCode = mCode;
            resultadoComic.mCopyright = mCopyright;
            resultadoComic.mData = mData;
            resultadoComic.mEtag = mEtag;
            resultadoComic.mStatus = mStatus;
            return resultadoComic;
        }

    }

}
