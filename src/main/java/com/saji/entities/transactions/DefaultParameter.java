package com.saji.entities.transactions;

import com.saji.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sajeth
 */
@Entity
@Table(name = "BATCH_JOB_DEFAULT_PARAMS")
public class DefaultParameter extends BaseEntity {

    @EmbeddedId
    private DefaultParameterId defaultParameterId;

    @Column(name = "key_name_values")
    private String value;

    public DefaultParameter() {
        super();
    }

    public DefaultParameter(final DefaultParameterId defaultParameterId, final String value) {
        this.defaultParameterId = defaultParameterId;
        this.value = value;
    }

    public DefaultParameterId getDefaultParameterId() {
        return defaultParameterId;
    }

    public void setDefaultParameterId(final DefaultParameterId defaultParameterId) {
        this.defaultParameterId = defaultParameterId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public String getJobName() {
        return this.defaultParameterId.getJobName();
    }

    public final String getKey() {
        return this.defaultParameterId.getKey();
    }

}
