//Plain Java Bean
package hello;

public class EqSearch {
    private int distance;
    private int minmag;
    
    //no-arg default constructor

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
