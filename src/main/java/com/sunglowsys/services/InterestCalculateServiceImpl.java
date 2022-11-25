package com.sunglowsys.services;

import com.sunglowsys.domain.InterestCaluculate;
import org.springframework.stereotype.Service;

@Service
public class InterestCalculateServiceImpl implements InterestCalculateService{

    @Override
    public InterestCaluculate simpleInterestCalculate(InterestCaluculate caluculate) {
        double simpleInterest = (caluculate.getPrincipleAmount() * caluculate.getRateOfInterest() * caluculate.getDuration())/100;
        double result = simpleInterest+caluculate.getPrincipleAmount();
        caluculate.setTotalAmount(result);
      return caluculate;
    }

    @Override
    public InterestCaluculate compoundInterestCalculate(InterestCaluculate caluculate) {
        double compoundInterest = (caluculate.getPrincipleAmount() * Math.pow((1 + caluculate.getRateOfInterest() / 100),
                caluculate.getDuration())) -caluculate.getPrincipleAmount();
        double result = compoundInterest+caluculate.getPrincipleAmount();
        caluculate.setTotalAmount(result);
        return caluculate;
    }
}
