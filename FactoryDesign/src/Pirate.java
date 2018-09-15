
public class Pirate extends FactoryOutfit {
		
		public Pirate(){
			setHat(Hat.FANCY);
			setShoes(Shoes.BOOTS);
			setTop(Top.CAPE);
			setCanFight();
		}

		@Override
		String getOutfitType() {
			return "Pirate";
		}
}
