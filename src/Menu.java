public class Menu {

  final String NAME;
  final int PRICE;
  final int K_CAL;

  public Menu(String name, int price, int kCal) {
    this.NAME = name;
    this.PRICE = price;
    this.K_CAL = kCal;
  }

  public int getPrice() {
    return PRICE;
  }

  public int getKCal() {
    return K_CAL;
  }

  String toMenuButtonText(final String priceTextColor) {
    return new StringBuilder().append("<html><center>").append(NAME).append("<br>")
        .append("Price Rs. ").append("<font color='")
        .append(priceTextColor)
        .append("'>").append(PRICE).append("</font><br>").append(K_CAL).append("KCal")
        .append("</center></html>").toString();
  }


  private String getNameWithoutTag() {

    final String tmpMenuName = NAME.replaceAll("<(/)?[bB][rR](\\s)*(/)?>", " ");

    return tmpMenuName.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "");
  }

  @Override
  public String toString() {
    return new StringBuilder().append(getNameWithoutTag()).append(" || ")
        .append("Price Rs. ").append(PRICE).append(" || ")
        .append(K_CAL)
        .append("KCal").toString();
  }
}
