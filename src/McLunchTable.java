
public class McLunchTable extends MenuTable {

  public McLunchTable(MenuPage menuPage, final OrderData orderData, final int rows,
      final int cols) {
    super(menuPage, rows, cols);
    resisterMcLunch(orderData);
  }

  private void resisterMcLunch(final OrderData orderData) {
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201704280826064130.png",
            createMenu(
                "Crispy Oriental Chicken Burger Meal",
                5500, 988)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201402210535304330.png",
            createMenu("Big Mac®<br>Extra Value Meal", 400, 880)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021239480850.png",
            createMenu("McSpicy™ Shanghai Burger<br>Extra Value Meal", 400, 831)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201508070731369560.png",
            createMenu("1955 Burger™<br>Extra Value Meal",
                500, 877)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021239276890.png",
            createMenu("Quarter Pounder® with Cheese<br>Extra Value Meal", 500, 864)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201612221010079000.png",
            createMenu("Supreme Shrimp Burger Meal", 400, 772)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201612221010197520.png",
            createMenu("Shrimp Beef Burger Meal", 500, 893)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021239122200.png",
            createMenu("Bacon Tomato Deluxe™<br>Extra Value Meal", 500, 887)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021240387800.png",
            createMenu("Bulgogi Burger<br>Extra Value Meal",
                300, 767)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_lunch/prol_201312021240536440.png",
            createMenu("Double Bulgogi Burger<br>Extra Value Meal",900, 1014)
            , orderData));
  }

  @Override
  public String toString() {
    return "McLunch™";
  }
}
