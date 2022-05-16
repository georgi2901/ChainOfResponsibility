 package chain_of_responsibility;

public interface Chain {
	
	public void setNextFunction(Chain nextFunction);
	
	public void calculate(Numbers request);
	
}
