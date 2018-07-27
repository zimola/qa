
public class Subtract extends MathOperation{

	public Subtract(int leftOperand, int rightOperand)
	{
		super(leftOperand, rightOperand);
	}
	
	public int GetResult()
	{
		return this.leftOperand - this.rightOperand;
	}
}


