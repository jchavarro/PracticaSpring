package co.edu.utp.isc.gia.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalculadoraController {
    
    @GetMapping("/suma")
    public String suma(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2){
        return "El resultado es: " + Integer.toString(num1 + num2);
    }
    
}
