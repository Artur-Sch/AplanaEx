package Classwork.Task15.sweet;

import Classwork.Task15.Sweet;

public class Cake extends Sweet {

    private String param;


    public Cake(int coast, int weight) {
        super(coast, weight);

    }

    @Override
    public String toString() {
        return "Cake";
    }
}
