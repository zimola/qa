Violation: Dependency Inversion  

Problem:  

CountryGDPReport depends on specific concrete classes. This is tightly coupled.  

Solution:  
the solution is to create anICountry interface. Each country can then implement the ICountryGDPReport interface which will print out the GDP Report for the country.