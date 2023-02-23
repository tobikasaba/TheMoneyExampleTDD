interface Expression{

//        this is of type money meaning whenever called/implemented has to return
//        an instance of Money
    Money reduce (Bank bank, String to);

    Expression plus (Expression addend);

    Expression times (int multiplier);
}