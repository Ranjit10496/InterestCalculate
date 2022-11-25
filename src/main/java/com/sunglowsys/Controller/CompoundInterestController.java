package com.sunglowsys.Controller;

import com.sunglowsys.domain.InterestCaluculate;
import com.sunglowsys.services.InterestCalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/compound")
public class CompoundInterestController {
    private final InterestCalculateService calculateService;

    public CompoundInterestController(InterestCalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @GetMapping("/calculate")
    public ModelAndView getCompound() {
        return new ModelAndView("compoundInterest", "interest", new InterestCaluculate());
    }
    @PostMapping("/calculate")
    public ModelAndView compoundInterest(@ModelAttribute InterestCaluculate caluculate) {
        return new ModelAndView("compoundInterest","interest", calculateService.compoundInterestCalculate(caluculate));
    }
}
