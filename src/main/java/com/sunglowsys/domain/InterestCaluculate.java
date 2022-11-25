package com.sunglowsys.domain;

public class InterestCaluculate {
    private double principleAmount;
    private double rateOfInterest;
    private double duration;
    private double totalAmount;

    public InterestCaluculate(double principleAmount, double rateOfInterest, double duration, double totalAmount) {
        this.principleAmount = principleAmount;
        this.rateOfInterest = rateOfInterest;
        this.duration = duration;
        this.totalAmount = totalAmount;
    }

    public double getPrincipleAmount() {
        return principleAmount;
    }

    public void setPrincipleAmount(double principleAmount) {
        this.principleAmount = principleAmount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
