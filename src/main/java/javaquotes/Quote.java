package javaquotes;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    List<String > tags = new ArrayList < String> ();
    private String author;
    private String likes;
    private String text;

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
