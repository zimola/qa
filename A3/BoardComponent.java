// This is the base Component abstract for the game's Composite pattern.
public abstract class BoardComponent
{
	protected BoardComponent parent;
	
	public BoardComponent()
	{
		parent = null;
	}
	
	public abstract void Operation();
	public abstract void Add(BoardComponent child);
	public abstract void Remove(BoardComponent child);
	public abstract void Update(BoardComponent square);
	public void SetParent(BoardComponent parent)
	{
		this.parent = parent;
	}
}