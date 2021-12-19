package com.saji.entities.transactions;

import javax.persistence.*;

@Entity
@Table(name = "BATCH_JOB_INSTANCE")
public class BatchJobInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "JOB_INSTANCE_ID")
    private Long jobInstanceId;

    @Column(name = "version")
    private Long version;

    @Column(name = "JOB_NAME")
    private String jobName;

    @Column(name = "JOB_KEY")
    private String jobKey;

    public Long getJobInstanceId() {
        return jobInstanceId;
    }

    public void setJobInstanceId(final Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    public String getJobKey() {
        return jobKey;
    }

    public void setJobKey(final String jobKey) {
        this.jobKey = jobKey;
    }

}
