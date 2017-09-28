package Assignment3New.Assignment3New;

import java.util.concurrent.CancellationException;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalImplementationTest extends TestCase {
	CalImplementation Obj;
	int a, b;
	double c,d;
	

	protected void setUp() throws Exception {
		
		Obj=new CalImplementation();
		a=9;
		b=5;
		c=(double)a;
		d=(double)b;
		CalInterface mockobj=mock(CalInterface.class);
		when(mockobj.add(a, b)).thenReturn(a+b);
		when(mockobj.sub(a, b)).thenReturn(a-b);
		when(mockobj.mul(a, b)).thenReturn(a*b);
		when(mockobj.div(a, b)).thenReturn(c/d);
		Obj.setObj(mockobj);
	}

	protected void tearDown() throws Exception {
		Obj=null;
		a=0;
		b=0;
		c=0;
		d=0;
	}

	public void testAddTwoNums() {
	assertEquals(14, Obj.addTwoNums(9, 5));
	}

	public void testSubTwoNums() {
		assertEquals(4, Obj.subTwoNums(9, 5));
	}

	public void testMulTwoNums() {
		assertEquals(45, Obj.mulTwoNums(9, 5));
	}

	public void testDivTwoNums() {
		assertEquals(1.8, Obj.divTwoNums(9, 5));
	}

}
