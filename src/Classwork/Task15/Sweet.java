package Classwork.Task15;

public  class Sweet {
    private String name;
    private int coast;
    private String param;


    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return getName();
    }

    private int weight;

    public Sweet(int coast, int weight) {
        this.name = "Sweet";
        this.coast = coast;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getCoast() {
        return coast;
    }

    public String getParam() {
        return param;
    }
}

