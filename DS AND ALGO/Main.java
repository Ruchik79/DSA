import java.util.*;

public class Main{
    public  static void main(String[] args) {
    
        MyLL myLL=new MyLL();
       myLL.append(2);
        myLL.append(4);
        myLL.append(9);
        myLL.append(12);
        myLL.append(15);
        System.out.println(myLL);

       // myLL.removeFirst();
        //myLL.removelast();
        //myLL.insert(2, 7);
        myLL.reverse2();
        System.out.println("ruko");
        System.out.println(myLL);
        // ArrayList<Integer> arr=new ArrayList<>();

        // double startTime=System.currentTimeMillis();
        // for(int i=0;i<1000000;i++)
        //    arr.add(0, i);
        // double endTime=System.currentTimeMillis();
        // System.out.println("Time taken by ArryList => "+(endTime-startTime));

        //   startTime=System.currentTimeMillis();
        // for(int i=0;i<10000;i++)
        //    myLL.prepend(i);
        //  endTime=System.currentTimeMillis();
        // System.out.println("Time taken by LinkedList => "+(endTime-startTime));

    }


}