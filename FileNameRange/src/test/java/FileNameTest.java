//word keeps that has any of:
// tests
// test
// spec
// step
// _
// -
// .
// if the file name is in a directory, keep the file name


import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class FileNameTest {
    FileName fileName = new FileName();

    @Test
    void selectFileNameWithoutExtension() {
        assertEquals(Selection.of(0, 5), fileName.select("hiker.cpp"));
        System.out.println(fileName.select("hiker.cpp"));
    }

    @Test
    void selectFileNameWithNoExtension() {
        assertEquals(Selection.of(0,7),fileName.select("DiamondSpec.kt"));
        System.out.println(fileName.select("DiamondSpec.kt"));
    }

    @Test
    void selectFileNameIfInADirectory(){
        assertEquals(Selection.of(12,17),fileName.select("wibble/test/hiker.rb"));
        System.out.println(fileName.select("wibble/test/hiker.rb"));
    }

    @Test
    void selectFileNameIfFilePathIncludesSpecialCharacterThatIsUnderscore(){
        assertEquals(Selection.of(0,5),fileName.select("hiker_Tests.rb"));

    }

    @Test
    void selectFileNameIfFilePathIncludesSpecialCharacterThatIsHyphen(){
        assertEquals(Selection.of(0,5),fileName.select("hiker-Tests.rb"));

    }

    @Test
    void selectFileNameIfFilePathIncludesSpecialCharacterThatIsFullStop(){
        assertEquals(Selection.of(0,5),fileName.select("hiker.Tests.rb"));

    }



//    @Test
//    void selectFileNameIfInADirectoryAndIncludesKeyWords(){
//        assertEquals(Selection.of);
//    }
}
