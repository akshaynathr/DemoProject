package view;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;
import oracle.adf.view.rich.context.AdfFacesContext;

public class salesManagerBean {
    private String taskFlowId = "/WEB-INF/salesmanager.xml#test-flow";
    private String taskFlowId1 = "/WEB-INF/salesmanager.xml#test-flow";
    private String taskFlowId2 = "/WEB-INF/salesmanager.xml#test-flow";
   
    private String taskFlowId3 = "/WEB-INF/salesmanager.xml#test-flow";
    private String taskFlowId4_admin="/WEB-INF/admin-flow.xml#admin-flow";
    private Boolean activateRegion = Boolean.FALSE;
    private RichRegion pocDynamicRegion;
    private String taskFlowId4 = "/WEB-INF/salesmanager.xml#test-flow";

    /////////////////////////////////////////////
    
    public void setActivateRegion(Boolean activateRegion) {
        this.activateRegion = activateRegion;
    }

    public Boolean getActivateRegion() {
        return activateRegion;
    }

    public void loadTF1AL(ActionEvent actionEvent) {
        // Add event code here...
        activateRegion = Boolean.TRUE;
        taskFlowId4 = "/WEB-INF/admin-flow.xml#admin-flow";
        AdfFacesContext.getCurrentInstance().addPartialTarget(pocDynamicRegion);
    }
    
    
    public void setPocDynamicRegion(RichRegion pocDynamicRegion) {
        this.pocDynamicRegion = pocDynamicRegion;
    }

    public RichRegion getPocDynamicRegion() {
        return pocDynamicRegion;
    }
    
    public String getSelectTaskFlow(){ 
        if(isUserInRole("manager")){return taskFlowId4;}
        else
        return taskFlowId4_admin;
        }
    
    public String[] getUserRoles(){
         return ADFContext.getCurrent().getSecurityContext().getUserRoles();
     }

     public boolean isUserInRole(String Rolename){
         return ADFContext.getCurrent().getSecurityContext().isUserInRole(Rolename);
     }
    
    /////////////////////////////////////////
    
    public salesManagerBean() {
    }

    public void setTaskFlowId4_admin(String taskFlowId4_admin) {
        this.taskFlowId4_admin = taskFlowId4_admin;
    }

    public String getTaskFlowId4_admin() {
        return taskFlowId4_admin;
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public TaskFlowId getDynamicTaskFlowId1() {
        return TaskFlowId.parse(taskFlowId1);
    }

    public void setDynamicTaskFlowId1(String taskFlowId) {
        this.taskFlowId1 = taskFlowId;
    }

    public String testflow() {
        setDynamicTaskFlowId1("/WEB-INF/salesmanager.xml#test-flow");
        return null;
    }
    
    public String admin_flow() {        setDynamicTaskFlowId1("/WEB-INF/admin-flow.xml#admin-flow");
        return null;
        
                            }

    public TaskFlowId getDynamicTaskFlowId2() {
        return TaskFlowId.parse(taskFlowId2);
    }

    public void setDynamicTaskFlowId2(String taskFlowId) {
        this.taskFlowId2 = taskFlowId;
    }

    public String adminflow() {
        setDynamicTaskFlowId2("/WEB-INF/admin-flow.xml#admin-flow");
        return null;
    }

    public TaskFlowId getDynamicTaskFlowId3() {
        return TaskFlowId.parse(taskFlowId3);
    }

    public void setDynamicTaskFlowId3(String taskFlowId) {
        this.taskFlowId3 = taskFlowId;
    }

    public TaskFlowId getDynamicTaskFlowId4() {
        return TaskFlowId.parse(taskFlowId4);
    }

    public void setDynamicTaskFlowId4(String taskFlowId) {
        this.taskFlowId4 = taskFlowId;
    }
}
