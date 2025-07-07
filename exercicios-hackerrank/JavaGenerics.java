public class JavaGenerics {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3};
        String[] s = {"Hello", "World"};

        Printer.printArray(n);
        Printer.printArray(s);
    }
}

class Printer {
    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}