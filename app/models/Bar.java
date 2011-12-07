package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jamesw
 * Date: 11/8/11
 * Time: 2:30 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class Bar extends Model {
    
    public String name;
    
    public int num;
    
}
