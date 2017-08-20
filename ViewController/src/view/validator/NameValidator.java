package view.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class NameValidator implements Validator {
    public NameValidator() {
        super();
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uIComponent, Object object) throws ValidatorException {
        String name = (String) object;
        if(name.length()<1){
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                        "Invalid length",name.length()+" length not accepted"));
        }

    }
}
