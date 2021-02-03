package org.btm.UserManagementApp;
import java.util.Scanner;
public class UserMain
{
	public static void main(String[] args) 
	{
		UserDbo ub=new UserDbo();
		boolean b=true;
		String res;
		while(b)
		{
		System.out.println("User Management Sysem");
		System.out.println("1.Enter The User Information");
		System.out.println("2.Show The User particular Information");
		System.out.println("3.Show All The Information of User");
		System.out.println("4.Update The User Information");
		System.out.println("5.Delete The User Information");
		System.out.println("Enter your choice Between(1-5)");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Enter The User Id");
			int id=sc.nextInt();
			System.out.println("Enter The User Name");
			String name=sc.next();
			System.out.println("Enter The User Email");
			String email=sc.next();
			System.out.println("Enter The User Place");
			String place=sc.next();
			System.out.println("Enter The User Phone_Number");
			String phn=sc.next();
			ub.insert(id, name, email, place, phn);
			System.out.println("sucessfully inserted your information to the database");
			System.out.println("Do You Want To Continue Y/N");
			res=sc.next();
			if(res.equalsIgnoreCase("n"))
			{
			b=false;
			ub.exit();
			}
			break;
		case 2:
			System.out.println("Enter the user id");
			int uid=sc.nextInt();
			ub.show(uid);
			System.out.println("Do You Want To Continue Y/N");
			res=sc.next();
			if(res.equalsIgnoreCase("n"))
			{
			b=false;
			ub.exit();
			}
			break;
		case 3:
			System.out.println("List of entire user");
			System.out.println("--------------------------");
			ub.showAll();
			System.out.println("Do You Want To Continue Y/N");
			res=sc.next();
			if(res.equalsIgnoreCase("n"))
			{
			b=false;
			ub.exit();
			}
			break;
		case 4:
			System.out.println("1.To update Name");
			System.out.println("2.To update Email");
			System.out.println("3.To update Place");
			System.out.println("4.To update Phone_number");
			int c1=sc.nextInt();
			switch(c1)
			{
			case 1:
				System.out.println("Enter The id of the user whose Name You want to Update");
				int eid=sc.nextInt();
				System.out.println("Enter New Name");
				String nm1=sc.next();
				ub.update_name(eid, nm1);
				System.out.println("sucessfully updated your name");
				System.out.println("Do You Want To Continue Y/N");
				res=sc.next();
				if(res.equalsIgnoreCase("n"))
				{
				b=false;
				ub.exit();
				}
				break;
			case 2:
				System.out.println("Enter The id of the user whose Email You want to Update");
				int eid1=sc.nextInt();
				System.out.println("Enter New Email");
				String Email=sc.next();
				ub.update_email(eid1, Email);
				System.out.println("sucessfully updated your email");
				System.out.println("Do You Want To Continue Y/N");
				res=sc.next();
				if(res.equalsIgnoreCase("n"))
				{
				b=false;
				ub.exit();
				}
				break;
			case 3:
				System.out.println("Enter The id of the user whose Place You want to Update");
				int eid2=sc.nextInt();
				System.out.println("Enter New Place");
				String pl=sc.next();
				ub.update_place(eid2, pl);
				System.out.println("sucessfully updated your place");
				System.out.println("Do You Want To Continue Y/N");
				res=sc.next();
				if(res.equalsIgnoreCase("n"))
				{
				b=false;
				ub.exit();
				}
				break;
			case 4:
				System.out.println("Enter The id of the user whose phone_number You want to Update");
				int eid3=sc.nextInt();
				System.out.println("Enter New phn");
				String phn1=sc.next();
				ub.update_phone(eid3, phn1);
				System.out.println("sucessfully updated your phone_number");
				System.out.println("Do You Want To Continue Y/N");
				res=sc.next();
				if(res.equalsIgnoreCase("n"))
				{
				b=false;
				ub.exit();
				}
				break;
			}
			break;
		case 5:
			System.out.println("enter the user id");
			int i=sc.nextInt();
			ub.delete(i);
			System.out.println("Do You Want To Continue Y/N");
			res=sc.next();
			if(res.equalsIgnoreCase("n"))
			{
			b=false;
			ub.exit();
			}
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}
}