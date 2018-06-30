
public interface ISubject {
	public void Attach(BoardComponent observer);
	public void Detatch(BoardComponent observer);
	public void Notify(BoardComponent observer);
	
}
