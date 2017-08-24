package view;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
//oracle.apps.fnd.applcore.flex.common.ADFUtils

import oracle.jbo.ViewObject;

public class popupBean {
    private RichPopup addOpportunityConfirm;
    private RichPopup saveAndCommit;

    public popupBean() {
    }

    public void addOportunityListener(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
        DCIteratorBinding iter = (DCIteratorBinding)bindings2.findIteratorBinding("ContactsU1Iterator");
//    
//    
        ViewObject vo=iter.getViewObject();
//        
      Row row=vo.createRow();
        vo.insertRow(row);
        
        
    }

    public void setAddOpportunityConfirm(RichPopup addOpportunityConfirm) {
        this.addOpportunityConfirm = addOpportunityConfirm;
    }
    
    
    
    public void ConfirmOpportunity(DialogEvent dialogEvent) {
        
        DCBindingContainer bindings2 = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry(); 
        
        DCIteratorBinding dcIterContacts = (DCIteratorBinding) bindings2.findIteratorBinding("ContactsU1Iterator");
        Row customer =dcIterContacts.getCurrentRow();
        
        DCIteratorBinding dcIterOpportunity = (DCIteratorBinding)bindings2.findIteratorBinding("OpportunitiesU13Iterator");
        Row opportunity =dcIterOpportunity.getCurrentRow();
        
        OperationBinding ob=bindings2.getOperationBinding("populate_Intersection");
            //ADFUtils.findOperation("populate_Intersection");
        
        ob.getParamsMap().put("rId",customer.getAttribute("Id"));
        ob.getParamsMap().put("bId",opportunity.getAttribute("Id"));
        ob.execute();
    }

    public RichPopup getAddOpportunityConfirm() {
        return addOpportunityConfirm;
    }

    public void setSaveAndCommit(RichPopup saveAndCommit) {
        this.saveAndCommit = saveAndCommit;
    }

    public RichPopup getSaveAndCommit() {
        return saveAndCommit;
    }
/////////////////////////////////////////////////////////////Opportunities Contacts/////////////////////
    public void dialogDeleteListener(DialogEvent dialogEvent)
       {
         if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok)
         {
           deleteCommitAction();
         }
       }
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }


       public String deleteCommitAction() {
           
           BindingContainer bindings = getBindings();
//           OperationBinding operationBinding = bindings.getOperationBinding("Delete");
//           Object result = operationBinding.execute();
//           if (!operationBinding.getErrors().isEmpty()) {
//               return null;
//           }
           
           OperationBinding operationBinding2 = bindings.getOperationBinding("Commit");
           Object result2 = operationBinding2.execute();
           if (!operationBinding2.getErrors().isEmpty()) {
               return null;
           }
           
           return null;
       }

}
