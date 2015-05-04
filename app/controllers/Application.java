package controllers;

import models.data.User;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.main;

public class Application extends Controller {

    public static Result index() {
    	User loggedInUser = User.findUserByEmail("venkatesh.vangala@imaginea.com");
    	Logger.info("Welcome to Play...." + loggedInUser.displayName);
        return ok(main.render());
    }

}
