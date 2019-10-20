package com.practice.pojos.web;

public class DinnerRequestWeb {

    private String firstDish;
    private String secondDish;

    private DinnerRequestWeb(Builder builder) {
        this.firstDish = builder.firstDish;
        this.secondDish = builder.secondDish;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String firstDish;
        private String secondDish;

        Builder() {
        }

        public Builder firstDish(String val) {
            firstDish = val;
            return this;
        }

        public Builder secondDish(String val) {
            secondDish = val;
            return this;
        }

        public DinnerRequestWeb build() {
            return new DinnerRequestWeb(this);
        }
    }

    public String getFirstDish() {
        return firstDish;
    }

    public String getSecondDish() {
        return secondDish;
    }
}
