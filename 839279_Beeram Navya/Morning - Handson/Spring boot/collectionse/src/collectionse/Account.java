package collectionse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.InsufficientResourcesException;

public class Account {
	
	ArrayList<Cde> lis=new ArrayList<Cde>();

	public void add(ArrayList<Cde> list)
	{
		
		
		System.out.println("added");
		lis.addAll(list);
		System.out.println(lis.size());
		
	}
public void remove(int q) 
{
	
		
		
  for (Iterator<Cde> iter = lis.listIterator(); 
		  iter.hasNext();) 
  {
Cde c=iter.next();
		
		if(c.getNum()==q)
		{
			iter.remove();
			System.out.println("HUcAY");
		}
	}
}
public void display() {
	// TODO Auto-generated method stub
	
	System.out.println("entere");
	Set<Cde> tempList = new TreeSet<Cde>((a1,a2) -> Integer.compare(a1.getNum(), a2.getNum()));
	tempList.addAll(lis);
	for(Cde zaq:tempList)
	
	{
		System.out.println("HOO");
		System.out.println("name:"+zaq.getName());
		System.out.println("number:"+zaq.getNum());
		System.out.println("balanceee:"+zaq.getBal());
	}
}
public void particular(int accc)
{
	System.out.println("particular");
	for(Cde bgt:lis)
	{
		if(bgt.getNum()==accc)
		{

			System.out.println("HOO");
			System.out.println("name:"+bgt.getName());
			System.out.println("number:"+bgt.getNum());
			System.out.println("balanceee:"+bgt.getBal());
		
		}
	
}



}
public void belaccc(float bel) {

for(Cde nhy:lis)	{
	
	
	if(nhy.getBal()<bel)
	{
		System.out.println("name:"+nhy.getName());
		System.out.println("number:"+nhy.getNum());
		System.out.println("balanceee:"+nhy.getBal());
	}
}
}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
