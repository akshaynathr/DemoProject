package view;

import javax.faces.component.UISelectItems;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDialog;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBorderLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelSpringboard;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class insertBean {
    private RichButton b1;
    private RichPanelGroupLayout pgl3;
    private RichInputDate id16;
    private RichInputDate id15;
    private RichTable t15;
    private RichShowDetailItem sdi15;
    private RichTable t14;
    private RichPanelHeader ph8;
    private RichPanelGroupLayout pgl6;
    private RichShowDetailItem tab4;
    private RichPanelTabbed pt3;
    private RichTable md3;
    private RichPanelHeader ph7;
    private RichShowDetailItem sdi6;
    private RichShowDetailItem sdi5;
    private RichInputDate id1;
    private RichTable t4;
    private RichShowDetailItem sdi4;
    private RichTable t2;
    private RichButton b5;
    private RichPanelHeader ph5;
    private RichPanelGroupLayout pgl2;
    private RichShowDetailItem sdi7;
    private RichTable t1;
    private RichButton b4;
    private RichPanelHeader ph2;
    private RichPanelGroupLayout pgl1;
    private RichShowDetailItem tab3;
    private RichTable t5;
    private RichShowDetailItem sdi8;
    private RichInputDate id5;
    private RichInputDate id4;
    private RichInputDate id3;
    private RichInputDate id2;
    private RichTable t6;
    private RichShowDetailItem sdi9;
    private RichInputDate id8;
    private RichInputDate id6;
    private RichTable t7;
    private RichShowDetailItem sdi10;
    private RichPanelTabbed pt2;
    private RichTable md1;
    private RichButton b2;
    private RichPanelHeader ph1;
    private RichShowDetailItem sdi3;
    private UISelectItems si28;
    private RichSelectOneChoice soc28;
    private RichPanelFormLayout pfl3;
    private RichDialog d3;
    private RichPopup p3;
    private RichInputDate id14;
    private RichInputDate id13;
    private RichInputDate id12;
    private RichTable t13;
    private RichButton b8;
    private RichCommandLink cl4;
    private RichQuickQuery qryId4;
    private RichPanelHeader ph9;
    private RichPanelGroupLayout pgl11;
    private RichShowDetailItem sdi14;
    private RichPopup p2;
    private RichInputDate id11;
    private RichInputDate id10;
    private RichTable t12;
    private RichButton b9;
    private RichCommandLink cl1;
    private RichQuickQuery qryId1;
    private RichPanelHeader ph4;
    private RichPanelGroupLayout pgl10;
    private RichShowDetailItem sdi13;
    private RichInputText it24;
    private UISelectItems si26;
    private RichSelectOneChoice soc26;
    private RichPanelFormLayout pfl1;
    private RichDialog d1;
    private RichPopup opportunities_contacts;
    private RichTable t11;
    private RichButton b7;
    private RichButton b6;
    private RichShowDetailItem sdi12;
    private RichTable t10;
    private RichInputText it30;
    private RichInputText it29;
    private RichInputText it28;
    private RichInputText it27;
    private RichInputText it26;
    private RichInputText it25;
    private UISelectItems si15;
    private RichSelectOneChoice soc15;
    private RichPanelFormLayout pfl2;
    private RichDialog d2;
    private RichPopup p1;
    private RichButton b3;
    private RichCommandLink cl2;
    private RichQuickQuery qryId2;
    private RichPanelGroupLayout pgl8;
    private RichPanelHeader ph10;
    private RichPanelGroupLayout pgl9;
    private RichShowDetailItem sdi11;
    private RichTable t9;
    private RichShowDetailItem tab1;
    private RichTable t8;
    private RichPanelHeader ph6;
    private RichPanelGroupLayout pgl4;
    private RichShowDetailItem tab2;
    private RichPanelTabbed pt1;
    private RichInputDate id18;
    private RichInputDate id17;
    private RichTable t16;
    private RichShowDetailItem sdi2;
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
    private RichTable t17;
    private RichButton b10;
    private RichTable t18;
    private RichButton b11;
    private RichTable t19;
    private RichButton b12;
    private RichButton b13;
    private RichButton b14;
    private RichButton b15;
    private RichButton b16;
    private RichButton b17;
    private RichButton b18;
    private RichTable t20;
    private RichButton b19;
    private RichTable t21;
    private RichButton b20;
    private RichTable t22;
    private RichButton b21;
    private RichButton b22;
    private RichButton b23;
    private RichButton b24;
    private RichButton b25;

    public insertBean() {
    }
    
                
            public BindingContainer getBindings() {
                    return BindingContext.getCurrent().getCurrentBindingsEntry();
                }
                

    public void insertOppContacts(DialogEvent dialogEvent) {
        // Add event code here...
        
        System.out.print("Test");
        
        System.out.print("Test");
        System.out.println(dialogEvent.getOutcome() == DialogEvent.Outcome.ok);
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok)
           {
               insertOPCustomersCommitAction();
           }
        }
        
        public String insertOPCustomersCommitAction() {
           System.out.print("Test");
           BindingContainer bindings = getBindings();
//                   OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert3");
//                   Object result = operationBinding.execute();
//                   if (!operationBinding.getErrors().isEmpty()) {
//                       return null;
//                   }
           
           OperationBinding operationBinding2 = bindings.getOperationBinding("Commit");
           Object result2 = operationBinding2.execute();
           if (!operationBinding2.getErrors().isEmpty()) {
               return null;
           }
           
           return null;
        }


    public String insertOpContactPopFetch(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        
        BindingContainer bindings = getBindings();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert3");
                Object result = operationBinding.execute();
                if (!operationBinding.getErrors().isEmpty()) {
                    
                }
                return null;
    }

  //////////////////////////////////////////////////////////////////////////////////////////////////
  
  public void insertOppRevenue(DialogEvent dialogEvent) {
      // Add event code here...
      
      System.out.print("Test");
      
      System.out.print("Test");
      System.out.println(dialogEvent.getOutcome() == DialogEvent.Outcome.ok);
      if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok)
         {
             insertOPRevenueCommitAction();
         }
      }
      
      public String insertOPRevenueCommitAction() {
         System.out.print("Test");
         BindingContainer bindings = getBindings();
  //                   OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert3");
  //                   Object result = operationBinding.execute();
  //                   if (!operationBinding.getErrors().isEmpty()) {
  //                       return null;
  //                   }
         
         OperationBinding operationBinding2 = bindings.getOperationBinding("Commit");
         Object result2 = operationBinding2.execute();
         if (!operationBinding2.getErrors().isEmpty()) {
             return null;
         }
         
         return null;
      }


  public String insertOpRevenuePopFetch(PopupFetchEvent popupFetchEvent) {
      // Add event code here...
      
      BindingContainer bindings = getBindings();
              OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert4");
              Object result = operationBinding.execute();
              if (!operationBinding.getErrors().isEmpty()) {
                  
              }
              return null;
  }
    
///////////////////////////////////////////////////////////////////////////////////
    
  public void insertOppNotes(DialogEvent dialogEvent) {
      // Add event code here...
      
      System.out.print("Test");
      
      System.out.print("Test");
      System.out.println(dialogEvent.getOutcome() == DialogEvent.Outcome.ok);
      if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok)
         {
             insertOPRevenueCommitAction();
         }
      }
      
      public String insertOPNotesCommitAction() {
         System.out.print("Test");
         BindingContainer bindings = getBindings();
  //                   OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert3");
  //                   Object result = operationBinding.execute();
  //                   if (!operationBinding.getErrors().isEmpty()) {
  //                       return null;
  //                   }
         
         OperationBinding operationBinding2 = bindings.getOperationBinding("Commit");
         Object result2 = operationBinding2.execute();
         if (!operationBinding2.getErrors().isEmpty()) {
             return null;
         }
         
         return null;
      }


  public String insertOpNotesPopFetch(PopupFetchEvent popupFetchEvent) {
      // Add event code here...
      
      BindingContainer bindings = getBindings();
              OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert5");
              Object result = operationBinding.execute();
              if (!operationBinding.getErrors().isEmpty()) {
                  
              }
              return null;
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

    public void setSdi15(RichShowDetailItem sdi15) {
        this.sdi15 = sdi15;
    }

    public RichShowDetailItem getSdi15() {
        return sdi15;
    }

    public void setT14(RichTable t14) {
        this.t14 = t14;
    }

    public RichTable getT14() {
        return t14;
    }

    public void setPh8(RichPanelHeader ph8) {
        this.ph8 = ph8;
    }

    public RichPanelHeader getPh8() {
        return ph8;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
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

    public void setSdi5(RichShowDetailItem sdi5) {
        this.sdi5 = sdi5;
    }

    public RichShowDetailItem getSdi5() {
        return sdi5;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setSdi4(RichShowDetailItem sdi4) {
        this.sdi4 = sdi4;
    }

    public RichShowDetailItem getSdi4() {
        return sdi4;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setPh5(RichPanelHeader ph5) {
        this.ph5 = ph5;
    }

    public RichPanelHeader getPh5() {
        return ph5;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setSdi7(RichShowDetailItem sdi7) {
        this.sdi7 = sdi7;
    }

    public RichShowDetailItem getSdi7() {
        return sdi7;
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

    public void setT5(RichTable t5) {
        this.t5 = t5;
    }

    public RichTable getT5() {
        return t5;
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

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
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

    public void setSi28(UISelectItems si28) {
        this.si28 = si28;
    }

    public UISelectItems getSi28() {
        return si28;
    }

    public void setSoc28(RichSelectOneChoice soc28) {
        this.soc28 = soc28;
    }

    public RichSelectOneChoice getSoc28() {
        return soc28;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setD3(RichDialog d3) {
        this.d3 = d3;
    }

    public RichDialog getD3() {
        return d3;
    }

    public void setP3(RichPopup p3) {
        this.p3 = p3;
    }

    public RichPopup getP3() {
        return p3;
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

    public void setPh9(RichPanelHeader ph9) {
        this.ph9 = ph9;
    }

    public RichPanelHeader getPh9() {
        return ph9;
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

    public void setP2(RichPopup p2) {
        this.p2 = p2;
    }

    public RichPopup getP2() {
        return p2;
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

    public void setPh4(RichPanelHeader ph4) {
        this.ph4 = ph4;
    }

    public RichPanelHeader getPh4() {
        return ph4;
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

    public void setT11(RichTable t11) {
        this.t11 = t11;
    }

    public RichTable getT11() {
        return t11;
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

    public void setSdi12(RichShowDetailItem sdi12) {
        this.sdi12 = sdi12;
    }

    public RichShowDetailItem getSdi12() {
        return sdi12;
    }

    public void setT10(RichTable t10) {
        this.t10 = t10;
    }

    public RichTable getT10() {
        return t10;
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

    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
    }

    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }

    public void setSi15(UISelectItems si15) {
        this.si15 = si15;
    }

    public UISelectItems getSi15() {
        return si15;
    }

    public void setSoc15(RichSelectOneChoice soc15) {
        this.soc15 = soc15;
    }

    public RichSelectOneChoice getSoc15() {
        return soc15;
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

    public void setP1(RichPopup p1) {
        this.p1 = p1;
    }

    public RichPopup getP1() {
        return p1;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
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

    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setPh10(RichPanelHeader ph10) {
        this.ph10 = ph10;
    }

    public RichPanelHeader getPh10() {
        return ph10;
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

    public void setT9(RichTable t9) {
        this.t9 = t9;
    }

    public RichTable getT9() {
        return t9;
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

    public void setPh6(RichPanelHeader ph6) {
        this.ph6 = ph6;
    }

    public RichPanelHeader getPh6() {
        return ph6;
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

    public void setSdi2(RichShowDetailItem sdi2) {
        this.sdi2 = sdi2;
    }

    public RichShowDetailItem getSdi2() {
        return sdi2;
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
    
    public String deleteOpportunitiesNotesLink(){
           String masterTable = "OpportunitiesU2Iterator";
           String detailTable = "NotesU2Iterator";
           String linkTable = "NotesOpportunitiesU1Iterator";
           String masterId = "OpportunityId";
           String detailId = "NotesId";
           
           DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
           DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding(masterTable);
           
           ViewObject masterData = dcItteratorBindings.getViewObject();
           
           Row rowMasterSelected = masterData.getCurrentRow();
           System.out.println(rowMasterSelected.getAttribute(masterId));
           
           DCIteratorBinding dcItteratorBindings2 = bindings.findIteratorBinding(detailTable);
           
           
           ViewObject detailData = dcItteratorBindings2.getViewObject();
           
           Row rowDetailSelected = detailData.getCurrentRow();
           
           System.out.println(rowDetailSelected.getAttribute(detailId));
           

           DCIteratorBinding dcItteratorBindings3 = bindings.findIteratorBinding(linkTable);
           
           ViewObject vo = dcItteratorBindings3.getViewObject();
                   while (vo.getRowSet().hasNext()) {  
                       
                       Row row = vo.next();
                       System.out.println("Inside "+row.getAttribute(detailId)+" "+ row.getAttribute(masterId));
                       if(row.getAttribute(detailId).toString().equals(rowDetailSelected.getAttribute(detailId).toString())&&
                            row.getAttribute(masterId).toString().equals(rowMasterSelected.getAttribute(masterId).toString())){
                               System.out.println("Deleting "+rowDetailSelected.getAttribute(detailId)+
                                               " "+rowMasterSelected.getAttribute(masterId));
                               vo.setCurrentRow(row);
                               vo.removeCurrentRow();
                           }                 
               }
           OperationBinding operation = (OperationBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("Commit");
           operation.execute();
           return "null";
       }

    public String deleteOpportunitiesAppointmentsLink(){
           String masterTable = "OpportunitiesU2Iterator";
           String detailTable = "AppointmentsU2Iterator";
           String linkTable = "AppointmentsOpportunitiesU1Iterator";
           String masterId = "OpportunityId";
           String detailId = "AppointmentId";
           
           DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
           DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding(masterTable);
           
           ViewObject masterData = dcItteratorBindings.getViewObject();
           
           Row rowMasterSelected = masterData.getCurrentRow();
           System.out.println(rowMasterSelected.getAttribute(masterId));
           
           DCIteratorBinding dcItteratorBindings2 = bindings.findIteratorBinding(detailTable);
           
           
           ViewObject detailData = dcItteratorBindings2.getViewObject();
           
           Row rowDetailSelected = detailData.getCurrentRow();
           
           System.out.println(rowDetailSelected.getAttribute(detailId));
           

           DCIteratorBinding dcItteratorBindings3 = bindings.findIteratorBinding(linkTable);
           
           ViewObject vo = dcItteratorBindings3.getViewObject();
                   while (vo.getRowSet().hasNext()) {  
                       
                       Row row = vo.next();
                       System.out.println("Inside "+row.getAttribute(detailId)+" "+ row.getAttribute(masterId));
                       if(row.getAttribute(detailId).toString().equals(rowDetailSelected.getAttribute(detailId).toString())&&
                            row.getAttribute(masterId).toString().equals(rowMasterSelected.getAttribute(masterId).toString())){
                               System.out.println("Deleting "+rowDetailSelected.getAttribute(detailId)+
                                               " "+rowMasterSelected.getAttribute(masterId));
                               vo.setCurrentRow(row);
                               vo.removeCurrentRow();
                           }                 
               }
           OperationBinding operation = (OperationBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("Commit");
           operation.execute();
           return "null";
       }
    
    public String deleteOpportunitiesContactsLink(){
           String masterTable = "OpportunitiesU2Iterator";
           String detailTable = "ContactsU3Iterator";
           String linkTable = "ContactsOpportunitiesU2Iterator";
           String masterId = "OpportunityId";
           String detailId = "ContactId";
           
           DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
           DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding(masterTable);
           
           ViewObject masterData = dcItteratorBindings.getViewObject();
           
           Row rowMasterSelected = masterData.getCurrentRow();
           System.out.println(rowMasterSelected.getAttribute(masterId));
           
           DCIteratorBinding dcItteratorBindings2 = bindings.findIteratorBinding(detailTable);
           
           
           ViewObject detailData = dcItteratorBindings2.getViewObject();
           
           Row rowDetailSelected = detailData.getCurrentRow();
           
           System.out.println(rowDetailSelected.getAttribute(detailId));
           

           DCIteratorBinding dcItteratorBindings3 = bindings.findIteratorBinding(linkTable);
           
           ViewObject vo = dcItteratorBindings3.getViewObject();
                   while (vo.getRowSet().hasNext()) {  
                       
                       Row row = vo.next();
                       System.out.println("Inside "+row.getAttribute(detailId)+" "+ row.getAttribute(masterId));
                       if(row.getAttribute(detailId).toString().equals(rowDetailSelected.getAttribute(detailId).toString())&&
                            row.getAttribute(masterId).toString().equals(rowMasterSelected.getAttribute(masterId).toString())){
                               System.out.println("Deleting "+rowDetailSelected.getAttribute(detailId)+
                                               " "+rowMasterSelected.getAttribute(masterId));
                               vo.setCurrentRow(row);
                               vo.removeCurrentRow();
                           }                 
               }
           OperationBinding operation = (OperationBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("Commit");
           operation.execute();
           return "null";
       }
    
    public String deleteCustomerTasksLink(){
           String masterTable = "CustomersU1Iterator";
           String detailTable = "TasksU1Iterator";
           String linkTable = "TasksCustomersU1Iterator";
           String masterId = "CustomerId";
           String detailId = "TaskId";
           
           DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
           DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding(masterTable);
           
           ViewObject masterData = dcItteratorBindings.getViewObject();
           
           Row rowMasterSelected = masterData.getCurrentRow();
           System.out.println(rowMasterSelected.getAttribute(masterId));
           
           DCIteratorBinding dcItteratorBindings2 = bindings.findIteratorBinding(detailTable);
           
           
           ViewObject detailData = dcItteratorBindings2.getViewObject();
           
           Row rowDetailSelected = detailData.getCurrentRow();
           
           System.out.println(rowDetailSelected.getAttribute(detailId));
           

           DCIteratorBinding dcItteratorBindings3 = bindings.findIteratorBinding(linkTable);
           
           ViewObject vo = dcItteratorBindings3.getViewObject();
                   while (vo.getRowSet().hasNext()) {  
                       
                       Row row = vo.next();
                       System.out.println("Inside "+row.getAttribute(detailId)+" "+ row.getAttribute(masterId));
                       if(row.getAttribute(detailId).toString().equals(rowDetailSelected.getAttribute(detailId).toString())&&
                            row.getAttribute(masterId).toString().equals(rowMasterSelected.getAttribute(masterId).toString())){
                               System.out.println("Deleting "+rowDetailSelected.getAttribute(detailId)+
                                               " "+rowMasterSelected.getAttribute(masterId));
                               vo.setCurrentRow(row);
                               vo.removeCurrentRow();
                           }                 
               }
           OperationBinding operation = (OperationBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("Commit");
           operation.execute();
           return "null";
       }
    
    public String deleteCustomerNotesLink(){
           String masterTable = "CustomersU1Iterator";
           String detailTable = "NotesU1Iterator";
           String linkTable = "TasksCustomers1Iterator";
           String masterId = "CustomerId";
           String detailId = "NotesId";
           
           DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
           DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding(masterTable);
           
           ViewObject masterData = dcItteratorBindings.getViewObject();
           
           Row rowMasterSelected = masterData.getCurrentRow();
           System.out.println(rowMasterSelected.getAttribute(masterId));
           
           DCIteratorBinding dcItteratorBindings2 = bindings.findIteratorBinding(detailTable);
           
           
           ViewObject detailData = dcItteratorBindings2.getViewObject();
           
           Row rowDetailSelected = detailData.getCurrentRow();
           
           System.out.println(rowDetailSelected.getAttribute(detailId));
           

           DCIteratorBinding dcItteratorBindings3 = bindings.findIteratorBinding(linkTable);
           
           ViewObject vo = dcItteratorBindings3.getViewObject();
                   while (vo.getRowSet().hasNext()) {  
                       
                       Row row = vo.next();
                       System.out.println("Inside "+row.getAttribute(detailId)+" "+ row.getAttribute(masterId));
                       if(row.getAttribute(detailId).toString().equals(rowDetailSelected.getAttribute(detailId).toString())&&
                            row.getAttribute(masterId).toString().equals(rowMasterSelected.getAttribute(masterId).toString())){
                               System.out.println("Deleting "+rowDetailSelected.getAttribute(detailId)+
                                               " "+rowMasterSelected.getAttribute(masterId));
                               vo.setCurrentRow(row);
                               vo.removeCurrentRow();
                           }                 
               }
           OperationBinding operation = (OperationBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("Commit");
           operation.execute();
           return "null";
       }
    
    public String deleteCustomerContactsLink(){
           String masterTable = "CustomersU1Iterator";
           String detailTable = "ContactsU2Iterator";
           String linkTable = "CustomersContactsU1Iterator";
           String masterId = "CustomerId";
           String detailId = "ContactId";
           
           DCBindingContainer bindings = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
           DCIteratorBinding dcItteratorBindings = bindings.findIteratorBinding(masterTable);
           
           ViewObject masterData = dcItteratorBindings.getViewObject();
           
           Row rowMasterSelected = masterData.getCurrentRow();
           System.out.println(rowMasterSelected.getAttribute(masterId));
           
           DCIteratorBinding dcItteratorBindings2 = bindings.findIteratorBinding(detailTable);
           
           
           ViewObject detailData = dcItteratorBindings2.getViewObject();
           
           Row rowDetailSelected = detailData.getCurrentRow();
           
           System.out.println(rowDetailSelected.getAttribute(detailId));
           

           DCIteratorBinding dcItteratorBindings3 = bindings.findIteratorBinding(linkTable);
           
           ViewObject vo = dcItteratorBindings3.getViewObject();
                   while (vo.getRowSet().hasNext()) {  
                       
                       Row row = vo.next();
                       System.out.println("Inside "+row.getAttribute(detailId)+" "+ row.getAttribute(masterId));
                       if(row.getAttribute(detailId).toString().equals(rowDetailSelected.getAttribute(detailId).toString())&&
                            row.getAttribute(masterId).toString().equals(rowMasterSelected.getAttribute(masterId).toString())){
                               System.out.println("Deleting "+rowDetailSelected.getAttribute(detailId)+
                                               " "+rowMasterSelected.getAttribute(masterId));
                               vo.setCurrentRow(row);
                               vo.removeCurrentRow();
                           }                 
               }
           OperationBinding operation = (OperationBinding)BindingContext.getCurrent().getCurrentBindingsEntry().get("Commit");
           operation.execute();
           return "null";
       }


    public void setT17(RichTable t17) {
        this.t17 = t17;
    }

    public RichTable getT17() {
        return t17;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setT18(RichTable t18) {
        this.t18 = t18;
    }

    public RichTable getT18() {
        return t18;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setT19(RichTable t19) {
        this.t19 = t19;
    }

    public RichTable getT19() {
        return t19;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }

    public void setB14(RichButton b14) {
        this.b14 = b14;
    }

    public RichButton getB14() {
        return b14;
    }


    public void setB15(RichButton b15) {
        this.b15 = b15;
    }

    public RichButton getB15() {
        return b15;
    }

    public void setB16(RichButton b16) {
        this.b16 = b16;
    }

    public RichButton getB16() {
        return b16;
    }

    public void setB17(RichButton b17) {
        this.b17 = b17;
    }

    public RichButton getB17() {
        return b17;
    }

    public void setB18(RichButton b18) {
        this.b18 = b18;
    }

    public RichButton getB18() {
        return b18;
    }

    public void setT20(RichTable t20) {
        this.t20 = t20;
    }

    public RichTable getT20() {
        return t20;
    }

    public void setB19(RichButton b19) {
        this.b19 = b19;
    }

    public RichButton getB19() {
        return b19;
    }

    public void setT21(RichTable t21) {
        this.t21 = t21;
    }

    public RichTable getT21() {
        return t21;
    }

    public void setB20(RichButton b20) {
        this.b20 = b20;
    }

    public RichButton getB20() {
        return b20;
    }

    public void setT22(RichTable t22) {
        this.t22 = t22;
    }

    public RichTable getT22() {
        return t22;
    }

    public void setB21(RichButton b21) {
        this.b21 = b21;
    }

    public RichButton getB21() {
        return b21;
    }

    public void setB22(RichButton b22) {
        this.b22 = b22;
    }

    public RichButton getB22() {
        return b22;
    }

    public void setB23(RichButton b23) {
        this.b23 = b23;
    }

    public RichButton getB23() {
        return b23;
    }

    public void setB24(RichButton b24) {
        this.b24 = b24;
    }

    public RichButton getB24() {
        return b24;
    }

    public void setB25(RichButton b25) {
        this.b25 = b25;
    }

    public RichButton getB25() {
        return b25;
    }
}
