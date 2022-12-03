package com.example.safedrivef.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_feedback")
@Getter
@Setter
public class Feedback extends BaseEntity {
    @Column(name = "content",columnDefinition = "TEXT")
    private String content;
    @Column(name = "rating")
    private String user_name;
    @Column(name = "price")
    private String user_photo;




}
