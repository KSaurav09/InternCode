import java.util.Scanner;

public class Intern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();//input string from console
		
		int count[] = new int[256];//count array to count occurrence of a character
		
		for(int i=0;i<count.length;i++){
			count[i]=0;	//count array initially filled with 0
		}
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);//extracting each character from the input string and storing it into character variable ch
			count[ch]++;//Incrementing each occurrence of the character at the specified index
		}
		int cnt=0;//a counter variable to count the unique element of the input string
		for(int i=0;i<count.length;i++){
			if(count[i]>=1)
				cnt++;//Incrementing the counter each time when any value greater or equal to 1 is found in the count array
		}
		
		System.out.println(cnt);//printing the unique number of character found in the input string.
		
	}
}
