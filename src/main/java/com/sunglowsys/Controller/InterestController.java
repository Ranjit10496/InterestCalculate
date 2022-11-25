/*
package com.sunglowsys.Controller;

import com.sunglowsys.domain.InterestCaluculate;
import com.sunglowsys.services.InterestCalculateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class InterestController {
    private final InterestCalculateService calculateService;

    public InterestController(InterestCalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @PostMapping("/simple-interest")
    public ResponseEntity<Double> simpleInterest(@RequestBody InterestCaluculate caluculate) {
        Double result = calculateService.simpleInterestCalculate(caluculate);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @PostMapping("/compound-interest")
    private ResponseEntity<Double> compoundInterest(@RequestBody InterestCaluculate caluculate) {
        Double result = calculateService.compoundInterestCalculate(caluculate);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
*/
