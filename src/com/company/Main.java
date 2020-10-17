package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        Comparator<String> comparator = (o1, o2) -> {
            Integer i1 = o1.length();
            Integer i2 = o2.length();
            return i1.compareTo(i2);
        };
        addToCollection(a, 5);
        printOut(a);

        Iterator<String> iteratorA = a.iterator();
        addToCollection1(b, 5);
        printOut(b);

        Iterator<String> iteratorB = b.iterator();
        Collections.reverse(b);

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            c.add(iteratorA.next());
            c.add(iteratorB.next());
        }

        printOut(c);

        c.sort(comparator);
        printOut(c);
    }

    public static void addToCollection(Collection<String> collection, int quantity) {
        System.out.println("Здравствуйте напишите пять имён");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < quantity; i++) {
            collection.add(s.nextLine());
        }
        System.out.println("Список A заполнен!");

    }

    public static void addToCollection1(Collection<String> collection, int quantity) {
        Scanner s = new Scanner(System.in);
        System.out.println("Вы отлично справились!\n" +
                "Вижу и со следующем списком не затруднитесь.");
        for (int i = 0; i < quantity; i++) {
            collection.add(s.nextLine());
        }
        System.out.println("Список B охвачен вашими пристрастиями!");
    }

    public static void printOut(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        System.out.println("__________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("******************");
    }
}




    /*
        7)  (Дэдлайн 3.10.2020 23:59)
        a)  В задании нельзя использовать циклы for и for each. Только while и Iterator
        b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
        c)  Затем программа должна отобразить этот список
        d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
        e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        f)  После объединения отобразить в консоли список С
        g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с
         наименьшим количеством символов, и распечатать отсортированный список С.*/
