import java.util.logging.*;


public class LoggerWork {
    public static void setLogger(){
         Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassA" );
         Logger LOGGER2 = Logger.getLogger("org.stepic.java.logging.ClassB" );
         Logger LOGGER3 = Logger.getLogger("org.stepic.java" );
        LOGGER1.setLevel(Level.ALL);
        LOGGER2.setLevel(Level.WARNING);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        LOGGER3.addHandler(handler);
        LOGGER3.setUseParentHandlers(false); 
        
    }
        public static void main(String[] args) {
           
    }
 
    
}
