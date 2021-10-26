# Taller_1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rodriguez-Alexander_Bañares-Matias
 */
public class CSVreader {

    public CSVreader() {

    }

    public Info[] entregarArreglo() {

        Info[] arreglo = new Info[18249];
        String csvFile = "palta.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            int contador = 0;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(cvsSplitBy);
                Info info = new Info(Double.valueOf(datos[2]), Double.valueOf(datos[3]), Double.valueOf(datos[4]), Double.valueOf(datos[5]), Double.valueOf(datos[6]), Double.valueOf(datos[7]));
                arreglo[contador] = info;
                contador++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return arreglo;
    }

    public long toLong(String string) {
        return Long.parseLong(string.replace(".", ""));
    }
}
