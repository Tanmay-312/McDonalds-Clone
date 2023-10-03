public class McMoningTable extends MenuTable {

  public McMoningTable(MenuPage menuPage, final OrderData orderData, final int rows,
      final int cols) {
    super(menuPage, rows, cols);
    resisterMcMoning(orderData);
  }

  private void resisterMcMoning(final OrderData orderData) {
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160247462420.png",
            createMenu("Tomato Bacon Egg McMuffin™",
                400, 448)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201311280852253010.png",
            createMenu("BLT Muffin", 400, 385)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160249302220.png",
            createMenu("Tomato Chicken 'n Cheese Muffin",
                500, 510)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210536286650.png",
            createMenu("Egg McMuffin™", 300, 286)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201311280852044240.png",
            createMenu("Bacon Egg McMuffin™", 300, 289)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201603170147008720.png",
            createMenu("Sausage McMuffin™", 250, 338)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210548008880.png",
            createMenu("Sausage Egg McMuffin™", 300, 414)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210551034670.png",
            createMenu("Chicken 'n Cheese Muffin", 300, 338)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201312111049449760.png",
            createMenu("McSpicy™ Chicken Snack Wrap®",
                250, 296)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402240350481910.png",
            createMenu("Deluxe Breakfast™", 500, 816)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402240351164550.png",
            createMenu("Big Breakfast™", 400, 596)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201402210552030320.png",
            createMenu("Hotcakes 3pc", 300, 331)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160231285820.png",
            createMenu("Tomato Bacon Egg McMuffin™<br>Extra Value Breakfast", 480, 448)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280449072030.png",
            createMenu("BLT Muffin<br>Extra Value Breakfast",400, 385)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201703160238588990.png",
            createMenu("Tomato Chicken 'n Cheese Muffin<br>Extra Value Breakfast", 500, 510)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280441107300.png",
            createMenu("Egg McMuffin™<br>Extra Value Breakfast",430, 452)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280442076260.png",
            createMenu("Bacon Egg McMuffin™<br>Extra Value Breakfast", 430, 454)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280444463940.png",
            createMenu("Sausage McMuffin™<br>Extra Value Breakfast",
                400, 504)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280443577710.png",
            createMenu("Sausage Egg McMuffin™<br>Extra Value Breakfast", 400, 579)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280445552890.png",
            createMenu("Chicken 'n Cheese Muffin<br>Extra Value Breakfast", 400, 503)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280446555460.png",
            createMenu("Deluxe Breakfast™<br>Extra Value Breakfast", 300, 826)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280447308350.png",
            createMenu("Big Breakfast™<br>Extra Value Breakfast",
                500, 605)
            , orderData));
    this.addMenu(
        createMenuButton("image/mc_moning/prol_201501280448120810.png",
            createMenu("Hotcakes 3pc<br>Extra Value Breakfast", 400,
                340)
            , orderData));
  }

  @Override
  public String toString() {
    return "McMorning";
  }
}
