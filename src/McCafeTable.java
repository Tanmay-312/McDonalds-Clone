
public class McCafeTable extends MenuTable {

  public McCafeTable(MenuPage menuPage, final OrderData orderData, final int rows, final int cols) {
    super(menuPage, rows, cols);
    resisterMcCafe(orderData);
  }

  private void resisterMcCafe(final OrderData orderData) {
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280310302830.png",
            createMenu("Premium Roast™ Coffee", 150, 10)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280331001790.png",
            createMenu("Iced Coffee", 150, 10)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280338541970.png",
            createMenu("Americano", 200, 13)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280353272690.png",
            createMenu("Café Latte", 240, 157)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160558512030.png",
            createMenu("Caramel Macchiato", 200, 217)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280345458940.png",
            createMenu("Cappuccino", 200, 133)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501290511504900.png",
            createMenu("Espresso", 150, 6)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201502020631462070.png",
            createMenu("Iced Americano", 250, 11)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280314115040.png",
            createMenu("Iced Café Latte", 290, 103)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160619136820.png",
            createMenu("Iced Caramel Macchiato", 290, 187)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210613038480.png",
            createMenu("Apple Mango Yogurt Smoothie", 380,
                264)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210622303450.png",
            createMenu("Strawberry Banana Yogurt Smoothie", 380, 229)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210629445890.png",
        		createMenu("Blueberry Pomegranate Yogurt Smoothie",380, 222)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201704210506373340.png",
            createMenu("Strawberry Lemonade", 150, 197)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201610261154116690.png",
            createMenu("Mocha Frappe", 380, 346)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312090423396200.png",
            createMenu("Americano", 200, 5)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100147004590.png",
            createMenu("Cappuccino", 300, 110)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100203305430.png",
            createMenu("Flat White", 300, 142)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170459513500.png",
            createMenu("Café Mocha", 300, 146)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312091105256050.png",
            createMenu("Espresso", 200, 3)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312091105541820.png",
            createMenu("Espresso Macchiato", 200, 6)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170531596900.png",
            createMenu("Piccolo", 200, 76)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160644549250.png",
            createMenu("Chocolate Affogato", 300, 250)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170559363440.png",
            createMenu("Affogato", 200, 157)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100227331810.png",
            createMenu("Café Latte", 300, 135)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170502066960.png",
            createMenu("Caramel Latte", 300, 200)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510160657022070.png",
            createMenu("Hazelnut Latte", 300, 198)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100251215360.png",
            createMenu("Vanilla Latte", 300, 203)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100734101020.png",
            createMenu("Hot Chocolate", 300, 186)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170401131370.png",
            createMenu("Premium Tea", 250, 0)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312091104271210.png",
            createMenu("Babycino", 500, 40)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100847100620.png",
            createMenu("Iced Americano", 240, 5)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100851144040.png",
            createMenu("Iced Chocolate", 380, 327)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100856188810.png",
            createMenu("Iced Cafe Mocha", 380, 167)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100908407470.png",
            createMenu("Peach Ice Tea", 390, 155)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100918340880.png",
            createMenu("Raspberry Ice Tea", 390, 155)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201312100929471100.png",
            createMenu("Iced Cafe Latte", 300, 93)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170506071500.png",
            createMenu("Iced Caramel Latte", 400, 158)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170503515230.png",
            createMenu("Iced Hazelnut Latte", 400, 156)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170505356570.png",
            createMenu("Iced Vanilla Latte", 400, 161)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201403170507233320.png",
            createMenu("Chocolate Frappe", 400, 390)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201510280616550500.png",
            createMenu("Strawberry Frappe", 300, 332)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_cafe/prol_201501280222157270.png",
            createMenu("Tomato Juice", 300, 96)
            , orderData));
  }

  @Override
  public String toString() {
    return "McCafé®";
  }
}
