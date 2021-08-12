package com.saji.stocks.entities.stocks;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "STOCKS")
public class StockEntity extends BaseEntity {
    @Id
    @Basic(optional = false)
    @Column(name = "stock_id", nullable = false)
    private String stockId;
    @Column(name = "symbol", nullable = false)
    private String symbol;
    @Column(name = "industry", nullable = true)
    private String industry;
    @Column(name = "sector", nullable = true)
    private String sector;

    public StockEntity() {
    }

    public StockEntity(String stockId, String symbol, String industry, String sector) {
        this.stockId = stockId;
        this.symbol = symbol;
        this.industry = industry;
        this.sector = sector;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
