package com.vladbielskyi.weather.weather.Entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;



@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String name;
    @Column(name = "time")
    private Date dt;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coord_id")
    private Coord coord;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private List<Weather> weather;

    public City() {
    }


    public City(String name, Date dt, Coord coord, List<Weather> weather) {
        this.name = name;
        this.dt = dt;
        this.coord = coord;
        this.weather = weather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }



    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public int getId() {
        return id;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }


}
