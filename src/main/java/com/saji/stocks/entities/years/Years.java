package com.saji.stocks.entities.years;

import com.saji.stocks.entities.models.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "YEARS")
public class Years extends BaseEntity {
    @Column(name = "YEAR", nullable = false)
    private String year;
}
