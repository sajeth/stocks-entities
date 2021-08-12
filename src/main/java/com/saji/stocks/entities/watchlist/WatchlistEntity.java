package com.saji.stocks.entities.watchlist;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "WATCHLIST")
public class WatchlistEntity extends BaseEntity {
    @Id
    @Basic(optional = false)
    @Column(name = "SYMBOL", nullable = false)
    private String symbol;
    @Column(name = "PRICE", nullable = true)
    private BigDecimal price;
    @Column(name = "QUANTITY", nullable = true)
    private BigDecimal quantity;

    public String getSymbol() {
        return symbol;
    }

    public WatchlistEntity() {
    }

    public WatchlistEntity(String symbol, BigDecimal price, BigDecimal quantity) {
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}

