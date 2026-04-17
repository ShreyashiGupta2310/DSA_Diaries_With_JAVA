package Stack;
import java.util.ArrayList;
public class ArrayList_Implimentation {
    static ArrayList<Integer> List = new ArrayList<>();
    public static boolean isEmpty(){
        if(List.size()==0){
        return true;
        }
        return false;
    }

    //push 
    public static void push(int data){
        List.add(data);
    }

    //pop
     public static int pop(){
        int top=List.get(List.size()-1);
        List.remove(List.size()-1);
        return top;
        
    }
//peek
     public static int peek(){
        return List.get(List.size()-1);
    }

  
    public static void main(String args[]){
ArrayList_Implimentation stack=new ArrayList_Implimentation();

stack.push(1);
stack.push(5);
stack.push(4);
while(!stack.isEmpty()){
System.out.println(stack.peek());
stack.pop();
}

    }
    
}
