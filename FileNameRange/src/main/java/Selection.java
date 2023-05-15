import java.util.Objects;

public class Selection {
    private final int begin;
    private final int end;

    private Selection(int begin, int end) {
        this.begin = begin;
        this.end = end;

    }

    @Override
    public String toString() {
        return "Selection{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }



    public static Selection of(int begin, int end) {
        return new Selection(begin, end);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Selection selection = (Selection) o;
        return begin == selection.begin && end == selection.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end);
    }
}
