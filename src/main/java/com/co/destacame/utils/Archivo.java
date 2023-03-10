package com.co.destacame.utils;

import com.co.destacame.utils.constants.General;

import java.io.*;

public class Archivo {
    private static String ruta;


    public static void write(String message) {
        ruta = General.RUTA_TXT;
        File file = new File(ruta);
        BufferedWriter bw;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            bw.write(message + "\r\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
