
public class Shield extends BoardComponent{

	private int shieldHealth;
	private BoardComponent square;
	
	public BoardComponent getSquare() {
		return square;
	}

	public void setSquare(BoardComponent square) {
		this.square = square;
	}

	public Shield(BoardComponent square)
	{
		super();
		this.square = square;
		shieldHealth = 2;
	}
	
	@Override
	public void Operation() {
		square.Operation();
	}
	@Override
	public void Add(BoardComponent child) {
		square.Add(child);
	}
	
	@Override
	public void Remove(BoardComponent child) {
		square.Remove(child);
	}
	
	
	// todo 
	@Override
	public void Update(BoardComponent notification){

		if(this.square.equals(notification)){

			if (shieldHealth <=0){
				square.Update(notification);

				}
			else{
				shieldHealth -= 1;
				}
			}
	}
	
}
