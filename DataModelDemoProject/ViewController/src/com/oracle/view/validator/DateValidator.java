package com.oracle.view.validator;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import oracle.adf.view.rich.component.rich.input.RichInputDate;

public class DateValidator implements Validator {
    public DateValidator() {
        super();
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uIComponent, Object object) throws ValidatorException {
        // TODO Implement this method
        String startDateComponentId = (String)uIComponent.getAttributes().get("StartDateComponentId");  
        RichInputDate startDateComponent = (RichInputDate)uIComponent.findComponent(startDateComponentId);
        Date startDate = (Date)startDateComponent.getValue();
        Date endDate = (Date)object;
        
        if(endDate==null){
            return;
        }
        
        String startDateLabel = startDateComponent.getLabel();
        String endDateLabel = ((RichInputDate)uIComponent).getLabel();
        
        if(startDate==null||(endDate.compareTo(startDate)<0)){
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                                          "Start date cannot be greater than end date",null));
        }
    }
}
