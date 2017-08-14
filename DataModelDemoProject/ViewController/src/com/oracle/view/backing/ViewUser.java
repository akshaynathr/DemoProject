package com.oracle.view.backing;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.layout.RichPanelBorderLayout;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichMessages;

public class ViewUser {
    private RichPanelBorderLayout pbl1;
    private RichButton b1;
    private RichMessages m1;
    private RichTable t1;

    public void setPbl1(RichPanelBorderLayout pbl1) {
        this.pbl1 = pbl1;
    }

    public RichPanelBorderLayout getPbl1() {
        return pbl1;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }
}
