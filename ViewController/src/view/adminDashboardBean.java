package view;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class adminDashboardBean implements Serializable {
    private String taskFlowId = "/WEB-INF/salesmanager.xml#test-flow";

    public adminDashboardBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
}
