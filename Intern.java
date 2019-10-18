import java.util.Scanner;

public class Intern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		int count[] = new int[256];
		
		for(int i=0;i<count.length;i++){
			count[i]=0;
		}
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			count[ch]++;
		}
		int cnt=0;
		for(int i=0;i<count.length;i++){
			if(count[i]>=1)
				cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
