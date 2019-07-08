package Classwork.Task15;

import java.util.Arrays;

public class Present {
   private Sweet[] sweets;
   private int cost;

    public int getWeight() {
        for (Sweet sweet : sweets) {
            weight = weight + sweet.getWeight();
        }
        return weight;
    }

    int weight;

    public Present(Sweet[] sweets) {
        this.sweets = sweets;
        getWeight();
        getCost();
    }

    public int getCost() {
        for (Sweet sweet : sweets) {
            cost = cost + sweet.getCoast();
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Подарок содержит: " +
                Arrays.toString(sweets) +
                ", стоимостю - " + cost +
                ", весом - " + weight+"кг";
    }
}
