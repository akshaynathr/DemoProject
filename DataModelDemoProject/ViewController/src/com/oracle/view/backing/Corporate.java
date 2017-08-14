package com.oracle.view.backing;

import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelBorderLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.nav.RichTrain;
import oracle.adf.view.rich.component.rich.nav.RichTrainButtonBar;
import oracle.adf.view.rich.component.rich.output.RichMessages;

public class Corporate {
    private RichPanelBorderLayout pbl1;
    private RichTrain t1;
    private RichTrainButtonBar tbb1;
    private RichPanelFormLayout pfl1;
    private RichInputComboboxListOfValues supervisorIdId;
    private RichInputDate id1;
    private RichInputDate id2;
    private RichInputText it1;
    private RichMessages m1;

    public void setPbl1(RichPanelBorderLayout pbl1) {
        this.pbl1 = pbl1;
    }

    public RichPanelBorderLayout getPbl1() {
        return pbl1;
    }

    public void setT1(RichTrain t1) {
        this.t1 = t1;
    }

    public RichTrain getT1() {
        return t1;
    }

    public void setTbb1(RichTrainButtonBar tbb1) {
        this.tbb1 = tbb1;
    }

    public RichTrainButtonBar getTbb1() {
        return tbb1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setSupervisorIdId(RichInputComboboxListOfValues supervisorIdId) {
        this.supervisorIdId = supervisorIdId;
    }

    public RichInputComboboxListOfValues getSupervisorIdId() {
        return supervisorIdId;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }
}
