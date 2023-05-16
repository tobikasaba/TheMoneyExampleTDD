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
        List<String> keyWordsList = Arrays.asList("spec", "test", "step");
        return loopMethod(filePath, keyWordsList);
    }

    public static int separatorCharacters(String filePath) {
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

    private static Selection getFileName(String filePath) {
        int i = filePath.lastIndexOf(".");
        int keyWordsIndex = keyWords(filePath);
        int lastSlashIndex = filePath.lastIndexOf("/") + 1;
        int lastSeparatorIndex = separatorCharacters(filePath);

        if (filePath.contains("/")) {
            if (lastSeparatorIndex > 0) {
                return Selection.of(lastSlashIndex, lastSeparatorIndex);
            }
            return Selection.of(lastSlashIndex, i);
        } else if (lastSeparatorIndex > 0) {
            return Selection.of(0, lastSeparatorIndex);
        } else if (keyWordsIndex != -1) {
            return Selection.of(0, keyWordsIndex);
        }
        return Selection.of(0, i);
    }

    public Selection select(String filePath) {
        filePath = filePathLowerCase(filePath);

        if (!filePath.contains(".")) {
            return Selection.of(0, filePath.length());
        } else {
            return getFileName(filePath);
        }
    }
}