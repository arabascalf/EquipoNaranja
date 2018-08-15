import java.util.Scanner;
import java.util.ArrayList;
public class boyorgirl{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int conteo = 0;
		ArrayList<String> used = new ArrayList<String>();
		for(int i=0;i<str.length()-1;i++){
		if(str.indexOf(str.charAt(i), i+1) != -1 || str.indexOf(str.charAt(i)) == i)
			conteo++;
		}
		if(str.indexOf(str.charAt(str.length()-1))==(str.length()-1))
			conteo++;
		if(conteo%2==0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
	}
}
