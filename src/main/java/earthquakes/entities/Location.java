package earthquakes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long placeId;
    private String name;
    private double latitude;
    private double longitude;
    private String uid;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Long getPlaceId() { return placeId; }
    public void setPlaceId(Long pid){ this.placeId = pid; }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }
    
    public double getLatitude() { return latitude; }
    public void setLatitude(double l){ this.latitude = l; }
    
    public double getLongitude() { return longitude; }
    public void setLongitude(double l){ this.longitude = l; }
    
    public String getUid(){ return uid; }
    public void setUid(String uid){ this.uid = uid; }
}
