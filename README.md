# Number-sytem-converter
Convert any base number to any other base up to 34. Written in java.

PROJECT TITLE: Number System Converter

PURPOSE OF PROJECT: Gain experience in java by making a number converter

HOW TO START THIS PROJECT: Run this code in a Java compiler and follow the instructions as it prompts you.

AUTHORS: Andra DJ Williams 

ITERATIONS AND REVISIONS: 
	At one point, the file called CompleteSystem only converted any base to base 10, then I created ReverseFullSystem to turn base 10 to whatever base you wanted. Once I finished ReverseFullSystem I combined them into FullSystem to allow conversion to and from any base with base 10 being the conversion point. 
	In the process of writing CompleteSystem, I had to test the ASCII value of all the characters so I can easily use letters for bases larger than 10. However, changed from using the ASCII value to finding the character's location in a static array
	The files have been renamed and refactored to better reflect what they do and minimize repetition across and within files.
	Along with the refactoring Roman Numerals were added as an option. The addition of Roman Numerals added another file that handles conversion and optimization of inputted numbers.

AVAILABLE CHARACTER ARRAY:
char[] CHARCTERS={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
*can be modified in the code to accommodate more bases by using special characters 

