package com.saji.entities.configurations;

import com.saji.entities.BaseEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "EXCHANGE")
public class Exchange extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID", nullable = false)
    private Country country;
    private String yRef;
    @Column(name = "HOME_PAGE")
    private String homePage;
    @Column(name = "BLOOMBERG_EXCHANGE_CODE")
    private String bloombergExchangeCode;
    @Column(name = "BLOOMBERG_COMPOSITE_CODE")
    private String bloomBergCompositeCode;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "GOOGLE_PREFIX")
    private String googlePrefix;
    @Column(name = "EOD_CODE")
    private String eodCode;

    @OneToMany(mappedBy = "exchange")
    private Set<ExchngInvstmnt> exchngInvstmnts;

    @Column(name = "LOGICAL_DEL_IN")
    private String logicalDeleteIn;


    public String getLogicalDelIn() {
        return logicalDeleteIn;
    }

    public void setLogicalDelIn(final String value) {
        this.logicalDeleteIn = value;
    }

    public Exchange() {
    }

    public String getyRef() {
        return yRef;
    }

    public void setyRef(final String yRef) {
        this.yRef = yRef;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(final String homePage) {
        this.homePage = homePage;
    }

    public String getBloombergExchangeCode() {
        return bloombergExchangeCode;
    }

    public void setBloombergExchangeCode(final String bloombergExchangeCode) {
        this.bloombergExchangeCode = bloombergExchangeCode;
    }

    public String getBloomBergCompositeCode() {
        return bloomBergCompositeCode;
    }

    public void setBloomBergCompositeCode(final String bloomBergCompositeCode) {
        this.bloomBergCompositeCode = bloomBergCompositeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getGooglePrefix() {
        return googlePrefix;
    }

    public void setGooglePrefix(final String googlePrefix) {
        this.googlePrefix = googlePrefix;
    }

    public String getEodCode() {
        return eodCode;
    }

    public void setEodCode(final String eodCode) {
        this.eodCode = eodCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

    public Set<ExchngInvstmnt> getExchngInvstmnts() {
        return exchngInvstmnts;
    }

    public void setExchngInvstmnts(final Set<ExchngInvstmnt> exchngInvstmnts) {
        this.exchngInvstmnts = exchngInvstmnts;
    }
}

