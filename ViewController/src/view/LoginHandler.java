package view;

import java.io.IOException;

import java.security.Permission;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.adf.share.ADFContext;


import oracle.adf.share.security.authorization.RegionPermission;

import weblogic.security.URLCallbackHandler;
import weblogic.security.services.Authentication;

import weblogic.servlet.security.ServletAuthentication;

public class LoginHandler {
    private String _username;
    private String _password;


    public String[] getUserRoles(){
         return ADFContext.getCurrent().getSecurityContext().getUserRoles();
     }

     public boolean isUserInRole(String Rolename){
         return ADFContext.getCurrent().getSecurityContext().isUserInRole(Rolename);
     }


    public void setUsername(String _username) {
        this._username = _username;
    }

    public String getUsername() {
        return _username;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public String getPassword() {
        return _password;
    }
    
    public String doLogin(ActionEvent event) {
    FacesContext ctx = FacesContext.getCurrentInstance();
    HttpServletRequest request = (HttpServletRequest)ctx.getExternalContext().getRequest();
    CallbackHandler handler = new URLCallbackHandler(_username, _password);
    try{
    Subject mySubject = Authentication.login(handler);
    ServletAuthentication.runAs(mySubject, request);
    ServletAuthentication.generateNewSessionID(request);
    String loginUrl = "ADFSecurityLoginLogoutApp-ViewController-context-root/adfAuthentication?success_url=/faces" + 
    ctx.getViewRoot().getViewId();
        System.out.println();
    HttpServletResponse response = 
               (HttpServletResponse)ctx.getExternalContext().getResponse();
        if (isUserInRole("Manager")){ System.out.println("Manager");return "manager";}
        else if (isUserInRole("admin")){System.out.println("admin"); return "admin";}
        else {System.out.println("No  role");}
        sendForward(request, response, loginUrl);
    }catch(FailedLoginException e){
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                "Incorrect Username or Password",
                                                "An incorrect Username or Password" +
                                                " was specified");
             ctx.addMessage(null, msg);
    }catch(LoginException e){
        reportUnexpectedLoginError("LoginException", e);
    }
    return "admin";
    }
    
    private void sendForward(HttpServletRequest request, 
                              HttpServletResponse response,
                              String forwardUrl){
       FacesContext ctx = FacesContext.getCurrentInstance();
       try{
         
       response.sendRedirect("Home.jsf");
       }
       catch(Exception e){reportUnexpectedLoginError("Exception", e);}
                                
 //       RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
//       try {
//         dispatcher.forward(request, response);
//       } catch (ServletException se) {
//         reportUnexpectedLoginError("ServletException", se);
//       } catch (IOException ie) {
//         reportUnexpectedLoginError("IOException", ie);
//       }
       ctx.responseComplete();
     }
    
    private void reportUnexpectedLoginError(String errType, Exception e){
      FacesMessage msg =
        new FacesMessage(FacesMessage.SEVERITY_ERROR, "Unexpected error                                                        during login",
                         "Unexpected error during login (" + errType + 
                         "), please consult logs for detail");
      FacesContext.getCurrentInstance().addMessage(null, msg);
      e.printStackTrace();
    }
    
    public boolean isAuthenticated() {
    boolean _authenticated = ADFContext.getCurrent().getSecurityContext().isAuthenticated();
        return _authenticated;
    }
    
    private boolean TestPermission (String PageName, String Action)  {
      Permission p = new RegionPermission("view.pageDefs." + PageName + "PageDef", 

                                             Action);
      if (p != null) {
         return ADFContext.getCurrent().getSecurityContext().hasPermission(p);   
     }
     else {
         return (true);
     }
    }
    
    public String getSecureNavigationAction() {
          String ActionName;
          if (TestPermission("Admin_dashboard", "view"))
            ActionName = "admin";
          else if (TestPermission("Manager_dashboard", "view"))
            ActionName = "manager";
          else
            ActionName = "error";
          return (ActionName);
        }

    public String doLogin() {
        // Add event code here...
        return null;
    }
}
