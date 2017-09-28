package Assignment3New.Assignment3New;


public class CalImplementation {

	

	CalInterface obj;
	public int addTwoNums(int a, int b) {
		return obj.add(a, b);
	}
	
	public void setObj(CalInterface obj) {
		this.obj = obj;
	}

	public int subTwoNums(int a, int b) {
		return obj.sub(a, b);
	}
	
	public int mulTwoNums(int a, int b) {
		return obj.mul(a, b);
	}
	
	public double divTwoNums(int a, int b) {
		return obj.div(a, b);
	}

	
}
