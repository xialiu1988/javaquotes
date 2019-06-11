package javaquotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteApiTest {
    //getter test
    @Test
    public void getAuthor() {
        QuoteApi q = new QuoteApi("test1","Today is a good day");
        assertEquals("This can get Author", "test1",q.getAuthor());
    }

    @Test
    public void getText() {
        QuoteApi q = new QuoteApi("test1","Today is a good day");
        assertEquals("This can get Text", "Today is a good day",q.getText());
    }
}