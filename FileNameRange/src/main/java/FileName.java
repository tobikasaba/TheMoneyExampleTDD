import java.util.Arrays;
import java.util.List;

/**
 * FileName class checks the index of files and add the first and last index of the keywords before the file extension from
 * the files name to an array.
 */
public class FileName {


    public static String filePathLowerCase(String filePath) {
        return filePath.toLowerCase();
    }

    public static int keyWords(String filePath) {
        filePath = filePathLowerCase(filePath);
        List<String> keyWordsList = Arrays.asList("spec", "test", "step");
        return loopMethod(filePath, keyWordsList);
    }

    public static int separatorCharacters(String filePath) {
        filePath = filePathLowerCase(filePath);
        if (filePath.contains("-") || filePath.contains("_")) {
            List<String> separatorCharactersList = Arrays.asList("_", "-");
            return loopMethod(filePath, separatorCharactersList);
        } else {
            String[] subWords = filePath.split("\\.");
            return filePath.lastIndexOf("." + subWords[subWords.length - 2]);
        }
    }

    public static int loopMethod(String filePath, List<String> filePathString) {
        for (String i : filePathString) {
            if (filePath.contains(i)) {
                return filePath.lastIndexOf(i);
            }
        }
        return -1;
    }

    public static int lastSeparatorIndex(String filePath) {
        return separatorCharacters(filePath);
    }

    public Selection select(String filePath) {
        filePath = filePathLowerCase(filePath);
        int i = filePath.lastIndexOf(".");
        int keyWordsIndex = keyWords(filePath);
        int lastSlashIndex = filePath.lastIndexOf("/") + 1;

        if (filePath.contains("/")) {
            if (lastSeparatorIndex(filePath) > 0) {
                return Selection.of(lastSlashIndex, lastSeparatorIndex(filePath));
            }
            return Selection.of(lastSlashIndex, i);
        } else if (lastSeparatorIndex(filePath) > 0) {
            return Selection.of(0, lastSeparatorIndex(filePath));
        } else if (keyWordsIndex != -1) {
            return Selection.of(0, keyWordsIndex);
        }
        return Selection.of(0, i);
    }
}