import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int ab = Integer.parseInt(in.nextLine().replaceAll("\\D", ""));
        System.out.println("Вы ввели: " + ab);
    }
}
