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
public class Watchlist extends BaseEntity {
    @Id
    @Basic(optional = false)
    @Column(name = "SYMBOL", nullable = false)
    private String symbol;

    @Column(name = "PRICETOBOOK", nullable = false)
    private BigDecimal priceToBook;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(final String value) {
        this.symbol = value;
    }

    public BigDecimal getPriceToBook() {
        return priceToBook;
    }

    public void setPriceToBook(BigDecimal priceToBook) {
        this.priceToBook = priceToBook;
    }
}

