Violation: Single Responsibility  


Problem:  
PiggyBank is doing more than it should, it should to one thing, take in coins. A second class should do the 
loading and saving methods.   


Solution:  
Depending on the implementation I feel like there is a few ways to solve this violation. 
I have chosen to leave the PiggyBank as basically a transaction handler, leading the addCoin methods and
then create another class (PiggyBankHandler) that takes the PiggyBank and then saves the data to a file, or reads
the data from a file.  
