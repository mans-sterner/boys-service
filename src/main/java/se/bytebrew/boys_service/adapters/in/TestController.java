package se.bytebrew.boys_service.adapters.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {

  @GetMapping
  public String helloWorld() {
    return "Hello, world!";
  }
}
