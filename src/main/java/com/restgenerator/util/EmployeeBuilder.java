package com.restgenerator.util;

import com.restgenerator.dto.EmployeeDTO;
import com.restgenerator.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeBuilder {

    public  static List<EmployeeDTO> getListDTO(){
        return Arrays.asList(new EmployeeDTO(1,"Suman","DEV",34000),new EmployeeDTO(2,"Santosh","QA",80000));
    }

    public static List<Employee>getListEntities(){
        return Arrays.asList(new Employee(1,"Suman","DEV",5000),new Employee(2,"Santosh","DEV",8999));

    }

    public static EmployeeDTO getDTO(){
        return new EmployeeDTO(1,"Suman","DEV",34534);
    }

    public static Employee getEntity(){
        return new Employee(1,"suman","DEV",34343);
    }
}
