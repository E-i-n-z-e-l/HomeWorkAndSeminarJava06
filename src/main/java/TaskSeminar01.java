/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
        а) информационной системой ветеринарной клиники
        б) архивом выставки котов
        в) информационной системой Театра кошек Ю. Д. Куклачёва
*/


import java.util.HashSet;
import java.util.Set;

public class TaskSeminar01 {
    public static void main(String[] args) {

        Cat cat1 = new Cat(2, "Вася", "Персидская", true);
        Cat cat2 = new Cat(5, "Маша", "Персидская", false);
        VetCat catVet1 = new VetCat(2, "Виктор", "Персидская", true, "blanc", false);
        TheatreCat catTheatre1 = new TheatreCat(8, "Вика", "Персидская", false, 12345, "Прыгает через горящие кольцо");

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(catVet1);
        cats.add(catTheatre1);

        System.out.println(cats);

    }
}
























