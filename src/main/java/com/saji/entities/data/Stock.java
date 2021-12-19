package com.saji.entities.data;

import com.saji.entities.BaseEntity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "STOCKS")
public class Stock extends BaseEntity {

    @Column(name = "LINK")
    private String link;
    @ManyToOne
    @JoinColumn(name = "SECTOR_ID", nullable = false)
    private Sector sector;


    public Stock() {
    }

    public Stock(BigInteger stockId, String symbol, String link, Sector sector) {
        this.setId(stockId);
        this.setName(symbol);
        this.link = link;
        this.sector = sector;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
