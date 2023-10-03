import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class OrderDataConfirmPanel extends JPanel {

  private final JLabel ORDER_TEXT_LABEL = new JLabel();
  private final JLabel ORDER_DATA_LABEL = new JLabel();
  private final JButton CANCLE_BTN = new JButton();
  private final JButton PAYMENT_BTN = new JButton();

  private final Color BG_COLOR = Color.WHITE;
  private final Color CANCLE_BTN_COLOR = Color.GRAY;
  private final Color PAYMENT_BTN_COLR = Color.ORANGE;

  private MenuPage menuPage;
  private final OrderData orderData;

  OrderDataConfirmPanel(MenuPage menuPage, OrderData orderData) {
    this.menuPage = menuPage;
    this.orderData = orderData;

    initOrderConfirmPanel();

    initTextLabel();
    initDataLabel();
    initButton();

    setListener();
  }

  private void initOrderConfirmPanel() {
    this.setLayout(new GridLayout(0, 4));
    this.setBackground(BG_COLOR);
    this.add(ORDER_TEXT_LABEL);
    this.add(ORDER_DATA_LABEL);
    this.add(CANCLE_BTN);
    this.add(PAYMENT_BTN);
  }

  private void initTextLabel() {
    ORDER_TEXT_LABEL.setText("<html>Order quantity<br>Order amount<br>Total calories</html>");
    ORDER_TEXT_LABEL.setHorizontalAlignment(JLabel.CENTER);
  }

  private void initDataLabel() {
    ORDER_DATA_LABEL.setText("<html>" + orderData.getOrderQuantity() +
        "<br>" + orderData.getOrderAmount() +
        "<br>" + orderData.getOrderKCal() + "</html>");
    ORDER_DATA_LABEL.setHorizontalAlignment(JLabel.CENTER);
  }

  private void initButton() {
    CANCLE_BTN.setText("CANCEL ORDER");
    CANCLE_BTN.setBackground(CANCLE_BTN_COLOR);

    PAYMENT_BTN.setText("COMPLETE ORDER");
    PAYMENT_BTN.setBackground(PAYMENT_BTN_COLR);
  }

  private void setListener() {
    CANCLE_BTN.addActionListener((e) -> {
      orderData.clearMenu();
      menuPage.reflesh();
    });

    PAYMENT_BTN.addActionListener((e) -> {
      if (orderData.getOrderQuantity() == 0) {
        AudioPlayer.newInstance("sound/order_eng.wav").play();
      } else {
        menuPage.nextPage();
      }
    });
  }

  void refresh() {
    ORDER_DATA_LABEL.setText("<html>" + orderData.getOrderQuantity() +
        "<br>" + orderData.getOrderAmount() +
        "<br>" + orderData.getOrderKCal() + "</html>");
  }
}
