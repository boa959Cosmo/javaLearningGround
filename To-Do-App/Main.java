import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        Scanner readInput = new Scanner(System.in);
        toDoList.add("dumme siech");
        toDoList.add("duesch nid !");
        while (true) {
            System.out.println("Gday Sir!\n");
            System.out.println("list(l), add(a), remove(r), exit(e)");
            String input = readInput.nextLine();
            switch(input) {
                case "l":
                    list(toDoList);
                case "a":
                    break;
                case "r":
                    break;
                case "e":
                    break;
                default:
                    break;

            }
        }
    }

    public static void list(ArrayList toDoList) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(toDoList.get(i) + " -> " + i);
        }
        System.out.println("\n\n");
    }


}