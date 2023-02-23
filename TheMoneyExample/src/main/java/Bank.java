import java.util.Hashtable;
import java.util.Objects;

public class Bank {

    //    here source is of type Expression, that is, it's an instance of expression so can call
//    methods/constructor in expression
    Money reduce(Expression source, String to) {
//        if (source instanceof Money){
//            return (Money) source.reduce(to);
//        }
//        Sum sum = (Sum) source;
        return source.reduce(this, to);
//        int amount = sum.augend.amount + sum.addend.amount;
//        return new Money(amount, to);
//        return Money.dollar(10);
    }

    public static class Pair {
        private String from;
        private String to;


//        constructor used to define the two currencies labelled for conversion
        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

//        public boolean equals(Object object) {
//            Pair pair = (Pair) object;
//            return from.equals(pair.from) && to.equals(pair.to);
//        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Objects.equals(from, pair.from) && Objects.equals(to, pair.to);
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }
    }

//    hashtable are kind of like dictionaries in python
//    creating a new hashtable object called rates.
    private final Hashtable rates = new Hashtable();
//    private final Hashtable<Pair, Integer> rates = new Hashtable<>();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }


    int rate(String from, String to) {
        Integer rate = (Integer) rates.get(new Pair(from, to));
        if(Objects.equals(from, to)) {
            return 1;
        }else {
            return rate;
        }
    }
}
