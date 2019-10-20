package com.practice.pojos.web;

public class DinnerRequestCopy {

    private String firstDish;
    private String secondDish;

    private DinnerRequestCopy(Builder builder) {
        firstDish = builder.firstDish;
        secondDish = builder.secondDish;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public String getFirstDish() {
        return firstDish;
    }

    public String getSecondDish() {
        return secondDish;
    }

    public static final class Builder {

        private String firstDish;
        private String secondDish;

        private Builder() {
        }

        public Builder firstDish(final String firstDish) {
            this.firstDish = firstDish;
            return this;
        }

        public Builder secondDish(final String secondDish) {
            this.secondDish = secondDish;
            return this;
        }

        public DinnerRequestCopy build() {
            return new DinnerRequestCopy(this);
        }
    }
}
