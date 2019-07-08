package Classwork.Task15.sweet;

import Classwork.Task15.Sweet;

public class Candy extends Sweet {

    private String param;


    public Candy(int coast, int weight) {
        super(coast, weight);
    }

    @Override
    public String toString() {
        return "Candy";
    }
}
