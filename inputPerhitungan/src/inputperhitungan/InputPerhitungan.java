/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputperhitungan;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class InputPerhitungan {
    
    public static void tugaspt3nomor1(){
        
        int num1, num2, num3;
        double rata;
        
        Scanner angka = new Scanner(System.in);
        
        System.out.print("number 1 = ");
        num1 = angka.nextInt();
        System.out.print("number 2 = ");
        num2 = angka.nextInt();
        System.out.print("number 3 = ");
        num3 = angka.nextInt();
        
        rata = (num1+num2+num3)/(double)3;
        System.out.println("Rata-rata = " + rata);
}
    public static void tugaspt3nomor2() {
        
        String num1, num2, num3;
        double rata ;
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        num1 = JOptionPane.showInputDialog("Masukkan Nilai num 1 = ");
        int no1 = Integer.parseInt(num1);
        num2 = JOptionPane.showInputDialog("Masukkan Nilai num 2 = ");
        int no2 = Integer.parseInt(num2);
        num3 = JOptionPane.showInputDialog("Masukkan Nilai num 3 = ");
        int no3 = Integer.parseInt(num3);
        
        rata = (no1+no2+no3)/(double)3;
        String pesan = "Number 1 = \t" + no1 + "\nNumber 2 = \t" + no2 + 
                "\nNumber 3 = \t" + no3 + "\nRata-rata = \t" + rata;
        JOptionPane.showMessageDialog(null, pesan);
        }catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "Masukkan Angka !!!");
        }
    }
    public static void main(String[] args) {
    
    //tugaspt3nomor1();
    tugaspt3nomor2();
    }
    
}

