package com.helloworld.HelloWorld.component;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private String employeeName = "John Doe";

    @Autowired  // Dependency Injection
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee: " + employeeName + ", Department: " + department.getDepartmentName();
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(DepartmentBean department) {
        this.department = department;
    }
}

