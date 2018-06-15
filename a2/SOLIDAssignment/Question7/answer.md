Violation: Interface Segregation  


Problem:  
We have classes with methods that dont do anything. Flying insects dont swim and Swimming insects dont fly there fore they shouldnt extend an interface that would make a fish fly and something that flys, swim.   

Solution:  
The interface has methods for objects that will not implement the methods. 
The solution to this problem is to change the Swim and Fly method to Move()
because, we dont care how the Insects move as long as when we call move it works.