package com.github.narcissujsk.openstackjsk;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Logger logger = Logger.getLogger("RequestBuilder");

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException {
        String str = "/*******************************************************************************\n" +
                " * \tCopyright 2019 ContainX and OpenStack4j\n" +
                " *\n" +
                " * \tLicensed under the Apache License, Version 2.0 (the \"License\"); you may not\n" +
                " * \tuse this file except in compliance with the License. You may obtain a copy of\n" +
                " * \tthe License at\n" +
                " *\n" +
                " * \t    http://www.apache.org/licenses/LICENSE-2.0\n" +
                " *\n" +
                " * \tUnless required by applicable law or agreed to in writing, software\n" +
                " * \tdistributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT\n" +
                " * \tWARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the\n" +
                " * \tLicense for the specific language governing permissions and limitations under\n" +
                " * \tthe License.\n" +
                " *******************************************************************************/\r\n";
        write(str, "D:\\tmp\\openstackjsk");
    }

    @Test
    public void getFile() throws IOException {

        String path = "D:\\tmp\\openstackjsk";
        File file = new File(path);
        ArrayList<File> list = getListFiles(path);
        for (int i = 0; i < list.size(); i++) {

            logger.info(list.get(i).getName());
        }
    }

    public static List<String> getFiles(String path) {
        List<String> files = new ArrayList<String>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].toString());
                //文件名，不包含路径
                //String fileName = tempList[i].getName();
            }
            if (tempList[i].isDirectory()) {
                //这里就不递归了，
            }
        }
        return files;
    }

    public static ArrayList<File> getListFiles(Object obj) {
        File directory = null;
        if (obj instanceof File) {
            directory = (File) obj;
        } else {
            directory = new File(obj.toString());
        }
        ArrayList<File> files = new ArrayList<File>();
        if (directory.isFile()) {
            files.add(directory);
            return files;
        } else if (directory.isDirectory()) {
            File[] fileArr = directory.listFiles();
            for (int i = 0; i < fileArr.length; i++) {
                File fileOne = fileArr[i];
                files.addAll(getListFiles(fileOne));
            }
        }
        return files;
    }

    public static boolean write(String content, String path) throws IOException {
        // 1.获取路径下所有Java文件
        File file = new File(path);
        ArrayList<File> files = getListFiles(path);
        // 2.读取Java文件，然后在第一行加上package信息
        for (File f : files) {
            File tmp = File.createTempFile("tmp", null);
            FileOutputStream tmpOut = new FileOutputStream(tmp);
            FileInputStream tmpIn = new FileInputStream(tmp);
            RandomAccessFile raf = null;
            try {
                raf = new RandomAccessFile(f, "rw");
                byte[] buf = new byte[64];
                int hasRead = 0;
                while ((hasRead = raf.read(buf)) > 0) {
                    // 把原有内容读入临时文件
                    tmpOut.write(buf, 0, hasRead);
                }
                raf.seek(0L);
                raf.write(content.getBytes());
                // 追加临时文件内容
                while ((hasRead = tmpIn.read(buf)) > 0) {
                    raf.write(buf, 0, hasRead);
                }
            } catch (IOException e) {
                System.out.println("写入失败！");
                e.printStackTrace();
                return false;
            } finally {
                try {
                    raf.close();
                } catch (IOException e) {
                    System.out.println("写入失败，关闭流失败！");
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

}
