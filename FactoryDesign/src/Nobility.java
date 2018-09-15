
public class Nobility extends FactoryOutfit {

	public Nobility() {
		setHat(Hat.FANCY);
		setShoes(Shoes.POINTY_SHOES);
		setTop(Top.DRESS);	
		setCanFight();
		setCanDance();
	}

	@Override
	String getOutfitType() {
		return "Noble";
	}
}
