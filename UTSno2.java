import java.util.Scanner;
public class UTSno2 {
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int btbm;
        float berat, tinggi, bmi, meter;
        double beratideal;
     
        System.out.println("Menghitung berat badan dengan bmi");
        System.out.println("==========================================");
        System.out.print ("Masukan Jenis Kelamin (1.Laki-lai)| (2.Perempuan): ");
        btbm = masuk.nextInt();
        System.out.print ("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;

        bmi=(berat/(tinggi*tinggi));
  
        System.out.println("==========================================");
        System.out.print("BMI : "+bmi+" ");
        
        if (bmi<18.5){
            System.out.println("(Underweight)");
        }else if (bmi<=22.9){
            System.out.println("(Ideal)");
        }else if (bmi<29.9){
            System.out.println("(Overweight)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }

        switch(btbm){
            case 1 : beratideal=((tinggi-100)-(0.10*(tinggi-100))); break;
            case 2 : beratideal=((tinggi-100)-(0.15*(tinggi-100))); break;
            default : beratideal=0;
        }

        int hasil = (int)beratideal;
        System.out.println("Berat badan ideal anda  : "+hasil+" Kg");
   }
}