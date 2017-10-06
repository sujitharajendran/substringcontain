package capgi;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
String n2=sc.nextLine();
int d=n2.length();
int count=0;
for(int i=0;i<n.length()-d;i++) {
	if(n.substring(i, i+d).contains(n2)) {
		count++;
	}
}
if(count!=0) {
	System.out.println("substring");
}
else {
	System.out.println("no substring");
}
	}

}
