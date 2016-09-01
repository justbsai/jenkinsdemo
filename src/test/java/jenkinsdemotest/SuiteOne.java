package jenkinsdemotest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jenkinsdemo.Add;
import jenkinsdemo.Mul;
import jenkinsdemo.Operations;
import jenkinsdemo.Sub;

public class SuiteOne {
	Operations add,sub,mul;
	
	@BeforeClass
	public void set_up(){
		add=new Add();sub=new Sub();mul=new Mul();
	}
	
	@Test
	public void addTest(){
		Assert.assertEquals(2,add.operation(1, 1));
	}
	
	@Test
	public void mulTest(){
		Assert.assertEquals(1,mul.operation(-1, -1));
	}
	
	@Test
	public void subTest(){
		Assert.assertEquals(0,sub.operation(1, 1));
	}
}
