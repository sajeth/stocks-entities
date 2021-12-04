package com.saji.entities.trading;

import com.saji.entities.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "ACTIONS")
public class Actions extends BaseEntity {
    @OneToMany(mappedBy = "actions")
    private Set<ActionSteps> actionSteps;

    public Actions() {
        super();
    }

    public Set<ActionSteps> getActionSteps() {
        return actionSteps;
    }

    public void setActionSteps(Set<ActionSteps> actionSteps) {
        this.actionSteps = actionSteps;
    }
}
