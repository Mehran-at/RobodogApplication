import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        readDocument(fileReader);
    }
    private static void readDocument(FileReader fileReader) {
        List<String> lines = fileReader.getLines("robodog.txt");
        for (String line : lines) {
//            System.out.println(line);
        }
        Set<String> lineALl = new HashSet<>();
            for (String line : lineALl) {
                line.replaceAll("!", "");
                lineALl.add(line);
            }
        System.out.println(lineALl);
    }
}
