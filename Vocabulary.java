import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vocabulary {

    
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
              String strTest1 = "Мама мыла-мыла-мыла раму!";

        String strTest2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";

        BufferedReader bf = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(strTest2.getBytes()),

                StandardCharsets.UTF_8));
              Map<String, Long> resultMap = bf.lines()
                .map(line -> line.toLowerCase())
                .map(line -> line.replaceAll("[^a-zA-Z\u0430-\u044F\u0410-\u042F0-9']+"," "))
                .flatMap(words -> Arrays.stream(words.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));      
                    System.out.println(resultMap);
        } catch (IOException e) {
        }

    }
}
