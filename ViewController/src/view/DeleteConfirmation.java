 package view;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class DeleteConfirmation {
    public DeleteConfirmation() {
        super();
    }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
        
    public void dialogDeleteListenerProductCategory(DialogEvent dialogEvent){
        if (dialogEvent.getOutcome()==DialogEvent.Outcome.ok){
            deleteProductCategory();
        }
    }
    
    public String deleteProductCategory() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        OperationBinding operationBinding2 = bindings.getOperationBinding("Commit");
        Object result2 = operationBinding2.execute();
        if (!operationBinding2.getErrors().isEmpty()) {
            return null;
        }
        
        return null;
    }    
    
}
