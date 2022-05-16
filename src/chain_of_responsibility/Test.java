package chain_of_responsibility;

public class Test {
	
	public static void main(String[] args) {
		
		Chain chainCalc = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		chainCalc.setNextFunction(chainCalc2);
		chainCalc2.setNextFunction(chainCalc3);
		chainCalc3.setNextFunction(chainCalc4);
		
		Numbers request = new Numbers(10, 5, "+");
		
		chainCalc.calculate(request);
		
	}
	
}
