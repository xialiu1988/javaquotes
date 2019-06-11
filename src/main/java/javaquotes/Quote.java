package javaquotes;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    List<String > tags = new ArrayList<> ();
    private String author;
    private String likes;
    private String text;

    //constructor
    public  Quote(String author,String likes,String txt){
        this.author = author;
        this.likes=likes;
        this.text=txt;
    }

    //constructor
    public Quote(String author,String txt){
        this.author = author;
        this.text=txt;
    }

    // Getter Methods

    public String getAuthor() {
        return this.author;
    }

    public String getLikes() {
        return this.likes;
    }

    public String getText() {
        return this.text;
    }

    // Setter Methods

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public void setText(String text) {
        this.text = text;
    }

}
