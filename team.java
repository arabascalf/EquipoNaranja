import java.util.Scanner;
public class Team{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int total = 0;
		while(sc.nextInt()){
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
			int x = 0;
			x = sc.nextInt() + sc.nextInt() + sc.nextInt();
			if(x>=2)
				total++;
			}
		}
		System.out.println(total);
	}
}
