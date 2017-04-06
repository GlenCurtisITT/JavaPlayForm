package controllers;

import play.data.DynamicForm;
import play.mvc.*;

import views.html.*;
import models.Person;
import play.data.*;
import javax.inject.Inject;


public class HomeController extends Controller {

    //Needed form forms.
    private FormFactory formFactory;
    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

    public Result index() {
        return ok(index.render());
    }

    //Page that displays the forms data.
    public Result formData(){
        Person p = null;
        return ok(formData.render(p));
    }

    public Result formSubmit(){
        DynamicForm df = formFactory.form().bindFromRequest();
        String name = df.get("name");
        String dob = df.get("DOB");
        String address = df.get("address");
        //All form fields are taken in as Strings, need to convert to data type if needs be.
        int age = Integer.parseInt(df.get("age"));
        String gender = df.get("gender");
        String password = df.get("password");

        Person p = new Person(name, dob, address, age, gender, password);
        return ok(formData.render(p));
    }

}
