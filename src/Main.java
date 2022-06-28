import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Logger.Hate();   в отдельном классе описан Логгер
        ArrayList<Integer> li =  new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
           li.add(i);
        }
        li.add(3,777);
        System.out.println(li.remove(3)); // 777
        System.out.println(li); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}