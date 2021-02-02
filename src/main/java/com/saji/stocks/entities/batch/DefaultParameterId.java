/**
 *
 */
package com.saji.stocks.entities.batch;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author sajeth
 *
 */

@Embeddable
public class DefaultParameterId implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Column(name = "job_name")
    private String jobName;
    @Column(name = "key_name")
    private String key;

    public DefaultParameterId() {
        super();
    }

    /**
     * @param jobName
     * @param key
     */
    public DefaultParameterId(final String jobName, final String key) {
        this.jobName = jobName;
        this.key = key;
    }

    public final String getJobName() {
        return jobName;
    }

    public final void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    public final String getKey() {
        return key;
    }

    public final void setKey(final String key) {
        this.key = key;
    }

}
