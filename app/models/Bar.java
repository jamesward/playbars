package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Bar extends Model {
    
    public String name;
    
}
