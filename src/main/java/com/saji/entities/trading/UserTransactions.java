package com.saji.entities.trading;

import com.saji.entities.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "USER_TRANSACTIONS")
public class UserTransactions extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "USER_PORTFOLIO_ID", nullable = false)
    private UserPortfolio transaction;
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;
    @Column(name = "QUANTITY", nullable = false)
    private BigInteger quantity;
    @Column(name = "TRANSACTION_TYPE", nullable = false)
    private String transactionType;
    @Column(name = "BROKERAGE", nullable = false)
    private BigDecimal brokerage;

    public UserTransactions() {
    }

    public UserTransactions(UserPortfolio transaction, BigDecimal price, BigInteger quantity, String transactionType, BigDecimal brokerage) {
        this.transaction = transaction;
        this.price = price;
        this.quantity = quantity;
        this.transactionType = transactionType;
        this.brokerage = brokerage;
    }

    public UserPortfolio getTransaction() {
        return transaction;
    }

    public void setTransaction(UserPortfolio transaction) {
        this.transaction = transaction;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(BigDecimal brokerage) {
        this.brokerage = brokerage;
    }
}
