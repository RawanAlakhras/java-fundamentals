package inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Theater implements Reviews{
    String name;
    ArrayList<String >movie=new ArrayList<>();
    Map <String,Review> reviewMovie=new HashMap<String, Review>();
    public Theater(String name) {
        this.name = name;
    }
    public void addMovie(String name){
        movie.add(name);
    }
    public void removeMovie(String name){
        if(movie.contains(name)){
            movie.remove(name);
        }
        else {
            System.out.println("Movie name not found");
        }

    }
    public String tostring(){
        String str="";
        str = "Theater name:"+this.name+"\n";
        if(movie.size()>0) {
            for (String movie : movie) {
                str = str + movie + "\n";
            }
        }
        return str;

    }
    @Override
    public void addReview(String body, String author, int stars) {
        Review review=new Review(body,author,stars);
        reviewMovie.put("without name",review);
    }
    public void addReview(String body, String author, int stars,String name){
        Review review=new Review(body,author,stars);
        reviewMovie.put(name,review);
    }
}
