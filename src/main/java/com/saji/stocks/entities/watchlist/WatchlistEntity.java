package com.saji.stocks.entities.watchlist;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "WATCHLIST")
public class WatchlistEntity extends BaseEntity {
    @Id
    @Basic(optional = false)
    @Column(name = "SYMBOL", nullable = false)
    private String symbol;
    @Column(name = "PB", nullable = true)
    private BigDecimal priceToBook;
    @Column(name = "PE", nullable = true)
    private BigDecimal priceToEarnings;
    @Column(name = "CURRENTRATIO", nullable = true)
    private BigDecimal currentRatio;
    @Column(name = "DEBTRATIO", nullable = true)
    private BigDecimal debtRatio;
    @Column(name = "ROE", nullable = true)
    private BigDecimal roe;
    @Column(name = "eps", nullable = true)
    private BigDecimal eps;
    @Column(name = "SALESGROWTH", nullable = true)
    private BigDecimal salesGrowth;
    @Column(name = "PROFITGROWTH", nullable = true)
    private BigDecimal profitGrowth;

    public WatchlistEntity(String symbol, BigDecimal priceToBook, BigDecimal priceToEarnings, BigDecimal currentRatio, BigDecimal debtRatio, BigDecimal roe, BigDecimal eps, BigDecimal salesGrowth, BigDecimal profitGrowth) {
        this.symbol = symbol;
        this.priceToBook = priceToBook;
        this.priceToEarnings = priceToEarnings;
        this.currentRatio = currentRatio;
        this.debtRatio = debtRatio;
        this.roe = roe;
        this.eps = eps;
        this.salesGrowth = salesGrowth;
        this.profitGrowth = profitGrowth;
    }

    public String getSymbol() {
        return symbol;
    }

    public WatchlistEntity() {
    }

    public BigDecimal getPriceToBook() {
        return priceToBook;
    }

    public void setPriceToBook(BigDecimal priceToBook) {
        this.priceToBook = priceToBook;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getPriceToEarnings() {
        return priceToEarnings;
    }

    public void setPriceToEarnings(BigDecimal priceToEarnings) {
        this.priceToEarnings = priceToEarnings;
    }

    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(BigDecimal currentRatio) {
        this.currentRatio = currentRatio;
    }

    public BigDecimal getDebtRatio() {
        return debtRatio;
    }

    public void setDebtRatio(BigDecimal debtRatio) {
        this.debtRatio = debtRatio;
    }

    public BigDecimal getRoe() {
        return roe;
    }

    public void setRoe(BigDecimal roe) {
        this.roe = roe;
    }

    public BigDecimal getEps() {
        return eps;
    }

    public void setEps(BigDecimal eps) {
        this.eps = eps;
    }

    public BigDecimal getSalesGrowth() {
        return salesGrowth;
    }

    public void setSalesGrowth(BigDecimal salesGrowth) {
        this.salesGrowth = salesGrowth;
    }

    public BigDecimal getProfitGrowth() {
        return profitGrowth;
    }

    public void setProfitGrowth(BigDecimal profitGrowth) {
        this.profitGrowth = profitGrowth;
    }
}

