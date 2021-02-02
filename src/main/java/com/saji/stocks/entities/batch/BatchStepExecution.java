package com.saji.stocks.entities.batch;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "BATCH_STEP_EXECUTION")
public class BatchStepExecution {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "STEP_EXECUTION_ID")
    private Long stepExecutionId;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "STEP_NAME")
    private String stepName;
    @ManyToOne
    @JoinColumn(name = "JOB_EXECUTION_ID", nullable = false, referencedColumnName = "JOB_EXECUTION_ID")
    private BatchJobExecution jobExecutionId;

    @Column(name = "START_TIME")
    private Date startTime;

    @Column(name = "END_TIME")
    private Date endTime;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "COMMIT_COUNT")
    private Long commitCount;

    @Column(name = "FILTER_COUNT")
    private Long filterCount;

    @Column(name = "READ_COUNT")
    private Long readCount;

    @Column(name = "WRITE_COUNT")
    private Long writeCount;

    @Column(name = "READ_SKIP_COUNT")
    private Long readSkipCount;

    @Column(name = "WRITE_SKIP_COUNT")
    private Long writeSkipCount;

    @Column(name = "PROCESS_SKIP_COUNT")
    private Long processSkipCount;

    @Column(name = "ROLLBACK_COUNT")
    private Long rollbackCount;

    @Column(name = "EXIT_CODE")
    private String exitCode;

    @Column(name = "EXIT_MESSAGE")
    private String exitMessage;

    @Column(name = "LAST_UPDATED")
    private Date lastUpdated;

    public Long getStepExecutionId() {
        return stepExecutionId;
    }

    public void setStepExecutionId(final Long stepExecutionId) {
        this.stepExecutionId = stepExecutionId;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(final String stepName) {
        this.stepName = stepName;
    }

    public BatchJobExecution getJobExecutionId() {
        return jobExecutionId;
    }

    public void setJobExecutionId(final BatchJobExecution jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public Long getCommitCount() {
        return commitCount;
    }

    public void setCommitCount(final Long commitCount) {
        this.commitCount = commitCount;
    }

    public Long getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(final Long filterCount) {
        this.filterCount = filterCount;
    }

    public Long getReadCount() {
        return readCount;
    }

    public void setReadCount(final Long readCount) {
        this.readCount = readCount;
    }

    public Long getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(final Long writeCount) {
        this.writeCount = writeCount;
    }

    public Long getReadSkipCount() {
        return readSkipCount;
    }

    public void setReadSkipCount(final Long readSkipCount) {
        this.readSkipCount = readSkipCount;
    }

    public Long getWriteSkipCount() {
        return writeSkipCount;
    }

    public void setWriteSkipCount(final Long writeSkipCount) {
        this.writeSkipCount = writeSkipCount;
    }

    public Long getProcessSkipCount() {
        return processSkipCount;
    }

    public void setProcessSkipCount(final Long processSkipCount) {
        this.processSkipCount = processSkipCount;
    }

    public Long getRollbackCount() {
        return rollbackCount;
    }

    public void setRollbackCount(final Long rollbackCount) {
        this.rollbackCount = rollbackCount;
    }

    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(final String exitCode) {
        this.exitCode = exitCode;
    }

    public String getExitMessage() {
        return exitMessage;
    }

    public void setExitMessage(final String exitMessage) {
        this.exitMessage = exitMessage;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(final Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
