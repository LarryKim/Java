import java.util.ArrayList;

public class Stack<T>{
  private ArrayList<T> list;
  private int stackPoint;

  public Stack() {
     // initialize
     list = new ArrayList<T>();
     stackPoint = -1;
  }

  public void push(T elem) {
    list.add(elem);
    stackPoint++;
  }

  public T pop() {
    T elem = null;
    if(!empty()) {
      elem = list.get(stackPoint);
      list.remove(stackPoint);
      stackPoint--;
    }
    return elem;
  }

  public T peek() {
    T elem = null;
    if(!empty()) {
      elem = list.get(stackPoint);
    }
    return elem;
  }

  public Boolean empty() {
    return (stackPoint >= 0) ? false : true;
  }

  public int search(T elem) {
    int rtn = list.indexOf(elem);
    if(rtn >= 0) {
      rtn++;
    }
    return rtn;
  }

  public String toString() {
    StringBuilder rtn = new StringBuilder();
    rtn.append("[");
    for(T elem : list) {
      rtn.append(elem.toString() + ",");
    }
    rtn = rtn.replace(rtn.length()-1, rtn.length(), "]");

    return rtn.toString();
  }

  public static void main(String[] args) {
    Stack<String> t = new Stack<String> ();
    //System.out.println(t.toString());
    t.push("a");
    t.push("b");
    t.push("c");
    System.out.println(t.toString());
    String popNum = t.pop();
    System.out.println(popNum);
    t.push("d");
    t.push("e"); 
    System.out.println(t.toString());
    popNum = t.pop();
    System.out.println(popNum);
    popNum = t.pop();
    System.out.println(popNum); 
    popNum = t.pop();
    System.out.println(popNum);
    popNum = t.pop();
    System.out.println(popNum);
    //popNum = t.pop();
    //System.out.println(popNum);
    t.push("f");
    t.push("g"); 
    System.out.println(t.toString());
    System.out.println(t.search(t.peek()));    
  }
}