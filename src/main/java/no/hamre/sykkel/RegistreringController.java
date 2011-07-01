package no.hamre.sykkel;

import no.hamre.sykkel.dao.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Kontroller for å registrere timer og hente ut timer for en brukers
 */
@Controller
@RequestMapping("/registrering")
public class RegistreringController {

  private static final Logger logger = LoggerFactory.getLogger(RegistreringController.class);

  private SykkelService sykkelService;

  @Autowired
  public RegistreringController(SykkelService sykkelService) {
    this.sykkelService = sykkelService;
  }

  @RequestMapping(value = "/lagre")
  public String registrerUke(@Valid Person person, Model model) {
    logger.info("Ny person");


    sykkelService.lagreNyPerson(person);
    model.addAttribute("controllerMessage", "Lagret ny person");
    return "home";
  }
}
