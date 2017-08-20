package view;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class SafeDeleteBean {
    public SafeDeleteBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
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
        System.out.println("Runnin delete");
        return null;
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
