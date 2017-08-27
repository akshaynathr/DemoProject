package view;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class TestClass implements Serializable {
    private String taskFlowId = "/WEB-INF/CreateOpp.xml#CreateOpp";

    public TestClass() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
}
