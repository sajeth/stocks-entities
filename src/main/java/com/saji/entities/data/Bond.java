package com.saji.entities.data;

import com.saji.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "BONDS")
public class Bond extends BaseEntity {
    @Column(name = "DATE_OF_ISSUANCE", nullable = false)
    private String dateOfIssuance;
    @Column(name = "AMOUNT_IN_CR", nullable = false)
    private BigDecimal amount;
    @Column(name = "NO_OF_INVESTORS", nullable = false)
    private BigInteger noOfInvestors;
    @Column(name = "CATEGORY_OF_INVESTORS", nullable = false)
    private String categoryOfInvestors;
    @Column(name = "TENURE", nullable = false)
    private String tenure;
    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;
    @Column(name = "CREDIT_RATING", nullable = false)
    private String creditRating;
    @Column(name = "PPM_IM", nullable = false)
    private String ppmIm;

    public Bond(String dateOfIssuance, BigDecimal amount, BigInteger noOfInvestors, String categoryOfInvestors, String tenure, BigDecimal price, String creditRating, String ppmIm) {
        this.dateOfIssuance = dateOfIssuance;
        this.amount = amount;
        this.noOfInvestors = noOfInvestors;
        this.categoryOfInvestors = categoryOfInvestors;
        this.tenure = tenure;
        this.price = price;
        this.creditRating = creditRating;
        this.ppmIm = ppmIm;
    }

    public Bond() {
    }

    public String getDateOfIssuance() {
        return dateOfIssuance;
    }

    public void setDateOfIssuance(String dateOfIssuance) {
        this.dateOfIssuance = dateOfIssuance;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigInteger getNoOfInvestors() {
        return noOfInvestors;
    }

    public void setNoOfInvestors(BigInteger noOfInvestors) {
        this.noOfInvestors = noOfInvestors;
    }

    public String getCategoryOfInvestors() {
        return categoryOfInvestors;
    }

    public void setCategoryOfInvestors(String categoryOfInvestors) {
        this.categoryOfInvestors = categoryOfInvestors;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    public String getPpmIm() {
        return ppmIm;
    }

    public void setPpmIm(String ppmIm) {
        this.ppmIm = ppmIm;
    }
}
