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
                for(int i=0;i < length; i++) {
                    down[i] = (byte)  (down[i]^5);
                }
                fileOut.write(down, 0, length);
            }
        } catch (IOException e) {
            throw new RuntimeException("Not Found File");
        } finally {
            if(fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    throw new RuntimeException("Output Error");
                }
            } if (fileIn != null) {
                try {
                    fileIn.close();
                } catch (IOException e) {
                    throw new RuntimeException("Input Error");
                }
            }
        }
    }
}
