package ДЗ2;

public class HomeWork2 {
    public static void main(String[] args) {
//Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
        int a = 11;
        int b = 7;
        int с = (a + b);

        if (с > 10 && с < 20) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        public static void positiveOrNegative () {
            int e = -7;
            if (e >= 0) {
                System.out.print("Positive");
            } else {
                System.out.print("Negative");
            }
        }

//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        public static boolean yesOrNo () {
            int f = -10;
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
