package anotherex;

public class DealerAuthorization implements Security {

	public String dealerid;
	public String dealeraccesskey;
	
	public DealerAuthorization(String dealerid, String dealeraccesskey) {
		super();
		this.dealerid = dealerid;
		this.dealeraccesskey = dealeraccesskey;
	}

	public boolean IsDealerAuthorized(String dealerid, String dealeraccesskey){
		if (this.dealerid != "" & this.dealeraccesskey != ""){
			return true;
		}else return false;
	}

	//Getters and setters
	
	public String getDealerid() {
		return dealerid;
	}


	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
	}


	public String getDealeraccesskey() {
		return dealeraccesskey;
	}


	public void setDealeraccesskey(String dealeraccesskey) {
		this.dealeraccesskey = dealeraccesskey;
	}

}
