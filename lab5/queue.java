
interface QueueImpl{
     void insert(int n) throws QueueOverflow;
     void delete() throws QueueUnderflow;
     int no();

}
class QueueUnderflow extends Exception{
   QueueUnderflow(String s){
      super(s);
   };
}
class QueueOverflow extends Exception{
   QueueOverflow(String s){
      super(s);
   };
}
class QueueDemo implements QueueImpl{
    int arr[]=new int[10];
    int front=-1;
    int rear=-1;
    int size=0;
    @Override
   public void insert(int n)throws QueueOverflow {
       if(size==10){
        throw new QueueOverflow("Stack overflow");
     }
     else if(front==-1){
        rear=front=0;
        size++;
        arr[rear]=n;
        System.out.println("Inserted: "+ n);
     }
     else{
      rear=(rear+1)%10;
      arr[rear]=n;
      size++;
      System.out.println("Inserted: "+ n);
     }
   }
   @Override
   public void delete ()throws QueueUnderflow{
      if(size==0){
        throw new QueueUnderflow("Stack underflow");
     }
      else if(front==rear){
        int x= arr[front];
        rear=front=-1;
        size--;
        System.out.println("Deleted: "+ x);
     }
     else{
      int x= arr[front];
      front=(front+1)%10;
      size--;
      System.out.println("Deleted: "+ x);
     }
   }
   @Override
   public int no(){
   return size;
   }
}
public class queue{
    public static void main(String[] args) {
        QueueDemo q= new QueueDemo();
      try{
                 q.insert(1);
        q.insert(3);
        q.insert(2);
        q.insert(6);
        q.insert(9);
        q.insert(7);
        q.insert(4);
        q.insert(15);
        q.insert(17);
        q.insert(15);
        System.out.println("No of element: "+ q.no());
        q.insert(1);
      }
      catch(QueueOverflow ex){
         ex.printStackTrace();
      }
      try{
              q.delete();
      q.delete();
      q.delete();
      q.delete();
      q.delete();
      q.delete();
      q.delete();
      q.delete();
      q.delete();
      q.delete();
      System.out.println("No of element: "+ q.no());
      q.delete();
      }
      catch(QueueUnderflow ex){
        ex.printStackTrace();
      }
    }
}