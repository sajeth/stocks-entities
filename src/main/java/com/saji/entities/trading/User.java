package com.saji.entities.trading;

import com.saji.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User extends BaseEntity {
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "PIN", nullable = false)
    private String pin;
    @Column(name = "TPIN", nullable = false)
    private String tpin;
    @Column(name = "EMAIL", nullable = false)
    private String email;
    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;
    @Column(name = "LINK", nullable = false)
    private String link;
    @Column(name = "LOGICAL_DEL_IN")
    private String logicalDeleteIn;
    @OneToMany(mappedBy = "userid")
    private Set<UserPortfolio> userPortfolios;

    public User() {
    }

    public User(String password, String pin, String tpin, String email, String phoneNumber) {
        this.password = password;
        this.pin = pin;
        this.tpin = tpin;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getTpin() {
        return tpin;
    }

    public void setTpin(String tpin) {
        this.tpin = tpin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Set<UserPortfolio> getUserPortfolios() {
        return userPortfolios;
    }

    public void setUserPortfolios(Set<UserPortfolio> userPortfolios) {
        this.userPortfolios = userPortfolios;
    }

    public String getLogicalDeleteIn() {
        return logicalDeleteIn;
    }

    public void setLogicalDeleteIn(String logicalDeleteIn) {
        this.logicalDeleteIn = logicalDeleteIn;
    }
}
