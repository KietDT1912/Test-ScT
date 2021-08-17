/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghichjava;

import java.io.*;
/**
 *
 * @author AdMins
 */
public class NghichJava {

    /**
     * @param args the command line arguments
     */
    private final static String FILE_URL = "D:/Nhi.txt";
 
    public static void main(String[] args) throws IOException {
        File file = new File(FILE_URL);
        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
 
        String line = "";
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
    
}
