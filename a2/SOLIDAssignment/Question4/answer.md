Violation: Liskov Substitution  

Problem:  
USDollarAccount is a subclass of BankAccount and there fore should be polymorphic and the subclass should be able to be placed in any place the parent class is in code and nothing should break. However, because the final exchange rate is placed in the subclass breaks the code because exchangeRates change all the time.   

Solution:  
Putting an exchangeRate in the parent class and setting it equal to 1 solves the problem. Now we can make a USDollarAccount and set the exchange rate to whatever we want.  