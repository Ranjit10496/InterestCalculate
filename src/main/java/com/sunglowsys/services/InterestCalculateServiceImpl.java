package com.sunglowsys.services;

import com.sunglowsys.domain.InterestCaluculate;
import org.springframework.stereotype.Service;

@Service
public class InterestCalculateServiceImpl implements InterestCalculateService{

    @Override
    public double simpleInterestCalculate(InterestCaluculate caluculate) {
        double simpleInterest = (caluculate.getPrincipleAmount() * caluculate.getRateOfInterest() * caluculate.getDuration())/100;
        return simpleInterest;
    }

    @Override
    public double compoundInterestCalculate(InterestCaluculate caluculate) {
        double compoundInterest = (caluculate.getPrincipleAmount() * Math.pow((1 + caluculate.getRateOfInterest() / 100),
                caluculate.getDuration())) -caluculate.getPrincipleAmount();
        return compoundInterest;
    }
}
