package view;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class InsertOpportunityMaster {
    public InsertOpportunityMaster() {
        super();
    }
    
           public void insertPopupFetchListener(PopupFetchEvent popupFetchEvent){
    {
               BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
               OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert2");
               operationBinding.execute();
               
               
           }
       }
}
