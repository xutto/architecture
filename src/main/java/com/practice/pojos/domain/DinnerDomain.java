package com.practice.pojos.domain;

public class DinnerDomain {

    private String firstDish;
    private String secondDish;

    public DinnerDomain(String firstDish, String secondDish) {
        this.firstDish = firstDish;
        this.secondDish = secondDish;
    }

    public String getFirstDish() {
        return firstDish;
    }

    public void setFirstDish(String firstDish) {
        this.firstDish = firstDish;
    }

    public String getSecondDish() {
        return secondDish;
    }

    public void setSecondDish(String secondDish) {
        this.secondDish = secondDish;
    }
}
