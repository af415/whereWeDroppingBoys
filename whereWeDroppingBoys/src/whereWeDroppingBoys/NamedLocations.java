package whereWeDroppingBoys;

public enum NamedLocations {
	NamedLocations(1, "Anarchy Acres"), DustyDepot(2, "Dusty Depot"), FatalFields(
			3, "Fatal Fields"), FlushFactory(4, "Flush Factory"), GreasyGrove(
			5, "Greasy Grove"), HauntedHills(6, "Haunted Hills"), JunkJunction(
			7, "Junk Junction"), LonelyLodge(8, "Lonely Lodge"), LootLake(9,
			"Loot Lake"), MoistyMire(10, "Moisty Mire"), PleasentPark(11,
			"Pleasent Park"), RetailRow(12, "Retail Row"), SaltySprings(13,
			"Salty Springs"), ShiftyShafts(14, "Shifty Shafts"), SnobbyShores(
			15, "Snobby Shores"), TiltedTowers(16, "Tilted Towers"), TomatoTown(
			17, "Tomato Town"), WailingWoods(18, "Wailing Woods");

	private final int index;
	private final String locationName;

	NamedLocations(int index, String locationName) {
		this.index = index;
		this.locationName = locationName;
	}

	public int getIndex() {
		return index;
	}

	public String getLocationName() {
		return locationName;
	}

}
