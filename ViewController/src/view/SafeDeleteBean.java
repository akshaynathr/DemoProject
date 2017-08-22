package view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class SafeDeleteBean {
    public SafeDeleteBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void dialogDeleteListenerUser(DialogEvent dialogEvent){
        if (dialogEvent.getOutcome()==DialogEvent.Outcome.ok){
            commit_Delete();
        }
    }
    public String commit_Delete() {
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
    
    public void dialogDeleteListenerProduct(DialogEvent dialogEvent){
        if (dialogEvent.getOutcome()==DialogEvent.Outcome.ok){
            commit_Delete_Product();
        }
    }
    public String commit_Delete_Product() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        OperationBinding operationBinding2 = bindings.getOperationBinding("Commit");
        Object result2 = operationBinding2.execute();
        if (!operationBinding2.getErrors().isEmpty()) {
            return null;
        }
        System.out.println("Runnin delete");
        return null;
    }

    public void dialogDeleteListenerRole(DialogEvent dialogEvent){
        if (dialogEvent.getOutcome()==DialogEvent.Outcome.ok){
            deleteRole();
        }
    }
    
    public String deleteRole() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete2");
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
