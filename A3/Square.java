import java.util.ArrayList;
import java.util.ListIterator;

public class Square extends BoardComponent
{
	private final ArrayList<BoardComponent> children;
	private BoardComponent parent; //is this being used?
	
	public Square()
	{
		super();
		children = new ArrayList<BoardComponent>();
	}

	@Override
	public void Operation()
	{
		ArrayList<BoardComponent> childrenCopy = new ArrayList<>(children);
		for (int i = 0; i < childrenCopy.size(); i++)
		{
			BoardComponent child = childrenCopy.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		children.remove(child);
	}
		
	@Override
	public void Update(BoardComponent square){

		
		
		if (this.equals(square)) {
			ListIterator<BoardComponent> iter = this.children.listIterator();
			for(int i = 0; i < children.size(); i++){
				children.get(i).Update(square);
				}

		}
	}	
}