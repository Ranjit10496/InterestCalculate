package com.sunglowsys.Controller;

import com.sunglowsys.domain.InterestCaluculate;
import com.sunglowsys.services.InterestCalculateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class InterestController {
    private final InterestCalculateService calculateService;

    public InterestController(InterestCalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @PostMapping("/simple")
    public ResponseEntity<Double> simpleInterest(@RequestBody InterestCaluculate caluculate) {
        Double result = calculateService.simpleInterestCalculate(caluculate);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @PostMapping("/compound")
    private ResponseEntity<Double> compoundInterest(@RequestBody InterestCaluculate caluculate) {
        Double result = calculateService.compoundInterestCalculate(caluculate);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
