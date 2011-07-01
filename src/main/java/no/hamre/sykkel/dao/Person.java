package no.hamre.sykkel.dao;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Person implements Serializable{

  private Integer id;
  private String initialer;
  private String navn;
  private Boolean aktiv = true;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Integer getId() {
    return id;
  }

  @Override
  public String toString() {
    return "(" + initialer + ")" + navn + (aktiv?"":" IKKE AKTIV");
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getInitialer() {
    return initialer;
  }

  public void setInitialer(String initialer) {
    this.initialer = initialer;
  }

  public String getNavn() {
    return navn;
  }

  public void setNavn(String navn) {
    this.navn = navn;
  }

  public boolean isAktiv() {
    return aktiv;
  }

  public void setAktiv(boolean aktiv) {
    this.aktiv = aktiv;
  }
}
