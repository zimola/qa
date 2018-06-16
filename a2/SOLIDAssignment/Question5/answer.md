Violation: Open Closed? 

Problem:  

CountryGDPReport depends on specific concrete classes. This is tightly coupled.  

Solution:  
the solution is to create an ICountry interface. Each country can then implement the ICountryGDPReport interface which will print out the GDP Report for the country. Each country will also be a subclass of class Country().
