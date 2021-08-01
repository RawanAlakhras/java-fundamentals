package inheritance;

import java.util.ArrayList;

public class Restaurant {
    String name;
    int numberOfStars;
    double price;
    ArrayList <Review>reviewsArr=new ArrayList<>();
    int sum=0;

    public Restaurant(String name,double price) {
        this.name = name;
        this.numberOfStars=0;
        this.price=price;
    }
    public int addReview(String body,String author,int stars) {
        Review addNewReview=new Review(body,author,stars);
        reviewsArr.add(addNewReview);
        this.sum=this.sum+addNewReview.stars;
        changeStars(reviewsArr);
        return reviewsArr.size();

    }
    public void changeStars(ArrayList<Review>r){
        this.numberOfStars=this.sum /r.size();
    }

    public String tostring(){
        String str="the name of Restaurant is:"+this.name +
                "\nthe number of stars is :"+this.numberOfStars+
                "\nprice category:"+this.price+"\nThe Review details\n";
        for (Review review:reviewsArr){
            str=str+review.tostring()+"\n";
        }
        return str;
    }
}
