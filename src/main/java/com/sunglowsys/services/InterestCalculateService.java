package com.sunglowsys.services;

import com.sunglowsys.domain.InterestCaluculate;

public interface InterestCalculateService {
    public InterestCaluculate simpleInterestCalculate(InterestCaluculate caluculate);
    public InterestCaluculate compoundInterestCalculate(InterestCaluculate caluculate);
}
