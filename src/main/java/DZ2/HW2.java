package DZ2;

public class HW2 {
    public static void main(String[] args) {

        System.out.print(compareMetod(7,11));
        positiveOrNegative(-7);
        System.out.print(yesOrNo(-10));
    }

//Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false

    public static boolean compareMetod(int a, int b) {

        if ((a + b) > 10 && (a + b) < 20) {
            return true;
        } else {
            return false;
        }
    }
//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void positiveOrNegative (int e) {
        if (e >= 0) {
            System.out.print("Positive");
        } else {
            System.out.print("Negative");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean yesOrNo (int f) {
        if (f < 0) {
            return true;
        }
        return false;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWordNTimes() {
        for(int d = 7; d <= 6; d++) {
            System.out.print(d);
        }
    }
}
