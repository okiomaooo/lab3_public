package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println("Сумма чисел матрицы: " + method(array));
        }
        catch (MyArraySizeException | MyArrayDataException | MyNoFibonacciException e){
            e.printStackTrace();
        }
    }
    public static int method(String[][] array) throws MyArraySizeException, MyArrayDataException, MyNoFibonacciException{

        if(array.length != 4){
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4){
                throw new MyArraySizeException();
            }
        }
        int number;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    number = Integer.parseInt(array[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j,array[i][j]);
                }

                try {
                    if (isFib(number))
                        throw new MyNoFibonacciException(i, j, array[i][j]);
                } catch (MyNoFibonacciException  ee) {
                    ee.printStackTrace();
                }
            }

        }

        return sum;
    }
    public static boolean isFib(int num) {
        int n0 = 0;
        int n1 = 1;
        int n2;
        do {
            if (n0 + n1 > 1000) {
                return true;
            }
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        } while (n2 != num);
        return false;
    }

}