package javaquotes;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
   //can generate a random quote from api
    @Test
    public void getResults() {
        String s = App.getResults();
        assertTrue("The string is not empty",s.length()>0);
    }
  //can get a random quote from the json file -- test.json
    @Test
    public void getQuoteFromFile() {

        String filepath = "src/test/resources/test.json";
        String testLists = App.getQuoteFromFile(filepath);
        assertTrue("This is not an empty string",testLists.length()>0);
    }

    //can read file and return list of quotes
    @Test
    public void readFromFile(){
        List<Quote> list = App.readFromFile();
        assertTrue("List has all objects from json file",list.size()>1);
      for(Quote q :list){
          assertTrue("Each quote object includes text",q.getText().length()>0);
      }
    }
}