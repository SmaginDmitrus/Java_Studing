import java.util.*;

public class OddAndBackwards {
    
    public static void main(String[] args) {
        
        List<Integer> in = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            in.add(scanner.nextInt());
        }
        scanner.close();
    List<Integer> buffer = new ArrayList<>();

    for (int i =1;i<in.size();i+=2){
        buffer.add(in.get(i));
    }
    Collections.reverse(buffer);
    buffer.forEach(x -> System.out.print(x+" 1 2 "));
    System.out.flush();
    }
        }
    

