public class ConsoleLogger implements Observable{

   public ConsoleLogger(){
      //if(message == State.Warn)
         //rootLevel = State.Warn;
   }

   String rootLevel = System.getProperty("Log root level");
   
   //State property = System.getProperty("wanted level");
   //if(property.equals("warning")
      //rootLevel = State.Warn;

   public void observe(Message message){
      //if(message.State >= rootLevel)
         System.out.println(message);
   }
}