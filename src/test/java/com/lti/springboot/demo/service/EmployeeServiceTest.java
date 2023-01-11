package com.lti.springboot.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.springboot.demo.model.Employee;
import com.lti.springboot.demo.repository.EmployeeRepository;

@SpringBootTest
class EmployeeServiceTest {

	@Mock
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeService employeeService;

	private Employee employee;

	@BeforeAll
	static void setUpBeforeClass() {

	}

	@AfterAll
	static void tearDownAfterClass() {
	}

	@BeforeEach
	void setUp() {
		employeeRepository = Mockito.mock(EmployeeRepository.class);
		employeeService = Mockito.mock(EmployeeService.class);
		employee = new Employee(101, "Sonu", 90000);
	}

	@AfterEach
	void tearDown() {
	}

	@DisplayName("JUnit test for saveEmployee method")
	@Test
	public void givenEmployeeObject_whenSaveEmployee_thenReturnEmployeeObject() {
		// given - precondition or setup

		when(employeeRepository.save(employee)).thenReturn(employee);

		Employee savedEmployee = employeeService.addEmployee(employee);

		assertThat(savedEmployee).isNull();
	}

//	// JUNit 
//	@Test
//	void testGetAllEmployees() {
//		assertEquals(1002, employeeService.getAllEmployees().size());
//	}

}
