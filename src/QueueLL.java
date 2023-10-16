
import java.util.LinkedList;

public class QueueLL <T> {
    private LinkedList<T> list = new LinkedList<T>();
    public QueueLL(){
    }
    public T enqueue (T item){
    list.add(item);
        return item;
    }
    public T dequeue(){
       return list.remove(0);
    }
    public T peek(){
         return list.get(0);
    }
    public void display(){
        for( int i = 0 ; i <= list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public int size(){
       return list.size();
    }
    public boolean isEmpty(){
        return list.get(0)== null;
    }

}


/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */