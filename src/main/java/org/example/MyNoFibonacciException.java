//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example;

public class MyNoFibonacciException extends RuntimeException {
    public MyNoFibonacciException(int i, int j, String value) {
        super("В матрице в строке [" + (i + 1) + "] в столбце [" + (j + 1) + "] находится число \"" + value + "\", котороле не число Фибоначчи в пределах тысячи.");
    }
}
