
public class Fairy extends FactoryOutfit {
	
	public Fairy() {
		setHat(Hat.POINTY);
		setShoes(Shoes.POINTY_SHOES);
		setTop(Top.DRESS);
		setCanDance();
		setCanFly();
	}

	@Override
	String getOutfitType() {
		return "Fairy";
	}
	

	
}
