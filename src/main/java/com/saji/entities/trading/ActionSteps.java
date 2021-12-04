package com.saji.entities.trading;

import com.saji.entities.BaseEntity;
import com.saji.entities.Lov;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACTION_STEPS")
public class ActionSteps extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "ACTION_ID", nullable = false)
    private Actions actions;
    @ManyToOne
    @JoinColumn(name = "TYPE", nullable = false)
    private Lov actionType;

    public ActionSteps() {
        super();
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }

    public Lov getActionType() {
        return actionType;
    }

    public void setActionType(Lov actionType) {
        this.actionType = actionType;
    }
}
