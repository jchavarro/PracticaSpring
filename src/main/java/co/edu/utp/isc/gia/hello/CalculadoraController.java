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
        return "El resultado de la suma es: " + Integer.toString(num1 + num2);
    }
    
    @GetMapping("/resta")
    public String resta(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2){
        return "El resultado de la resta es: " + Integer.toString(num1 - num2);
    }
    
    @GetMapping("/multi")
    public String multiplicacion(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2){
        return "El resultado de la multiplicacion es: " + Integer.toString(num1 * num2);
    }
    
    @GetMapping("/divi")
    public String division(
            @RequestParam("num1") float num1,
            @RequestParam("num2") float num2){
        return "El resultado de la division es: " + Float.toString(num1 / num2);
    }
    
    
}
