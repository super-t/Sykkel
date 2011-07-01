package no.hamre.sykkel;

import no.hamre.sykkel.dao.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class SykkelService {

  private Logger LOGGER = LoggerFactory.getLogger(SykkelService.class);

  public void lagreNyPerson(Person person) {
    LOGGER.info("Lagrer person: " + person);
  }
}
