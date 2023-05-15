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
        if (filePath.contains("spec")) {
            return filePath.lastIndexOf("spec");
        } else if (filePath.contains("test")) {
            return filePath.lastIndexOf("test");
        } else {
            return filePath.lastIndexOf("step");
        }
    }

    public static int separatorCharacters(String filePath) {
        filePath = filePathLowerCase(filePath);
        if (filePath.contains("-")) {
            return filePath.lastIndexOf("-");
        } else if(filePath.contains("_")){
            return filePath.lastIndexOf("_");
        }else{
            String[] subWords = filePath.split("\\.");
            return filePath.lastIndexOf("." + subWords[subWords.length - 2]);
        }
    }

    public Selection select(String filePath) {
        filePath = filePathLowerCase(filePath);
        int i = filePath.lastIndexOf(".");
        int keyWordsIndex = keyWords(filePath);
        int lastSlashIndex = filePath.lastIndexOf("/") + 1;
        int lastSeparatorIndex = separatorCharacters(filePath);

        if (filePath.contains("/")) {
            return Selection.of(lastSlashIndex, i);
        } else if (lastSeparatorIndex > 0) {
            return Selection.of(0, lastSeparatorIndex);
        } else if (keyWordsIndex != -1) {
            return Selection.of(0, keyWordsIndex);
        }
        return Selection.of(0, i);
    }
}