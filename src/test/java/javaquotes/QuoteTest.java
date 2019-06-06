package javaquotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void CangetAuthor() {
        Quote q = new Quote("Alice","3","as long as we are alive");
       assertTrue("can get the auhor Alice",q.getAuthor()=="Alice");
    }

    @Test
    public void getLikes() {
        Quote q = new Quote("Alice","3","as long as we are alive");
        assertTrue("can get the likes 3",q.getLikes()=="3");
    }

    @Test
    public void getText() {
        Quote q = new Quote("Alice","3","as long as we are alive");
        assertTrue("can get the text",q.getText()=="as long as we are alive");
    }

    @Test
    public void setAuthor() {
        Quote q = new Quote("Alice","3","as long as we are alive");
        q.setAuthor("Bobby");
        assertTrue("can get the new auhor Bobby",q.getAuthor()=="Bobby");
    }

    @Test
    public void setLikes() {
        Quote q = new Quote("Alice","3","as long as we are alive");
        q.setLikes("10");
        assertTrue("can get the likes 10",q.getLikes()=="10");
    }

    @Test
    public void setText() {
        Quote q = new Quote("Alice","3","as long as we are alive");
        q.setText("let's do the test");
        assertTrue("can get the text",q.getText()=="let's do the test");
    }
}