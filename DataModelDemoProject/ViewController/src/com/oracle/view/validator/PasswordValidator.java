package com.oracle.view.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class PasswordValidator implements Validator {
    public PasswordValidator() {
        super();
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uIComponent, Object object) throws ValidatorException{
        // TODO Implement this method
        String password = (String) object;
        if((password == null)||password.length()==0){
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                        "Password is compulsory.",null));
        }
        
        int min =8;
        int max=16;
        int digit=0;
        int special=0;
        int upCount=0;
        int loCount=0;
        if(password.length()>=min&&password.length()<=max){
                for(int i =0;i<password.length();i++){
                    char c = password.charAt(i);
                    if(Character.isUpperCase(c)){
                        upCount++;
                    }
                    if(Character.isLowerCase(c)){
                        loCount++;
                    }
                    if(Character.isDigit(c)){
                        digit++;
                    }
                    if(c>=33&&c<=46||c==64){
                        special++;
                    }
                }
                if(special>=1&&loCount>=1&&upCount>=1&&digit>=1){
                    System.out.println("Valid password: "+password);
                }
                else{
                    System.out.println("InValid password: "+password);
                    throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                                "It should contain atleast one special, upper case and lower case characters.",null));
                }
        }else{
            System.out.println("InValid password length: "+password);
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                        "The password must have 8 or more characters (but less than 16).",null));
        }
    }
}
