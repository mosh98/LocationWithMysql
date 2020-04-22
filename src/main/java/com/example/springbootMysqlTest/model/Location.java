package com.example.springbootMysqlTest.model;



import javax.persistence.*;

@Entity

public class Location {
    @Id
    private String station; //The station is the id overhere.
   // @GeneratedValue(strategy= GenerationType.AUTO)



    private String description;

    private long longitude;
    private long latitude;

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

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }
}
