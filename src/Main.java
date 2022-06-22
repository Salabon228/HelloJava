public class Main {
    public static void main(String[] args) throws Exception {

        String text = Files.ReadFile("input.txt"); // считывает текст из файла

        Files.WriteFile(text); // записывает считанный текст в файл(название файла пока не изменяется)
    }
}