public class MyLL {

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    Node head;
    Node tail;
    int length = 0;

    public void append(int x) {
        Node newNode = new Node(x);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int x) {
        Node newNode = new Node(x);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public boolean removeFirst() { 
        boolean deleted= false ;
        if (length !=0){
        Node temp =head.next;
        head.next= null;
        head = temp;
        length--;
        deleted= true;
        }
        return deleted;
    
    }

    public void removelast() {  
        //System.out.println(length);
        int n=length;
        Node temp=head;
        if (length==0)
        {
            head=null;
            return;
        }
        else if (length==1)
        {
            head=null;
            return;
        }
        else{
        while(n!=2 && length>1 ){
            temp=temp.next;
            n--; 
       }
       
        tail=temp;
        tail.next=null;}
        length--;
        return;
    }

    public void insert(int pos, int element) { 
        
        if(pos<0 || pos >length ){
            System.out.println("Please enter a valid value");
            return;
        }
        Node newNode = new Node(element);
        int n=0;
        Node temp=head;
        if (pos==0)
            prepend(element);
        else if (pos==length)
           append(element);
        else{
        while(n<length){
            temp=temp.next;
            
            if(n==(pos-2))
            {
            Node oldnodes=temp.next;
            temp.next=newNode;
            newNode.next=oldnodes;
            return;
            }
            
            n++;
       }
    }
        
    }
    

    //reverse
    public void reverse() { 
        Node prev=head;
        Node after=head.next;
        Node temp=head;

        while(after!=null){
            System.out.println("Before any operation i) prev.value: "+ prev.value +" temp.value: "+temp.value+" after.value : "+ after.value );
            temp=prev.next;
            System.out.println(after.value);
            after=temp.next;
            temp.next=prev;
            prev.next=null;
            prev=temp;
            System.out.println("After all operation i) prev.value: "+ prev.value +" temp.value: "+temp.value+" after.value : "+ after.value );
        }
        head=prev;

    }
   






    public String toString() {
        String result = "";
        Node temp = head;
        while (temp != null) {
            result += temp.value;
                    //System.out.println(result);
            if (temp.next != null)
                result += " --> ";
            temp = temp.next;
        }
        return result;
    }

}
