public class DrinkTable extends MenuTable {

	public DrinkTable(MenuPage menuPage, final OrderData orderData, final int rows, final int cols) {
		super(menuPage, rows, cols);
		resisterDrink(orderData);
	}

	private void resisterDrink(final OrderData orderData) {
		this.addMenu(
				createMenuButton("image/drink/prol_201312050151291100.png",
						createMenu("Coca-Cola Zero", 150, 0)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201312050152466340.png",
						createMenu("Coca-Cola", 100, 143)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201312050152466340.png",
						createMenu("Sprite", 100, 149)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201312050152466340.png",
						createMenu("Fanta", 100, 167)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201402220224483140.png",
						createMenu("Vanilla Shake", 200, 339)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201402220229522730.png",
						createMenu("Strawberry Shake", 300, 345)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201402220234029140.png",
						createMenu("Chocolate Shake", 200, 339)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201312090535528510.png",
						createMenu("Orange Juice", 200, 0)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201312011125364160.png",
						createMenu("Milk", 200, 0)
						, orderData));
		this.addMenu(
				createMenuButton("image/drink/prol_201404220647354250.png",
						createMenu("Mineral Water", 100, 0)
						, orderData));
	}

	@Override
	public String toString() {
		return "Beverages";
	}
}
