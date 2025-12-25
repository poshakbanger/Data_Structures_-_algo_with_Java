package Generics;
//Example of Java Generic Methods
public class GenericMethodTest {
    // generic method print array
    public static <E> void printArray(E[] inputArray){
        //Display array elements
        for (E element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create array of Integer , Double and Character
        Integer[] intArray = {1,2,34,5};
        Double[] doubleArray = {1.4,2.67,34.89,5.00};
        Character[] charArray = {'w', 'o', 'l'};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("doubleArray Array:");
        printArray(doubleArray);

        System.out.println("char Array:");
        printArray(charArray);
    }
}
