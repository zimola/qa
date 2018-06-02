package anotherex;

import static org.junit.Assert.*;

import org.junit.Test;


public class SecurityTest {

	@Test
	public void isSecurityValid(){
		SecurityMock mock = new SecurityMock();
		assertTrue(mock.IsDealerAuthorized(mock.dealer1.dealerid, mock.dealer1.dealeraccesskey));
		assertFalse(mock.IsDealerAuthorized(mock.dealer2.dealerid, mock.dealer2.dealeraccesskey));
		assertFalse(mock.IsDealerAuthorized(mock.dealer3.dealerid, mock.dealer3.dealeraccesskey));
		assertFalse(mock.IsDealerAuthorized(mock.dealer4.dealerid, mock.dealer4.dealeraccesskey));	
	}

}