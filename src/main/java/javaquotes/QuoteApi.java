package javaquotes;

public class QuoteApi {
    private String quoteAuthor;
    private String quoteText;

    //constructor
    public  QuoteApi(String author,String txt){
        this.quoteAuthor = author;
        this.quoteText=txt;
    }

    // Getter Methods

    public String getAuthor() {
        return this.quoteAuthor;
    }


    public String getText() {
        return this.quoteText;
    }
}
