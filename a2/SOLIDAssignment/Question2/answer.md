Violation: Interface Segregation  

Problem:  
The interface had methods for digital classes which, for books doesnt make sense.  

Solution:   
the solution is to get remove that from ILibraryItem and then put it into a new interface
IDigitalItem and have the DVD class implement both interfaces.