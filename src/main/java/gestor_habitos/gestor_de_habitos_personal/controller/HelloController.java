package gestor_habitos.gestor_de_habitos_personal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping ("/")
    public String home() {
        return "Hola! La app funciona y ya tenemos models, enums y repository. Service en camino!";
    }
}
