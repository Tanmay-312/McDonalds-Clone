import java.awt.BorderLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SelectedOrderConfirmPanel extends JPanel {

  private final TextToolbarPanel textToolbarPanel;
  private final OrderListPanel orderListPanel;
  private final OrderDataConfirmPanel orderDataConfirmPanel;

  private final OrderData orderData;

  public SelectedOrderConfirmPanel(MenuPage menuPage, OrderData orderData) {
    this.orderData = orderData;

    textToolbarPanel = new TextToolbarPanel();
    orderListPanel = new OrderListPanel();
    orderDataConfirmPanel = new OrderDataConfirmPanel(menuPage, orderData);

    initMyOrderPanel();
    addTextToTextToolbar();
  }

  private void initMyOrderPanel() {
    this.setLayout(new BorderLayout());
    this.add(textToolbarPanel.getPanel(), BorderLayout.NORTH);
    this.add(orderListPanel, BorderLayout.CENTER);
    this.add(orderDataConfirmPanel, BorderLayout.SOUTH);
  }


  private void addTextToTextToolbar() {
    textToolbarPanel.addText(("Eating place : ") + orderData
        .getEatPlace())
        .addText(("Payment Place : ") + orderData.getPaymentPlace());
  }


  public void reflesh() {
    orderListPanel.setJListMenu(orderData.getOrderMenuArray());
    orderDataConfirmPanel.refresh();
  }
}
