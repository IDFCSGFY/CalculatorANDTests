package HW.CalculatorForTests.controller;

import HW.CalculatorForTests.service.CalculatorServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/plus")
    public Double plus(@RequestParam(value = "num1", required = false) Double a,
                       @RequestParam(value = "num2", required = false) Double b) {
        return calculatorService.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public Double minus(@RequestParam(value = "num1", required = false) Double a,
                        @RequestParam(value = "num2", required = false) Double b) {
        return calculatorService.minus(a, b);
    }

    @GetMapping(path = "/multiply")
    public Double multiply(@RequestParam(value = "num1", required = false) Double a,
                           @RequestParam(value = "num2", required = false) Double b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping(path = "/divide")
    public Double divide(@RequestParam(value = "num1", required = false) Double a,
                         @RequestParam(value = "num2", required = false) Double b) {
        return calculatorService.divide(a, b);
    }

}
