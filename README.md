# Learning Management System (LMS)
_**by Muhammad Vahhaaj**_

***

## What is LMS?
* Library management is a sub-discipline of institutional management that focuses on specific issues faced by libraries and library management professionals. Library management encompasses normal managerial tasks, as well as intellectual freedom and fundraising responsibilities. Issues faced in library management frequently overlap with those faced in managing non-profit organizations.

* The basic functions of library management include, but are not limited to: planning and negotiating the acquisition of materials, Interlibrary Loan (ILL) requests, stacks maintenance, overseeing fee collection, event planning, fundraising, and human resources.

* An important aspect of library management is planning and maintaining library facilities. Successful planning is defined as "active planning that ensures an organization will have the right people in the right place at the right time for right job" [4] Planning the construction of new libraries or remodeling those that exist is integral since user needs are often changing. To supplement their operating budget, managers often secure funding through donor gifts and fundraising. Many facilities have begun including cafes, Friends of the Library spaces, and even exhibits to help generate additional revenue. These areas should be taken into account when planning for building expansions.

***

## Entity Relationship Diagram
![Entity Relationship Diagram for SQL Database, Back-end](https://github.com/m-vahhaaj/LMS/blob/master/Miscellaneous/Picture2.png)

The database has four entities. Book table is used to store the details of books. Student table is used to store the database of students. Librarian table is used to store the account information of librarian. Issued_Books table stores the books issued. The database is created in Microsoft SQL Server.

***

## Relational Schema
![Relational Schema for SQL Database, Back-end](https://github.com/m-vahhaaj/LMS/blob/master/Miscellaneous/Picture3.png)

Database has four tables.

***

## Welcome Screen
![Welcome Screen of Application, Front-end](https://github.com/m-vahhaaj/LMS/blob/master/Miscellaneous/Picture1.png)

This screen is the introductory screen of Learning Management System. This screen has two button. Start button initializes LMS and the Exit button safely closes the program in pre-execution state.

***

## Login Screen
![Login Screen of Application, Front-end](https://github.com/m-vahhaaj/LMS/blob/master/Miscellaneous/Picture4.png)

This screen is the Login screen of Learning Management System. It contains three buttons. Login button is used to login after the user has entered the credentials. Create Account button is used to create register new librarian account and automatically assign the librarian id. Forgot password is used retrieve password in case it is forgotten or there is trouble remembering account information.

***

## LMS Home
![Home Screen of Application, Front-end](https://github.com/m-vahhaaj/LMS/blob/master/Miscellaneous/Picture5.png)

This screen is the LMS Home or LMS Control Panel. From here six total features can be accessed to facilitate library operations. The most important functions in this screen are Issue Book and Return Book. This screen has menu to Log-out or Exit the screen. The About Menu Item displays information.

***

### _Some things to consider_
1. Microsoft SQL Server should be installed and set-up.
2. JDBC driver should be installed.
3. SQL database must be set-up for interaction with Java.
4. You can build the .jar file and then use it to run the program.
