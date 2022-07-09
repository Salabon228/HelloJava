package src;

import java.io.*;

public class Files {
    static String ReadFile(String file) throws Exception {
        FileReader fr = new FileReader(file);
        String res = "";
        int c;
        while(((c = fr.read()) != -1)){
            char ch = (char) c;
            if (ch == '\n') {
                res += ch;
            } else {
                res += ch;
            }
        }
        return res;
    }

    static void WriteFile(String text){
        try(FileWriter fw = new FileWriter("output.txt", false)) {
            for (int i = 0; i < text.length(); i++) {
                fw.write(text.charAt(i));
            }
        }
        catch (IOException ex) {
                System.out.println(ex.getMessage());
        }
    }
}
