package Classwork.Task15.sweet;

import Classwork.Task15.Sweet;

public class Cookies extends Sweet {

    private String param;


    public Cookies(int coast, int weight) {
        super(coast, weight);
    }

    @Override
    public String toString() {
        return "Cookies";
    }
}
