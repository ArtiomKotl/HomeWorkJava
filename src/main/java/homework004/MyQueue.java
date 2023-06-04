package homework004;

import java.util.LinkedList;
public class MyQueue {
    LinkedList<Integer> myQueueList = new LinkedList<>();

    public void enqueue(int element) {
        myQueueList.addLast(element);
    }

    public int dequeue() {
        if (!myQueueList.isEmpty()) {
            return myQueueList.pollFirst();
        } else {
            throw new RuntimeException("Queue is empty.");
        }
    }

    public int first() {
        if (!myQueueList.isEmpty()) {
            return myQueueList.peekFirst();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }


    public void print() {
        System.out.println(myQueueList);
    }

}

