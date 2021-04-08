package com.example.hibernate.entity;

public class Result {
    private String name;
    private double sum;
    private int count;

    public Result() {
    }

    public Result(String name, double sum, int count) {
        this.name = name;
        this.sum = sum;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
