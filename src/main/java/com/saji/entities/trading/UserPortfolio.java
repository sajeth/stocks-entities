package com.saji.entities.trading;

import com.saji.entities.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "USER_PORTFOLIO")
public class UserPortfolio extends BaseEntity {

    @Column(name = "INVESTMENT_TYPE", nullable = false)
    private String investmentType;
    @Column(name = "INVESTMENT_ID", nullable = false)
    private BigInteger investmentId;
    @Column(name = "AMOUNT_INVESTED", nullable = false)
    private BigDecimal amountInvested;
    @Column(name = "PROFIT", nullable = false)
    private BigDecimal profit;
    @Column(name = "DIVIDENDS_EARNED", nullable = false)
    private BigDecimal dividendsEarned;
    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User userid;
    @Column(name = "LINK", nullable = false)
    private String link;
    @Column(name = "LOGICAL_DEL_IN")
    private String logicalDeleteIn;


    public UserPortfolio() {
    }

    public UserPortfolio(String investmentType, BigInteger investmentId, BigDecimal amountInvested, BigDecimal profit, BigDecimal dividendsEarned, User userid) {
        this.investmentType = investmentType;
        this.investmentId = investmentId;
        this.amountInvested = amountInvested;
        this.profit = profit;
        this.dividendsEarned = dividendsEarned;
        this.userid = userid;
    }

    public String getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(String investmentType) {
        this.investmentType = investmentType;
    }

    public BigInteger getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(BigInteger investmentId) {
        this.investmentId = investmentId;
    }

    public BigDecimal getAmountInvested() {
        return amountInvested;
    }

    public void setAmountInvested(BigDecimal amountInvested) {
        this.amountInvested = amountInvested;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getDividendsEarned() {
        return dividendsEarned;
    }

    public void setDividendsEarned(BigDecimal dividendsEarned) {
        this.dividendsEarned = dividendsEarned;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLogicalDeleteIn() {
        return logicalDeleteIn;
    }

    public void setLogicalDeleteIn(String logicalDeleteIn) {
        this.logicalDeleteIn = logicalDeleteIn;
    }
}
