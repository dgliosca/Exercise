# Java Exercise

## Steps
***

*	First thing that I've tried was to compile and run the code
*	Doing some clean-up of the code and convert the main into tests.
*	The main deal was to do not break the actual system and make sure that there was a test coverage for all the cases
*	After we are sure we have tests for the actual code, we can start modifying the code adding new functionalities
*	In order to add the item "Organic Bananas" I had to respect the policy of the system:
    -  	Once the sell by date has passed, Quality degrades twice as fast (i.e. the int is decremented by 2 instead of 1)
    -   The Quality of an item is never negative
*	I wrote a couple of failing tests to make sure the requirements are accomplished.
*	I have added the code to the updateQuality method.
*	Run the tests again and make sure they were all passing.


In order to improve the actual code one possible solution would be the usage of a factory method and have an abstract Item class (if possible)
and have an update method which will behave differently for each concrete implementation of Item.
