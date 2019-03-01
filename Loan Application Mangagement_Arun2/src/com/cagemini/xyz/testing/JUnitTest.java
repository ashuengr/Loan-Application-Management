package com.cagemini.xyz.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.xyz.beans.Customer;
import com.capgemini.xyz.dao.LoneDao;
import com.capgemini.xyz.exceptions.InValidAddressException;
import com.capgemini.xyz.service.ILoneService;
import com.capgemini.xyz.service.LoneService;




public class JUnitTest {

		private static ILoneService prodServiceTest;
		//before class annotation is used for setting the variables which is used in whole class
		@BeforeClass
		public static void setUpTestEnv() {
			 prodServiceTest=new LoneService();
		}
		// it is used to define those things which can be used in each of methods
		@Before
		public void setUpTestData() {
		//	Customer cust= new Customer(custName, address, mobile, email)
		Customer cust= new Customer(1, "ar", "b",65, "a@g");
		Customer cust1= new Customer(2, "ar", "b",62, "a@g");
			LoneDao.customerEntry.put(1, cust);
			LoneDao.customerEntry.put(2, cust1);
		
			
		}
		//Test annotation is used for testing methods
		@Test
		public void testGetDetailsForInvalidaddress(){
			Customer cust= new Customer(3, "ar", "b",65, "a@g");
			prodServiceTest.insertCust(cust);
			
			Customer actual =prodServiceTest.insertCust(cust);
			Assert.assertEquals("b",actual.getAddress());
		
		}
		
		
		@After
		//after is used for clear those value which is not required after performing all the methods
		public void tearDownData() {
			LoneDao.customerEntry.clear();
			
		}
		@AfterClass
		public static void tearDownEnv() {
			prodServiceTest=null;
		}
		
	}

