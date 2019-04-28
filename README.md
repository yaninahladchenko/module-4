Module 4    

1. We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract
methods namely 'rectangleArea' taking two parameters, 'squareArea' and 'circleArea' taking one parameter each.
The parameters of 'rectangleArea' are its length and breadth, that of 'squareArea' is its side and that of 'circleArea' is its
radius. Now create another class 'Area' containing all the three methods 'rectangleArea', 'squareArea' and 'circleArea' for
printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.


2. Create a Banking Application classes: the hierarchy should contains an abstract bank account class with an ability to add
money, to withdraw and to calculate a payment fee. Create different account plans with customizable fee amount and an
ability to limit withdrawal: debit account – it is impossible to get more money than the account currently has, credit account
– it is possible to get a credit line for this account. The fees should be 1% for debit account and 1% for credit account type in
case of positive balance and 5% in case of negative balance.
Create a special class which will print the account logs using the Observer pattern
(https://en.wikipedia.org/wiki/Observer_pattern).
Create a test application which will use all application features.