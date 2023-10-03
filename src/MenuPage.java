import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MenuPage extends Page {

  private final JPanel menuPagePanel = new JPanel();

  private final ImageIcon bannerImageIcon = new ImageIcon("image/banner_top.jpg");
  private final MenuTabbedPane menuTabbedPane;
  private final SelectedOrderConfirmPanel selectedOrderConfirmPanel;

  public MenuPage() {
    super(new PageData.Builder("sound/order_eng.wav")
                      .nextPageType(PageType.CONFIRM_PAGE)
                      .previousPageType(PageType.PAYMENT_PLACE_PAGE)
                      .build());

    menuTabbedPane = new MenuTabbedPane(this, Page.getOrderData());
    selectedOrderConfirmPanel = new SelectedOrderConfirmPanel(this, Page.getOrderData());

    initPage();
    initManuPagePanel();
    setLayout();
    reflesh();
  }

  private void initPage() {
    this.showBackBtn();
    this.add(menuPagePanel);
  }

  private void initManuPagePanel() {
    menuPagePanel.setLayout(new BorderLayout());
    menuPagePanel.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
    menuPagePanel.setLocation(0, 0);

    menuPagePanel.add(createImageLabel(bannerImageIcon), BorderLayout.NORTH);
    menuPagePanel.add(menuTabbedPane, BorderLayout.CENTER);
    menuPagePanel.add(selectedOrderConfirmPanel, BorderLayout.SOUTH);

  }

  private JLabel createImageLabel(final ImageIcon imageIcon) {
    return new JLabel(
        ImageEdit.getResizeIcon(imageIcon, Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT
            / 5));
  }

  private void setLayout() {
    this.getBackButton().addActionListener((e) -> Page.getOrderData().clearMenu());
  }

  public void reflesh() {
    selectedOrderConfirmPanel.reflesh();
  }

  public void nextPage() {
    this.loadNextPage();
  }
}
