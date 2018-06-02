package anotherex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "dealer" )
@XmlAccessorType(XmlAccessType.FIELD)
public class Dealer implements Security{
	
	@XmlElement(name="dealerid") 
	public String dealerid;
	
	@XmlElement(name="dealeraccesskey")    
	public String dealeraccesskey;
	
	@XmlElement(name="result")
	public String result;
	
	@XmlElement(name="result")
	public String error;	
	
	
	//constructors
	public Dealer() {
		super();
	}

	public Dealer(String dealerid, String dealeraccesskey) {
		super();
		this.dealerid = dealerid;
		this.dealeraccesskey = dealeraccesskey;
	}

	
	//class methods
	
	// TODO put this in isValid?
	public boolean IsDealerAuthorized(String dealerid, String dealeraccesskey){
		if( this.dealeraccesskey == null || this.dealerid==null || this.dealerid.trim().isEmpty() || this.dealeraccesskey.trim().isEmpty()){
			return false;
			}
		else 
			return true;
	}
	
	public boolean isValid(){
		if(this.dealeraccesskey == null || this.dealerid==null || this.dealerid.trim().isEmpty() || this.dealeraccesskey.trim().isEmpty()){
			return false;
			}
		else 
			return true;
	}
	
	public Boolean isSecureDealer(Dealer d, Security s){
		
		return s.IsDealerAuthorized(d.dealerid, d.dealeraccesskey);
	}
	

	//getters and setters
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	//toString
	@Override
	public String toString() {
		return "Dealer [dealerid=" + dealerid + ", dealeraccesskey=" + dealeraccesskey + "]";
	}


}
