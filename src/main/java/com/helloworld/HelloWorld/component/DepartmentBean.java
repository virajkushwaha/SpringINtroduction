package com.helloworld.HelloWorld.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    private String departmentName = "Software Development";

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
