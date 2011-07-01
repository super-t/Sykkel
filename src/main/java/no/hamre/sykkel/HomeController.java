package no.hamre.sykkel;

import no.hamre.sykkel.dao.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

  private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

  @RequestMapping( {"/", "home"})
  public String showHomePage(Model model) {
    logger.info("Welcome home!");

    Person person = new Person();
    person.setNavn("default navn");
    model.addAttribute(person);
    model.addAttribute("controllerMessage",
        "This is the message from the controller!");
    return "nyPerson";
  }
}
