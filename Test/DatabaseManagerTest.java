package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.mockito.Mockito.when;

import java.util.ArrayList;

import Model.DatabaseManager;

class DatabaseManagerTest {
	
	DatabaseManager db;
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<Object[]> emp = new ArrayList<Object[]>();
	Object t[] = {"1","Tasnim","Ahsan","tasnim.ahsan@gmail.com","Human Resource","25000"};
	@BeforeEach
	void setUp() throws Exception {
		db = Mockito.mock(DatabaseManager.class);
		list.add("Human Resource");
		list.add("Marketing");
		emp.add(t);

	}

	@Test
	void testVerifyLoginId() {
		when(db.verifyLoginId("admin")).thenReturn(true);
		assertEquals(true,db.verifyLoginId("admin"));
	}
	
	
	@Test
	void testVerifyLoginId2() {
		when(db.verifyLoginId("admin","password")).thenReturn(true);
		assertEquals(true,db.verifyLoginId("admin","password"));	
	}
	

	@Test
	void testExistsDepartment() {
		when(db.existsDepartment("Human Resource")).thenReturn(true);
		assertEquals(true,db.existsDepartment("Human Resource"));
	}
	
	
	@Test
	void testGetListOfDepartments() {
		list.add("Human Resource");
		list.add("Marketing");
		when(db.getListOfDepartments()).thenReturn(list);
		assertEquals(list,db.getListOfDepartments());
	}
	
	
	@Test
	void testGetSalary() {
		when(db.getSalary("Human Resource")).thenReturn(25000);
		assertEquals(25000,db.getSalary("Human Resource"));	
	}
	
	
	@Test
	void testExistsEmployeeID() {
		when(db.existsEmployeeID(2)).thenReturn(true);
		assertEquals(true,db.existsEmployeeID(2));	
	}
	
	
	@Test
	void testGetEmployees() {
		Object a[][] = emp.toArray(new Object[emp.size()][]);
		when(db.getEmployees()).thenReturn(a);
		assertEquals(a,db.getEmployees());
	}
	
}
