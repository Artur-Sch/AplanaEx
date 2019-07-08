# AplanaEx
Задания для Аплана
ClassWork:
 Task1
 Написать метод.
 Метод должен выводить на экран ближайшее к 10 из двух введеных чисел, записанных в аргумент метода.
 Числа могут быть любого типа.
 Числа вводятся с клавиатуры.

 Task2
 Написать два метода.
 Первый метод должен по номеру месяца определить время года (зима, весна, лето, осень) с помощью if else.
 Второй метод цель аналогичная первому, но реализован с помощью switch
 Номер месяца вводится с клавиатуры


 Task3
 Написать метод
 Положительное или отрицательное число
 Ввести число с клавиатуры
 Если число положительное, то увеличить его в два раза
 Если число отрицательное, то прибавить к нему единицу
 Есди введенное число равно 0, то вывести на экран 0.

 Task4
 Вывести на экран таблицу умножения для введенного с клавиатуры числа.
 Нельзя использовать циклы
 В коде не должно быть цифр
 Привер ввода "5"
 Пример вывода:
 "5 * 1 = 5"
 "5 * 2 = 5"
 и т.д.

 Task5
 Правило треугольника
 Ввести с клавиатуры 3 числа a,b,c - стороны предполагаемого треугольника
 Определить возможность существования треугольника
 Результат вывода:
 "Треугольник существует" или "Треугольник не существует"
 Подсказка:
 Треугольник существует только тогда, когда сумма двух любых его сторон больше третьей.

 Task6
 Ввести с клавиатуры три числа
 Отсортировать по возрастанию
 Отсортировать по убыванию
 Ввод: 16 43 23 вывод: 16 23 43 : 43 23 16

 Task7 Светофор
 В начале каждого часа в течении 3х минут горит зеленый сигнал
 затем в течении одной минуты горит желтый
 затем в течении одной минуты горит красный
 затем опять зеленый горит 3 минуты и т.д.
 Ввести с клавиатуры число, означающее время в минутах, прошедшее с начала очередного часа.
 Определить сигнал какого цвета горит в данный момент.
 Вывод: Зеленый / Желтый / Красный

Task8
Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt. 
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли. 
Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

Task9
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt 

Task10
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, 
а потом в этот же файл перезаписывать текстовые данные, введенные вручную. 
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

Task11
Ввести с консоли число в бинарном формате. 
Перевести его в десятичный формат, записать в переменную int и вывести на экран. 
Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

Task12
Массив размерностью 20 чисел заполняется случайными целыми числами от -10 до 10 (Использовать рандомизатор).
Найти Максимальный положительный и отрицательный элемент массива, поменять их местами.

Task13
Реализовать базовые операции калькулятора (+ | - | / | *).
Операции разнести по отдельным методам. Упаковать программу в исполняемый jar. Должна запускаться по принципу java -jar * 1 2. Выводить результат в консоль.

Task14 Поиск максимального элемента в массиве.
Размерность массива задается пользователем.
Пользователем вводится массив строк. 
В полученном массиве необходимо найти самое длинное и самое короткое слово, вывести оба в консоль.


Task15
Формируется новогодний подарок.
Он может содержать различные сладости (Candy, Jellybean, etc (в программе должно быть не менее 7 видов)).
У каждой сладости есть название, цена, уникальный параметр.
Необходимо собрать подарок. Найти вес подарка, общую стоимость, вывести информацию в консоль.
Реализация:
Должен быть родительский класс Sweet, от которого будут наследоваться остальные классы сладостей.
Название, цена, уникальный параметр должны быть переменными экземпляра класса.
Подарок должен быть отдельным классом. 
Стоимость и цены и наполнение подарка должны быть экземплярами класса и вычислятся автоматически.
Экзепляра класса для хранения сладостей (массив или лист или Generic).
Для вывода в консоль веса и общей стоимости необходимо переопределить toString. Так же данный класс должен содержать переменную 

HomeWork:
// Task1
Даны два слова. Найдите только те символы слов, которые встречаются в обоих словах только один раз.
Слова вводятся пользователем.
// Task2
Написать генерацию строк длины 10, причем первые 4 символа - цифры, следующие два символы - различные буквы,
 следующие 4 символа - нули или единицы, причем одна единица точно присутствует.
// Task3
Строка состоит из слов, разделенных одним или несколькими пробелами. 
Переставьте слова по убыванию их длин.
// Task4
Пользователем с клавиатуры вводится два массива чисел, 
размерность массивов задается пользователем (не менее 4 символов).
Программа должна выводить массив чисел, который состоит из середин двух массивов сложенных и перемешанных между собой. 
(Длина середины должна быть не менее 50% от общей длины).
 Для заполнения массива должны быть реализованы set и get методы.
// Task5
Пользователем задается массив чисел и его размерность, если есть место для разбиения массива так, 
чтобы сумма чисел на одной стороне была равна сумме чисел на другой стороне вывести на экран 2 массива (каждый из них одна
 половина изначального массива) и суммы чисел итоговых массивов.
// Task6
Когда белки собираются на вечеринку, им нравится курить сигары. Вечеринка успешна, 
когда количество сигар составляет от 40 до 60 включительно. Если это не выходные,
 в этом случае не существует верхней границы количества сигар. Вернуть true,
 если партия с заданными значениями успешна, или false в противном случае.
// Task7
Вы едете слишком быстро, и полицейский останавливает вас. Напишите код для вычисления результата,
закодированный как значение типа int: 0 = нет штрафа, 1 = маленький штраф, 2 = большой штраф. 
Если скорость равна 60 или меньше, результат равен 0. Если скорость находится между 61 и 80 включительно, 
результат равен 1. Если скорость равна 81 или больше, результат равен 2.
 Если это не ваш день рождения - в этот день ваш Скорость может быть на 5 выше во всех случаях. 
Текущая дата задается рандомно, дата рождения вводится с клавиатуры.
// Task8
Создайте класс student, содержащую поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создать массив из десяти элементов такого типа, упорядочить записи по возрастанию среднего балла. 
Добавить возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.
// Task9
Создайте структуру с именем train, содержащую поля: название пункта назначения, номер поезда, время отправления.
 Ввести данные в массив из пяти элементов типа train, упорядочить элементы по номерам поездов. 
Добавить возможность вывода информации о поезде, номер которого введен пользователем. 
Добавить возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления.
// Task10
Класс Покупатель: Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, 
Номер банковского счета; Конструктор; Методы: установка значений атрибутов, получение значений атрибутов, 
вывод информации.Создать массив объектов данного класса. Вывести список покупателей в алфавитном порядке и 
список покупателей, у которых номер кредитной карточки находится в заданном диапазоне.
