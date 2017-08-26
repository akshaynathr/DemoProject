package view.backing;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.fragment.RichPageTemplate;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.event.ReturnEvent;

public class Admin {
    private RichPageTemplate pt1;
    private RichForm f1;
    private RichDocument d1;
    private RichTable roles_table;

    public void setPt1(RichPageTemplate pt1) {
        this.pt1 = pt1;
    }

    public RichPageTemplate getPt1() {
        return pt1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void onReturnEditRoleDialog(ReturnEvent returnEvent) {
        // Add event code here...
        System.out.println("refreshing table");
        AdfFacesContext.getCurrentInstance().addPartialTarget(roles_table);
    }

    public void setRoles_table(RichTable roles_table) {
        this.roles_table = roles_table;
    }

    public RichTable getRoles_table() {
        return roles_table;
    }
}
