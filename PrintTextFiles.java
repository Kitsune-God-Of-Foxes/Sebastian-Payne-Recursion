public class PrintTextFiles {
    // Complete this method. Print the path of every .txt file in folder
    // and all its subfolders. Use recursion. Print one path per line.
    public static void printTextFiles(String folder) {
        // This starter visits only the immediate items in ONE folder.
        String File = "";
        for (int i = 0; i < FileSystem.count(folder); i++) {
            String path = FileSystem.item(folder, i);
            if (FileSystem.isTextFile(path)){
            System.out.println(path);
            }
            if (FileSystem.isFolder(path)){
                File = FileSystem.item(folder,i);
                printTextFiles(File);
            }
        }
    }

    // Supplied launch code. You do not need to change or study String[] today.
    public static void main(String[] args) {
        printTextFiles(FileSystem.root());
    }
}
