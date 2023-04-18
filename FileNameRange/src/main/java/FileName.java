import java.util.Arrays;
import java.util.Scanner;

public class FileName {

    public FileName() {
    }

    private static Scanner inputFile = new Scanner(System.in);

    public int firstIndex(String file) {
        return 0;
    }

    public int secondIndex(String file) {
        char[] ch = file.toCharArray();
        int i;
        for (i = 0; i < ch.length; i++) {
            if (i == file.indexOf(".")) {
                break;
            }
        }
        return i;
    }

    public String addIndexToArray() {
        int[] indexArray = {firstIndex("hiker.cpp"), secondIndex("hiker.cpp")};
        return Arrays.toString(indexArray);
    }

    public int specialIndex(String file) {
        return 5;
    }
}
