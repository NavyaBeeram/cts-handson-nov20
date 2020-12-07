package collectionse;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		Account ac=new Account();
		int z=3;
		while(z==3)
		{

		System.out.println("1.add acccount");
		System.out.println("2.Remove acccount by account number");
		System.out.println("3.Display account by account number");
		System.out.println("4.Display all account by account number");
		System.out.println("5.Display those accounts having the balance less than 1000");
		System.out.println("6.Exit");
		System.out.println("Enter your choice:");
		int c=s.nextInt();
		Cde C=new Cde();
	ArrayList<Cde> list=new ArrayList<Cde>();
	
	switch(c)
	{
	case 1:System.out.println("enter the account number");
	int num=s.nextInt();
	s.nextLine();
	System.out.println("enter the balance");
	float bal=s.nextFloat();
	s.nextLine();
	
	
	System.out.println("nameeeeeee");
	String nam=s.next();
	list.add(new Cde(num,nam,bal));
	
	ac.add(list);
	break;
	
	
	case 2:System.out.println("enter the aaaacount number you want to remove");
	   int q=s.nextInt();
       ac.remove(q);
       break;
	case 3:System.out.println("onlyy");
	System.out.println("which");
	int ew=s.nextInt();
	ac.particular(ew);
	break;
	case 4:
		System.out.println("nABSjdg");

        ac.display();
	break;
	case 5:System.out.println("enter below how");
	
	
	float bel=s.nextFloat();
	ac.belaccc(bel);
	break;
	case 6:z=0;
	}
	}

	}
}
