
public class Multiply extends MathOperation{

	public Multiply(int leftOperand, int rightOperand)
	{
		
		super(leftOperand, rightOperand);
	}
	
	public int GetResult()
	{
		return this.leftOperand * this.rightOperand;
	}
}
