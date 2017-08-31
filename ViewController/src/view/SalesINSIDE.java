package view;

import javax.faces.component.UISelectItems;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichGridCell;
import oracle.adf.view.rich.component.rich.layout.RichGridRow;
import oracle.adf.view.rich.component.rich.layout.RichPanelBorderLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGridLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelSpringboard;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.layout.RichToolbox;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;

import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class SalesINSIDE {
    private RichButton b1;
    private RichPanelGroupLayout pgl3;
    private RichInputDate id16;
    private RichInputDate id15;
    private RichTable t15;
    private RichButton b37;
    private RichCommandLink cl11;
    private RichQuickQuery qryId11;
    private RichPanelGroupLayout pgl22;
    private RichShowDetailItem sdi15;
    private RichTable t27;
    private RichButton b36;
    private RichCommandLink cl14;
    private RichQuickQuery qryId14;
    private RichPanelGroupLayout pgl27;
    private RichShowDetailItem tab4;
    private RichPanelTabbed pt3;
    private RichTable md3;
    private RichButton b35;
    private RichCommandLink cl20;
    private RichQuickQuery qryId20;
    private RichPanelGroupLayout pgl32;
    private RichPanelHeader ph7;
    private RichShowDetailItem sdi6;
    private RichTable t26;
    private RichButton b41;
    private RichCommandLink cl15;
    private RichQuickQuery qryId15;
    private RichPanelGroupLayout pgl28;
    private RichShowDetailItem sdi17;
    private RichInputDate id27;
    private RichInputDate id26;
    private RichTable t20;
    private RichButton b40;
    private RichCommandLink cl19;
    private RichQuickQuery qryId19;
    private RichPanelGroupLayout pgl31;
    private RichShowDetailItem sdi16;
    private RichInputDate id25;
    private RichInputDate id24;
    private RichTable t4;
    private RichButton b39;
    private RichCommandLink cl13;
    private RichQuickQuery qryId13;
    private RichPanelGroupLayout pgl26;
    private RichShowDetailItem tab5;
    private RichPanelTabbed pt5;
    private RichInputDate id23;
    private RichInputDate id22;
    private RichInputDate id21;
    private RichInputDate id20;
    private RichTable t2;
    private RichButton b34;
    private RichCommandLink cl12;
    private RichQuickQuery qryId12;
    private RichPanelHeader ph4;
    private RichPanelGroupLayout pgl25;
    private RichShowDetailItem sdi5;
    private RichTable t23;
    private RichButton b38;
    private RichCommandLink cl18;
    private RichQuickQuery qryId18;
    private RichPanelGroupLayout pgl30;
    private RichShowDetailItem customers;
    private RichPanelTabbed pt4;
    private RichDialog d5;
    private RichPopup p5;
    private RichTable md2;
    private RichButton b33;
    private RichCommandLink cl5;
    private RichQuickQuery qryId5;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph10;
    private RichPanelGroupLayout pgl19;
    private RichShowDetailItem sdi4;
    private RichInputDate id28;
    private RichTable t14;
    private RichButton b19;
    private RichButton b32;
    private RichTable t11;
    private RichCommandLink cl2;
    private RichQuickQuery qryId2;
    private RichPanelGroupLayout pgl20;
    private RichShowDetailItem sdi7;
    private RichButton b20;
    private RichTable t21;
    private RichTable t1;
    private RichButton b4;
    private RichPanelHeader ph2;
    private RichPanelGroupLayout pgl1;
    private RichShowDetailItem tab3;
    private RichButton b21;
    private RichTable t22;
    private RichTable t5;
    private RichButton b31;
    private RichShowDetailItem sdi8;
    private RichInputDate id5;
    private RichInputDate id4;
    private RichInputDate id3;
    private RichInputDate id2;
    private RichTable t6;
    private RichButton b23;
    private RichButton b22;
    private RichButton b30;
    private RichCommandLink cl17;
    private RichQuickQuery qryId17;
    private RichPanelGroupLayout pgl6;
    private RichShowDetailItem sdi9;
    private RichInputDate id8;
    private RichInputDate id6;
    private RichTable t7;
    private RichButton b25;
    private RichButton b24;
    private RichButton b29;
    private RichCommandLink cl16;
    private RichQuickQuery qryId16;
    private RichPanelGroupLayout pgl18;
    private RichShowDetailItem sdi10;
    private RichPanelTabbed pt2;
    private RichTable md1;
    private RichInputText it75;
    private RichInputText it74;
    private RichInputText it73;
    private RichInputText it72;
    private RichInputText it71;
    private RichInputText it70;
    private RichInputText it69;
    private RichInputText it68;
    private UIXGroup shippingAddress;
    private RichInputText it67;
    private RichInputText it66;
    private RichInputText it65;
    private RichInputText it64;
    private RichInputText it63;
    private RichInputText it62;
    private RichInputText it61;
    private RichInputText it60;
    private UIXGroup primaryAddress;
    private RichInputText it56;
    private RichInputText it55;
    private RichInputText it54;
    private RichInputText it53;
    private RichInputText it52;
    private RichInputText it51;
    private RichInputText it50;
    private UISelectItems si37;
    private RichSelectOneChoice soc37;
    private UISelectItems si36;
    private RichSelectOneChoice soc36;
    private RichInputText it49;
    private RichPanelFormLayout pfl4;
    private RichDialog d4;
    private RichPopup p4;
    private RichButton b2;
    private RichCommandLink cl6;
    private RichQuickQuery qryId6;
    private RichPanelGroupLayout pgl21;
    private RichPanelHeader ph1;
    private RichShowDetailItem sdi3;
    private RichTable t17;
    private RichInputDate id14;
    private RichInputDate id13;
    private RichInputDate id12;
    private RichTable t13;
    private RichDialog d11;
    private RichPopup p11;
    private RichButton b10;
    private RichButton b28;
    private RichButton b8;
    private RichCommandLink cl4;
    private RichQuickQuery qryId4;
    private RichPanelGroupLayout pgl11;
    private RichShowDetailItem sdi14;
    private RichTable t18;
    private RichInputDate id11;
    private RichInputDate id10;
    private RichTable t12;
    private RichDialog d7;
    private RichPopup p10;
    private RichButton b11;
    private RichButton b9;
    private RichCommandLink cl1;
    private RichQuickQuery qryId1;
    private RichPanelGroupLayout pgl10;
    private RichShowDetailItem sdi13;
    private RichTable t10;
    private RichGridCell gc6;
    private RichGridRow gr6;
    private RichPanelGridLayout pgl17;
    private RichTable t19;
    private RichInputText it24;
    private UISelectItems si26;
    private RichSelectOneChoice soc26;
    private RichPanelFormLayout pfl1;
    private RichDialog d1;
    private RichPopup opportunities_contacts;
    private RichButton b12;
    private RichButton b7;
    private RichButton b6;
    private RichCommandLink cl10;
    private RichQuickQuery qryId10;
    private RichPanelGroupLayout pgl24;
    private RichShowDetailItem sdi12;
    private RichTable t28;
    private RichGridCell gc5;
    private RichGridRow gr5;
    private RichPanelGridLayout pgl8;
    private RichButton b13;
    private RichDialog d9;
    private RichPopup p8;
    private RichButton b14;
    private RichButton b27;
    private RichCommandLink cl9;
    private RichQuickQuery qryId9;
    private RichPanelGroupLayout pgl23;
    private RichPanelGroupLayout pgl9;
    private RichShowDetailItem sdi11;
    private RichInputDate id29;
    private RichTable t9;
    private RichGridCell gc4;
    private RichGridRow gr4;
    private RichPanelGridLayout pgl16;
    private RichDialog d8;
    private RichPopup p7;
    private RichButton b15;
    private RichButton b26;
    private RichPanelGroupLayout pgl15;
    private RichShowDetailItem tab1;
    private RichTable t8;
    private RichGridCell gc1;
    private RichGridRow gr1;
    private RichPanelGridLayout pgl12;
    private RichButton b16;
    private RichCommandLink cl8;
    private RichQuickQuery qryId8;
    private RichDialog d6;
    private RichPopup p6;
    private RichPanelGroupLayout pgl29;
    private RichPanelBorderLayout pbl3;
    private RichPanelGroupLayout pgl4;
    private RichShowDetailItem tab2;
    private RichPanelTabbed pt1;
    private RichGridCell gc3;
    private RichGridRow gr3;
    private RichInputText it48;
    private UISelectItems si35;
    private RichSelectOneChoice soc35;
    private RichInputText it47;
    private RichInputText it46;
    private RichInputText it45;
    private RichInputText it44;
    private RichInputText it43;
    private RichInputText it42;
    private RichInputText it41;
    private RichInputText it30;
    private RichInputText it29;
    private RichInputText it28;
    private RichInputText it27;
    private UISelectItems si34;
    private RichSelectOneChoice soc34;
    private UISelectItems si33;
    private RichSelectOneChoice soc33;
    private UISelectItems si32;
    private RichSelectOneChoice soc32;
    private RichInputDate id19;
    private RichInputDate id1;
    private RichInputText it26;
    private UISelectItems si31;
    private RichSelectOneChoice soc31;
    private RichInputText it25;
    private RichPanelFormLayout pfl2;
    private RichDialog d2;
    private RichPopup opportunityEdit;
    private RichInputDate id18;
    private RichInputDate id17;
    private RichTable t16;
    private RichButton b5;
    private RichToolbar t25;
    private RichToolbox t24;
    private RichGridCell gc2;
    private RichGridRow gr2;
    private RichPanelGridLayout pgl13;
    private RichButton b18;
    private RichButton b17;
    private RichCommandLink cl7;
    private RichQuickQuery qryId7;
    private RichPanelGroupLayout pgl14;
    private RichPanelBorderLayout pbl2;
    private RichShowDetailItem sdi2;
    private RichDialog d28;
    private RichPopup p28;
    private RichDialog d27;
    private RichPopup p27;
    private RichDialog d26;
    private RichPopup p26;
    private RichDialog d25;
    private RichPopup p25;
    private RichDialog d24;
    private RichPopup p24;
    private RichDialog d23;
    private RichPopup p23;
    private RichDialog d22;
    private RichPopup p22;
    private RichDialog d21;
    private RichPopup p21;
    private RichDialog d20;
    private RichPopup p20;
    private RichDialog d19;
    private RichPopup p19;
    private RichDialog d18;
    private RichPopup p18;
    private RichDialog d16;
    private RichPopup p17;
    private RichDialog d17;
    private RichPopup p16;
    private RichDialog d15;
    private RichPopup p15;
    private RichDialog d14;
    private RichPopup p14;
    private RichDialog d13;
    private RichPopup p13;
    private RichDialog d12;
    private RichPopup p12;
    private RichDialog d10;
    private RichPopup p9;
    private RichPanelGroupLayout pgl5;
    private RichTable t3;
    private RichCommandLink cl3;
    private RichQuickQuery qryId3;
    private RichPanelGroupLayout pgl7;
    private RichPanelHeader ph3;
    private RichPanelBorderLayout pbl1;
    private RichShowDetailItem sdi1;
    private RichPanelSpringboard ps1;
    private RichPanelStretchLayout psl1;
    private RichPanelFormLayout pfl3;
    private RichSelectOneChoice soc28;
    private UISelectItems si28;
    private RichPanelFormLayout pfl5;
    private RichSelectOneChoice soc46;
    private UISelectItems si46;
    private RichInputText it35;
    private RichInputText it36;
    private RichInputText it57;
    private RichInputText it58;
    private RichInputText it59;
    private RichInputText it76;
    private RichPanelGroupLayout pgl33;
    private RichQuickQuery qryId21;
    private RichCommandLink cl21;
    private RichPopup p1;
    private RichDialog d3;
    private RichPanelFormLayout pfl6;
    private RichInputText it77;
    private RichInputDate id30;
    private RichInputText it78;
    private RichSelectOneChoice soc47;
    private UISelectItems si47;
    private RichSelectOneChoice soc48;
    private UISelectItems si48;
    private RichInputText it79;
    private RichInputText it80;
    private RichPopup p2;
    private RichDialog d29;
    private RichDialog d30;
    private RichPanelFormLayout pfl7;
    private RichSelectOneChoice soc49;
    private UISelectItems si49;
    private RichInputText it81;
    private RichInputText it82;
    private RichInputText it83;
    private RichInputText it84;
    private RichInputText it85;
    private RichInputText it86;
    private RichPopup p3;
    private RichDialog d31;
    private RichPanelFormLayout pfl8;
    private RichInputText it87;
    private RichSelectOneChoice soc50;
    private UISelectItems si50;
    private RichSelectOneChoice soc51;
    private UISelectItems si51;
    private RichInputText it88;
    private RichInputText it89;
    private RichInputText it90;
    private RichInputText it91;
    private RichInputText it92;
    private RichInputText it93;
    private RichInputText it94;
    private RichInputText it95;
    private RichInputText it96;
    private RichInputText it97;
    private RichInputText it98;
    private RichInputText it99;
    private RichInputText it100;
    private RichInputText it101;
    private RichInputText it102;
    private RichInputText it103;
    private RichInputText it104;
    private RichInputText it105;
    private RichInputText it106;
    private RichInputText it107;
    private RichInputText it108;
    private RichInputText it109;
    private RichInputText it110;
    private RichInputText it111;
    private RichPopup p29;
    private RichDialog d32;
    private RichPanelFormLayout pfl9;
    private RichInputText it112;
    private RichSelectOneChoice soc52;
    private UISelectItems si52;
    private RichInputText it113;
    private RichInputDate id31;
    private RichInputDate id32;
    private RichSelectOneChoice soc53;
    private UISelectItems si53;
    private RichSelectOneChoice soc54;
    private UISelectItems si54;
    private RichSelectOneChoice soc55;
    private UISelectItems si55;
    private RichInputText it114;
    private RichInputText it115;
    private RichInputText it116;
    private RichInputText it117;
    private RichInputText it118;
    private RichInputText it119;
    private RichInputText it120;
    private RichInputText it121;
    private RichInputText it122;
    private RichInputText it123;
    private RichSelectOneChoice soc56;
    private UISelectItems si56;

    public SalesINSIDE() {
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setId16(RichInputDate id16) {
        this.id16 = id16;
    }

    public RichInputDate getId16() {
        return id16;
    }

    public void setId15(RichInputDate id15) {
        this.id15 = id15;
    }

    public RichInputDate getId15() {
        return id15;
    }

    public void setT15(RichTable t15) {
        this.t15 = t15;
    }

    public RichTable getT15() {
        return t15;
    }

    public void setB37(RichButton b37) {
        this.b37 = b37;
    }

    public RichButton getB37() {
        return b37;
    }

    public void setCl11(RichCommandLink cl11) {
        this.cl11 = cl11;
    }

    public RichCommandLink getCl11() {
        return cl11;
    }

    public void setQryId11(RichQuickQuery qryId11) {
        this.qryId11 = qryId11;
    }

    public RichQuickQuery getQryId11() {
        return qryId11;
    }

    public void setPgl22(RichPanelGroupLayout pgl22) {
        this.pgl22 = pgl22;
    }

    public RichPanelGroupLayout getPgl22() {
        return pgl22;
    }

    public void setSdi15(RichShowDetailItem sdi15) {
        this.sdi15 = sdi15;
    }

    public RichShowDetailItem getSdi15() {
        return sdi15;
    }

    public void setT27(RichTable t27) {
        this.t27 = t27;
    }

    public RichTable getT27() {
        return t27;
    }

    public void setB36(RichButton b36) {
        this.b36 = b36;
    }

    public RichButton getB36() {
        return b36;
    }

    public void setCl14(RichCommandLink cl14) {
        this.cl14 = cl14;
    }

    public RichCommandLink getCl14() {
        return cl14;
    }

    public void setQryId14(RichQuickQuery qryId14) {
        this.qryId14 = qryId14;
    }

    public RichQuickQuery getQryId14() {
        return qryId14;
    }

    public void setPgl27(RichPanelGroupLayout pgl27) {
        this.pgl27 = pgl27;
    }

    public RichPanelGroupLayout getPgl27() {
        return pgl27;
    }

    public void setTab4(RichShowDetailItem tab4) {
        this.tab4 = tab4;
    }

    public RichShowDetailItem getTab4() {
        return tab4;
    }

    public void setPt3(RichPanelTabbed pt3) {
        this.pt3 = pt3;
    }

    public RichPanelTabbed getPt3() {
        return pt3;
    }

    public void setMd3(RichTable md3) {
        this.md3 = md3;
    }

    public RichTable getMd3() {
        return md3;
    }

    public void setB35(RichButton b35) {
        this.b35 = b35;
    }

    public RichButton getB35() {
        return b35;
    }

    public void setCl20(RichCommandLink cl20) {
        this.cl20 = cl20;
    }

    public RichCommandLink getCl20() {
        return cl20;
    }

    public void setQryId20(RichQuickQuery qryId20) {
        this.qryId20 = qryId20;
    }

    public RichQuickQuery getQryId20() {
        return qryId20;
    }

    public void setPgl32(RichPanelGroupLayout pgl32) {
        this.pgl32 = pgl32;
    }

    public RichPanelGroupLayout getPgl32() {
        return pgl32;
    }

    public void setPh7(RichPanelHeader ph7) {
        this.ph7 = ph7;
    }

    public RichPanelHeader getPh7() {
        return ph7;
    }

    public void setSdi6(RichShowDetailItem sdi6) {
        this.sdi6 = sdi6;
    }

    public RichShowDetailItem getSdi6() {
        return sdi6;
    }

    public void setT26(RichTable t26) {
        this.t26 = t26;
    }

    public RichTable getT26() {
        return t26;
    }

    public void setB41(RichButton b41) {
        this.b41 = b41;
    }

    public RichButton getB41() {
        return b41;
    }

    public void setCl15(RichCommandLink cl15) {
        this.cl15 = cl15;
    }

    public RichCommandLink getCl15() {
        return cl15;
    }

    public void setQryId15(RichQuickQuery qryId15) {
        this.qryId15 = qryId15;
    }

    public RichQuickQuery getQryId15() {
        return qryId15;
    }

    public void setPgl28(RichPanelGroupLayout pgl28) {
        this.pgl28 = pgl28;
    }

    public RichPanelGroupLayout getPgl28() {
        return pgl28;
    }

    public void setSdi17(RichShowDetailItem sdi17) {
        this.sdi17 = sdi17;
    }

    public RichShowDetailItem getSdi17() {
        return sdi17;
    }

    public void setId27(RichInputDate id27) {
        this.id27 = id27;
    }

    public RichInputDate getId27() {
        return id27;
    }

    public void setId26(RichInputDate id26) {
        this.id26 = id26;
    }

    public RichInputDate getId26() {
        return id26;
    }

    public void setT20(RichTable t20) {
        this.t20 = t20;
    }

    public RichTable getT20() {
        return t20;
    }

    public void setB40(RichButton b40) {
        this.b40 = b40;
    }

    public RichButton getB40() {
        return b40;
    }

    public void setCl19(RichCommandLink cl19) {
        this.cl19 = cl19;
    }

    public RichCommandLink getCl19() {
        return cl19;
    }

    public void setQryId19(RichQuickQuery qryId19) {
        this.qryId19 = qryId19;
    }

    public RichQuickQuery getQryId19() {
        return qryId19;
    }

    public void setPgl31(RichPanelGroupLayout pgl31) {
        this.pgl31 = pgl31;
    }

    public RichPanelGroupLayout getPgl31() {
        return pgl31;
    }

    public void setSdi16(RichShowDetailItem sdi16) {
        this.sdi16 = sdi16;
    }

    public RichShowDetailItem getSdi16() {
        return sdi16;
    }

    public void setId25(RichInputDate id25) {
        this.id25 = id25;
    }

    public RichInputDate getId25() {
        return id25;
    }

    public void setId24(RichInputDate id24) {
        this.id24 = id24;
    }

    public RichInputDate getId24() {
        return id24;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setB39(RichButton b39) {
        this.b39 = b39;
    }

    public RichButton getB39() {
        return b39;
    }

    public void setCl13(RichCommandLink cl13) {
        this.cl13 = cl13;
    }

    public RichCommandLink getCl13() {
        return cl13;
    }

    public void setQryId13(RichQuickQuery qryId13) {
        this.qryId13 = qryId13;
    }

    public RichQuickQuery getQryId13() {
        return qryId13;
    }

    public void setPgl26(RichPanelGroupLayout pgl26) {
        this.pgl26 = pgl26;
    }

    public RichPanelGroupLayout getPgl26() {
        return pgl26;
    }

    public void setTab5(RichShowDetailItem tab5) {
        this.tab5 = tab5;
    }

    public RichShowDetailItem getTab5() {
        return tab5;
    }

    public void setPt5(RichPanelTabbed pt5) {
        this.pt5 = pt5;
    }

    public RichPanelTabbed getPt5() {
        return pt5;
    }

    public void setId23(RichInputDate id23) {
        this.id23 = id23;
    }

    public RichInputDate getId23() {
        return id23;
    }

    public void setId22(RichInputDate id22) {
        this.id22 = id22;
    }

    public RichInputDate getId22() {
        return id22;
    }

    public void setId21(RichInputDate id21) {
        this.id21 = id21;
    }

    public RichInputDate getId21() {
        return id21;
    }

    public void setId20(RichInputDate id20) {
        this.id20 = id20;
    }

    public RichInputDate getId20() {
        return id20;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setB34(RichButton b34) {
        this.b34 = b34;
    }

    public RichButton getB34() {
        return b34;
    }

    public void setCl12(RichCommandLink cl12) {
        this.cl12 = cl12;
    }

    public RichCommandLink getCl12() {
        return cl12;
    }

    public void setQryId12(RichQuickQuery qryId12) {
        this.qryId12 = qryId12;
    }

    public RichQuickQuery getQryId12() {
        return qryId12;
    }

    public void setPh4(RichPanelHeader ph4) {
        this.ph4 = ph4;
    }

    public RichPanelHeader getPh4() {
        return ph4;
    }

    public void setPgl25(RichPanelGroupLayout pgl25) {
        this.pgl25 = pgl25;
    }

    public RichPanelGroupLayout getPgl25() {
        return pgl25;
    }

    public void setSdi5(RichShowDetailItem sdi5) {
        this.sdi5 = sdi5;
    }

    public RichShowDetailItem getSdi5() {
        return sdi5;
    }

    public void setT23(RichTable t23) {
        this.t23 = t23;
    }

    public RichTable getT23() {
        return t23;
    }

    public void setB38(RichButton b38) {
        this.b38 = b38;
    }

    public RichButton getB38() {
        return b38;
    }

    public void setCl18(RichCommandLink cl18) {
        this.cl18 = cl18;
    }

    public RichCommandLink getCl18() {
        return cl18;
    }

    public void setQryId18(RichQuickQuery qryId18) {
        this.qryId18 = qryId18;
    }

    public RichQuickQuery getQryId18() {
        return qryId18;
    }

    public void setPgl30(RichPanelGroupLayout pgl30) {
        this.pgl30 = pgl30;
    }

    public RichPanelGroupLayout getPgl30() {
        return pgl30;
    }

    public void setCustomers(RichShowDetailItem customers) {
        this.customers = customers;
    }

    public RichShowDetailItem getCustomers() {
        return customers;
    }

    public void setPt4(RichPanelTabbed pt4) {
        this.pt4 = pt4;
    }

    public RichPanelTabbed getPt4() {
        return pt4;
    }

    public void setD5(RichDialog d5) {
        this.d5 = d5;
    }

    public RichDialog getD5() {
        return d5;
    }

    public void setP5(RichPopup p5) {
        this.p5 = p5;
    }

    public RichPopup getP5() {
        return p5;
    }

    public void setMd2(RichTable md2) {
        this.md2 = md2;
    }

    public RichTable getMd2() {
        return md2;
    }

    public void setB33(RichButton b33) {
        this.b33 = b33;
    }

    public RichButton getB33() {
        return b33;
    }

    public void setCl5(RichCommandLink cl5) {
        this.cl5 = cl5;
    }

    public RichCommandLink getCl5() {
        return cl5;
    }

    public void setQryId5(RichQuickQuery qryId5) {
        this.qryId5 = qryId5;
    }

    public RichQuickQuery getQryId5() {
        return qryId5;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPh10(RichPanelHeader ph10) {
        this.ph10 = ph10;
    }

    public RichPanelHeader getPh10() {
        return ph10;
    }

    public void setPgl19(RichPanelGroupLayout pgl19) {
        this.pgl19 = pgl19;
    }

    public RichPanelGroupLayout getPgl19() {
        return pgl19;
    }

    public void setSdi4(RichShowDetailItem sdi4) {
        this.sdi4 = sdi4;
    }

    public RichShowDetailItem getSdi4() {
        return sdi4;
    }

    public void setId28(RichInputDate id28) {
        this.id28 = id28;
    }

    public RichInputDate getId28() {
        return id28;
    }

    public void setT14(RichTable t14) {
        this.t14 = t14;
    }

    public RichTable getT14() {
        return t14;
    }

    public void setB19(RichButton b19) {
        this.b19 = b19;
    }

    public RichButton getB19() {
        return b19;
    }

    public void setB32(RichButton b32) {
        this.b32 = b32;
    }

    public RichButton getB32() {
        return b32;
    }

    public void setT11(RichTable t11) {
        this.t11 = t11;
    }

    public RichTable getT11() {
        return t11;
    }

    public void setCl2(RichCommandLink cl2) {
        this.cl2 = cl2;
    }

    public RichCommandLink getCl2() {
        return cl2;
    }

    public void setQryId2(RichQuickQuery qryId2) {
        this.qryId2 = qryId2;
    }

    public RichQuickQuery getQryId2() {
        return qryId2;
    }

    public void setPgl20(RichPanelGroupLayout pgl20) {
        this.pgl20 = pgl20;
    }

    public RichPanelGroupLayout getPgl20() {
        return pgl20;
    }

    public void setSdi7(RichShowDetailItem sdi7) {
        this.sdi7 = sdi7;
    }

    public RichShowDetailItem getSdi7() {
        return sdi7;
    }

    public void setB20(RichButton b20) {
        this.b20 = b20;
    }

    public RichButton getB20() {
        return b20;
    }

    public void setT21(RichTable t21) {
        this.t21 = t21;
    }

    public RichTable getT21() {
        return t21;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setTab3(RichShowDetailItem tab3) {
        this.tab3 = tab3;
    }

    public RichShowDetailItem getTab3() {
        return tab3;
    }

    public void setB21(RichButton b21) {
        this.b21 = b21;
    }

    public RichButton getB21() {
        return b21;
    }

    public void setT22(RichTable t22) {
        this.t22 = t22;
    }

    public RichTable getT22() {
        return t22;
    }

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
    }

    public void setB31(RichButton b31) {
        this.b31 = b31;
    }

    public RichButton getB31() {
        return b31;
    }

    public void setSdi8(RichShowDetailItem sdi8) {
        this.sdi8 = sdi8;
    }

    public RichShowDetailItem getSdi8() {
        return sdi8;
    }

    public void setId5(RichInputDate id5) {
        this.id5 = id5;
    }

    public RichInputDate getId5() {
        return id5;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setT6(RichTable t6) {
        this.t6 = t6;
    }

    public RichTable getT6() {
        return t6;
    }

    public void setB23(RichButton b23) {
        this.b23 = b23;
    }

    public RichButton getB23() {
        return b23;
    }

    public void setB22(RichButton b22) {
        this.b22 = b22;
    }

    public RichButton getB22() {
        return b22;
    }

    public void setB30(RichButton b30) {
        this.b30 = b30;
    }

    public RichButton getB30() {
        return b30;
    }

    public void setCl17(RichCommandLink cl17) {
        this.cl17 = cl17;
    }

    public RichCommandLink getCl17() {
        return cl17;
    }

    public void setQryId17(RichQuickQuery qryId17) {
        this.qryId17 = qryId17;
    }

    public RichQuickQuery getQryId17() {
        return qryId17;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setSdi9(RichShowDetailItem sdi9) {
        this.sdi9 = sdi9;
    }

    public RichShowDetailItem getSdi9() {
        return sdi9;
    }

    public void setId8(RichInputDate id8) {
        this.id8 = id8;
    }

    public RichInputDate getId8() {
        return id8;
    }

    public void setId6(RichInputDate id6) {
        this.id6 = id6;
    }

    public RichInputDate getId6() {
        return id6;
    }

    public void setT7(RichTable t7) {
        this.t7 = t7;
    }

    public RichTable getT7() {
        return t7;
    }

    public void setB25(RichButton b25) {
        this.b25 = b25;
    }

    public RichButton getB25() {
        return b25;
    }

    public void setB24(RichButton b24) {
        this.b24 = b24;
    }

    public RichButton getB24() {
        return b24;
    }

    public void setB29(RichButton b29) {
        this.b29 = b29;
    }

    public RichButton getB29() {
        return b29;
    }

    public void setCl16(RichCommandLink cl16) {
        this.cl16 = cl16;
    }

    public RichCommandLink getCl16() {
        return cl16;
    }

    public void setQryId16(RichQuickQuery qryId16) {
        this.qryId16 = qryId16;
    }

    public RichQuickQuery getQryId16() {
        return qryId16;
    }

    public void setPgl18(RichPanelGroupLayout pgl18) {
        this.pgl18 = pgl18;
    }

    public RichPanelGroupLayout getPgl18() {
        return pgl18;
    }

    public void setSdi10(RichShowDetailItem sdi10) {
        this.sdi10 = sdi10;
    }

    public RichShowDetailItem getSdi10() {
        return sdi10;
    }

    public void setPt2(RichPanelTabbed pt2) {
        this.pt2 = pt2;
    }

    public RichPanelTabbed getPt2() {
        return pt2;
    }

    public void setMd1(RichTable md1) {
        this.md1 = md1;
    }

    public RichTable getMd1() {
        return md1;
    }

    public void setIt75(RichInputText it75) {
        this.it75 = it75;
    }

    public RichInputText getIt75() {
        return it75;
    }

    public void setIt74(RichInputText it74) {
        this.it74 = it74;
    }

    public RichInputText getIt74() {
        return it74;
    }

    public void setIt73(RichInputText it73) {
        this.it73 = it73;
    }

    public RichInputText getIt73() {
        return it73;
    }

    public void setIt72(RichInputText it72) {
        this.it72 = it72;
    }

    public RichInputText getIt72() {
        return it72;
    }

    public void setIt71(RichInputText it71) {
        this.it71 = it71;
    }

    public RichInputText getIt71() {
        return it71;
    }

    public void setIt70(RichInputText it70) {
        this.it70 = it70;
    }

    public RichInputText getIt70() {
        return it70;
    }

    public void setIt69(RichInputText it69) {
        this.it69 = it69;
    }

    public RichInputText getIt69() {
        return it69;
    }

    public void setIt68(RichInputText it68) {
        this.it68 = it68;
    }

    public RichInputText getIt68() {
        return it68;
    }

    public void setShippingAddress(UIXGroup shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public UIXGroup getShippingAddress() {
        return shippingAddress;
    }

    public void setIt67(RichInputText it67) {
        this.it67 = it67;
    }

    public RichInputText getIt67() {
        return it67;
    }

    public void setIt66(RichInputText it66) {
        this.it66 = it66;
    }

    public RichInputText getIt66() {
        return it66;
    }

    public void setIt65(RichInputText it65) {
        this.it65 = it65;
    }

    public RichInputText getIt65() {
        return it65;
    }

    public void setIt64(RichInputText it64) {
        this.it64 = it64;
    }

    public RichInputText getIt64() {
        return it64;
    }

    public void setIt63(RichInputText it63) {
        this.it63 = it63;
    }

    public RichInputText getIt63() {
        return it63;
    }

    public void setIt62(RichInputText it62) {
        this.it62 = it62;
    }

    public RichInputText getIt62() {
        return it62;
    }

    public void setIt61(RichInputText it61) {
        this.it61 = it61;
    }

    public RichInputText getIt61() {
        return it61;
    }

    public void setIt60(RichInputText it60) {
        this.it60 = it60;
    }

    public RichInputText getIt60() {
        return it60;
    }

    public void setPrimaryAddress(UIXGroup primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public UIXGroup getPrimaryAddress() {
        return primaryAddress;
    }

    public void setIt56(RichInputText it56) {
        this.it56 = it56;
    }

    public RichInputText getIt56() {
        return it56;
    }

    public void setIt55(RichInputText it55) {
        this.it55 = it55;
    }

    public RichInputText getIt55() {
        return it55;
    }

    public void setIt54(RichInputText it54) {
        this.it54 = it54;
    }

    public RichInputText getIt54() {
        return it54;
    }

    public void setIt53(RichInputText it53) {
        this.it53 = it53;
    }

    public RichInputText getIt53() {
        return it53;
    }

    public void setIt52(RichInputText it52) {
        this.it52 = it52;
    }

    public RichInputText getIt52() {
        return it52;
    }

    public void setIt51(RichInputText it51) {
        this.it51 = it51;
    }

    public RichInputText getIt51() {
        return it51;
    }

    public void setIt50(RichInputText it50) {
        this.it50 = it50;
    }

    public RichInputText getIt50() {
        return it50;
    }

    public void setSi37(UISelectItems si37) {
        this.si37 = si37;
    }

    public UISelectItems getSi37() {
        return si37;
    }

    public void setSoc37(RichSelectOneChoice soc37) {
        this.soc37 = soc37;
    }

    public RichSelectOneChoice getSoc37() {
        return soc37;
    }

    public void setSi36(UISelectItems si36) {
        this.si36 = si36;
    }

    public UISelectItems getSi36() {
        return si36;
    }

    public void setSoc36(RichSelectOneChoice soc36) {
        this.soc36 = soc36;
    }

    public RichSelectOneChoice getSoc36() {
        return soc36;
    }

    public void setIt49(RichInputText it49) {
        this.it49 = it49;
    }

    public RichInputText getIt49() {
        return it49;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setD4(RichDialog d4) {
        this.d4 = d4;
    }

    public RichDialog getD4() {
        return d4;
    }

    public void setP4(RichPopup p4) {
        this.p4 = p4;
    }

    public RichPopup getP4() {
        return p4;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setCl6(RichCommandLink cl6) {
        this.cl6 = cl6;
    }

    public RichCommandLink getCl6() {
        return cl6;
    }

    public void setQryId6(RichQuickQuery qryId6) {
        this.qryId6 = qryId6;
    }

    public RichQuickQuery getQryId6() {
        return qryId6;
    }

    public void setPgl21(RichPanelGroupLayout pgl21) {
        this.pgl21 = pgl21;
    }

    public RichPanelGroupLayout getPgl21() {
        return pgl21;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setSdi3(RichShowDetailItem sdi3) {
        this.sdi3 = sdi3;
    }

    public RichShowDetailItem getSdi3() {
        return sdi3;
    }

    public void setT17(RichTable t17) {
        this.t17 = t17;
    }

    public RichTable getT17() {
        return t17;
    }

    public void setId14(RichInputDate id14) {
        this.id14 = id14;
    }

    public RichInputDate getId14() {
        return id14;
    }

    public void setId13(RichInputDate id13) {
        this.id13 = id13;
    }

    public RichInputDate getId13() {
        return id13;
    }

    public void setId12(RichInputDate id12) {
        this.id12 = id12;
    }

    public RichInputDate getId12() {
        return id12;
    }

    public void setT13(RichTable t13) {
        this.t13 = t13;
    }

    public RichTable getT13() {
        return t13;
    }


    public void setD11(RichDialog d11) {
        this.d11 = d11;
    }

    public RichDialog getD11() {
        return d11;
    }

    public void setP11(RichPopup p11) {
        this.p11 = p11;
    }

    public RichPopup getP11() {
        return p11;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setB28(RichButton b28) {
        this.b28 = b28;
    }

    public RichButton getB28() {
        return b28;
    }

    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }

    public void setCl4(RichCommandLink cl4) {
        this.cl4 = cl4;
    }

    public RichCommandLink getCl4() {
        return cl4;
    }

    public void setQryId4(RichQuickQuery qryId4) {
        this.qryId4 = qryId4;
    }

    public RichQuickQuery getQryId4() {
        return qryId4;
    }

    public void setPgl11(RichPanelGroupLayout pgl11) {
        this.pgl11 = pgl11;
    }

    public RichPanelGroupLayout getPgl11() {
        return pgl11;
    }

    public void setSdi14(RichShowDetailItem sdi14) {
        this.sdi14 = sdi14;
    }

    public RichShowDetailItem getSdi14() {
        return sdi14;
    }

    public void setT18(RichTable t18) {
        this.t18 = t18;
    }

    public RichTable getT18() {
        return t18;
    }

    public void setId11(RichInputDate id11) {
        this.id11 = id11;
    }

    public RichInputDate getId11() {
        return id11;
    }

    public void setId10(RichInputDate id10) {
        this.id10 = id10;
    }

    public RichInputDate getId10() {
        return id10;
    }

    public void setT12(RichTable t12) {
        this.t12 = t12;
    }

    public RichTable getT12() {
        return t12;
    }

    public void setD7(RichDialog d7) {
        this.d7 = d7;
    }

    public RichDialog getD7() {
        return d7;
    }

    public void setP10(RichPopup p10) {
        this.p10 = p10;
    }

    public RichPopup getP10() {
        return p10;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }

    public void setCl1(RichCommandLink cl1) {
        this.cl1 = cl1;
    }

    public RichCommandLink getCl1() {
        return cl1;
    }

    public void setQryId1(RichQuickQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuickQuery getQryId1() {
        return qryId1;
    }

    public void setPgl10(RichPanelGroupLayout pgl10) {
        this.pgl10 = pgl10;
    }

    public RichPanelGroupLayout getPgl10() {
        return pgl10;
    }

    public void setSdi13(RichShowDetailItem sdi13) {
        this.sdi13 = sdi13;
    }

    public RichShowDetailItem getSdi13() {
        return sdi13;
    }

    public void setT10(RichTable t10) {
        this.t10 = t10;
    }

    public RichTable getT10() {
        return t10;
    }

    public void setGc6(RichGridCell gc6) {
        this.gc6 = gc6;
    }

    public RichGridCell getGc6() {
        return gc6;
    }

    public void setGr6(RichGridRow gr6) {
        this.gr6 = gr6;
    }

    public RichGridRow getGr6() {
        return gr6;
    }

    public void setPgl17(RichPanelGridLayout pgl17) {
        this.pgl17 = pgl17;
    }

    public RichPanelGridLayout getPgl17() {
        return pgl17;
    }

    public void setT19(RichTable t19) {
        this.t19 = t19;
    }

    public RichTable getT19() {
        return t19;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setSi26(UISelectItems si26) {
        this.si26 = si26;
    }

    public UISelectItems getSi26() {
        return si26;
    }

    public void setSoc26(RichSelectOneChoice soc26) {
        this.soc26 = soc26;
    }

    public RichSelectOneChoice getSoc26() {
        return soc26;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setD1(RichDialog d1) {
        this.d1 = d1;
    }

    public RichDialog getD1() {
        return d1;
    }

    public void setOpportunities_contacts(RichPopup opportunities_contacts) {
        this.opportunities_contacts = opportunities_contacts;
    }

    public RichPopup getOpportunities_contacts() {
        return opportunities_contacts;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setCl10(RichCommandLink cl10) {
        this.cl10 = cl10;
    }

    public RichCommandLink getCl10() {
        return cl10;
    }

    public void setQryId10(RichQuickQuery qryId10) {
        this.qryId10 = qryId10;
    }

    public RichQuickQuery getQryId10() {
        return qryId10;
    }

    public void setPgl24(RichPanelGroupLayout pgl24) {
        this.pgl24 = pgl24;
    }

    public RichPanelGroupLayout getPgl24() {
        return pgl24;
    }

    public void setSdi12(RichShowDetailItem sdi12) {
        this.sdi12 = sdi12;
    }

    public RichShowDetailItem getSdi12() {
        return sdi12;
    }

    public void setT28(RichTable t28) {
        this.t28 = t28;
    }

    public RichTable getT28() {
        return t28;
    }

    public void setGc5(RichGridCell gc5) {
        this.gc5 = gc5;
    }

    public RichGridCell getGc5() {
        return gc5;
    }

    public void setGr5(RichGridRow gr5) {
        this.gr5 = gr5;
    }

    public RichGridRow getGr5() {
        return gr5;
    }

    public void setPgl8(RichPanelGridLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGridLayout getPgl8() {
        return pgl8;
    }

    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }

    public void setD9(RichDialog d9) {
        this.d9 = d9;
    }

    public RichDialog getD9() {
        return d9;
    }

    public void setP8(RichPopup p8) {
        this.p8 = p8;
    }

    public RichPopup getP8() {
        return p8;
    }

    public void setB14(RichButton b14) {
        this.b14 = b14;
    }

    public RichButton getB14() {
        return b14;
    }

    public void setB27(RichButton b27) {
        this.b27 = b27;
    }

    public RichButton getB27() {
        return b27;
    }

    public void setCl9(RichCommandLink cl9) {
        this.cl9 = cl9;
    }

    public RichCommandLink getCl9() {
        return cl9;
    }

    public void setQryId9(RichQuickQuery qryId9) {
        this.qryId9 = qryId9;
    }

    public RichQuickQuery getQryId9() {
        return qryId9;
    }

    public void setPgl23(RichPanelGroupLayout pgl23) {
        this.pgl23 = pgl23;
    }

    public RichPanelGroupLayout getPgl23() {
        return pgl23;
    }

    public void setPgl9(RichPanelGroupLayout pgl9) {
        this.pgl9 = pgl9;
    }

    public RichPanelGroupLayout getPgl9() {
        return pgl9;
    }

    public void setSdi11(RichShowDetailItem sdi11) {
        this.sdi11 = sdi11;
    }

    public RichShowDetailItem getSdi11() {
        return sdi11;
    }

    public void setId29(RichInputDate id29) {
        this.id29 = id29;
    }

    public RichInputDate getId29() {
        return id29;
    }

    public void setT9(RichTable t9) {
        this.t9 = t9;
    }

    public RichTable getT9() {
        return t9;
    }

    public void setGc4(RichGridCell gc4) {
        this.gc4 = gc4;
    }

    public RichGridCell getGc4() {
        return gc4;
    }

    public void setGr4(RichGridRow gr4) {
        this.gr4 = gr4;
    }

    public RichGridRow getGr4() {
        return gr4;
    }

    public void setPgl16(RichPanelGridLayout pgl16) {
        this.pgl16 = pgl16;
    }

    public RichPanelGridLayout getPgl16() {
        return pgl16;
    }

    public void setD8(RichDialog d8) {
        this.d8 = d8;
    }

    public RichDialog getD8() {
        return d8;
    }

    public void setP7(RichPopup p7) {
        this.p7 = p7;
    }

    public RichPopup getP7() {
        return p7;
    }

    public void setB15(RichButton b15) {
        this.b15 = b15;
    }

    public RichButton getB15() {
        return b15;
    }

    public void setB26(RichButton b26) {
        this.b26 = b26;
    }

    public RichButton getB26() {
        return b26;
    }

    public void setPgl15(RichPanelGroupLayout pgl15) {
        this.pgl15 = pgl15;
    }

    public RichPanelGroupLayout getPgl15() {
        return pgl15;
    }

    public void setTab1(RichShowDetailItem tab1) {
        this.tab1 = tab1;
    }

    public RichShowDetailItem getTab1() {
        return tab1;
    }

    public void setT8(RichTable t8) {
        this.t8 = t8;
    }

    public RichTable getT8() {
        return t8;
    }

    public void setGc1(RichGridCell gc1) {
        this.gc1 = gc1;
    }

    public RichGridCell getGc1() {
        return gc1;
    }

    public void setGr1(RichGridRow gr1) {
        this.gr1 = gr1;
    }

    public RichGridRow getGr1() {
        return gr1;
    }

    public void setPgl12(RichPanelGridLayout pgl12) {
        this.pgl12 = pgl12;
    }

    public RichPanelGridLayout getPgl12() {
        return pgl12;
    }

    public void setB16(RichButton b16) {
        this.b16 = b16;
    }

    public RichButton getB16() {
        return b16;
    }

    public void setCl8(RichCommandLink cl8) {
        this.cl8 = cl8;
    }

    public RichCommandLink getCl8() {
        return cl8;
    }

    public void setQryId8(RichQuickQuery qryId8) {
        this.qryId8 = qryId8;
    }

    public RichQuickQuery getQryId8() {
        return qryId8;
    }

    public void setD6(RichDialog d6) {
        this.d6 = d6;
    }

    public RichDialog getD6() {
        return d6;
    }

    public void setP6(RichPopup p6) {
        this.p6 = p6;
    }

    public RichPopup getP6() {
        return p6;
    }

    public void setPgl29(RichPanelGroupLayout pgl29) {
        this.pgl29 = pgl29;
    }

    public RichPanelGroupLayout getPgl29() {
        return pgl29;
    }

    public void setPbl3(RichPanelBorderLayout pbl3) {
        this.pbl3 = pbl3;
    }

    public RichPanelBorderLayout getPbl3() {
        return pbl3;
    }

    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }

    public void setTab2(RichShowDetailItem tab2) {
        this.tab2 = tab2;
    }

    public RichShowDetailItem getTab2() {
        return tab2;
    }

    public void setPt1(RichPanelTabbed pt1) {
        this.pt1 = pt1;
    }

    public RichPanelTabbed getPt1() {
        return pt1;
    }

    public void setGc3(RichGridCell gc3) {
        this.gc3 = gc3;
    }

    public RichGridCell getGc3() {
        return gc3;
    }

    public void setGr3(RichGridRow gr3) {
        this.gr3 = gr3;
    }

    public RichGridRow getGr3() {
        return gr3;
    }

    public void setIt48(RichInputText it48) {
        this.it48 = it48;
    }

    public RichInputText getIt48() {
        return it48;
    }

    public void setSi35(UISelectItems si35) {
        this.si35 = si35;
    }

    public UISelectItems getSi35() {
        return si35;
    }

    public void setSoc35(RichSelectOneChoice soc35) {
        this.soc35 = soc35;
    }

    public RichSelectOneChoice getSoc35() {
        return soc35;
    }

    public void setIt47(RichInputText it47) {
        this.it47 = it47;
    }

    public RichInputText getIt47() {
        return it47;
    }

    public void setIt46(RichInputText it46) {
        this.it46 = it46;
    }

    public RichInputText getIt46() {
        return it46;
    }

    public void setIt45(RichInputText it45) {
        this.it45 = it45;
    }

    public RichInputText getIt45() {
        return it45;
    }

    public void setIt44(RichInputText it44) {
        this.it44 = it44;
    }

    public RichInputText getIt44() {
        return it44;
    }

    public void setIt43(RichInputText it43) {
        this.it43 = it43;
    }

    public RichInputText getIt43() {
        return it43;
    }

    public void setIt42(RichInputText it42) {
        this.it42 = it42;
    }

    public RichInputText getIt42() {
        return it42;
    }

    public void setIt41(RichInputText it41) {
        this.it41 = it41;
    }

    public RichInputText getIt41() {
        return it41;
    }

    public void setIt30(RichInputText it30) {
        this.it30 = it30;
    }

    public RichInputText getIt30() {
        return it30;
    }

    public void setIt29(RichInputText it29) {
        this.it29 = it29;
    }

    public RichInputText getIt29() {
        return it29;
    }

    public void setIt28(RichInputText it28) {
        this.it28 = it28;
    }

    public RichInputText getIt28() {
        return it28;
    }

    public void setIt27(RichInputText it27) {
        this.it27 = it27;
    }

    public RichInputText getIt27() {
        return it27;
    }

    public void setSi34(UISelectItems si34) {
        this.si34 = si34;
    }

    public UISelectItems getSi34() {
        return si34;
    }

    public void setSoc34(RichSelectOneChoice soc34) {
        this.soc34 = soc34;
    }

    public RichSelectOneChoice getSoc34() {
        return soc34;
    }

    public void setSi33(UISelectItems si33) {
        this.si33 = si33;
    }

    public UISelectItems getSi33() {
        return si33;
    }

    public void setSoc33(RichSelectOneChoice soc33) {
        this.soc33 = soc33;
    }

    public RichSelectOneChoice getSoc33() {
        return soc33;
    }

    public void setSi32(UISelectItems si32) {
        this.si32 = si32;
    }

    public UISelectItems getSi32() {
        return si32;
    }

    public void setSoc32(RichSelectOneChoice soc32) {
        this.soc32 = soc32;
    }

    public RichSelectOneChoice getSoc32() {
        return soc32;
    }

    public void setId19(RichInputDate id19) {
        this.id19 = id19;
    }

    public RichInputDate getId19() {
        return id19;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
    }

    public void setSi31(UISelectItems si31) {
        this.si31 = si31;
    }

    public UISelectItems getSi31() {
        return si31;
    }

    public void setSoc31(RichSelectOneChoice soc31) {
        this.soc31 = soc31;
    }

    public RichSelectOneChoice getSoc31() {
        return soc31;
    }

    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setD2(RichDialog d2) {
        this.d2 = d2;
    }

    public RichDialog getD2() {
        return d2;
    }

    public void setOpportunityEdit(RichPopup opportunityEdit) {
        this.opportunityEdit = opportunityEdit;
    }

    public RichPopup getOpportunityEdit() {
        return opportunityEdit;
    }

    public void setId18(RichInputDate id18) {
        this.id18 = id18;
    }

    public RichInputDate getId18() {
        return id18;
    }

    public void setId17(RichInputDate id17) {
        this.id17 = id17;
    }

    public RichInputDate getId17() {
        return id17;
    }

    public void setT16(RichTable t16) {
        this.t16 = t16;
    }

    public RichTable getT16() {
        return t16;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }


    public void setT25(RichToolbar t25) {
        this.t25 = t25;
    }

    public RichToolbar getT25() {
        return t25;
    }

    public void setT24(RichToolbox t24) {
        this.t24 = t24;
    }

    public RichToolbox getT24() {
        return t24;
    }

    public void setGc2(RichGridCell gc2) {
        this.gc2 = gc2;
    }

    public RichGridCell getGc2() {
        return gc2;
    }

    public void setGr2(RichGridRow gr2) {
        this.gr2 = gr2;
    }

    public RichGridRow getGr2() {
        return gr2;
    }

    public void setPgl13(RichPanelGridLayout pgl13) {
        this.pgl13 = pgl13;
    }

    public RichPanelGridLayout getPgl13() {
        return pgl13;
    }

    public void setB18(RichButton b18) {
        this.b18 = b18;
    }

    public RichButton getB18() {
        return b18;
    }

    public void setB17(RichButton b17) {
        this.b17 = b17;
    }

    public RichButton getB17() {
        return b17;
    }

    public void setCl7(RichCommandLink cl7) {
        this.cl7 = cl7;
    }

    public RichCommandLink getCl7() {
        return cl7;
    }

    public void setQryId7(RichQuickQuery qryId7) {
        this.qryId7 = qryId7;
    }

    public RichQuickQuery getQryId7() {
        return qryId7;
    }

    public void setPgl14(RichPanelGroupLayout pgl14) {
        this.pgl14 = pgl14;
    }

    public RichPanelGroupLayout getPgl14() {
        return pgl14;
    }

    public void setPbl2(RichPanelBorderLayout pbl2) {
        this.pbl2 = pbl2;
    }

    public RichPanelBorderLayout getPbl2() {
        return pbl2;
    }

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
    }

    public void setD28(RichDialog d28) {
        this.d28 = d28;
    }

    public RichDialog getD28() {
        return d28;
    }

    public void setP28(RichPopup p28) {
        this.p28 = p28;
    }

    public RichPopup getP28() {
        return p28;
    }

    public void setD27(RichDialog d27) {
        this.d27 = d27;
    }

    public RichDialog getD27() {
        return d27;
    }

    public void setP27(RichPopup p27) {
        this.p27 = p27;
    }

    public RichPopup getP27() {
        return p27;
    }

    public void setD26(RichDialog d26) {
        this.d26 = d26;
    }

    public RichDialog getD26() {
        return d26;
    }

    public void setP26(RichPopup p26) {
        this.p26 = p26;
    }

    public RichPopup getP26() {
        return p26;
    }

    public void setD25(RichDialog d25) {
        this.d25 = d25;
    }

    public RichDialog getD25() {
        return d25;
    }

    public void setP25(RichPopup p25) {
        this.p25 = p25;
    }

    public RichPopup getP25() {
        return p25;
    }

    public void setD24(RichDialog d24) {
        this.d24 = d24;
    }

    public RichDialog getD24() {
        return d24;
    }

    public void setP24(RichPopup p24) {
        this.p24 = p24;
    }

    public RichPopup getP24() {
        return p24;
    }

    public void setD23(RichDialog d23) {
        this.d23 = d23;
    }

    public RichDialog getD23() {
        return d23;
    }

    public void setP23(RichPopup p23) {
        this.p23 = p23;
    }

    public RichPopup getP23() {
        return p23;
    }

    public void setD22(RichDialog d22) {
        this.d22 = d22;
    }

    public RichDialog getD22() {
        return d22;
    }

    public void setP22(RichPopup p22) {
        this.p22 = p22;
    }

    public RichPopup getP22() {
        return p22;
    }

    public void setD21(RichDialog d21) {
        this.d21 = d21;
    }

    public RichDialog getD21() {
        return d21;
    }

    public void setP21(RichPopup p21) {
        this.p21 = p21;
    }

    public RichPopup getP21() {
        return p21;
    }

    public void setD20(RichDialog d20) {
        this.d20 = d20;
    }

    public RichDialog getD20() {
        return d20;
    }

    public void setP20(RichPopup p20) {
        this.p20 = p20;
    }

    public RichPopup getP20() {
        return p20;
    }

    public void setD19(RichDialog d19) {
        this.d19 = d19;
    }

    public RichDialog getD19() {
        return d19;
    }

    public void setP19(RichPopup p19) {
        this.p19 = p19;
    }

    public RichPopup getP19() {
        return p19;
    }

    public void setD18(RichDialog d18) {
        this.d18 = d18;
    }

    public RichDialog getD18() {
        return d18;
    }

    public void setP18(RichPopup p18) {
        this.p18 = p18;
    }

    public RichPopup getP18() {
        return p18;
    }

    public void setD16(RichDialog d16) {
        this.d16 = d16;
    }

    public RichDialog getD16() {
        return d16;
    }

    public void setP17(RichPopup p17) {
        this.p17 = p17;
    }

    public RichPopup getP17() {
        return p17;
    }

    public void setD17(RichDialog d17) {
        this.d17 = d17;
    }

    public RichDialog getD17() {
        return d17;
    }

    public void setP16(RichPopup p16) {
        this.p16 = p16;
    }

    public RichPopup getP16() {
        return p16;
    }

    public void setD15(RichDialog d15) {
        this.d15 = d15;
    }

    public RichDialog getD15() {
        return d15;
    }

    public void setP15(RichPopup p15) {
        this.p15 = p15;
    }

    public RichPopup getP15() {
        return p15;
    }

    public void setD14(RichDialog d14) {
        this.d14 = d14;
    }

    public RichDialog getD14() {
        return d14;
    }

    public void setP14(RichPopup p14) {
        this.p14 = p14;
    }

    public RichPopup getP14() {
        return p14;
    }

    public void setD13(RichDialog d13) {
        this.d13 = d13;
    }

    public RichDialog getD13() {
        return d13;
    }

    public void setP13(RichPopup p13) {
        this.p13 = p13;
    }

    public RichPopup getP13() {
        return p13;
    }

    public void setD12(RichDialog d12) {
        this.d12 = d12;
    }

    public RichDialog getD12() {
        return d12;
    }

    public void setP12(RichPopup p12) {
        this.p12 = p12;
    }

    public RichPopup getP12() {
        return p12;
    }

    public void setD10(RichDialog d10) {
        this.d10 = d10;
    }

    public RichDialog getD10() {
        return d10;
    }

    public void setP9(RichPopup p9) {
        this.p9 = p9;
    }

    public RichPopup getP9() {
        return p9;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setCl3(RichCommandLink cl3) {
        this.cl3 = cl3;
    }

    public RichCommandLink getCl3() {
        return cl3;
    }

    public void setQryId3(RichQuickQuery qryId3) {
        this.qryId3 = qryId3;
    }

    public RichQuickQuery getQryId3() {
        return qryId3;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setPh3(RichPanelHeader ph3) {
        this.ph3 = ph3;
    }

    public RichPanelHeader getPh3() {
        return ph3;
    }

    public void setPbl1(RichPanelBorderLayout pbl1) {
        this.pbl1 = pbl1;
    }

    public RichPanelBorderLayout getPbl1() {
        return pbl1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setPs1(RichPanelSpringboard ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSpringboard getPs1() {
        return ps1;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }
    
    
    
    public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }
    
    
    
    public void insertNotes(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        
        BindingContainer bindings = getBindings();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsertNotes");
                Object result = operationBinding.execute();
                if (!operationBinding.getErrors().isEmpty()) {
                    
                }
                 
    }
    
    
    public void Cancel(PopupCanceledEvent popupCancel) {
        // Add event code here...
        
        BindingContainer bindings = getBindings();
                OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
                Object result = operationBinding.execute();
                if (!operationBinding.getErrors().isEmpty()) {
                    
                }
                 
    }
    
    
    
    
    
    
    public void Save(DialogEvent dEvent)
    {
    
     if (dEvent.getOutcome() == DialogEvent.Outcome.ok)
        {
            //insertOPCustomersCommitAction();
         
         BindingContainer bindings=getBindings();
         
         OperationBinding opBind=bindings.getOperationBinding("Commit");
         Object res=opBind.execute();
        }
     
   //  return null;
     }


    public void insertOpp(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        
//        BindingContainer bindings = getBindings();
//                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert2Opportunity");
//                Object result = operationBinding.execute();
//                if (!operationBinding.getErrors().isEmpty()) {
//                    
//                }
                 
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setSoc28(RichSelectOneChoice soc28) {
        this.soc28 = soc28;
    }

    public RichSelectOneChoice getSoc28() {
        return soc28;
    }

    public void setSi28(UISelectItems si28) {
        this.si28 = si28;
    }

    public UISelectItems getSi28() {
        return si28;
    }

    public void setPfl5(RichPanelFormLayout pfl5) {
        this.pfl5 = pfl5;
    }

    public RichPanelFormLayout getPfl5() {
        return pfl5;
    }

    public void setSoc46(RichSelectOneChoice soc46) {
        this.soc46 = soc46;
    }

    public RichSelectOneChoice getSoc46() {
        return soc46;
    }

    public void setSi46(UISelectItems si46) {
        this.si46 = si46;
    }

    public UISelectItems getSi46() {
        return si46;
    }

    public void setIt35(RichInputText it35) {
        this.it35 = it35;
    }

    public RichInputText getIt35() {
        return it35;
    }

    public void setIt36(RichInputText it36) {
        this.it36 = it36;
    }

    public RichInputText getIt36() {
        return it36;
    }

    public void setIt57(RichInputText it57) {
        this.it57 = it57;
    }

    public RichInputText getIt57() {
        return it57;
    }

    public void setIt58(RichInputText it58) {
        this.it58 = it58;
    }

    public RichInputText getIt58() {
        return it58;
    }

    public void setIt59(RichInputText it59) {
        this.it59 = it59;
    }

    public RichInputText getIt59() {
        return it59;
    }

    public void setIt76(RichInputText it76) {
        this.it76 = it76;
    }

    public RichInputText getIt76() {
        return it76;
    }

    public void setPgl33(RichPanelGroupLayout pgl33) {
        this.pgl33 = pgl33;
    }

    public RichPanelGroupLayout getPgl33() {
        return pgl33;
    }


    public void setQryId21(RichQuickQuery qryId21) {
        this.qryId21 = qryId21;
    }

    public RichQuickQuery getQryId21() {
        return qryId21;
    }

    public void setCl21(RichCommandLink cl21) {
        this.cl21 = cl21;
    }

    public RichCommandLink getCl21() {
        return cl21;
    }

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setD3(RichDialog d3) {
        this.d3 = d3;
    }

    public RichDialog getD3() {
        return d3;
    }

    public void setPfl6(RichPanelFormLayout pfl6) {
        this.pfl6 = pfl6;
    }

    public RichPanelFormLayout getPfl6() {
        return pfl6;
    }

    public void setIt77(RichInputText it77) {
        this.it77 = it77;
    }

    public RichInputText getIt77() {
        return it77;
    }

    public void setId30(RichInputDate id30) {
        this.id30 = id30;
    }

    public RichInputDate getId30() {
        return id30;
    }

    public void setIt78(RichInputText it78) {
        this.it78 = it78;
    }

    public RichInputText getIt78() {
        return it78;
    }

    public void setSoc47(RichSelectOneChoice soc47) {
        this.soc47 = soc47;
    }

    public RichSelectOneChoice getSoc47() {
        return soc47;
    }

    public void setSi47(UISelectItems si47) {
        this.si47 = si47;
    }

    public UISelectItems getSi47() {
        return si47;
    }

    public void setSoc48(RichSelectOneChoice soc48) {
        this.soc48 = soc48;
    }

    public RichSelectOneChoice getSoc48() {
        return soc48;
    }

    public void setSi48(UISelectItems si48) {
        this.si48 = si48;
    }

    public UISelectItems getSi48() {
        return si48;
    }

    public void setIt79(RichInputText it79) {
        this.it79 = it79;
    }

    public RichInputText getIt79() {
        return it79;
    }

    public void setIt80(RichInputText it80) {
        this.it80 = it80;
    }

    public RichInputText getIt80() {
        return it80;
    }

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
    }

    public void setD29(RichDialog d29) {
        this.d29 = d29;
    }

    public RichDialog getD29() {
        return d29;
    }

    public void setD30(RichDialog d30) {
        this.d30 = d30;
    }

    public RichDialog getD30() {
        return d30;
    }

    public void setPfl7(RichPanelFormLayout pfl7) {
        this.pfl7 = pfl7;
    }

    public RichPanelFormLayout getPfl7() {
        return pfl7;
    }

    public void setSoc49(RichSelectOneChoice soc49) {
        this.soc49 = soc49;
    }

    public RichSelectOneChoice getSoc49() {
        return soc49;
    }

    public void setSi49(UISelectItems si49) {
        this.si49 = si49;
    }

    public UISelectItems getSi49() {
        return si49;
    }

    public void setIt81(RichInputText it81) {
        this.it81 = it81;
    }

    public RichInputText getIt81() {
        return it81;
    }

    public void setIt82(RichInputText it82) {
        this.it82 = it82;
    }

    public RichInputText getIt82() {
        return it82;
    }

    public void setIt83(RichInputText it83) {
        this.it83 = it83;
    }

    public RichInputText getIt83() {
        return it83;
    }

    public void setIt84(RichInputText it84) {
        this.it84 = it84;
    }

    public RichInputText getIt84() {
        return it84;
    }

    public void setIt85(RichInputText it85) {
        this.it85 = it85;
    }

    public RichInputText getIt85() {
        return it85;
    }

    public void setIt86(RichInputText it86) {
        this.it86 = it86;
    }

    public RichInputText getIt86() {
        return it86;
    }


    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
    }

    public void setD31(RichDialog d31) {
        this.d31 = d31;
    }

    public RichDialog getD31() {
        return d31;
    }

    public void setPfl8(RichPanelFormLayout pfl8) {
        this.pfl8 = pfl8;
    }

    public RichPanelFormLayout getPfl8() {
        return pfl8;
    }

    public void setIt87(RichInputText it87) {
        this.it87 = it87;
    }

    public RichInputText getIt87() {
        return it87;
    }

    public void setSoc50(RichSelectOneChoice soc50) {
        this.soc50 = soc50;
    }

    public RichSelectOneChoice getSoc50() {
        return soc50;
    }

    public void setSi50(UISelectItems si50) {
        this.si50 = si50;
    }

    public UISelectItems getSi50() {
        return si50;
    }

    public void setSoc51(RichSelectOneChoice soc51) {
        this.soc51 = soc51;
    }

    public RichSelectOneChoice getSoc51() {
        return soc51;
    }

    public void setSi51(UISelectItems si51) {
        this.si51 = si51;
    }

    public UISelectItems getSi51() {
        return si51;
    }

    public void setIt88(RichInputText it88) {
        this.it88 = it88;
    }

    public RichInputText getIt88() {
        return it88;
    }

    public void setIt89(RichInputText it89) {
        this.it89 = it89;
    }

    public RichInputText getIt89() {
        return it89;
    }

    public void setIt90(RichInputText it90) {
        this.it90 = it90;
    }

    public RichInputText getIt90() {
        return it90;
    }

    public void setIt91(RichInputText it91) {
        this.it91 = it91;
    }

    public RichInputText getIt91() {
        return it91;
    }

    public void setIt92(RichInputText it92) {
        this.it92 = it92;
    }

    public RichInputText getIt92() {
        return it92;
    }

    public void setIt93(RichInputText it93) {
        this.it93 = it93;
    }

    public RichInputText getIt93() {
        return it93;
    }

    public void setIt94(RichInputText it94) {
        this.it94 = it94;
    }

    public RichInputText getIt94() {
        return it94;
    }

    public void setIt95(RichInputText it95) {
        this.it95 = it95;
    }

    public RichInputText getIt95() {
        return it95;
    }

    public void setIt96(RichInputText it96) {
        this.it96 = it96;
    }

    public RichInputText getIt96() {
        return it96;
    }

    public void setIt97(RichInputText it97) {
        this.it97 = it97;
    }

    public RichInputText getIt97() {
        return it97;
    }

    public void setIt98(RichInputText it98) {
        this.it98 = it98;
    }

    public RichInputText getIt98() {
        return it98;
    }

    public void setIt99(RichInputText it99) {
        this.it99 = it99;
    }

    public RichInputText getIt99() {
        return it99;
    }

    public void setIt100(RichInputText it100) {
        this.it100 = it100;
    }

    public RichInputText getIt100() {
        return it100;
    }

    public void setIt101(RichInputText it101) {
        this.it101 = it101;
    }

    public RichInputText getIt101() {
        return it101;
    }

    public void setIt102(RichInputText it102) {
        this.it102 = it102;
    }

    public RichInputText getIt102() {
        return it102;
    }

    public void setIt103(RichInputText it103) {
        this.it103 = it103;
    }

    public RichInputText getIt103() {
        return it103;
    }

    public void setIt104(RichInputText it104) {
        this.it104 = it104;
    }

    public RichInputText getIt104() {
        return it104;
    }

    public void setIt105(RichInputText it105) {
        this.it105 = it105;
    }

    public RichInputText getIt105() {
        return it105;
    }

    public void setIt106(RichInputText it106) {
        this.it106 = it106;
    }

    public RichInputText getIt106() {
        return it106;
    }

    public void setIt107(RichInputText it107) {
        this.it107 = it107;
    }

    public RichInputText getIt107() {
        return it107;
    }

    public void setIt108(RichInputText it108) {
        this.it108 = it108;
    }

    public RichInputText getIt108() {
        return it108;
    }

    public void setIt109(RichInputText it109) {
        this.it109 = it109;
    }

    public RichInputText getIt109() {
        return it109;
    }

    public void setIt110(RichInputText it110) {
        this.it110 = it110;
    }

    public RichInputText getIt110() {
        return it110;
    }

    public void setIt111(RichInputText it111) {
        this.it111 = it111;
    }

    public RichInputText getIt111() {
        return it111;
    }

    public void setP29(RichPopup p29) {
        this.p29 = p29;
    }

    public RichPopup getP29() {
        return p29;
    }

    public void setD32(RichDialog d32) {
        this.d32 = d32;
    }

    public RichDialog getD32() {
        return d32;
    }

    public void setPfl9(RichPanelFormLayout pfl9) {
        this.pfl9 = pfl9;
    }

    public RichPanelFormLayout getPfl9() {
        return pfl9;
    }

    public void setIt112(RichInputText it112) {
        this.it112 = it112;
    }

    public RichInputText getIt112() {
        return it112;
    }

    public void setSoc52(RichSelectOneChoice soc52) {
        this.soc52 = soc52;
    }

    public RichSelectOneChoice getSoc52() {
        return soc52;
    }

    public void setSi52(UISelectItems si52) {
        this.si52 = si52;
    }

    public UISelectItems getSi52() {
        return si52;
    }

    public void setIt113(RichInputText it113) {
        this.it113 = it113;
    }

    public RichInputText getIt113() {
        return it113;
    }

    public void setId31(RichInputDate id31) {
        this.id31 = id31;
    }

    public RichInputDate getId31() {
        return id31;
    }

    public void setId32(RichInputDate id32) {
        this.id32 = id32;
    }

    public RichInputDate getId32() {
        return id32;
    }

    public void setSoc53(RichSelectOneChoice soc53) {
        this.soc53 = soc53;
    }

    public RichSelectOneChoice getSoc53() {
        return soc53;
    }

    public void setSi53(UISelectItems si53) {
        this.si53 = si53;
    }

    public UISelectItems getSi53() {
        return si53;
    }

    public void setSoc54(RichSelectOneChoice soc54) {
        this.soc54 = soc54;
    }

    public RichSelectOneChoice getSoc54() {
        return soc54;
    }

    public void setSi54(UISelectItems si54) {
        this.si54 = si54;
    }

    public UISelectItems getSi54() {
        return si54;
    }

    public void setSoc55(RichSelectOneChoice soc55) {
        this.soc55 = soc55;
    }

    public RichSelectOneChoice getSoc55() {
        return soc55;
    }

    public void setSi55(UISelectItems si55) {
        this.si55 = si55;
    }

    public UISelectItems getSi55() {
        return si55;
    }

    public void setIt114(RichInputText it114) {
        this.it114 = it114;
    }

    public RichInputText getIt114() {
        return it114;
    }

    public void setIt115(RichInputText it115) {
        this.it115 = it115;
    }

    public RichInputText getIt115() {
        return it115;
    }

    public void setIt116(RichInputText it116) {
        this.it116 = it116;
    }

    public RichInputText getIt116() {
        return it116;
    }

    public void setIt117(RichInputText it117) {
        this.it117 = it117;
    }

    public RichInputText getIt117() {
        return it117;
    }

    public void setIt118(RichInputText it118) {
        this.it118 = it118;
    }

    public RichInputText getIt118() {
        return it118;
    }

    public void setIt119(RichInputText it119) {
        this.it119 = it119;
    }

    public RichInputText getIt119() {
        return it119;
    }

    public void setIt120(RichInputText it120) {
        this.it120 = it120;
    }

    public RichInputText getIt120() {
        return it120;
    }

    public void setIt121(RichInputText it121) {
        this.it121 = it121;
    }

    public RichInputText getIt121() {
        return it121;
    }

    public void setIt122(RichInputText it122) {
        this.it122 = it122;
    }

    public RichInputText getIt122() {
        return it122;
    }

    public void setIt123(RichInputText it123) {
        this.it123 = it123;
    }

    public RichInputText getIt123() {
        return it123;
    }

    public void setSoc56(RichSelectOneChoice soc56) {
        this.soc56 = soc56;
    }

    public RichSelectOneChoice getSoc56() {
        return soc56;
    }

    public void setSi56(UISelectItems si56) {
        this.si56 = si56;
    }

    public UISelectItems getSi56() {
        return si56;
    }
}