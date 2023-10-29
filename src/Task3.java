import java.util.ArrayDeque;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,4,6,5,7,79,0,9,5,8,4,8,4};
        addToQueue(array);
        addToStack(array);

    }
    public static void addToStack(int[] ints){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ints.length; i++){
            stack.push(ints[i]);
        }
        System.out.println(stack);


    }

    public static void addToQueue(int[] ints){
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < ints.length; i++){
            arrayDeque.push(ints[i]);
        }
        System.out.println(arrayDeque);
    }

}
