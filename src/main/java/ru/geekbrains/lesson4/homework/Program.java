package ru.geekbrains.lesson4.homework;

public class Program {

    /**
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     *
     * Формат сдачи: ссылка на гитхаб проект
     * @param args
     */
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        for (int i = 0; i < 2; i++) {
            appleBox1.add(new Apple("golden"));
        }

        Box<Apple> appleBox2 = new Box<>();
        for (int i = 0; i < 3; i++) {
            appleBox2.add(new Apple("red"));
        }

        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 2; i++) {
            orangeBox1.add(new Orange());
        }

        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 2; i++) {
            orangeBox2.add(new Orange());
        }

        System.out.printf("В первой корзине %d яблок, вес  %.1f едениц\n", appleBox1.boxSize(), appleBox1.getWeight());
        System.out.printf("Во второй корзине %d яблок, вес  %.1f едениц\n", appleBox2.boxSize(), appleBox2.getWeight());
        System.out.printf("В третьей корзине %d апельсинов, вес %.1f единиц\n", orangeBox1.boxSize(), orangeBox1.getWeight());
        System.out.printf("В четвертой корзине %d апельсинов, вес %.1f единиц\n", orangeBox2.boxSize(), orangeBox2.getWeight());
        if(appleBox1.compare(orangeBox1)) {
            System.out.println("Вес коробок одинаковый");
        }else{
            System.out.println("Вес коробок отличается");
        }
        System.out.printf("%.1f, %.1f, %.1f, %.1f\n",appleBox1.getWeight(),appleBox2.getWeight(), orangeBox1.getWeight(), orangeBox2.getWeight() );
        appleBox2.combine(appleBox1);
        orangeBox2.combine(orangeBox1);
        System.out.printf("%.1f, %.1f, %.1f, %.1f\n",appleBox1.getWeight(),appleBox2.getWeight(), orangeBox1.getWeight(), orangeBox2.getWeight() );

        System.out.println(appleBox2.compare(orangeBox2));
       if(appleBox2.compare(orangeBox2))  {
        System.out.println("Вес коробок одинаковый");
       }else{
        System.out.println("Вес коробок отличается");
    }

    }

}
