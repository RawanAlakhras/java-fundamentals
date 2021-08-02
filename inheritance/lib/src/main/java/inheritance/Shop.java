package inheritance;

import java.util.ArrayList;

public class Shop implements Reviews{
    String name;
    String description;
    int dollarSign;
    ArrayList<Review>reviewsArr=new ArrayList<>();

    public Shop(String name, String description, int dollarSign) {
        this.name = name;
        this.description = description;
        this.dollarSign = dollarSign;
    }
    public String tostring(){
        String str="{name:"+this.name+",description:"+this.description+",number of dollar signs:"+this.dollarSign+"}";
        return str;
    }
    @Override
    public void addReview(String body,String author,int stars) {
        Review addNewReview=new Review(body,author,stars);
        reviewsArr.add(addNewReview);

    }
}
