package Para_3;

import java.util.*;

/**  
 * All rights Reserved, Designed By www.tydic.com
 * @Title:  Retirement.java   
 * @Package Para_3   
 * @Description:    TODO  
 * @author: Jun 
 * @date:   2018年12月2日 上午12:14:56   
 * @version V1.0 
 */
public class Retirement 
{
	public static void main(String[] args)
	{
		//read input
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much do you need to retire?");
		double goal = in.nextDouble();
		
		System.out.println("How much money will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.println("Interset rate in %");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		//update account balance while goal isn't reached
		while (balance < goal)
		{
			//add this year's payment and interst
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
		System.out.println("Your can retire in " + years + "years.");
	}
}
