//Plain Java Bean
package earthquakes.searches;

public class LocSearch {
    private String location;
    
    //no-arg default constructor
    public LocSearch() {}
    
    public String getLocation(){
        return location;
    }
    
    public void setLocation(String l){
        location = l;
    }
}
