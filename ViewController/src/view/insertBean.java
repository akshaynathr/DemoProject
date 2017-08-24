package view;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class insertBean {
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


    public void insertOpContactPopFetch(PopupFetchEvent popupFetchEvent) {
        // Add event code here...
        
        BindingContainer bindings = getBindings();
                OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert3");
                Object result = operationBinding.execute();
                if (!operationBinding.getErrors().isEmpty()) {
                    
                }
    }
}
