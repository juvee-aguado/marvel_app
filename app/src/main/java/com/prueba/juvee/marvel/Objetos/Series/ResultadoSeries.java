
package com.prueba.juvee.marvel.Objetos.Series;

import com.google.gson.annotations.SerializedName;

public class ResultadoSeries {

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

        public ResultadoSeries.Builder withAttributionHTML(String attributionHTML) {
            mAttributionHTML = attributionHTML;
            return this;
        }

        public ResultadoSeries.Builder withAttributionText(String attributionText) {
            mAttributionText = attributionText;
            return this;
        }

        public ResultadoSeries.Builder withCode(Long code) {
            mCode = code;
            return this;
        }

        public ResultadoSeries.Builder withCopyright(String copyright) {
            mCopyright = copyright;
            return this;
        }

        public ResultadoSeries.Builder withData(Data data) {
            mData = data;
            return this;
        }

        public ResultadoSeries.Builder withEtag(String etag) {
            mEtag = etag;
            return this;
        }

        public ResultadoSeries.Builder withStatus(String status) {
            mStatus = status;
            return this;
        }

        public ResultadoSeries build() {
            ResultadoSeries resultadoSeries = new ResultadoSeries();
            resultadoSeries.mAttributionHTML = mAttributionHTML;
            resultadoSeries.mAttributionText = mAttributionText;
            resultadoSeries.mCode = mCode;
            resultadoSeries.mCopyright = mCopyright;
            resultadoSeries.mData = mData;
            resultadoSeries.mEtag = mEtag;
            resultadoSeries.mStatus = mStatus;
            return resultadoSeries;
        }

    }

}
