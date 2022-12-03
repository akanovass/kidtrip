package com.example.safedrivef.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_tariff")
@Getter
@Setter
public class Tariff extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "content",columnDefinition = "TEXT")
    private String content;
    @Column(name = "definition",columnDefinition = "TEXT")
    private String definition;

    @Column(name = "price")
    private String price;




}
