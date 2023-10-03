public class DessertTable extends MenuTable {

	public DessertTable(MenuPage menuPage, final OrderData orderData, final int rows,
			final int cols) {
		super(menuPage, rows, cols);
		resisterDessert(orderData);
	}

	private void resisterDessert(final OrderData orderData) {
		this.addMenu(
				createMenuButton("image/dessert/prol_201703290608504310.png",
						createMenu("Reese’s McFlurry®", 280, 300)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201601311029185960.png",
						createMenu("Churros", 200, 181)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201312050311223540.png",
						createMenu("Oreo McFlurry®", 300, 322)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201312041015558530.png",
						createMenu("Strawberry Oreo McFlurry®", 300,
								291)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201312050311494320.png",
						createMenu("Choco Oreo McFlurry®", 300, 375)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201311280226114370.png",
						createMenu("Chocolate Sundae", 200, 307)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201509091159582930.png",
						createMenu("Caramel Sundae", 200, 306)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201311280223173290.png",
						createMenu("Strawberry Sundae", 200, 261)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201311280221377300.png",
						createMenu("Oreo Affogato", 280, 248)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201311280227345110.png",
						createMenu("Chocolate Cone", 80, 229)
						, orderData));
		this.addMenu(
				createMenuButton("image/dessert/prol_201311280228539530.png",
						createMenu("Ice Cream Cone", 60, 153)
						, orderData));
	}

	@Override
	public String toString() {
		return "Desserts";
	}
}
