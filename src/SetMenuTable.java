public class SetMenuTable extends MenuTable {

  public SetMenuTable(MenuPage menuPage, final OrderData orderData, final int rows,
      final int cols) {
    super(menuPage, rows, cols);
    resisterSetMenu(orderData);
  }

  private void resisterSetMenu(final OrderData orderData) {
    this.addMenu(
        createMenuButton("image/set_menu/prol_201703290425058560.png",
            createMenu("Golden Egg Cheeseburger Meal",
                900, 1004)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201703290425447840.png",
            createMenu("Grilled Mushroom Burger Meal",
                900, 1047)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201704280826064130.png",
            createMenu("Crispy Oriental Chicken Burger Meal",700, 988)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201402210535304330.png",
            createMenu("Big Mac® Extra<br>Value Meal", 600, 880)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201605160956103670.png",
            createMenu("Mega Mac Extra Value Meal", 700, 1062)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021239480850.png",
            createMenu("McSpicy™ Shanghai Burger<br>Extra Value Meal", 600, 831)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201508070731369560.png",
            createMenu("1955 Burger™<br>Extra Value Meal", 700, 877)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201403131156168140.png",
            createMenu("Double 1955 Burger™<br>Extra Value Meal", 800, 1094)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021239276890.png",
            createMenu("Quarter Pounder® with Cheese<br>Extra Value Meal", 700, 864)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312011049256070.png",
            createMenu("Double Quarter Pounder®<br>with CheeseExtra Value Meal", 800, 1080)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201612221010079000.png",
            createMenu("Supreme Shrimp Burger Meal", 600, 772)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201612221010197520.png",
            createMenu("Shrimp Beef Burger Meal", 700, 893)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021239122200.png",
            createMenu("Bacon Tomato Deluxe™<br>Extra Value Meal", 700, 887)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021240387800.png",
            createMenu("Bulgogi Burger<br>Extra Value Meal",500, 767)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312021240536440.png",
            createMenu("Double Bulgogi Burger<br>Extra Value Meal",600, 1014)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201404300804125040.png",
            createMenu("McWings™<br>Extra Value Meal", 600, 841)
            , orderData));
    this.addMenu(
        createMenuButton("image/set_menu/prol_201312011051114730.png",
            createMenu("McSpicy™ Chicken Tenders<br>Extra Value Meal", 600, 728)
            , orderData));
  }

  @Override
  public String toString() {
    return "Extra Value Meals";
  }
}
