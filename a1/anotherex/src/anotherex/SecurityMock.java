package anotherex;

public class SecurityMock implements Security{
	

	Dealer dealer1;
	Dealer dealer2;
	Dealer dealer3;
	Dealer dealer4;
	
	
	public SecurityMock() {
		super();
		dealer1 = new Dealer("1234","kjhsdfkjh"); //valid
		dealer2 = new Dealer();//not valid
		dealer3 = new Dealer("21342",null);//not valid
		dealer4 = new Dealer(null, "qwerqwer");//not valid
	}

	public boolean IsDealerAuthorized(String dealerid, String dealeraccesskey){
		Dealer dealer = new Dealer(dealerid, dealeraccesskey);
		if(dealer.isValid()){return true;}
		else
			return false;
	}


}
