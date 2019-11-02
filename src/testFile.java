import java.io.*;
import java.util.Scanner;

public class testFile {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        String filepath = "F:\\test2\\file.txt";
        File file = new File(filepath);
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis, "utf-8"),10 * 1024 * 1024);// 用5M的缓冲读取文本文件
         //Scanner sc = new Scanner(new FileInputStream(file));
        File createFile = new File("F:\\test2\\0810.TXT");
        if(createFile.exists()){
            createFile.delete();
            System.out.println("刪除已經存在的文件");
        }

        FileWriter writer = new FileWriter(createFile);
        String line = "";
        System.out.println("======开始=====");
         while((line = reader.readLine()) != null){
            //line = reader.readLine();
            writer.append(line + "\r\n");
        }
        reader.close();
        writer.flush();
        writer.close();

       /*while (sc.hasNextLine()){
           String str =sc.nextLine();
           writer.write(str+"\r\n");
       }*/
        System.out.println("======================");

        System.out.println("======结束=====");
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /*public static boolean updateContent(String content) {
        File file = new File("E:/0810.TXT");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file, true);
            writer.write(content);
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return true;
    }
*/

}
