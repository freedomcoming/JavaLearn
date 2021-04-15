import java.io.File;

public class FileUse {
    public static void main(String[] args) {
        File f = new File("..");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
    }
}
