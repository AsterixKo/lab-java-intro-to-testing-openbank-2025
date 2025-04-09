package org.jmc.mydomain;

import java.util.Arrays;

public class Main {
    public static int[] getAllOddIntegers(int n) {
        int[] arr = new int[((n + 1) / 2)];
        for (int i = 0, e = 1; i < arr.length; e += 2, i++) {
            arr[i] = e;
        }
        return arr;
    }

    public static boolean containsJavaKeywords(String inputStr) {
        String[] keywords =
                {"abstract", "continue", "for", "new", "switch",
                        "assert***", "default", "goto*", "package", "synchronized",
                        "boolean", "do", "if", "private", "this",
                        "break", "double", "implements", "protected", "throw",
                        "byte", "else", "import", "public", "throws",
                        "case", "enum****", "instanceof", "return", "transient",
                        "catch", "extends", "int", "short", "try",
                        "char", "final", "interface", "static", "void",
                        "class", "finally", "long", "strictfp**", "volatile",
                        "const*", "float", "native", "super", "while"};
        boolean found = false;
        for (String word : keywords) {
            if (inputStr.contains(word)) {
                System.out.println("find: " + word);
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getAllOddIntegers(10)));
        System.out.println(containsJavaKeywords("native"));
    }
}