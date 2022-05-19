import java.io.*;

public class MyFile {
    public void fileCopy() {
        /*
        * FileReader从文本类读
        * FileWriter从文本类写
         */
        FileReader fReader = null;
        FileWriter fWriter = null;
        try {
            //创建File对象，指出读入和写出的文件
            File srcFile = new File("D:\\OneDrive\\Code\\Java\\Class4\\test1-read.txt");
            File destFile = new File("test1-writer.txt");
            //创建输入流&输出流
            fReader = new FileReader(srcFile);
            fWriter = new FileWriter(destFile);
            //数据读和写
            char[] down = new char[10];
            int length;
            while ((length = fReader.read(down)) != -1) {
                fWriter.write(down, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File Not Found");
        } catch (IOException e) {
            throw new RuntimeException("IO Error");
        } finally {
            //关闭流
            try {
                if (fWriter != null) {
                    fWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("Writer Close Error");
            } finally {
                try {
                    if (fReader != null) {
                        fReader.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Reader Close Error");
                }
            }
        }
    }
}
