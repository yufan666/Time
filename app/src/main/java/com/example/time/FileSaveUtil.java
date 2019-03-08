package com.example.time;

import android.os.Environment;

import java.io.File;
import java.io.RandomAccessFile;

public class FileSaveUtil {
    public final static String FILE_PATH = Environment.getExternalStorageDirectory() +"";

        public static void writeFile(String fileName, String content) {
            String strContent = content + "\n";
            try {
                File fileDir = new File(FILE_PATH);
                if (!fileDir.exists()) {
                    fileDir.mkdirs();
                    if (!fileDir.exists()) {
                        return;
                    }
                }
                File file = new File(FILE_PATH, fileName);
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.seek(file.length());
                raf.write(strContent.getBytes());
                raf.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    public static void writeFile(String content) {
        String strContent = content + "\n";
        try {
            File fileDir = new File(FILE_PATH);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
                if (!fileDir.exists()) {
                    return;
                }
            }
            File file = new File(FILE_PATH, "local.txt");
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            raf.seek(file.length());
            raf.write(strContent.getBytes());
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static void delLogFile(String path) {
            File file = new File(path);
            if (file.exists()) {
                file.delete();
            }
        }
}
