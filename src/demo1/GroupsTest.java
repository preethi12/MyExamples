package demo1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//priority and groups concept

public class GroupsTest 
{
	@BeforeClass(groups={"Sanity","Regression","Database","Smoke"})
	public void Setup()
	{
		System.out.println("(groups={Sanity,Regression,Database,Smoke})");
	}
@Test(priority=3,groups={"Sanity","Regression"})
public void test1()
{
	System.out.println("(groups={Sanity,Regression})");
}

@Test(priority=0,groups={"Sanity","Database"})
public void test2()
{
	System.out.println("(groups={Sanity,Database})");
}
@Test(priority=1,groups={"Sanity"})
public void test3()
{
	System.out.println("(groups={Sanity})");
}

@Test(priority=2,groups={"Smoke"})
public void test4()
{
	System.out.println("(groups={Smoke})");
}

}
