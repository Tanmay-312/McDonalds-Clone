public class BurgerTable extends MenuTable {

  public BurgerTable(MenuPage menuPage, final OrderData orderData, final int rows, final int cols) {
    super(menuPage, rows, cols);
    resisterBurger(orderData);
  }

  private void resisterBurger(final OrderData orderData) {
    this.addMenu(
        createMenuButton("image/burger/Golden Egg Cheeseburger.png",
            createMenu("Golden Egg Cheeseburger", 800, 636),orderData));
    this.addMenu(
        createMenuButton("image/burger/Grilled Mushroom Burger.png",
            createMenu("Grilled Mushroom Burger", 800, 679),orderData));
    this.addMenu(
        createMenuButton("image/burger/Crispy Oriental Chicken Burger.png",
            createMenu("Crispy Oriental Chicken Burger",570, 620), orderData));
    this.addMenu(
        createMenuButton("image/burger/Big Mac®.png",
            createMenu("BigMac®", 490, 512), orderData));
    this.addMenu(
        createMenuButton("image/burger/Mega Mac.png",
            createMenu("Mega Mac", 600, 694), orderData));
    this.addMenu(
        createMenuButton("image/burger/McSpicy™ Shanghai Burger.png",
            createMenu("McSpicy™ Shanghai Burger", 400,463), orderData));
    this.addMenu(
        createMenuButton("image/burger/1955 Burger™.png",
            createMenu("1955 Burger™", 590, 509), orderData));
    this.addMenu(
        createMenuButton("image/burger/Double 1955 Burger™.png",
            createMenu("Double 1955 Burger™", 730, 726), orderData));
    this.addMenu(
        createMenuButton("image/burger/Quarter Pounder® with Cheese.png",
            createMenu("Quarter Pounder® with Cheese", 540,496), orderData));
    this.addMenu(
        createMenuButton("image/burger/Double Quarter Pounder® with Cheese.png",
            createMenu("Double Quarter Pounder® with Cheese", 690,712), orderData));
    this.addMenu(
        createMenuButton("image/burger/Supreme Shrimp Burger.png",
            createMenu("Supreme Shrimp Burger", 490, 404), orderData));
    this.addMenu(
        createMenuButton("image/burger/Shrimp Beef Burger.png",
            createMenu("Shrimp Beef Burger", 590, 525), orderData));
    this.addMenu(
        createMenuButton("image/burger/Bacon Tomato Deluxe™.png",
            createMenu("Bacon Tomato Deluxe™", 550, 519), orderData));
    this.addMenu(
        createMenuButton("image/burger/Tomato Cheeseburger.png",
            createMenu("Tomato Cheeseburger", 250, 335), orderData));
    this.addMenu(
        createMenuButton("image/burger/Bulgogi Burger.png",
            createMenu("Bulgogi Burger", 250, 398), orderData));
    this.addMenu(
        createMenuButton("image/burger/Double Bulgogi Burger.png",
            createMenu("Double Bulgogi Burger", 490, 646), orderData));
    this.addMenu(
        createMenuButton("image/burger/Chicken Burger.png",
            createMenu("Chicken Burger", 250, 324), orderData));
    this.addMenu(
        createMenuButton("image/burger/Cheeseburger.png",
            createMenu("Cheeseburger", 300, 302), orderData));
    this.addMenu(
        createMenuButton("image/burger/Hamburger.png",
            createMenu("Hamburger", 250, 253), orderData));
  }

  @Override
  public String toString() {
    return "Burgers & Sandwiches";
  }
}
