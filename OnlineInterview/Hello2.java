package pan;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hello2 {

//	public static void main(String[] args) {
		@Test(priority=1)
		public void test1() {
			System.out.println("test1A");
			Assert.fail();
		}
		
		@Test (dependsOnMethods= {"test1"})//default priority 1
		public void test2() {
			System.out.println("test2A");
		}
		
		@Test
		public void test7() {
			System.out.println("test7A");
//			Assert.fail();
		}

		@BeforeMethod
		public void before() {
			System.out.println("beforeA");
		}
		
		
		@AfterMethod
		public void after() {
			System.out.println("afterA");
//			Assert.fail();

		}
		
		
		@Test (invocationCount=3, dependsOnMethods={"test1"})
		public void test3() {
			System.out.println("test3A");
//			Assert.fail();
		}

	
}
