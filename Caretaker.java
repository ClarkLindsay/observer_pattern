import java.util.*;

public class Caretaker{

   public ArrayList<Message> caretaker = new ArrayList<>();

   public ArrayList<Observable> observers = new ArrayList<>();
   
   public Caretaker(){
      this.observers = new ArrayList<>();
      this.observers.add(new ConsoleLogger());
   }
   
   public void add(Message message){
      caretaker.add(message);
      observers.parallelStream().forEach((observer) -> observer.observe(message));
   }
}