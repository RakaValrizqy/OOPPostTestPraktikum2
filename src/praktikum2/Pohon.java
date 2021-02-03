package praktikum2;
import java.util.Scanner;
public class Pohon {
    String nama;
    double tinggi;
    Scanner io = new Scanner (System.in);
    
    void SetNama(){
        System.out.print("Masukkan nama pohon   : ");
        nama = io.nextLine();
    }
    void SetTinggi(){
        System.out.print("Masukkan tinggi pohon : ");
        tinggi = io.nextDouble();
    }
    void GetNama(){
        System.out.println("Nama pohon   : "+nama);
    }
    void GetTinggi(){
        System.out.println("Tinggi pohon : "+tinggi+"m");
    }
}
