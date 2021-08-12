package com.saji.stocks.entities.data;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "STOCKS")
public class StockMetaData extends BaseEntity {
    @Id
    @Basic(optional = false)
    @Column(name = "stock_id", nullable = false)
    private String stockId;
    @Column(name = "priceToBook", nullable = true)
    private BigDecimal priceToBook;
    @Column(name = "priceToEarning", nullable = true)
    private BigDecimal priceToEarning;
    @Column(name = "debt_ratio", nullable = true)
    private BigDecimal debtRatio;
    @Column(name = "current_ratio", nullable = true)
    private BigDecimal currentRatio;
    @Column(name = "roe", nullable = true)
    private BigDecimal roe;

    public StockMetaData() {
    }

    public StockMetaData(String stockId, BigDecimal priceToBook, BigDecimal priceToEarning, BigDecimal debtRatio, BigDecimal currentRatio, BigDecimal roe) {
        this.stockId = stockId;
        this.priceToBook = priceToBook;
        this.priceToEarning = priceToEarning;
        this.debtRatio = debtRatio;
        this.currentRatio = currentRatio;
        this.roe = roe;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public BigDecimal getPriceToBook() {
        return priceToBook;
    }

    public void setPriceToBook(BigDecimal priceToBook) {
        this.priceToBook = priceToBook;
    }

    public BigDecimal getPriceToEarning() {
        return priceToEarning;
    }

    public void setPriceToEarning(BigDecimal priceToEarning) {
        this.priceToEarning = priceToEarning;
    }

    public BigDecimal getDebtRatio() {
        return debtRatio;
    }

    public void setDebtRatio(BigDecimal debtRatio) {
        this.debtRatio = debtRatio;
    }

    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(BigDecimal currentRatio) {
        this.currentRatio = currentRatio;
    }

    public BigDecimal getRoe() {
        return roe;
    }

    public void setRoe(BigDecimal roe) {
        this.roe = roe;
    }
}
