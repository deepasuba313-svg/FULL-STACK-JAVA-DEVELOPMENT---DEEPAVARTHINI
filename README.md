Smart Room Management System
This is a simple Java program for managing hotel rooms. It lets you choose between Deluxe Room and Suit Room, enter the number of persons and days, and it calculates the total amount for your stay.  
The project is created to practice Java OOP concepts like inheritance and method overriding.

 Features
- Choose between Deluxe Room or Suit Room.
- Enter number of persons and number of days.
- Automatically calculates total amount.
- Shows a summary of your booking.
- Demonstrates inheritance and method overriding in Java.


 Classes in the Project
 1. Room (Parent Class)
- Attributes: ‘number’ (persons), ‘days’ (stay duration)
- Method: ‘display()’ → prints a welcome message

 2. DeluxeRoom (Child Class)
- Extends ‘Room’
- Rate: 5000 per day
- Calculates total cost
- Overrides ‘display()’ to show booking details

 3. SuitRoom (Child Class)
- Extends ‘Room’
- Rate: 2000 per day
- Calculates total cost
- Overrides ‘display()’ to show booking details

 4. Main Class
- Takes input from the user (room type, number of persons, days)
- Creates appropriate room object and shows the total amount

 How to Run
1. Make sure Java JDK is installed on your computer.
2. Clone this repository:
   git clone https://github.com/deepasuba313-svg/FULL-STACK-JAVA-DEVELOPMENTDEEPAVARTHINI.git
