package com.vladbielskyi.weather.weather.Entity;


import javax.persistence.*;

@Entity
@Table(name = "coord")
public class Coord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "lon")
    private float lon;
    @Column(name = "lat")
    private float lat;

    public Coord() {
    }


    public Coord(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
}
