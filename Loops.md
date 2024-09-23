
```java
//WHILE

public class Main {
  public static void main(String[] args) {

int amountOfTimesToDuck = 10;
    while (amountOfTimesToDuck !=0) { //do action
      System.out.println("Duck");
      amountOfTimesToDuck = amountOfTimesToDuck -1;
      
    }
   
  }
}
```
```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int amountOfTimesToDuck = 10;
    //10 != 0
    //9 != 0
    //8 != 0
    //7 != 0
    //...
    //0 != 0
    while (amountOfTimesToDuck != 0) {
      System.out.println(amountOfTimesToDuck);
      amountOfTimesToDuck = amountOfTimesToDuck - 1;
    }

  }
}
```
```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 0;
    //counts from 0 to 10
    while (i < 10) {
      System.out.println(i);
      i = i+1;
    }

  }
}
```

```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 1; // first number is always 1
    boolean isEven = false;  // first number if always odd
    //counts from 0 to 10
    while (i <= 10) {
      String result = "";
      
      if (isEven == true) {
      result = "even";
      } else {
      result = "odd";
      }
        
      System.out.println(i+ "" + result);
      i = i+1;
      isEven = !isEven;
    }

  }
}
```

```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 1; // 1
          //1 <= 10 -> TRUE
          //2 <= 10 -> TRUE
          //3 <= 10 -> TRUE
          //...
          //11 <= 10 -> FALSE
    while (i <= 10) {
      String result = ""; // Result
      if (i % 2 == 0) { //Odd or even
        result = "even";
      } else {
        result = "odd";
      }
                        //1 odd
                        //2 even
      System.out.println(i + " " + result);
      i = i + 1; // i = i + 1;
      //i = 1 + 1;
      //i = 2 + 1;
      //i = 3 + 1;
    }
  }
}
```
```java
//FOR

public class Main {
  public static void main(String[] args) {
 
    for (int i = 1; i <= 10; i = i + 1) { // We do action before first cycle; condition for cycle; action after every cycle
      System.out.println(i);
    }
  }
}
```

```java

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Opening a channel for user input
    int number = scanner.nextInt(); // Waiting for a number

    String result = ""; // an empty string
                    // 1 <= 5
    for (int i = 1; i <= number; i++) { // We do action before first cycle; condition for cycle; action after every cycle
      result = result + "_";
      System.out.println(result);
    }

    scanner.close();
  }
}
```

1. Develop a program in java, that iterates through numbers from 0 till X amount of times (X is user provided) using Modular operator.
For numbers that are divided by 3: print out "Wo" .
For numbers that are divided by 5: print out "Tech". 
For numbers divided by 3 and 5: print out "WoTech".
(i % 3 == 0 && i % 5 == 0)
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the whole number: ");
        int iterations = scanner.nextInt(); 

        for (int i = 1; i < iterations; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("WoTech");
            }
            else if (i % 3 == 0) {
                System.out.println("Wo");
            }
            else if (i % 5 == 0) {
                System.out.println("Tech");
            }
            else {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
```
 var2
 ```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");

    int number = scanner.nextInt(); //15

    for(int i = 1; i <= number; i++){
      // 1 2 3 4 5 ... 15
      String result = "";
      if (i % 3 == 0){ // 3 6 9 12 15
        result += "Wo";
      } 
      if (i % 5 == 0){ // 5 10 15
        result += "Tech";
      } 
      if(result.equals("")){ //if result is empty = 'result == "" '
        result = String.valueOf(i); //Then result = i (number)
      }
      System.out.println(result);

      scanner.close();
    }
  }
}
```

2. User provides a text, and then the program puts it in a square (===== |)

for example, if user provides "WoTech".

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        int textLength = 0; 
        for (int i = 0; i < text.length(); i++) { // text.length() counting the number of characters in the 'text' string
            textLength++; 
        }
        // Determine the length of the square's sides
        int sideLength = textLength + 4; // 2 spaces on each side of the text
        // Print the top of the square
        System.out.println("=".repeat(sideLength));
        // Print the middle rows of the square
        int middleRowIndex = (sideLength - 3) / 2; // The text will be centred vertically within the square frame, regardless of the length of the text or the size of the square.
        for (int i = 0; i < sideLength - 2; i++) {
            if (i == middleRowIndex) {
                // Print the row containing the text
                int leftSpaces = (sideLength - textLength - 2) / 2;
                int rightSpaces = sideLength - textLength - 2 - leftSpaces;
                System.out.println("|" + " ".repeat(leftSpaces) + text + " ".repeat(rightSpaces) + "|");
            } else {
                // Print empty row
                System.out.println("|" + " ".repeat(sideLength - 2) + "|");
            }
        }
        // Print the bottom border of the square
        System.out.println("=".repeat(sideLength));

        scanner.close();
    }
}
```


