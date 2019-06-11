# javaquotes

_Using Gson to convert from json to object

References:
https://github.com/google/gson

This repo includes two main classes:

App: main()

     getResults(): get back from api if internet is ok otherwise get quote from file
     getQuoteFromFile():  a helper function to getn a random quote from file

Quote: tags;
       author;
       likes;
       text;
       


QuoteApi: quoteAuthor
          quoteText




Examples:

Each time click run button will generate a random result with "Author" and "Text"

![image1](Assets/img1.png)


![image1](Assets/img2.png)


![image1](Assets/img3.png)


Tests:

QuoteTest: including all tests for getters and setters

AppTest: test the getResults() in the app 
         test the getQuoteFromFile() in the app class

QuoteApiTest: test all the getters.