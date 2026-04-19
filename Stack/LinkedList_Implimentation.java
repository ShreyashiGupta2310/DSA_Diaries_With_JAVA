package Stack;



public class LinkedList_Implimentation {
   static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;  
            // we have initialized next with null
            }
   
    }
    static class stack{
       public static  Node head=null;


       public static boolean isEmpty(){
        // as if head is null that means list is empty so return true(as the head==null condition will be fullfilled) otherwise false will be returned
        return head==null;
       }

       public  void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;

        }

        newNode.next=head;
        head=newNode;

        
       }


    //    public static Node  pop(){

    //     if(isEmpty()){
    //         return;
    //     }
    //     Node top=head;
    //     head=head.next;
    //      return top;
    //    }


     public int pop(){

        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
         return top;
       }



        public static int peek(){
            if(isEmpty()){
                return -1;
            }
        return head.data;
    }
    }



   
public static void main(String args[]){
stack list= new stack();
list.push(3);
list.push(2);
list.push(1);
while(!list.isEmpty()){
    System.out.println(list.peek());
    System.out.println(list.pop());
}

}

    }
