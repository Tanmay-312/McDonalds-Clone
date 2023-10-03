import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
class OrderTotalDataPanel extends JPanel {

  private final OrderData orderData;

  OrderTotalDataPanel(OrderData orderData) {
    this.orderData = orderData;

    initPanel();
  }


  private void initPanel() {
    this.setLayout(new BorderLayout());
    this.add(new JScrollPane(new JList<Menu>(orderData.getOrderMenuArray())),
        BorderLayout.CENTER);
    this.add(createTotalListPanel(), BorderLayout.SOUTH);
  }


  private JPanel createTotalListPanel() {
    JPanel totalListPanel = new JPanel();
    totalListPanel.setLayout(new GridLayout(0, 4));
    totalListPanel.add(new JLabel(("Eating place : ") + orderData.getEatPlace(), JLabel.CENTER));
    totalListPanel.add(new JLabel(("Order quantity : ") + orderData.getOrderQuantity(), JLabel.CENTER));
    totalListPanel.add(new JLabel(("Order amount : ") + orderData.getOrderAmount(), JLabel.CENTER));
    totalListPanel.add(new JLabel(("Total calories : ") + orderData.getOrderKCal(), JLabel.CENTER));

    return totalListPanel;
  }
}
