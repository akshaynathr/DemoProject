package com.oracle.view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;

public class Users {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputComboboxListOfValues supervisorIdId;
    private RichInputDate id1;
    private RichInputDate id2;
    private RichInputText it5;
    private RichButton b1;

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
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

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }
}
