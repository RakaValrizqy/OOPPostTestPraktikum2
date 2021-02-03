package praktikum2;

public class Main {

    public static void main(String[] args) {
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
        
        cemara.SetNama();
        cemara.SetTinggi();
        kelapa.SetNama();
        kelapa.SetTinggi();
        System.out.println(" ");
        
        cemara.GetNama();
        cemara.GetTinggi();
        System.out.println(" ");
        kelapa.GetNama();
        kelapa.GetTinggi();
    }
    
}
