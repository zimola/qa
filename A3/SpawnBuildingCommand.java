public class SpawnBuildingCommand extends Command
{
	public SpawnBuildingCommand(Object receiver, String[] args)
	{
		super(receiver, args);
	}

	@Override
	public void Execute()
	{
		// The receiver for the SpawnAsteroidCommand is the Square to spawn the asteroid in.
		Square square = (Square) receiver;
		IAsteroidGameFactory factory = GameBoard.Instance().GetFactory();
		System.out.println("Spawning asteroid at (" + args[0] + "," + args[1] + ") with height = ");
		square.Add(factory.MakeBuilding());
	}
}