public class SnackTable extends MenuTable
{

  public SnackTable(MenuPage menuPage, final OrderData orderData, final int rows, final int cols) {
    super(menuPage, rows, cols);
    resisterSnack(orderData);
  }

  private void resisterSnack(final OrderData orderData) {
    this.addMenu(
        createMenuButton("image/snack/prol_201312040705101540.png",
            createMenu("McNuggets® 4pc", 200, 185)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041109175130.png",
            createMenu("McNuggets® 6pc", 300, 378)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041117509620.png",
            createMenu("McNuggets® 10pc", 400, 463)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041119014910.png",
            createMenu("McNuggets® 20pc", 900, 925)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041112149570.png",
            createMenu("McSpicy™ Chicken Tenders 2pc",
                300, 180)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312041113153590.png",
            createMenu("McSpicy™ Chicken Tenders 4pc",
                500, 359)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312051035534240.png",
            createMenu("McSpicy™ Chicken Tenders 8pc",
                900, 719)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201404300757383040.png",
            createMenu("McWings™ 2pc", 700, 236)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201404300800189010.png",
            createMenu("McWings™ 4pc", 400, 472)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201404300802241440.png",
            createMenu("McWings™ 8pc", 800, 945)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201402220248443700.png",
            createMenu("Double Chicken Box", 1300, 1644)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201405120556246810.png",
            createMenu("Chicken Snack Pack", 800, 935)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201704250505221790.png",
            createMenu("Jeju Tangerine Salad", 500, 18)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201703240201573360.png",
            createMenu("Waffle Fries", 200, 197)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201504290918266140.png",
            createMenu("French Fries", 200, 368)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312111049449760.png",
            createMenu("McSpicy™ Chicken Snack Wrap®",
                500, 296)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201401090204552140.png",
            createMenu("Spicy Beef Snack Wrap®", 250, 297)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201312130709085280.png",
            createMenu("Pineapple Fruit Cup", 200, 0)
            , orderData));
    this.addMenu(
        createMenuButton("image/snack/prol_201311280851341080.png",
            createMenu("Hash Brown", 150, 156)
            , orderData));
  }

  @Override
  public String toString() {
    return "Snacks & Sides";
  }
}
