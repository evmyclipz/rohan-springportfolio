package com.nighthawk.spring_portfolio.mvc.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nighthawk.spring_portfolio.mvc.calculator.Calculator;

import java.util.*;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
    private Calculator calc;

    @PostMapping( "/{expression}")
    public ResponseEntity<Object> postLightBoard(@RequestParam("expression") String exp ) 
    {
        calc = new Calculator(exp);

        if(calc.isBalanced())
        {
            //return calc.toString();
            return new ResponseEntity<>(calc.toString(),HttpStatus.CREATED);
        }
        else
        {
            return new ResponseEntity<>("Try again",HttpStatus.BAD_REQUEST);
        }
    }

}
