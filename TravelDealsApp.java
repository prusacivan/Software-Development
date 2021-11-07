// @author Ivan Prusac

import java.util.Scanner;

public class TravelDealsApp {

	public static void main (String[] args) {

		// we declare here local varibles
		Scanner input = new Scanner(System.in);
		String sesn;
		int num;
		// we create now variable of TravelDeals
		TravelDeals tdObj;

		// here we ask customer for input
		System.out.println ("If you wanna travel in summer seasion type: summer or if you wanna travel in winter seasion type: winter.");
		sesn = input.next();
		System.out.println("Please enter the amout of people that wanna travel.");
		num = input.nextInt();

		// now we can create an object of TravelDeals
		tdObj = new TravelDeals (sesn,num);

		// here we will preform processing (object will use method calcSingPrice)
		tdObj.calcSingPrice ();

		// output

		int prSin;
		int prGro;

		prSin = tdObj.getSinPric();
		System.out.println ("Single price is: " + prSin);

		prGro = tdObj.getGrPrice();
		System.out.println ("Price for whole group is: " + prGro);








	}








}