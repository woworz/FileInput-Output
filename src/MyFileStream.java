import java.io.*;

public class MyFileStream {
    public void fileCopy() {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        try {
            fileIn = new FileInputStream("D:\\OneDrive\\图片\\壁纸\\cool (1).jpg");
            fileOut = new FileOutputStream("test2-out.jpg");
            byte[] down = new byte[40];
            int length;
            while ((length = fileIn.read(down)) != -1) {

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Not Found File");
        }
    }
}
