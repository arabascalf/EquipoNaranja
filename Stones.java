import java.util.*;

class Stones{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nStones = sc.nextInt();
    sc.nextLine();
    String stones = sc.nextLine();
    // for (int i = 0; i <= nStones ; i++) {
    //   stones += sc.nextLine();
    // }
    
    System.out.println(repeticiones(stones));
  }
  
  static int repeticiones(String stones){
    int nRepeticiones = 0;
    for (int i = 0; i < stones.length()-1; i++) {
      //Tengo que comparar al char actual con el siguiente, si es el mismo, se suma uno a nrepeticiones
      if (stones.charAt(i) == stones.charAt(i+1)) {
        nRepeticiones++;
      }
    }
    return nRepeticiones;
  }
}