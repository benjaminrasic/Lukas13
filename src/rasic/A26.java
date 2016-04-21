/**
 * 
 */
package rasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Einlesen und ausgeben von csv dateien
 * 
 * @version 1.0
 * @author Rasic Benjamin
 *
 */
public class A26 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		parseCsvFile("A26.csv");

	}
	 /** 
     * Lese CSV Datei und verarbeite zeilenweise 
	 * @throws IOException 
     */ 
    public static void parseCsvFile(final String fileName) throws IOException { 
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        String current = reader.readLine(); 
        while (current != null) { 
            processCsvLine(current); 
            current = reader.readLine(); 
        } 
        reader.close(); 
    }
    /** 
     * Verarbeite eine einzelne Zeile
     *      
     */ 
    public static void processCsvLine(final String data) { 
        System.out.println("Neue Zeile:"); 
        final StringTokenizer st = new StringTokenizer(data, ";"); 
        while (st.hasMoreTokens()) {  
            System.out.println("Nächste Spalte:" + st.nextToken()); 
        } 
    }

}
