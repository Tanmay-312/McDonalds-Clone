public enum PageType {
  EMPTY_PAGE, START_PAGE, EAT_PLACE_PAGE, PAYMENT_PLACE_PAGE, MENU_PAGE, CONFIRM_PAGE, PAYMENT_CARD_PAGE, END_PAGE;

  @SuppressWarnings("serial")
public Page createPage() {
    Page page = null;
    if (this == EMPTY_PAGE) {
      page = new Page() {};
    } else if (this == START_PAGE) {
      page = new StartPage();
    } else if (this == EAT_PLACE_PAGE) {
      page = new EatPlacePage();
    } else if (this == PAYMENT_PLACE_PAGE) {
      page = new PaymentPlacePage();
    } else if (this == MENU_PAGE) {
      page = new MenuPage();
    } else if (this == CONFIRM_PAGE) {
      page = new ConfirmPage();
    } else if (this == PAYMENT_CARD_PAGE) {
      page = new PaymentCardPage();
    } else if (this == END_PAGE) {
      page = new EndPage();
    }

    return page;
  }
}
