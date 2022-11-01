package com.company.IO;

import java.io.*;

public class MyBufferedWriter {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\86178\\Desktop\\a.txt";
        BufferedWriter bufferedReader = new BufferedWriter(new FileWriter(filePath));

        bufferedReader.write("hello world io");
        bufferedReader.newLine();

        bufferedReader.close();
    }
}
