import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class WalletTest {

//    member variable / attributes
    Wallet wallet = new Wallet(new ArrayList<>());

    @Test
    void createWallet() {
//        local variable
        Assertions.assertNotNull(wallet);
    }

//    @Test
//    void walletsWithDiffContentsNotEqual() {
//        Dollar dollar = new Dollar(6);
//        ArrayList<Money> mullah = new ArrayList<>();
//        mullah.add(dollar);
//        Wallet secondWallet = new Wallet(mullah);
//        Assertions.assertNotEquals(wallet, secondWallet);
//    }



}
