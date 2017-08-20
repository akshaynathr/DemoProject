package view.validator;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class StartDateValidator implements Validator {
    public StartDateValidator() {
        super();
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uIComponent, Object object) throws ValidatorException {
        Date startDate = (Date) object;
        if(startDate == null){
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                                          "Start Date Invalid","Start Date cannot be null"));
        }

    }
}
