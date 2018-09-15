
public class Wizard extends FactoryOutfit {
	
	public Wizard() {
		setHat(Hat.POINTY);
		setShoes(Shoes.BOOTS);
		setTop(Top.CAPE);
		setCanDance();
		setCanFly();
	}

	@Override
	String getOutfitType() {
		return "Wizard";
	}
}
