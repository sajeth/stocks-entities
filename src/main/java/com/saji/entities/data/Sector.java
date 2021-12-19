package com.saji.entities.data;

import com.saji.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "SECTOR")
public class Sector extends BaseEntity {

    @Column(name = "PE")
    private BigDecimal sectorPE;
    @Column(name = "PB")
    private BigDecimal sectorPB;
    @Column(name = "DY")
    private BigDecimal sectorDY;
    @OneToMany(mappedBy = "sector")
    private Set<Stock> stocks;

    public Sector() {
    }

    public Sector(BigInteger sectorId, String sector, BigDecimal sectorPE, BigDecimal sectorPB, BigDecimal sectorDY) {
        this.setId(sectorId);
        this.setName(sector);
        this.sectorPE = sectorPE;
        this.sectorPB = sectorPB;
        this.sectorDY = sectorDY;
    }

    public BigDecimal getSectorPE() {
        return sectorPE;
    }

    public void setSectorPE(BigDecimal sectorPE) {
        this.sectorPE = sectorPE;
    }

    public BigDecimal getSectorPB() {
        return sectorPB;
    }

    public void setSectorPB(BigDecimal sectorPB) {
        this.sectorPB = sectorPB;
    }

    public BigDecimal getSectorDY() {
        return sectorDY;
    }

    public void setSectorDY(BigDecimal sectorDY) {
        this.sectorDY = sectorDY;
    }

    public Set<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }
}
