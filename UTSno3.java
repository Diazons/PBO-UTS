import java.util.Scanner;
   
class UTSno3 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("Program oop bilangan bulat");
    System.out.println("=======================================");
    System.out.println();
     
    int n,i;
    boolean angka_bilanganbulat = true;
     
    System.out.print("Input sebuah angka bulat: ");
    n = input.nextInt();

    //0 dan 1 adalah bilangan bulat
    if (n == 0 || n == 1) {
      angka_bilanganbulat = false;
    }
    else {
      for (i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
          angka_bilanganbulat = false;
          break;
        }
      }
    } 
     
    if (angka_bilanganbulat)
      System.out.println( n + " adalah bilangan bulat");
    else
      System.out.println( n + " bukan bilangan bulat");
  }
}