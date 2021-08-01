package inheritance;

public class Review {
    String body;
    String author;
    int stars;

    public Review(String body,String author,int stars) {
        this.body = body;
        this.author=author;
        this.stars=stars;
    }

    public String tostring(){
        String str="the author is:"+this.author +
                "\nthe body of review :"+this.body+
                "\nnumber Of Stars :"+this.stars;
        return str;
    }

}
