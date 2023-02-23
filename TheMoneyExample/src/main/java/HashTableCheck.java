import java.util.Hashtable;

public class HashTableCheck {

    public static void main(String[] args) {
        hashTable();
    }

    public static void hashTable(){
        Hashtable table1 = new Hashtable();

        table1.put(new Bank.Pair("usd", "Naira"), 3);
        table1.put("Toy", 3);
//        table1.get("usd");

        System.out.println(table1.put(new Bank.Pair("usd", "Naira"), 6));
        System.out.println(table1);
//        return false;
    }
}
