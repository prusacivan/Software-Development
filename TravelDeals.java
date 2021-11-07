// @author Ivan Prusac

	// A class definition

public class TravelDeals {

	// Suitable data members (instance variables)
	private String season;
	private int groupNum;
	private int groupPrice;
	private int singlePrice;

	// A constructor
public TravelDeals (String season, int groupNum){
	this.season = season;
	this.groupNum = groupNum;
	}
	// if we need to reuse inst. class we need to create another constructor without parameters
public TravelDeals(){

}
	// getter for single price
public int getSinPric() {
      return singlePrice;

}
	// getter for group price
public int getGrPrice() {
	return groupPrice;
}


public void calcSingPrice (){
	// to calculate proce for single person we will use nested if
	if (season.equals("winter")){
		if (groupNum == 1 || groupNum == 2){
			singlePrice = 450;
	    } else if (groupNum > 2 && groupNum <=6){
			singlePrice = 350;
	    } else {
			 singlePrice = 250;
	    }

    } else if (season.equals("summer")){
		if (groupNum == 1 || groupNum == 2){
			singlePrice = 575;
        } else if (groupNum > 2 && groupNum <=6){
			singlePrice = 450;
	    } else {
			singlePrice = 325;
	    }


    } else {
		singlePrice = -1;
      }
	// with this method we calculate group price
    groupPrice = singlePrice * groupNum;
}





}
