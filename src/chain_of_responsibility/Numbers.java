package chain_of_responsibility;

public class Numbers {
	
	private int num1;
	private int num2;
	
	private String calculationWanted;
	
	public Numbers(int newNum1, int newNum2, String calcWanted) {
		
		num1 = newNum1;
		num2 = newNum2;
		calculationWanted = calcWanted;
		
	}

	public int getNumber1() {return num1;}
	public int getNumber2() {return num2;}
	public String getCalcWanted() {return calculationWanted;}
	
}
