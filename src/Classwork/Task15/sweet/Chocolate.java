package Classwork.Task15.sweet;

import Classwork.Task15.Sweet;

public class Chocolate extends Sweet {

    private String param;

    public Chocolate(int coast, int weight) {
        super(coast, weight);
    }

    @Override
    public String toString() {
        return "Chocolate";
    }
}
