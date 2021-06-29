package No2;
public class AntrianApp {
public static void main(String[] args){
                No1 antrian = new No1(10);
                antrian.enqueue(9);
                antrian.display();
                antrian.enqueue(8);
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.peek());
                antrian.display();
                antrian.enqueue(7);
                antrian.display();
                antrian.display();
                antrian.enqueue(6);
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.dequeue());
}        
    
}
