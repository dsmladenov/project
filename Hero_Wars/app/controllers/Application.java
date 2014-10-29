package controllers;

import play.mvc.*;
import views.html.*;
import web.constants.PageTitleConstants;

public class Application extends Controller {

    public static Result index() {
        return ok(page.render(PageTitleConstants.HOME_PAGE_TITLE));
    }

}
