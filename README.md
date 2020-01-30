# library-simulation
Library Simulation Project for CMPSC 222 at Illinois Central College

You have to analyze and design this system before writing code as well as filling out the PSP form and then keep working PSP during the implementation.

This assignment asks students to implement the library simulation system which has the following functions:

•	Register a new customer to the library system 
•	Add a new book into the library database
•	Remove the book from the library database
•	Borrow the book
•	Return the book

Add new Customer:
All customers must register prior to using this library. In order to register new customer, the new customer needs to the some information: name, phone, email, address, state. The customer ID will be assigned by the system when the new customer registers.
Whenever the user wants to use the library system, the system should check that this user has been registered or not.

Add new books:
All books should be loaded into the library database system prior to being used. In order to register new book, the following data should be entered: ISBN, title, author, publisher, Quantity. 
Borrow Books:
•	When a customer borrows the book, system needs to check the given customer is already registered through searching for the user list. If he/she is valid, borrowing the book is allowed.
•	Librarian enters the book title or ISBN and quantity to be borrowed, system checks if the given book is in the library and also the quantity user asked is available. The quantity must be an unsigned integer. 

•	There is a borrow limit that each customer cannot borrow more than 5 books at one time.
Display Books:
Display all book information to the screen.
Remove Books:
Specific book will be entered and then deleted from the book database.
Return Books:
•	When customer returns the book, system needs to check the customer’s borrow status. If he/she is valid, system put the book back to the library database.  
Main menu options:
The main routine should be repeated until the user exits.
1.	Register a new user
2.	Borrow the book
3.	Return the book
4.	Add a new book to the library
5.	Remove the book from the library 
6.	Display book list
7.	Exit the menu

Note:
•	You have to complete PSP
•	At least two classes are required: Book and Customer 
•	All attributes are private and you have to define setter and getter methods for accessing them.
•	Please keep the programming general rules.
•	If your program has compile errors or does not run at all, you will get zero points.
•	Apply the rules below

Secure Variable rules:
•	Declare your variables all on different lines
•	Minimize Scopes
•	Declare constants as static final
•	Do not reuse variable names in sub-scopes

Data Validation rules:
•	Customer name does not include any special symbols and the length is no more than 20 characters.
•	Available states: MI, IL, OH, IN, MO, WI
•	Email: starts with the recipient name (maximum of 8 characters long with alphabet, digits and special symbols), followed by symbol @ and domain name (maximum of 5 characters long with alphabet and digits), followed by period, and then top level domains (like com, net, org, or edu) will be followed.
•	Book title includes any number of alphanumeric characters and the length is no more than 50 characters.
•	Quantity should be the positive number.
•	10 digit ISBN number: To verify an ISBN, calculate 10 times the first digit, plus 9 times the second digit, plus 8 times the third digit and so on until we add 1 time the last digit. If the final number leaves no remainder when divided by 11, the code is a valid ISBN.

