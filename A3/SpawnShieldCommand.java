import java.util.ArrayList;

public class SpawnShieldCommand extends Command
{
	public SpawnShieldCommand(Object receiver, String[] args)
	{
		super(receiver, args);
	}

	@Override
	public void Execute()
	{
		BoardComponent square = (Square) receiver;
		GameBoard.Instance().getAsteroidSubject().Detatch(square);
		square = new Shield(square);
		GameBoard.Instance().getAsteroidSubject().Attach(square);
		System.out.println("Spawning shield at (" + args[0] + "," + args[1] + ")");

	}
	
	
}
