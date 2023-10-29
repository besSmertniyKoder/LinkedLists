import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      List<Integer> linkedList = new LinkedList<>();
      long startTime = System.currentTimeMillis();
      for(int i = 0; i < 1000000; i++){
          list.add(i);
      }
      long endTime = System.currentTimeMillis();
      long result = endTime - startTime;
        System.out.println("time to add in arrayList " + result );



        long startTimeLinkedLIst = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
        }
        long endTimeLinkedList = System.currentTimeMillis();
        long resultLinkedList = endTimeLinkedList - startTimeLinkedLIst;
        System.out.println("time to add in LinkedList " + resultLinkedList );

    }
}
