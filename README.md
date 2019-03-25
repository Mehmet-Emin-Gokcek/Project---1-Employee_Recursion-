# Project---1-Employee_Recursion-
Read the information from : https://www.topcoder.com/community/data-science/data-science-tutorials/an-introduction-to-recursion-part-1/

In this graph, the objects are people, and the connections in the graph show who reports to whom in the company. An upward line on our graph says that the person lower on the graph reports to the person above them. To the right we see how this structure could be represented in a database. For each employee we record their name and the name of their manager (and from this information we could rebuild the whole hierarchy if required – do you see how?).

Write a java code that read load the data above from a file called employee.txt into an Employee class. Create an another class called EmployeeManager that do the following:

Write methods that looks like “countEmployeesUnder(employeeName)”. This method is intended to tell us how many employees report (directly or indirectly) to the person named by employeeName. For example, suppose we’re calling “countEmployeesUnder(‘Sally’)” to find out how many employees report to Sally directly. You must use recursion. 
