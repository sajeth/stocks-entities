package com.saji.stocks.entities.sector;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@Table(name = "SECTOR")
public class SectorEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "SECTOR_ID", nullable = false)
    private Long sectorId;
    @Column(name = "SECTOR", nullable = false)
    private String sector;
    @Column(name = "PE", nullable = false)
    private BigDecimal sectorPE;
    @Column(name = "PB", nullable = false)
    private BigDecimal sectorPB;
    @Column(name = "DY", nullable = false)
    private BigDecimal sectorDY;

    public SectorEntity() {
    }

    public SectorEntity(Long sectorId, String sector, BigDecimal sectorPE, BigDecimal sectorPB, BigDecimal sectorDY) {
        this.sectorId = sectorId;
        this.sector = sector;
        this.sectorPE = sectorPE;
        this.sectorPB = sectorPB;
        this.sectorDY = sectorDY;
    }

    public Long getSectorId() {
        return sectorId;
    }

    public void setSectorId(Long sectorId) {
        this.sectorId = sectorId;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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
}
