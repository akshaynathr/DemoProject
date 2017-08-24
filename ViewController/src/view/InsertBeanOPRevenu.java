package view;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class InsertBeanOPRevenu {
    public InsertBeanOPRevenu() {
    }
    
    public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }
    public String insertOPRevenueItemCommitAction() {
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


    public void insertOpRevenueItemPopFetch(PopupFetchEvent popupFetchEvent) {
    // Add event code here...
    
    BindingContainer bindings = getBindings();
            OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert4");
            Object result = operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                
            }
    }
    
/////////////////////////////////////////////////////

    public String insertOpNotesPopFetch(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        
        BindingContainer bindings = getBindings();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert5");
                Object result = operationBinding.execute();
                if (!operationBinding.getErrors().isEmpty()) {
                    
                }
                return null;
    }



}
