import java.io.*;
import java.lang.*;
import java.util.*;
public class gmail
{
	static Scanner sc = new Scanner(System.in);
    public static void main(String args[])throws IOException
    {
    	char option;
    	do
    	{
    		InputStreamReader I=new InputStreamReader(System.in);
    		BufferedReader B=new BufferedReader(I);
    		System.out.println("");
    		System.out.println("***************Menu*****************");
    		System.out.println("");
    		System.out.println("1: Signup");
    		System.out.println("2: Login");
    		System.out.println("3: Compose");
    		System.out.println("");
    		System.out.print("Enter your choice : ");
    		String ch=B.readLine();
    		if(ch.equals("signup") || ch.equals("1"))
    		{
    			InputStreamReader reader=new InputStreamReader(System.in);
    			BufferedReader input=new BufferedReader(reader);
    			System.out.println("");
    			System.out.print("Create new account : ");
    			java.lang.String User=input.readLine();
    			System.out.print("Password : ");
    			java.lang.String Pass=input.readLine();
    			System.out.println("");
    			System.out.println("New ID created successfully " + User);
    			FileWriter fout=new FileWriter(User+"@gmail.com");
    			BufferedWriter bout=new BufferedWriter(fout);
    			PrintWriter pout=new PrintWriter(bout);
    			pout.println(Pass);
    			FileWriter fot=new FileWriter(User);
    			BufferedWriter bot=new BufferedWriter(fot);
    			PrintWriter pot=new PrintWriter(bot);
    			pout.close();
    			bout.close();
    			pout.close();
    		}
    	        else if(ch.equals("login") || ch.equals("2"))
    		{
    			InputStreamReader reader=new InputStreamReader(System.in);
    			BufferedReader input=new BufferedReader(reader);
    			System.out.print("Username : ");
    			java.lang.String User=input.readLine();
    			System.out.print("Password : ");
    			java.lang.String Pass=input.readLine(); 
    			FileReader fout=new FileReader(User+"@gmail.com");
    			BufferedReader bout=new BufferedReader(fout);
    			java.lang.String data=bout.readLine();
    			if(Pass.equals(data))
    			{
    				System.out.println("Logged On");
    				System.out.println("");
    				System.out.print("Do you want to go to the inbox (yes/no) : ");
    				java.lang.String Ask=input.readLine();
    				if(Ask.equals("yes") || Ask.equals("Y") || Ask.equals("y"))
    				{
    					FileReader f=new FileReader(User);
    					BufferedReader b=new BufferedReader(f);
    					System.out.println("");
    					java.lang.String Composed;
    					int i=0;
    					while((Composed=b.readLine())!=null)
    					{
    						i++;
    						System.out.println(Composed);
    					}
    					System.out.println("");
    					b.close();
    					bout.close();
    				}
    		}
    		else
    		{
    			System.out.println("Wrong password!");
    		}
    	}
    		else if(ch.equals("compose") || ch.equals("3"))
    		{
    			InputStreamReader reader=new InputStreamReader(System.in);
    			BufferedReader input=new BufferedReader(reader);
    			Calendar c=Calendar.getInstance();
    			System.out.print("Username: ");
    			java.lang.String User1=input.readLine();
    			System.out.print("Password: ");
    			java.lang.String Pass=input.readLine();
    			FileReader fout=new FileReader(User1+"@gmail.com");
    			BufferedReader bout=new BufferedReader(fout);
    			java.lang.String data=bout.readLine();
    			if(Pass.equals(data))
    			{
    				System.out.println("Logged On!");
    				System.out.print("From : " +User1);
    				// java.lang.String From=input.readLine();
    				System.out.println("");
    				System.out.print("To : ");
    				java.lang.String User=input.readLine();
    				System.out.println("");
    				System.out.println("Compose :");
    				java.lang.String Body=input.readLine();
    				FileWriter fin=new FileWriter(User);
    				BufferedWriter bin=new BufferedWriter(fin);
    				PrintWriter pin=new PrintWriter(bin);
    				System.out.println("");
    				pin.println("Time:"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)+" PM");
    				pin.println("From "+User1+" ");
    				pin.println(Body);
    				System.out.println("");
    				System.out.println("Mail sent");
    				bout.close();
    				pin.close();
    				bin.close();
    				pin.close();
    			}
    			else
    			{
    				System.out.println("Wrong password!");
    			}
    		}
    	else
    		System.out.println("Wrong choice!");
    		System.out.println("");
    	System.out.println("Want to go to the menu again");
    	option=sc.nextLine().charAt(0);	
    	}while(option=='Y' || option == 'y');
    }
}

    
    
    
    
    
    

    
    
    
    
    
