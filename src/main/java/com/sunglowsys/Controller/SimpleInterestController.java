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
@RequestMapping("/simple")
public class SimpleInterestController {
    private final InterestCalculateService calculateService;

    public SimpleInterestController(InterestCalculateService calculateService) {
        this.calculateService = calculateService;
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/calculate")
    public ModelAndView getSimple() {
        return new ModelAndView("simpleInterest", "interest", new InterestCaluculate());
    }

    @PostMapping("/calculate")
    public ModelAndView simpleInterest(@ModelAttribute InterestCaluculate caluculate) {
        return new ModelAndView("simpleInterest", "interest", calculateService.simpleInterestCalculate(caluculate));
    }
}
