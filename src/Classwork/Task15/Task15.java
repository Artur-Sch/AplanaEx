package Classwork.Task15;

/**
 * Task15
 * Формируется новогодний подарок.
 * Он может содержать различные сладости (Candy, Jellybean, etc (в программе должно быть не менее 7 видов)).
 * У каждой сладости есть название, цена, уникальный параметр.
 * Необходимо собрать подарок. Найти вес подарка, общую стоимость, вывести информацию в консоль.
 * Реализация:
 * Должен быть родительский класс Sweet, от которого будут наследоваться остальные классы сладостей.
 * Название, цена, уникальный параметр должны быть переменными экземпляра класса.
 * Подарок должен быть отдельным классом.
 * Стоимость и цены и наполнение подарка должны быть экземплярами класса и вычислятся автоматически.
 * Экзепляра класса для хранения сладостей (массив или лист или Generic).
 * Для вывода в консоль веса и общей стоимости необходимо переопределить toString. Так же данный класс должен содержать переменную
 */


import Classwork.Task15.sweet.*;

public class Task15 {
    public static void main(String[] args) {
        Sweet[] sweets = new Sweet[7];
        sweets[0] = new Cake(15, 1);
        sweets[1] = new Candy(65, 3);
        sweets[2] = new Chocolate(85, 4);
        sweets[3] = new Cookies(12, 6);
        sweets[4] = new Lollipop(5, 3);
        sweets[5] = new Marshmallow(55, 2);
        sweets[6] = new Toffee(35, 4);

        Present present = new Present(sweets);
        System.out.println(present.toString());

    }

}
