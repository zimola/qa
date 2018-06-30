import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AsteroidSubject implements ISubject{

	
	private List<BoardComponent> observers;
	
	public AsteroidSubject(){
		observers = new ArrayList<BoardComponent>();
	}
	
	
	@Override
	public void Attach(BoardComponent observer) {
        observers.add(observer);		
	}

	@Override
	public void Detatch(BoardComponent observer) {
       observers.remove(observer);		
	}

	
	
	@Override
	public void Notify(BoardComponent observer) {
		//System.out.print("NOTIFICATION");
		ListIterator<BoardComponent> iter = observers.listIterator();
		//System.out.println(observers.size());
		for(int i = 0; i < observers.size(); i++){
			observers.get(i).Update(observer);
		}
		/*
		while(iter.hasNext()){
			iter.next().Update(observer);
			}
			*/
	}

}
