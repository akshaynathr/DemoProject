package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.output.RichMessages;

public class Customers_tab {
    private RichForm f1;
    private RichDocument d1;
    private RichMessages m1;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichInputDate id2;
    private RichInputDate id3;

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

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setResId1(RichTable resId1) {
        this.resId1 = resId1;
    }

    public RichTable getResId1() {
        return resId1;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }
}
