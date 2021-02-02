package com.saji.stocks.entities.batch;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BATCH_JOB_EXECUTION")
public class BatchJobExecution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "JOB_EXECUTION_ID")
    private Long jobExecutionId;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "JOB_INSTANCE_ID")
    private Long jobInstanceId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "START_TIME")
    private Date startTime;

    @Column(name = "END_TIME")
    private Date endTime;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "EXIT_CODE")
    private String exitCode;

    @Column(name = "EXIT_MESSAGE")
    private String exitMessage;

    @Column(name = "LAST_UPDATED")
    private Date lastUpdated;

    @Column(name = "JOB_CONFIGURATION_LOCATION")
    private String jobConfiurationLocation;

    @OneToMany(mappedBy = "jobExecutionId", cascade = CascadeType.ALL)
    private Set<BatchStepExecution> set = new HashSet<>();

//	public Set<BatchStepExecution> getSet() {
//		return set;
//	}
//
//	public void setSet(final Set<BatchStepExecution> set) {
//		this.set = set;
//	}
//
//	public Long getJobExecutionId() {
//		return jobExecutionId;
//	}
//
//	public void setJobExecutionId(final Long jobExecutionId) {
//		this.jobExecutionId = jobExecutionId;
//	}
//
//	public Long getVersion() {
//		return version;
//	}
//
//	public void setVersion(final Long version) {
//		this.version = version;
//	}
//
//	public Long getJobInstanceId() {
//		return jobInstanceId;
//	}
//
//	public void setJobInstanceId(final Long jobInstanceId) {
//		this.jobInstanceId = jobInstanceId;
//	}
//
//	public Date getCreateTime() {
//		return createTime;
//	}
//
//	public void setCreateTime(final Date createTime) {
//		this.createTime = createTime;
//	}
//
//	public Date getStartTime() {
//		return startTime;
//	}
//
//	public void setStartTime(final Date startTime) {
//		this.startTime = startTime;
//	}
//
//	public Date getEndTime() {
//		return endTime;
//	}
//
//	public void setEndTime(final Date endTime) {
//		this.endTime = endTime;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(final String status) {
//		this.status = status;
//	}
//
//	public String getExitCode() {
//		return exitCode;
//	}
//
//	public void setExitCode(final String exitCode) {
//		this.exitCode = exitCode;
//	}
//
//	public String getExitMessage() {
//		return exitMessage;
//	}
//
//	public void setExitMessage(final String exitMessage) {
//		this.exitMessage = exitMessage;
//	}
//
//	public Date getLastUpdated() {
//		return lastUpdated;
//	}
//
//	public void setLastUpdated(final Date lastUpdated) {
//		this.lastUpdated = lastUpdated;
//	}
//
//	public String getJobConfiurationLocation() {
//		return jobConfiurationLocation;
//	}
//
//	public void setJobConfiurationLocation(final String jobConfiurationLocation) {
//		this.jobConfiurationLocation = jobConfiurationLocation;
//	}

}
