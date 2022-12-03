package com.example.safedrivef.model;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_permissions")
@Getter
@Setter
public class Permission extends BaseEntity {

    @Column(name = "name")
    private String name;

    //@Override
   // public String getAuthority() {
        //return name;
   // }
}
