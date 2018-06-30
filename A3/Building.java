// Building is the leaf node for the composite pattern, Square's can have MULTIPLE Buildings
// Buildings cannot have children.
public class Building extends BoardComponent
{
	private int buildingHealth;
	
	public Building()
	{
		super();
		buildingHealth = 2;
	}

	@Override
	public void Operation()
	{
		// Buildings just stand there, they don't do anything.
	}

	@Override
	public void Add(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// Do nothing, I'm a leaf.
	}
	
	
	//todo .equals 
	@Override
	public void Update(BoardComponent notification){
		if(buildingHealth == 0){
			parent.Remove(this);
			GameBoard.Instance().DecrementBuildingCount();
			
		}else{
			buildingHealth = buildingHealth-1;
		}
	
	}
}