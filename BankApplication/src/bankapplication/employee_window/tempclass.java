
package bankapplication.employee_window;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * @author patil
 */
public class tempclass {
    public static void main(String[] args) throws IOException{
        
//        RandomAccessFile numbr = new RandomAccessFile("Accountnumber.txt","r");
        RandomAccessFile numbr = new RandomAccessFile("C:/Users/patil/OneDrive/Desktop/Java Projects/BankApplication/build/classes/bankapplication/Accountnumber.txt","r");
        String str = numbr.readLine();
        System.out.println("GPA"+str);
        System.out.println("well this program is runnng");
        
    }
}
