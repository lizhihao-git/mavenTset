import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetFileName {
    public static String [] getFileName(String path)
    {
        File file = new File(path);
        String [] fileName = file.list();
        return fileName;
    }
    public static void getAllFileName(String path,ArrayList<String> fileName)
    {
        File file = new File(path);
        File [] files = file.listFiles();
        String [] names = file.list();
        if(names != null)
            fileName.addAll(Arrays.asList(names));
        for(File a:files)
        {
            if(a.isDirectory())
            {
                getAllFileName(a.getAbsolutePath(),fileName);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        //读物文件的路径
        String FilePate="E:\\test";
        File[] list = new File(FilePate).listFiles();
        System.out.println("读取文件的数量"+list.length);
        //生成文件的路径测试使用
        String createFile = "F:\\test2\\file.txt";
        BufferedWriter write = new BufferedWriter(new FileWriter(createFile));
            try {
                for (File file :list) {
                    System.out.println("当前读取的文件名:"+file.getName());
                    BufferedReader buf = new BufferedReader(new FileReader(file));
                    String line ;
                    while((line = buf.readLine())!= null){
                        write.write(line);
                        write.newLine();
                    }
                    buf.close();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                write.close();
                System.out.println("文件读取完毕");
            }
    }

}
