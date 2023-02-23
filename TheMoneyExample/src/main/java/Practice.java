import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Practice {

    interface Door {
        boolean isOpen();
    }

    interface Toggleable {
        void toggle();
    }

    // is-a Door to find out if it's opened or not.
// is-a Toggleable so we can change whether the Door is open
    public class WoodenDoor implements Door, Toggleable {

        // has a boolean flag to state if the door is open
        public boolean isOpened = false;

        @Override
        public boolean isOpen() {
            return this.isOpened;
        }

        @Override
        public void toggle() {
            this.isOpened = !this.isOpened;
        }


    }

    public class DoorTest {

        @Test
        public void verifyOpened() {
            WoodenDoor woodenDoor = new WoodenDoor();
            boolean isDoorOpened = woodenDoor.isOpened;
            boolean isDoorOpenedTwo = woodenDoor.isOpen();

            woodenDoor.toggle();
            boolean isDoorOpenedThree = woodenDoor.isOpen();

            Assertions.assertFalse(isDoorOpened);
            Assertions.assertFalse(isDoorOpenedTwo);

            Assertions.assertTrue(isDoorOpenedThree);
        }
    }
}
