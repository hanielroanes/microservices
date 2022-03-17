package br.com.haniel.greetingservice.controllers;

import br.com.haniel.greetingservice.configuration.GreetingConfiguration;
import br.com.haniel.greetingservice.models.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/greeting")
public class GreetingController {

  @Autowired
  private GreetingConfiguration greetingConfiguration;

  @GetMapping
  public Greeting getAll(@RequestParam(value = "name", defaultValue = "") String name){

    return new Greeting(greetingConfiguration.getGreeting(), greetingConfiguration.getDefaultValue());
  }
}
