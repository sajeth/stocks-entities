package com.saji.entities.transactions;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BATCH_JOB_EXECUTION")
public class BatchJobExecution {
    @OneToMany(mappedBy = "jobExecutionId", cascade = CascadeType.ALL)
    private final Set<BatchStepExecution> set = new HashSet<>();
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

}
