package com.saji.entities.data;

import com.saji.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "INDEXES")
public class Indx extends BaseEntity {
    @Column(name = "OPEN", nullable = false)
    private BigDecimal open;
    @Column(name = "HIGH", nullable = false)
    private BigDecimal high;
    @Column(name = "CUR_VAL", nullable = false)
    private BigDecimal currentValue;
    @Column(name = "LOW", nullable = false)
    private BigDecimal low;
    @Column(name = "PREV_CLOSE", nullable = false)
    private BigDecimal prevClose;
    @Column(name = "CH_PTS", nullable = false)
    private BigDecimal chPts;
    @Column(name = "CH_PERCENTAGE", nullable = false)
    private BigDecimal chPercentage;
    @Column(name = "52_WK_HIGH", nullable = false)
    private BigDecimal wk52High;
    @Column(name = "52_WK_LOW", nullable = false)
    private BigDecimal wk52Low;
    @Column(name = "TURNOVER_IN_CR", nullable = false)
    private BigDecimal turnoverInCr;
    @Column(name = "PERCENTAGE_IN_TOTAL_TURNOVER", nullable = false)
    private BigDecimal percentageInTotalTurnOver;

    public Indx() {
    }

    public Indx(BigDecimal open, BigDecimal high, BigDecimal currentValue, BigDecimal low, BigDecimal prevClose, BigDecimal chPts, BigDecimal chPercentage, BigDecimal wk52High, BigDecimal wk52Low, BigDecimal turnoverInCr, BigDecimal percentageInTotalTurnOver) {
        this.open = open;
        this.high = high;
        this.currentValue = currentValue;
        this.low = low;
        this.prevClose = prevClose;
        this.chPts = chPts;
        this.chPercentage = chPercentage;
        this.wk52High = wk52High;
        this.wk52Low = wk52Low;
        this.turnoverInCr = turnoverInCr;
        this.percentageInTotalTurnOver = percentageInTotalTurnOver;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(BigDecimal prevClose) {
        this.prevClose = prevClose;
    }

    public BigDecimal getChPts() {
        return chPts;
    }

    public void setChPts(BigDecimal chPts) {
        this.chPts = chPts;
    }

    public BigDecimal getChPercentage() {
        return chPercentage;
    }

    public void setChPercentage(BigDecimal chPercentage) {
        this.chPercentage = chPercentage;
    }

    public BigDecimal getWk52High() {
        return wk52High;
    }

    public void setWk52High(BigDecimal wk52High) {
        this.wk52High = wk52High;
    }

    public BigDecimal getWk52Low() {
        return wk52Low;
    }

    public void setWk52Low(BigDecimal wk52Low) {
        this.wk52Low = wk52Low;
    }

    public BigDecimal getTurnoverInCr() {
        return turnoverInCr;
    }

    public void setTurnoverInCr(BigDecimal turnoverInCr) {
        this.turnoverInCr = turnoverInCr;
    }

    public BigDecimal getPercentageInTotalTurnOver() {
        return percentageInTotalTurnOver;
    }

    public void setPercentageInTotalTurnOver(BigDecimal percentageInTotalTurnOver) {
        this.percentageInTotalTurnOver = percentageInTotalTurnOver;
    }
}
