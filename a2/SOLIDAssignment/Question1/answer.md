Principle Violated: DEPENDENCY INVERSION PRINCIPLE

a. Why:

i. The high level class Employer depends on the low level classes HourlyWorker and SalaryWorker, if we added more worker types or more methods in the Employer class we’d have to do a lot of work in the Employer class.

b. Solution:

The high level class Employer should depend on an interface with a calculatePay(hours) method. Then each class (HourlyWorker, SalaryWorker, any new worker types) should implement that interface.

Employer would have to change how it stores workers and how workers are added, there should be a single array of workers (an array of the interface type created in step i), and add different concrete types to it (i.e. keep the two loops in the constructor, but each loop adding to the same array).