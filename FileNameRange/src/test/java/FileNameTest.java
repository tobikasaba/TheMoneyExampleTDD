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
    }

    @Test
    void acceptsJustFileName() {
        assertEquals(Selection.of(0, 5), fileName.select("hiker"));
    }

    @Test
    void removesSpecAndExtension() {
        assertEquals(Selection.of(0, 7), fileName.select("DiamondSpec.kt"));
    }

    @Test
    void removesTestAndExtension() {
        assertEquals(Selection.of(0, 7), fileName.select("DiamondTest.kt"));
    }

    @Test
    void removesTestsAndExtension() {
        assertEquals(Selection.of(0, 7), fileName.select("DiamondTests.kt"));
    }

    @Test
    void removesStepAndExtension() {
        assertEquals(Selection.of(0, 7), fileName.select("DiamondStep.kt"));
    }

    @Test
    void removesDirectoryAndExtension() {
        assertEquals(Selection.of(12, 17), fileName.select("wibble/test/hiker.rb"));
    }

    @Test
    void removesUnderscoredSuffixAndExtension() {
        assertEquals(Selection.of(0, 5), fileName.select("hiker_Tests.rb"));

    }

    @Test
    void removesHyphenatedSuffixAndExtension() {
        assertEquals(Selection.of(0, 5), fileName.select("hiker-Tests.rb"));

    }

    /**
     * For file names including multiple "." characters
     */
    @Test
    void removesDoubleBarrelledExtension() {
        assertEquals(Selection.of(0, 5), fileName.select("hiker.Tests.rb"));

    }

    @Test
    void removesDirectoryUnderscoredSuffixAndExtension() {
        assertEquals(Selection.of(12, 17), fileName.select("wibble/test/hiker_spec.rb"));
    }
}
