//Plain Java Bean
package hello.searches;

public class EqSearch {
    private int distance;
    private int minmag;
    
    //no-arg default constructor
    public EqSearch() {}

    //Getters
    public int getDistance(){
        return distance;
    }
    
    public int getMinmag(){
        return minmag;
    }
    
    //Setters
    public void setDistance(int d){
        distance = d;
    }
    
    public void setMinmag(int m){
        minmag = m;
    }
}
