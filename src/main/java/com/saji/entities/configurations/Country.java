package com.saji.entities.configurations;

import com.saji.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Set;

@Entity
@Table(name = "COUNTRY")
public class Country extends BaseEntity {

    @Column(name = "COUNTRY_CODE")
    private String countryCode;
    @Column(name = "CURRENCY")
    private String currency;

    @OneToMany(mappedBy = "country")
    private Set<Exchange> exchanges;

    @Column(name = "LOGICAL_DEL_IN")
    private String logicalDeleteIn;


    public String getLogicalDelIn() {
        return logicalDeleteIn;
    }

    public void setLogicalDelIn(final String value) {
        this.logicalDeleteIn = value;
    }

    public Country() {
    }

    public Country(final BigInteger countryId, final String countryName, final String countryCode, final String currency) {
        this.setId(countryId);
        this.setName(countryName);
        this.countryCode = countryCode;
        this.currency = currency;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public Set<Exchange> getExchanges() {
        return exchanges;
    }

    public void setExchanges(final Set<Exchange> exchanges) {
        this.exchanges = exchanges;
    }
}
