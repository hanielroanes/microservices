package br.com.haniel.greetingservice.models;

public class Greeting {

  private String name;
  private String destiny;

  public Greeting() {
  }

  public Greeting(String name, String destiny) {
    this.name = name;
    this.destiny = destiny;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDestiny() {
    return destiny;
  }

  public void setDestiny(String destiny) {
    this.destiny = destiny;
  }
}
