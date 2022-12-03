package com.example.safedrivef.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "t_users")
@Getter
@Setter
public class User extends BaseEntity  {

    @Column(name = "user_email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @ManyToMany(fetch = FetchType.EAGER)
   // @Fetch(FetchMode.SELECT)
    private List<Permission> permissions;

    //@ManyToOne(fetch = FetchType.EAGER)
    //@Fetch(FetchMode.SELECT)
   // private Tariff tariff;

    //@Override
    //public Collection<? extends GrantedAuthority> getAuthorities() {
     //   return permissions;
    //}

   // @Override
    //public String getPassword() {
      //  return password;
   // }

   // @Override
   // public String getUsername() {
    //    return email;
    //}

    //@Override
   // public boolean isAccountNonExpired() {
     //   return true;
    //}

   // @Override
    //public boolean isAccountNonLocked() {
     //   return true;
   // }

    //@Override
   // public boolean isCredentialsNonExpired() {
    //    return true;
    //}

  //  @Override
   // public boolean isEnabled() {
      //  return true;
   // }


}
