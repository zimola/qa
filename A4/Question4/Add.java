
public class Add extends MathOperation{

	public Add(int leftOperand, int rightOperand)
	{
		super(leftOperand, rightOperand);
	}
	
	public int GetResult()
	{
		return this.leftOperand + this.rightOperand;
	}

}
