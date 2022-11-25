package com.sunglowsys.services;

import com.sunglowsys.domain.InterestCaluculate;

public interface InterestCalculateService {
    public double simpleInterestCalculate(InterestCaluculate caluculate);
    public double compoundInterestCalculate(InterestCaluculate caluculate);
}
