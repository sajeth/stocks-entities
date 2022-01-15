package com.saji.entities.trading;

import com.saji.entities.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "ACTION")
public class Action extends BaseEntity {
    @OneToMany(mappedBy = "action")
    private Set<Step> steps;

    public Action() {
        super();
    }

    public Set<Step> getSteps() {
        return steps;
    }

    public void setSteps(Set<Step> steps) {
        this.steps = steps;
    }
}
