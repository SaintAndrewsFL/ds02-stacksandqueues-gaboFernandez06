import java.util.LinkedList;

public class StackLL <T> {
    private LinkedList<T> list = new LinkedList<T>();
    private LinkedList<T> list2 = new LinkedList<T>();
    public StackLL(){

    }
    public T push ( T item){
        list.add(0,item);
        return item;
    }
    public T pop (){
     return  list.remove(0);
    }
    public T peek(){
       return  list.get(0);
    }
    public void display(){
        for ( int i = 0 ; i < list.size();i++) {
            list2.add(list.get(0));
            list.pop();
        }
        list = list2;
        System.out.println(list2);
    }
    public int size(){
      return  list.size();
    }
    public boolean isEmpty(){
 return  list.get(0)==null ;

    }
}
/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */