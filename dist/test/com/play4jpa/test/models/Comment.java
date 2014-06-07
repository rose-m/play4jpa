package com.play4jpa.test.models;

import com.play4jpa.jpa.models.Finder;
import com.play4jpa.jpa.models.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment extends Model<Comment> {

    public static Finder<Long, Comment> find = new Finder<>(Long.class, Comment.class);

    @GeneratedValue
    @Id
    public Long id;
    @ManyToOne
    public User creator;
    public String text;

}
