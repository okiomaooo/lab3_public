package org.example;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int i, int j, String value){
        super("В матрице в строке [" + (i+1) + "] в столбце ["+ (j+1) +"] находится число \"" + value + "\", которое не является целым числом.");
    }
}
