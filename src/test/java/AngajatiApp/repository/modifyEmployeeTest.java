package AngajatiApp.repository;

import AngajatiApp.controller.DidacticFunction;
import AngajatiApp.model.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static AngajatiApp.controller.DidacticFunction.*;
import static AngajatiApp.controller.DidacticFunction.TEACHER;
import static org.junit.jupiter.api.Assertions.*;

class modifyEmployeeTest {
    private EmployeeMock employeeMock;
    @BeforeEach
    void setUp() {
        employeeMock = new EmployeeMock();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void modifyEmployeeFunction_ValidID() {
        Employee George = employeeMock.getEmployeeList().get(0);
        DidacticFunction newFunction = TEACHER;

        employeeMock.modifyEmployeeFunction(George, newFunction);


        assertEquals(TEACHER,George.getFunction());

         /*
         Employee Ionel = new Employee("George", "Pacuraru", "1234567890876", DidacticFunction.ASSISTENT, 2500d);
         Employee Mihai = new Employee("Ionut", "Dumitrescu", "1234567890876", DidacticFunction.LECTURER, 2500d);
        */


    }

    @Test
    void modifyEmployeeFunction_EmployeeNull()
    {
        Employee employee = null;
        employeeMock.modifyEmployeeFunction(employee, TEACHER);

        assertEquals(ASSISTENT, employeeMock.getEmployeeList().get(0).getFunction());
//        assertEquals(LECTURER, employeeMock.getEmployeeList().get(1).getFunction());


    }

}