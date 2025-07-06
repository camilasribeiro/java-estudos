import java.util.Scanner;

class JavaRegex {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String pattern =
            "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
}