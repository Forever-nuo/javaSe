package IO.File;

import ObjectToObject.innerClass.A;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by forever on 2017-6-25.
 */
public class Filetest {

    /***
     * 构造函数
     */
    @Test
    public void testConstructedMethod() {
        /***
         * 构造函数1个参数
         * 文件的相对路径 和绝对路径
         * 如果是绝对路径 打印的file 对象就是绝对路径
         * 如果是相对路径 打印的file 对象就是相对路径
         */
        File file1 = new File("H:\\a.txt");
        /**'
         * 构造函数 2个参数
         * 参数1:文件的目录   不需要文件分割符
         * 参数2:文件名
         */
        File file2 = new File("H:", "b.txt");
        /**
         * 构造函数3
         * 参数1 将文件的目录 封装成文件对象
         * 参数2 文件名
         */
        File file3 = new File(new File("H:"), "b.txt");
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
    }

    /**
     * 文件的路径分割符
     * <p/>
     * 文件路径可以写成
     * 1:父目录/子目录/文件名
     * 2:父目录\子目录\文件名  但是在java中\要转义 所以要\\
     * 父目录\\子目录\\文件名
     * <p/>
     * 使用File.separator 可以跨系统 通用
     */
    @Test
    public void testPathSeparator() {
        File file = new File("H:" + File.separator + "a.txt");
        System.out.println(file);
    }

    /**
     * 创建文件:
     * createNewFile()
     * 返回值 boolean
     * true 创建成功
     * false 创建失败  (文件已存在,不会再创建)
     *
     * @throws IOException
     */
    @Test
    public void testCreateNewFile() throws IOException {
        File file = new File("H:" + File.separator + "a.txt");
        boolean success = file.createNewFile();
        if (success)
            System.out.println("创建文件成功");
    }

    /**
     * 创建一个文件夹:
     * mkdir()
     * 返回值 boolean
     * true 创建成功
     * false 创建失败
     *
     * @throws IOException
     */
    @Test
    public void testMkdir() throws IOException {
        File file = new File("H:" + File.separator + "aa");
        boolean success = file.mkdir();
        if (success)
            System.out.println("创建文件成功");
    }


    /***
     * 创建嵌套的文件夹 (1个或多个都可以)
     * mkdirs
     */
    @Test
    public void testMkdirs() throws IOException {
        File file = new File("H:" + File.separator + "aa"/*+File.separator+"bb"+File.separator+"cc"*/);
        boolean success = file.mkdirs();
        if (success)
            System.out.println("创建文件成功");
    }

    /***
     * 删除文件
     * delete()方法
     * 返回值 : boolean
     * true: 删除成功
     * false: 删除 失败
     * (删除失败原因:1.文件不存在 2.是嵌套的文件夹)
     */
    @Test
    public void testDelete() {
        File file = new File("H:" + File.separator + "aa");
        boolean delete = file.delete();
        if (delete)
            System.out.println("删除文件成功");
    }

    /**
     * 删除文件夹
     * 1. 只能删除最里层的
     * 2. 如果有文件就不能删除
     */
    @Test
    public void testDeleteDict() {
        File file = new File("H:" + File.separator + "aa" + File.separator + "bb");
        boolean delete = file.delete();
        if (delete)
            System.out.println("删除文件成功");
    }

    /***
     * 退出虚拟机时删除文件
     */
    @Test
    public void testDeleteOnExit() {
        File file = new File("H:" + File.separator + "aa" + File.separator + "bb");
        file.deleteOnExit();
        /***
         * 下面都是执行的代码
         * 当退出虚拟机时候就会删除, 哪怕发生异常
         * 一般用在临时文件
         */
        System.out.println("233");
        throw new RuntimeException("233");

    }

    /****
     * 判断文件是否是可执行文件
     *
     * @throws IOException
     */
    @Test
    public void testCanExecute() throws IOException {
        File file = new File("F:\\软件\\多媒体\\娱乐\\YY语音\\yy\\YY.exe");
        boolean canExecute = file.canExecute();
        System.out.println("文件可执行:" + canExecute);
        if (canExecute) {
            Runtime.getRuntime().exec(file.getAbsolutePath());
        }
    }


    /***
     * 文件比较
     */
    @Test
    public void testCompareTo() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        File file2 = new File(dict, "table1.txt");

        int i = file1.compareTo(file2);
        System.out.println(i);
    }

    @Test
    public void testExists() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        File file2 = new File(dict, "table7.txt");

        /**
         * 目录是否存在
         */
        System.out.println(dict.exists());
        /**
         * 文件是否存在
         */
        System.out.println(file1.exists());
        System.out.println(file2.exists());
    }

    /**
     * 判断一个文件对象
     * 是文件还是目录
     * <p/>
     * 先要判断是否存在
     */
    @Test
    public void testIsFileOrDict() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");

        if (file1.exists()) {
            System.out.println(file1.isFile());
            System.out.println(file1.isDirectory());
        }
    }

    /***
     * 是否是绝对路径
     * <p/>
     * 哪怕文件不存在
     */
    @Test
    public void testIsAbsolute() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");

        System.out.println(file1.isAbsolute());
        System.out.println(file1.isHidden());
    }

    /***
     * 是否是隐藏文件
     */
    @Test
    public void testIsHidden() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");

        System.out.println(file1.isHidden());
    }


    /*************************************获取***************************************/
    /**
     * 获取路径
     * 封装的什么路径 获取的就是什么路径
     * 1: File file = new File("a.txt");  封装的相对路径 返回的也是相对路径
     * 2: File file = new File("c:\\a.txt") 封装的是绝对路径 返回的也是绝对路径
     */
    @Test
    public void testGetPath() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        System.out.println(file1.getPath());
    }

    /***
     * 获取绝对路径
     * 不管封装的是绝对还是相对路径
     * 返回的都是绝对路径
     */
    @Test
    public void testGetAbsolutePath() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        System.out.println(file1.getAbsolutePath());
    }

    /**
     * 只获取文件的名字
     */
    @Test
    public void testGetName() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        System.out.println(file1.getName());
    }

    /**
     * 获取文件的父目录
     * 1.返回封装时  绝对路径中的父目录
     * 2. 如果封装时 是相对路径 返回null
     * 3. 如果相对路径中 有上一层目录 a/b/c.txt 返回结果 a/b
     */
    @Test
    public void testGetParent() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        System.out.println(file1.getParent());
    }

    /**
     * 获取文件的最后一次修改时间
     */
    @Test
    public void testLastModified() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        System.out.println(file1.lastModified());
    }

    /**
     * 获取文件的大小
     */
    @Test
    public void testLength() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        System.out.println(file1.length());
    }

    /**
     * 重新命名并且移动文件
     */
    @Test
    public void testRenameTo() {
        File dict = new File("F:");
        File file1 = new File(dict, "table0.txt");
        File file2 = new File("F:\\table3.txt");
        file1.renameTo(file2);
    }


    /***
     * 获取系统盘符
     * 返回结果 File 数组
     */
    @Test
    public void testListRoots() {
        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file);
        }
    }

    /***
     * 获取当前文件下的直接子文件(文件,文件目录)
     * 包含隐藏文件
     * <p/>
     * list调用list 方法 必须是封装的一个目录
     * 如果不是目录 返回的是null
     */
    @Test
    public void testList() {
        File file = new File("H:\\");
        for (String fileName : file.list()) {
            System.out.println(fileName);
        }
    }


    @Test
    public void testList1() {
        File file = new File("H:\\caiNiaoDesignPattern");
        file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
    }


    public void list(File file) {
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir, name);
                if (file1.isDirectory())
                    return true;
                return name.endsWith(".java");
            }
        });
        for (String fileName : list) {
            File file1 = new File(file, fileName);
            if (!file1.isDirectory())
                System.out.println(file + "---" + fileName);
            if (file1.isDirectory()) {
                list(file1);
            }
        }

    }

    @Test
    public void test() {
        list(new File("H:\\caiNiaoDesignPattern"));
    }

    /***
     * 递归 打印所有的文件
     *
     * @param dict
     */
    public void showFileList(File dict) {
        System.out.println(dict);
        for (File file : dict.listFiles()) {
            if (file.isDirectory())
                showFileList(file);
            else
                System.out.println(file);
        }
    }

    @Test
    public void testShowFileList() {
        showFileList(new File("H:\\caiNiaoDesignPattern"));
    }


    @Test
    public void testRecursionDelete() {
        recursionDelete(new File("H:\\aa"));
    }

    public void recursionDelete(File file) {
        for (File fileChild : file.listFiles()) {
            if (fileChild.isDirectory())
                recursionDelete(fileChild);
            else{
                System.out.println(fileChild.delete());
            }
        }
        file.delete();
    }



    public List<String> getFileListTOFile(File file,List<String> filenameList) {
        filenameList.add(file.getAbsolutePath());
        for (File fileChild : file.listFiles()) {
           if (fileChild.isDirectory())
               getFileListTOFile(fileChild, filenameList);
            else
               filenameList.add(fileChild.getAbsolutePath());
        }
        return  filenameList;
    }

    public void outNamesTOFile(List<String> fileList, String  filename) throws IOException {
        BufferedWriter bw = new BufferedWriter( new FileWriter(new File(filename)));
        for (String s : fileList) {
            bw.write(s);
            bw.flush();
            bw.newLine();
        }
        bw.close();
    }



    @Test
    public void testOutNamesTOFile() throws IOException {
        outNamesTOFile(getFileListTOFile(new File("H:\\caiNiaoDesignPattern"),new ArrayList<String>()),"H:\\file.txt");
    }
}