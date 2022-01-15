package com.saji.entities.trading;

import com.saji.entities.BaseEntity;
import com.saji.entities.Lov;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STEP")
public class Step extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "ACTION_ID", nullable = false)
    private Action action;
    @ManyToOne
    @JoinColumn(name = "TYPE", nullable = false)
    private Lov actionType;

    public Step() {
        super();
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action actions) {
        this.action = actions;
    }

    public Lov getActionType() {
        return actionType;
    }

    public void setActionType(Lov actionType) {
        this.actionType = actionType;
    }
}
