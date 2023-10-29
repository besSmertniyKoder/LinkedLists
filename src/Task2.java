import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList =new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("please enter line ");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            String[] parts = input.split("~");
            if (parts.length != 2){
                System.out.println("wrong format!");
                continue;
            }
            String commmand = parts[0];
            int position = Integer.parseInt(parts[1]);
            if (commmand.equals("text")){
                System.out.println("enter text ");
               String text = scanner.nextLine();
                linkedList.add(position, text);
                System.out.println("text added");
            } else if (commmand.equals("print")) {
                if (position >= 0 && position < linkedList.size()){
                    String text = linkedList.remove(position);
                    System.out.println("here is text: " + text);
                } else {
                    System.out.println("wrong position");
                }
                
            } else {
                System.out.println("wrong command");
            }
        }
        scanner.close();
    }
}
