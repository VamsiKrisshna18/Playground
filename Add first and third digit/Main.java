import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int n1=n%10;
        int n2=n/100;
        int s=n1+n2;
        System.out.println(s);
	}
}