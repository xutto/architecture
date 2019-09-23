package com.practice.model;


import java.util.List;

public class PersonModel {

    private String name;
    private String surName;
    private String customNick;
    private List<String> properties;

    private PersonModel(Builder builder) {
        name = builder.name;
        surName = builder.surName;
        customNick = builder.customNick;
        properties = builder.properties;
    }


    public static final class Builder {
        private String name;
        private String surName;
        private String customNick;
        private List<String> properties;

        public Builder() {
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withSurName(String val) {
            surName = val;
            return this;
        }


        public Builder withCustomNick(String val) {
            customNick = val;
            return this;
        }

        public Builder withProperties(List<String> val) {
            properties = val;
            return this;
        }


        public PersonModel build() {
            return new PersonModel(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCustomNick() {
        return customNick;
    }

    public List<String> getProperties() {
        return properties;
    }
}
