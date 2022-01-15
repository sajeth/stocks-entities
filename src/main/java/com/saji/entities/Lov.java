package com.saji.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LOV")
public class Lov extends BaseEntity {

    @Column(name = "TYPE")
    private String type;
    @Column(name = "LOGICAL_DEL_IN")
    private String logicalDeleteIn;


    public String getLogicalDelIn() {
        return logicalDeleteIn;
    }

    public void setLogicalDelIn(final String value) {
        this.logicalDeleteIn = value;
    }

    public Lov() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

