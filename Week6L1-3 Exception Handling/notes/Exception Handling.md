### 1. ArithmeticException (Division by Zero)
### Before ArithmeticException Handling (Division by Zero)
public class ArithmeticBefore {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
    }
}
### After ArithmeticException Handling (Division by Zero)
public class ArithmeticAfter {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            e.printStackTrace();
        }
    }
}
### 2. ArrayIndexOutOfBoundsException (Invalid Index)
### Before ArrayIndexOutOfBoundsException Handling
public class ArrayBefore {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // Will crash due to invalid index
    }
}
### After ArrayIndexOutOfBoundsException Handling
public class ArrayAfter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
            e.printStackTrace();
        }
    }
}
### 3. NullPointerException (Null Reference)
### Before NullPointerException Handling (Null Reference)
public class NullBefore {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.length()); // Will crash due to null reference
    }
}
### After NullPointerException Handling (Null Reference)
public class NullAfter {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null reference detected!");
            e.printStackTrace();
        }
    }
}


### 4. IOException with try-with-resources
### Before IOException Handling
import java.io.BufferedReader;
import java.io.FileReader;

public class FileBefore {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
        String line = reader.readLine(); // Will crash if file doesn't exist
        System.out.println(line);
        reader.close();
    }
}

### After IOException Handling
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAfter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error: File could not be read!");
            e.printStackTrace();
        }
    }
}

### 5. Custom Exception Handling
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
### Before Custom Exception Handling
public class CustomBefore {
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Error: Age must be 18 or older!"); // No proper exception handling
            return;
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}

### After Custom Exception Handling

public class CustomAfter {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older!");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

### 6. Multi-Catch and Finally Block
### Before Multi-Catch and Finally Block
public class MultiBefore {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int result = arr[5] / 0; // Will crash due to multiple potential exceptions
        System.out.println("Result: " + result);
    }
}
### After Multi-Catch and Finally Block

public class MultiAfter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int result = arr[5] / 0;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

### 7. Exception Propagation
### Before Exception Propagation
public class PropagationBefore {
    public static void method2() {
        int result = 10 / 0; // Will crash
    }

    public static void method1() {
        method2();
    }

    public static void main(String[] args) {
        method1();
    }
}

### After Exception Propagation

public class PropagationAfter {
    public static void method2() throws ArithmeticException {
        int result = 10 / 0;
    }

    public static void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Error in method1: " + e.getMessage());
            throw e; // Re-throw to demonstrate propagation
        }
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Error in main: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

# Chained Exceptions