package Laba_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Первый");
        arrayList.add("Второй");
        arrayList.add("Третий");
        arrayList.add("Четвёртый");
        arrayList.add("Пятый");
        arrayList.add("Шестой");
        arrayList.add("Седьмой");
        System.out.println(arrayList);
        String s1 = arrayList.get(2);
        String s2 = arrayList.get(4);
        arrayList.set(2,s2);
        arrayList.set(4,s1);
        System.out.println(arrayList);
        String[] mass=new String[arrayList.size()];
        arrayList.toArray(mass);

        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Banana> banan = new Box<>();


        apple.addfruitdefault(new Apple());
        banan.addfruitdefault(new Banana());
        orange.addfruitdefault(new Orange());
        apple1.addfruitdefault(new Apple());
        orange1.addfruitdefault(new Orange());

        apple.AddFruit(5);
        banan.AddFruit(5);
        orange.AddFruit(2);
        apple1.AddFruit(3);
        orange1.AddFruit(4);


        System.out.println("Вес первой коробки с яблоками: "+apple.getMaxWeight());
        System.out.println("Вес первой коробки с банан: "+banan.getMaxWeight());
        banan.Print(banan);
        System.out.println("Вес второй коробки с яблоками: "+ apple1.getMaxWeight());
        System.out.println("Сравнение двух коробок с яблоками: "+ apple.Compare(apple1));
        apple.Transfer(apple1);
        System.out.println("Вес первой коробки с яблоками после пересыпки "+ apple.getMaxWeight());
        System.out.println("Вес второй коробки с яблоками после пересыпки "+ apple1.getMaxWeight());

        System.out.println("Вес первой коробки с апельсинами: "+orange.getMaxWeight());
        System.out.println("Вес второй коробки с апельсинами: "+ orange1.getMaxWeight());
        System.out.println("Сравнение двух коробок с апельсинами: "+ orange.Compare(orange1));
        orange.Transfer(orange1);
        System.out.println("Вес первой коробки с апельсинами после пересыпки "+ orange.getMaxWeight());
        System.out.println("Вес второй коробки с апельсинами после пересыпки "+ orange1.getMaxWeight());
        System.out.println("Содержимое первой коробки с яблоками ");
        apple.Print(apple);
        System.out.println("Содержимое первой коробки с апельсинами ");
        orange.Print(orange);

    }

}

