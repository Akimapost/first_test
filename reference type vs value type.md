```java
//reference type vs value type

public class Main {
    public static void main(String[] args) {
        int number = 20;
        number = changeNumber(number);
        System.out.println(number);
        
        int numberVoid = 20;
        changeNumberVoid(numberVoid);
        System.out.println(numberVoid);
    }

    public static int changeNumber(int number){
        number = 55;
        return number;
    }

    public static void changeNumberVoid(int number){
        number = 55; //THIS NUMBER WILL NOT CHANGE THE numberVoid value
    }
}
```
```java
public class Main {
    public static void main(String[] args) { // Main method
        int[] array = { 1, 2, 3, 4, 5 }; // 1. declare an array
        array = changeArray(array); // 2. change the content of the array
        printOutArray(array); // 3. print out the values of the array

        int[] arrayVoid = { 1, 2, 3, 4, 5 }; // 4
        changeArrayVoid(arrayVoid); // 5
        printOutArray(arrayVoid); //6
    }

    public static int[] changeArray(int[] array) { // 2
        for (int i = 0; i < array.length; i++) { // 2.1.
            array[i] = 0; // 2.2
        } // 2.3
        return array; // 2.4
    }

    public static void changeArrayVoid(int[] array) { //5
        for (int i = 0; i < array.length; i++) { // 5.1
            array[i] = 1; // 5.2
        }// 5.3
    }

    public static void printOutArray(int[] array) { // 3 // 6
        for (int i = 0; i < array.length; i++) { // 3.1 //6.1
            System.out.println(array[i]);// 3.2 // 6.2
        } // 3.3 // 6.3
    }
}
```
```java

public class Main {
    public static void main(String[] args) { // Main method
        int[] arrayVoid = { 1, 2, 3, 4, 5 }; 

        int[] array = arrayVoid;
        array[0] = 100;
        
        printOutArray(arrayVoid);
    }

    public static void printOutArray(int[] array) { 
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

// Reference type
```







