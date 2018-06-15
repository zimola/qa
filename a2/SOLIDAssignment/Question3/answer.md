Violation: Single Responsibility  

Problem:  

class ProfitReport is doing too much work. its sending to email and sending to printer.  


Solution:  

the key is to get classes that handle these on their own. Have an EmailSender class and a PrinterSender class 
that handle any printing or email needs.   

EmailSenders job is to send to email  
PrinterSenders job is to send to printer  
ProfitReports job is to generate a report.


