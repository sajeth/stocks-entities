package com.saji.entities.data;

import com.saji.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "ETF")
public class ETF extends BaseEntity {
    @Column(name = "ASSET_TYPE", nullable = false)
    private BigInteger assetType;
    @Column(name = "LTP_CLOSE", nullable = false)
    private String ltpClose;
    @Column(name = "CHANGE", nullable = false)
    private String change;
    @Column(name = "DAY_HIGH_LOW", nullable = false)
    private String dayHighLow;
    @Column(name = "52WEEK_HIGH_LOW", nullable = false)
    private String week52HighLow;
    @Column(name = "PREV_CLOSE_OPEN", nullable = false)
    private String prevCloseOpen;
    @Column(name = "WT_AVG_PRICE", nullable = false)
    private BigDecimal wtAvgPrice;
    @Column(name = "TOTAL_VOL", nullable = false)
    private BigInteger totalVol;
    @Column(name = "TURNOVER", nullable = false)
    private BigDecimal turnover;
    @Column(name = "CIRCUIT_LIMITS", nullable = false)
    private String cktLimits;

    public ETF() {
    }


    public BigInteger getAssetType() {
        return assetType;
    }

    public void setAssetType(BigInteger assetType) {
        this.assetType = assetType;
    }

    public String getLtpClose() {
        return ltpClose;
    }

    public void setLtpClose(String ltpClose) {
        this.ltpClose = ltpClose;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getDayHighLow() {
        return dayHighLow;
    }

    public void setDayHighLow(String dayHighLow) {
        this.dayHighLow = dayHighLow;
    }

    public String getWeek52HighLow() {
        return week52HighLow;
    }

    public void setWeek52HighLow(String week52HighLow) {
        this.week52HighLow = week52HighLow;
    }

    public String getPrevCloseOpen() {
        return prevCloseOpen;
    }

    public void setPrevCloseOpen(String prevCloseOpen) {
        this.prevCloseOpen = prevCloseOpen;
    }

    public BigDecimal getWtAvgPrice() {
        return wtAvgPrice;
    }

    public void setWtAvgPrice(BigDecimal wtAvgPrice) {
        this.wtAvgPrice = wtAvgPrice;
    }

    public BigInteger getTotalVol() {
        return totalVol;
    }

    public void setTotalVol(BigInteger totalVol) {
        this.totalVol = totalVol;
    }

    public BigDecimal getTurnover() {
        return turnover;
    }

    public void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public String getCktLimits() {
        return cktLimits;
    }

    public void setCktLimits(String cktLimits) {
        this.cktLimits = cktLimits;
    }
}
