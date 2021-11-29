package com.technews.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "user")
public class User {
    private Integer id;
    private String username;
    private String email;
    private String password;
    boolean loggedIn;

    private List<Post> posts;
    private List<Vote> votes;
    private List<Comment> comments;

}

@Id
@GeneratedValue(Strategy = GenerationType.Auto)
private Integer id;

@Column(unique =  true)
private String email;

@Transient
boolean loggedIn;