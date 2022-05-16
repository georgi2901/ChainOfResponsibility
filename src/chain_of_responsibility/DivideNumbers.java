package chain_of_responsibility;

public class DivideNumbers implements Chain {
	private Chain nextInChain;

	@Override
	public void setNextFunction(Chain nextFunction) {
		this.nextInChain = nextFunction;
		
	}

	@Override
	public void calculate(Numbers request) {
		if(request.getCalcWanted() == "/") {
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1()/request.getNumber2()));
		}else {
			System.out.println("The function is not supported!");
		}
		
	}
}
