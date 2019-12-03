//Plain Java Bean
package earthquakes.searches;

public class EqSearch {
    private int distance;
    private int minmag;
    
    private double lat;
    private double lon;
    private String location;
    
    //no-arg default constructor
    public EqSearch() {}

    //Getters
    public int getDistance(){
        return distance;
    }
    
    public int getMinmag(){
        return minmag;
    }
    
    public double getLat(){
        return lat;
    }
    
    public double getLon(){
        return lon;
    }
    
    public String getLocation(){
        return location;
    }
    
    //Setters
    public void setDistance(int d){
        distance = d;
    }
    
    public void setMinmag(int m){
        minmag = m;
    }
    
    public void setLat(double l){
        lat = l;
    }
    
    public void setLon(double l){
        lon = l;
    }
    
    public void setLocation(String loc){
        location = loc;
    }
}
