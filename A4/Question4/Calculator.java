public class Calculator
{
	public static int Divide(int left, int right)
	{

		MathOperation op = new Divide(left, right);
		return op.GetResult();
	}

	public static int Multiply(int left, int right)
	{
		MathOperation op = new Multiply(left, right);
		return op.GetResult();
	}

	public static int Add(int left, int right)
	{
		MathOperation op = new Add(left, right);
		return op.GetResult();
	}

	public static int Subtract(int left, int right)
	{
		MathOperation op = new Subtract(left, right);
		return op.GetResult();
	}
}
