class Money implements Expression {

    //member variables
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    //"Bank bank" simply means whatever variable that is passed here
    // needs to be of type money
//    similar can be said for the expression plus. this means
//    that whatever is passed needs to be passed in plus needs to be of type
//    Money class
    public Money reduce(Bank bank, String to) {
        int rate = (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;
        return new Money(amount / rate, to);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
//        here amount signifies the amount from the object that calls this method
//        addend.amount signifies the amount from the addend i.e the object passed
//        in plus
//        int rate = (addend.currency.equals("CHF") && currency.equals("USD")) ? 2 :
//                (currency.equals("CHF") && addend.currency.equals("USD")) ? (1/2) : 1;

//        System.out.println("amount" +amount +"addend amount"+ addend.amount + "currency "+ currency);
//        return new Money(amount + (addend.amount), currency);
//        return new Money(amount + (addend.amount/rate), currency);
    }


    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }


    public String toString() {
        return amount + " " + currency;
    }


    public boolean equals(Object object) {
        Money money = (Money) object; //method variable
        return amount == money.amount && currency.equals(money.currency);
    }

    //    factory method. This method returns a new instance(object of the class)
//    static method. can be called directly using the class
//    i.e without creating an instance of the class first
    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    //    factory method. This method returns a new instance(object of the class)
//    static method. can be called directly using the class
//    i.e without creating an instance of the class first
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

}
