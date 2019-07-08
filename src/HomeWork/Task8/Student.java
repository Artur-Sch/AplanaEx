package HomeWork.Task8;

public class Student {

    private String name;
    private int group;
    private int[] ratings;
    private boolean isExcellentStudent;


    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int[] getRatings() {
        return ratings;
    }

    public Student(String name, int group, int[] ratings) {
        this.name = name;
        this.group = group;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", из " + group +" группы.";
    }

    /**
     * Метод для получения среднего значения оценок
     * @return
     */
    public double getAvgRatings() {
        double result = 0;
        for (int rating : ratings) {
            result = result+ rating;
        }
        double avg = result / ratings.length;
        return  avg;
    }

    /**
     * признак хороших оценок (только 4 и 5)
     * @return
     */
    public boolean isExcellentStudent() {
        int count = 0;
        for (int rating : ratings) {
            if (rating == 4 || rating == 5) {
                count++;
            }
        }
        if (count == 5) {
            isExcellentStudent = true;
        } else {
            isExcellentStudent = false;
        }

        return isExcellentStudent;
    }


}
