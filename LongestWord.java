import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) throws IOException {
        File file = new File("Input_01.txt");
        Scanner sc = new Scanner(file);
        List<String> list = new ArrayList<String>();
        while(sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
        Collections.sort(list,Comparator.comparing(String::length));
        System.out.println(list);
        System.out.println("Longest Compound Word: "+list.get(list.size()-1));
        System.out.println("Second Longest Compound Word: "+list.get(list.size()-2));
    }
}
