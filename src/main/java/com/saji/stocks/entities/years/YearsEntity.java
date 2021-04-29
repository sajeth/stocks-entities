package com.saji.stocks.entities.years;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "YEARS")
public class YearsEntity extends BaseEntity {
    @Id
    @Basic(optional = false)
    @Column(name = "YEAR", nullable = false)
    private Integer year;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
