package ДЗ1;

// 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("************************");
    }


    //2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banan");
        System.out.println("Apple");
    }
//3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.

    public static void checkSumSign() {
        int a = 2;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицательная");
        }
    }

    //4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.

    public static void printColor() {
        int value = 401;
        if (value <= 0) {
            System.out.print("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.print("Желтый");
        }
        if (value > 100) {
            System.out.print("Зеленый");
        }
    }

// 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

    public static void compareNumbers() {
        int a = 74;
        int b = 55;
        if (a >= b) {
            System.out.print("a >= b");
        } else {
            System.out.print("a < b");
        }
    }
}

