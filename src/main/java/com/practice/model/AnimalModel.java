package com.practice.model;

public class AnimalModel {

    private String nick;
    private String age;

    private AnimalModel(Builder builder) {
        nick = builder.nick;
        age = builder.age;
    }


    public static final class Builder {
        private String nick;
        private String age;

        public Builder() {
        }

        public Builder withNick(String val) {
            nick = val;
            return this;
        }

        public Builder withAge(String val) {
            age = val;
            return this;
        }

        public AnimalModel build() {
            return new AnimalModel(this);
        }
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
