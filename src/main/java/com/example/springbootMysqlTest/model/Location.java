package com.example.springbootMysqlTest.model;



import javax.persistence.*;

@Entity
@Table()
public class Location {
    @Id
    private String station; //The station is the id overhere.
   // @GeneratedValue(strategy= GenerationType.AUTO)



    private String description;

    private String longitude;
    private String latitude;

   /* public Location(Coordinates coordinates, String station, String description) {
        this.coordinates = coordinates;
        this.station = station;
        this.description = description;
    }*/


    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


}
