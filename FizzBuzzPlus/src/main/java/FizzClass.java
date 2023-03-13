import java.util.ArrayList;
import java.util.List;

public class FizzClass {

    public FizzClass() {
    }


    public List<Integer> numberRange(int startNumber, int endNumber) {
        List<Integer> oneToHundred = new ArrayList<>();
        for (int i = startNumber; i < endNumber; i++) {
            oneToHundred.add(i);
        }
        return oneToHundred;
    }

}
