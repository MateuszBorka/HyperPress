package com.example.hyperpress.huffman1;

import java.io.*;

public class Huffman1Controller {

    public static void runCompressor(String[] argc) {
        Runtime rt = Runtime.getRuntime();
        String ranPath = System.getProperty("user.dir");
        Process process = null;
        try {
            process = rt.exec(ranPath + "\\src\\main\\java\\com\\example\\hyperpress\\huffman1\\compressor\\compressor.exe");
        } catch (IOException e) {
            System.err.println("Error opening compressor");
            System.exit(1);
        }
        try {
            process.waitFor();
        } catch (InterruptedException e) {
            System.err.println("Thrown InterruptedException");
            System.exit(1);
        }
//        InputStream in = process.getInputStream();
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();

//        int c = -1;
//        while ((c = in.read()) != -1) {
//            baos.write(c);
//        }
//
//        String response = new String(baos.toByteArray());
//        System.out.println("Response From Exe : " + response);

        //System.out.println("completed");
    }

    public static void runDecompressor(String[] argc) {
        Runtime rt = Runtime.getRuntime();
        String ranPath = System.getProperty("user.dir");
        Process process = null;
        try {
            process = rt.exec(ranPath + "\\src\\main\\java\\com\\example\\hyperpress\\huffman1\\compressor\\decompressor.exe");
        } catch (IOException e) {
            System.err.println("Error opening compressor");
            System.exit(1);
        }
        try {
            process.waitFor();
        } catch (InterruptedException e) {
            System.err.println("Thrown InterruptedException");
            System.exit(1);
        }

        //System.out.println("completed");
    }

}
