package com.example.springbootMysqlTest.model;



import javax.persistence.*;

@Entity
@Table()
public class Location {
    @Id
    @GeneratedValue
    private int id;

    private String station; //The station is the id overhere.

    private String description;

    private long longitude;

    private long latitude;

    public Location() {
    }

    public Location(String station, String description, long longitude, long latitude) {
        this.station = station;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

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
