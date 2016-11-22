Read me text for Book Analysis project.
Joe Franz

The book analysis project uses several classes


TextCollectorV1()
This class takes a file name calls the file reader and returns an arraylist of strings
It also collects and returns an array list of strings containing the stop list

LetterFrequency()
LetterFrequency takes an array list of strings containing the book and it finds the letter frequency for a - z
The first method invoked is removeSpaces(), remove spaces splits each line, removes characters not in the alphabet
Then it puts everything in lower case
If the resulting string is not empty it is added to ArrayList<String> words
ArrayList<String> words instance variable holds the resulting strings which contain only characters
To count the letters I used an array of size 26, letterCountV1;
Each index corresponds to a unique character (a = 0, b = 1, .... z = 25)
The countLetters() method counts each characters frequency
The program iterates through each word in ArrayList<String> words
It then iterates through each character and adds 1 to the corresponding character in letterCountV1
It does this by subtracting a from the character being tested
This will return a value 0 - 25 corresponding to the appropriate character
getTopTenV1()
This method finds the top 10 characters used in the book
It uses a for loop and iterates 10 times
It uses a second for loop to find the largest value in letterCountV1 then it stores the count and index
For the largest value in each iteration it creates a character object and adds that character to an arrayList of Characters, unoriginally named characters
the characters arraylist holds the top ten characters in the book

Characters()
The characters class holds a character and it's count
It uses the index to match a character to its corresponding index value
It returns count and character

Word()
This class holds a string for a word and a count value
It is used for question 2 and 3 to find the most frequent words in a text

WordFrequency()
This class is passed an ArrayList<String> holding the book
It uses two ArrayLists<Word> one to hold all words and one to hold the top ten
getWords() a method to separate all the words in a text and find their counts
Firstly it iterates through every string in the book ArrayList<String>
If its empty it continues;
if not it splits the string by spaces
For each word that it splits into the pogram removes all characters not in the alphabet
It uses a last for loop to test the newly found word against all the words found before
If the word equals any of the previous words it adds one to the count of that word
If not it adds a new word to the words array list
After these loops the words arraylist contains an object for every word and its count in the text

Next it finds the top ten
To do this it loops ten times and finds the word with the highest frequency
For each iteration it adds the word with the highest frequency to the mostFrequent arrayList and removes that Word from the words arrayList
Most frequent will then contain the ten most frequently occuring words

StopListFrequency()
This class finds the frequency of words excluding stop list words
It works in the same way as the word frequency
It takes in a stop list as an arrayList of strings and the words in a book as an arrayList of words
the method findTop() loops ten times and finds the word with the highest occurence on each loop
it then removes that word from the ArrayList of words
To find the top word it iterates through every Word object in the arrayList of words 
Here it uses a boolean value and a second iteration
For each word it checks if that word is in the stop list if so the boolean is false
If the boolean is true and the count of the word is higher than the record holder the program saves the information for that word

Wild card
For this question I decided to find the number of words with specified suffixes (such as -ly, -ing) and so on.
This class SuffixFinder() finds the words ending in a suffix and counts them then returns an ArrayList<Word> of the top ten occuring words with those suffixes
