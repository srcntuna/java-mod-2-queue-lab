# Queue Lab

## Learning Goals

- Use a queue to keep track of information

## Instructions

Let's create a lightweight, simplified, restaurant reservation system:

1. Our restaurant has 2 tables
2. In an input loop, ask the user if they want to check someone in or check
   someone out
3. If they want to check someone in, check if a table is available.
   1. If a table is available, check them in
   2. If a table is not available, put them on a waiting list
4. If they want to check someone out:
   1. Free one of the table that is taken
   2. Immediately assign the table to the next person on the waiting list

Hints:

1. You can use an array, a list, a map or a queue for your tables - each data
   structure has pros and cons, but you can make each one work for the list of
   tables
2. Use a queue for your wait list, as that's the most natural data structure for
   this type of scenario
3. You may want to use a class named `Restaurant` that holds both your table
   list and your waitlist
4. Your `Restaurant` class will have a method you might call `checkin` and a
   method called `checkout` that will be responsible for implementing the logic
   we described above
