package com.example.safedrivef.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "t_requestTypeFirst")
@Getter
@Setter
public class RequestTypeFirst extends  BaseEntity {
    @Column(name = "numberOfChildren")
    private String noch;
    @Column(name = "days")
    private String days;
    @Column(name = "sumOfDays")
    private int sumOfDays;
    @Column(name = "timeStart")
    private String timeStart;
    @Column(name = "timeEnd")
    private String timeEnd;
    @Column(name = "region")
    private String region;
    @Column(name = "inputAddress")
    private String inputAddress;
    @Column(name = "outputAddress")
    private String outputAddress;
    @Column(name = "price")
    private int price;
    @Column(name = "distanceKm")
    private int distanceKm;

}
