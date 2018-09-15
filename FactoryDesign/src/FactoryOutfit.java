//Program FactoryOutfit.java
//Purpose: This is the super class for outfits children will wear
//Developer: Carlos Portillo
enum Hat {
		POINTY, FANCY 
	};
enum Shoes{
	BOOTS, POINTY_SHOES
};
enum Top{
	DRESS, CAPE
};

public abstract class FactoryOutfit {

	private Hat hat;
	private boolean canFight = false;
	private boolean canFly = false;
	private boolean canDance = false;
	private Shoes shoes;
	private Top top;
	
	
	//returns string of what the user should get for specified outfit
	public String printWhatToGet() {
		String whatToGetString = "";
		whatToGetString = whatHatToGet(this) + ", " + whatShoesToGet(this) + ", and "
				+ whatTopToGet(this);
		return whatToGetString;
		
		
	}
	//returns string of what hat the user should get for specified outfit
	public String whatHatToGet(FactoryOutfit outfit) {
		String hatString = "";
		if(outfit.hat == Hat.FANCY) {
			hatString = "Fancy hat";
		}
		else if(outfit.hat == Hat.POINTY) {
			hatString = "Pointy hat";
		}
		return hatString;
	}
	//returns string of shoes the user should get for specified outfit
	public String whatShoesToGet(FactoryOutfit outfit){
		String shoeString = "";
		if(outfit.shoes == Shoes.BOOTS) {
			shoeString = "Boots";
		}
		else if(outfit.shoes == Shoes.POINTY_SHOES) {
			shoeString = "Pointy Shoes";
		}
		return shoeString;
	}
	//returns string of top the user should get for specified outfit
	public String whatTopToGet(FactoryOutfit outfit) {
		String topString = "";
		if(outfit.top == Top.DRESS) {
			topString = "Dress";
		}
		else if(outfit.top == Top.CAPE) {
			topString = "Cape";
		}
		return topString;
	}
	
	public String getAction() {
		String actionString = "";
		if(canFly == true) {
			actionString += " go fly,";
		}
		if(canFight == true) {
			actionString += " go fight,";
			
		}
		if(canDance == true) {
			actionString += " go dance,";
		}
		if(actionString != "") {
			actionString += " and be merry";
		}
		else {
			actionString += " be merry";
		}
		return actionString;
	}

	public Hat getHat() {
		return this.hat;
	};

	public void setHat(Hat hat) {
		this.hat = hat;
	}
	
	public boolean ableToFight() {
		return canFight;
	}
	public void setCanFight() {
		//negation
		canFight = !canFight;
	}

	public boolean ableToFly() {
		return canFly;
	}

	public void setCanFly() {
		//negation
		canFly = !canFly;
	};
	public boolean ableToDance() {
		return canDance;
	}
	public void setCanDance() {
		//negation
		canDance = !canDance;
	}

	public Shoes getShoes() {
		return shoes;
	}

	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}

	public Top getTop() {
		return top;
	}

	public void setTop(Top top) {
		this.top = top;
	}
	//method returns string of what type of outfit object is
	abstract String getOutfitType();
	
}	
