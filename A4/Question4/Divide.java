
public class Divide extends MathOperation {

	public Divide(int leftOperand, int rightOperand)
	{
		super(leftOperand, rightOperand);
	}
	
	public int GetResult()
	{
		return this.leftOperand / this.rightOperand;
	}
	
}
