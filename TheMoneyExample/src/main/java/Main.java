/*
class Dollar extends Money {

    //    static Money dollar (int amount) {
//        return new Money(amount, "USD");
//    }
    //class constructor
    Dollar(int amount, String currency) {
//        "this" is used to differentiate between class parameters and attribute
//        here "this" is used to specify the attribute "amount" not the parameter
//        this.amount = amount;
//        this.currency = currency;
        super(amount, currency);
//        super.amount = amount;

    }





//    public boolean equals (Object object) {
//        Dollar dollar = (Dollar) object;
//        return amount == dollar.amount;
//    }

}
*/




















/*
    @Override
    public boolean equals(Object o) {
//        checks the reference between two objects
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
//        o isn't a member of the dollar class hence it cant access amount
//        typecasting o makes it accessible
        Dollar dollar = (Dollar) o;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
*/

/*
    public boolean equals (Object object) {

//    (Dollar) is typecasting to make object an instance of the dollar class and
//    it has been assigned the variable dollar (an "object" of the dollar class)
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
*/