package HomeWork.Task6;

/**
 * // Task6
 *
 * Когда белки собираются на вечеринку, им нравится курить сигары. Вечеринка успешна,
 * когда количество сигар составляет от 40 до 60 включительно. Если это не выходные,
 *  в этом случае не существует верхней границы количества сигар. Вернуть true,
 *  если партия с заданными значениями успешна, или false в противном случае.
 */
public class Task6 {
    public static void main(String[] args) {

        System.out.println(party(34, false));
        System.out.println( party(55, false));
        System.out.println(party(71, true));
        System.out.println(party(30,true));


    }

    private static boolean party(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        } else if (cigars >= 40 && isWeekend) {
            return true;
        } else {
            return false;
        }
    }


}
