package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void addBar(Bar bar) {
        bar.save();
        index();
    }
    
    public static void listBars() {
        renderJSON(Bar.findAll());
    }

}