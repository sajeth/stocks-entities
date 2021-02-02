package com.saji.stocks.entities.stock;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author saji 19-Aug-2018
 */
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "STOCKS")
public class StockEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "STOCK_ID", nullable = false)
    private Long stockId;

    @Column(name = "SYMBOL", nullable = false)
    private String symbol;

    @Column(name = "EXCHANGE")
    private String exchange;

    @Column(name = "SECTOR")
    private String sector;

    @Column(name = "INDUSTRY")
    private String industry;

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(final Long value) {
        this.stockId = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(final String value) {
        this.symbol = value;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(final String value) {
        this.exchange = value;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(final String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(final String industry) {
        this.industry = industry;
    }

}
