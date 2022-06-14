
import java.util.Scanner;


public class GelismisNotHesaplama {
    public static void main(String[] args) {
        /*
        -Kullanıcıdan vize1, vize2 ve final notlarını alarak bir harf hesaplama
        sistemi yapın.
        -Ayrıca kullanıcıdan okuldaki genel not ortalamasını alarak, DD alma ve
        2.50' nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdır.
        
        -Vize1 toplam notun %30'una etki edecek.
        -Vize2 toplam notun %30'una etki edecek.       
        -Final toplam notun %40'ına etki edecek.
        
        Not >= 90 : AA
        Not >= 85 : BA
        Not >= 80 : BB
        Not >= 75 : CB
        Not >= 70 : CC
        Not >= 65 : DC
        Not >= 60 : DD
        Not >= 55 : FD
        Not <  55 : FF
        */
        
        Scanner scanner = new Scanner(System.in);
        
        double vize1 = -1;
        double vize2 = -1;
        double fin = -1;
        double gpa;     // gpa : grade point average
        double wgpa = -1;    // wgpa: weighted grade point average
        
        while (vize1 < 0 || vize1 > 100){
        System.out.print("Please enter your first mid-term exam score: ");
        vize1 = scanner.nextDouble();
        if (vize1 < 0 || vize1 > 100){
            System.out.println("Invalid value.");
        }
        
        }
        
        while (vize2 < 0 || vize2 > 100){
        System.out.print("Please enter your second mid-term exam score: ");
        vize2 = scanner.nextDouble();
        if (vize2 < 0 || vize2 > 100){
            System.out.println("Invalid value.");
        }
        
        }
        
        while (fin < 0 || fin > 100){
        System.out.print("Please enter your final exam score: ");
        fin = scanner.nextDouble();
        if (fin < 0 || fin > 100){
            System.out.println("Invalid value.");
        }
        
        }
        
        gpa = (vize1 * 0.3) + (vize2 * 0.3) + (fin * 0.4);
        
        if (gpa <= 100 && gpa >= 90) {
            System.out.println("Your gpa is " + gpa + "(AA). Great job!");
            
        }
        else if (gpa < 90 && gpa >= 85) {
            System.out.println("Your gpa is " + gpa + "(BA). Well done!");
            
        }
        else if (gpa < 85 && gpa >= 80) {
            System.out.println("Your gpa is " + gpa + "(BB). Not bad!");
            
        }
        else if (gpa < 80 && gpa >= 75) {
            System.out.println("Your gpa is " + gpa + "(CB). You can do better!");
            
        }
        else if (gpa < 75 && gpa >= 70) {
            System.out.println("Your gpa is " + gpa + "(CC). Work harder!");
            
        }
        else if (gpa < 70 && gpa >= 65) {
            System.out.println("Your gpa is " + gpa + "(DC). Come on!!!");
            
        }
        else if (gpa < 65 && gpa >= 60) {
            System.out.println("Your gpa is " + gpa + "(DD). Don't give up!");
            
        }
        else if (gpa < 60 && gpa >= 55) {
            System.out.println("Your gpa is " + gpa + "(FD). Too bad!");
            
        }
        else if (gpa < 55 && gpa >= 0) {
            System.out.println("Your gpa is " + gpa + "(FF). Hopeless case!");
            
        }
            
        while (wgpa < 0 || wgpa > 4){    
        System.out.print("Please enter your weighted grade point average: ");
        wgpa = scanner.nextDouble();
        
            if (wgpa < 0 || wgpa > 4){
            System.out.println("Invalid value.");
            }
        }
        
        if (wgpa >= 2.50 && wgpa <= 4.00) {
            System.out.println("You did great job! And don't forget that you should always work harder. See you next year!");
            
        }
        
        else if (wgpa >=2 && wgpa < 2.50) {
            System.out.println("Your weighted grade point average is under the 2.50 point. You know what to do. Stop hanging out and go for your school!");
            
                }
        
        else if (wgpa >=0 && wgpa < 2) {
            System.out.println("Your weighted grade point average is under the 2.00 point. You failed...");
            
                } 
        
        
    }
}
        
        
        
    
        
    

            
        
