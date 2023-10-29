public class Task4 {
    private int[] stackArray;
    private int size;

    public Task4(int capacity){
        stackArray = new int[capacity];
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean empty(){
        return size == 0;
    }
    public void push(int item){
        if (size < stackArray.length){
            stackArray[size++] = item;
        }
    }
    public int peek(){
        return stackArray[size - 1];
    }
    public int pop(){
        return stackArray[--size];
    }

    public static void main(String[] args) {
        Task4 task4 = new Task4(40);
        task4.push(5);
        System.out.println(task4.size());
        System.out.println(task4.peek());
        System.out.println(task4.pop());
    }
}
