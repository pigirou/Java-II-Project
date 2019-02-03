# Java-II-Project

When you execute DataBaseTest(class containing the main method) it creates the first DataBase table which is a list of lists (made using LinkedList) by calling class CreatingDataBase via object .

##
"Welcome!
How many fields do you want to add to your DataBase?"
After this question, the user has the option to add as many fields as he/she wants to the table (input is integer). 
##


** Calling method addFieldNames from class AddDataBase**
##
Then user gets asked to give names to each field (the first one consists of the primary keys).
e.g Give me a name for field 1-PRIMARY KEY OF DB: Name
Give me a name for field 2: Surname 
etc.
##

** Calling method addData from class AddDataBase**
##
Adding data
Τype new data: 
Add one Name :  e.g Maria
Add one Surname: e.g Papadopoulou 

User adds elements to the table for as long as he/she wants.
##

** Calling the menu**

## 
*Menu* 
 1)Add data 
 2)Remove data 
 3)View data 
 4)Data processing 
 5)Exit 
 
Options for the user are 1-5 but if the input is wrong he has to insert an option again until it's correct.
#

** Option 1 **
##
The user adds as many additional elements to the DataBase as he/she wants.
##

** Option 2 **
##
The user removes as many lines of data as he/she wants. The options of the existing primary keys are printed and when a non-existing foreign key is inserted an Exception occurs.
##

** Option 3**
##
Here you have the options to: 
Press 1) If you want to print the whole DataBase, 
2) If you want to print the characteristics of a specific primary key and  
3) If you want to print a specific element of the DataBase

If 1 is pressed: the whole table is printed.
If 2 is pressed: User is asked which primary key's data he/she wants to view and prints all the data about this specific primary key (a line of data). Options are printed, but if the inserted primary key does not exists an Exception occurs.
If 3 is pressed: User can print an element that describes the primary key e.g You want the Surname of Maria. First, he/she chooses the name of the field containing the element (e.g Surname) and then the primary key (e.g the name/ Maria).
If anything else is pressed: An exception occurs.
##

** Option 4 **
##
The user can change a specific element. e.g the BankAccountId of Nikos from '1234' to '2345'.
First, he/she chooses the field that contains the information that is to be changed. e.g BankAccountId.
Then, he/she chooses whose primary key's is this specific piece of information/data.
Finally, he/she enters the new element.
##

** Option 5 ** 
## 
If he/she chooses the option "Exit" then he/she has the option to make a second table to the DataBase and the whole process starts all over again.
##
