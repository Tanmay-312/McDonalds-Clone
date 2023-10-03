import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class PaymentPlacePage extends Page {

  private final CommonGuidePanel PAYMENT_SELECT_PANEL = new CommonGuidePanel("WHERE DO YOU WANT TO PAY?", 0, 2);

  private final ImageTextButton COUNTER_BTN = new ImageTextButton();
  private final ImageTextButton KIOSK_BTN = new ImageTextButton();

  private ActionListener placeListener = null;

  public PaymentPlacePage() {
    super(new PageData.Builder("sound/pay_eng.wav")
                      .nextPageType(PageType.MENU_PAGE)
                      .previousPageType(PageType.EAT_PLACE_PAGE)
                      .build());

    initPage();
    initPaymentSelectPanel();
    initListeners();
    setListeners();
  }

  private void initPage() {
    this.setBackgroundImg("image/bg_green.png");
    this.showBackBtn();
  }

  private void initPaymentSelectPanel() {
    initKioskButton();
    PAYMENT_SELECT_PANEL.addItem(COUNTER_BTN, KIOSK_BTN);

    this.add(PAYMENT_SELECT_PANEL);
  }

  private void initKioskButton() {
    final int BUTTON_WIDTH = Display.WINDOWS_HALF_WIDTH * 4 / 15;
    final int BUTTON_HEIGHT = Display.WINDOWS_AVALIABLE_HEIGHT * 1 / 5;

    COUNTER_BTN.setText("PAYMENT AT THE COUNTER");
    COUNTER_BTN.setResizedImg(new ImageIcon("image/counter.jpg"), BUTTON_WIDTH, BUTTON_HEIGHT);

    KIOSK_BTN.setText(
        "<html><center>" + ("DIRECT PAYMENT IN McD<br>(CARD)")+ "</center></html>");
    KIOSK_BTN.setResizedImg(new ImageIcon("image/kiosk.jpg"), BUTTON_WIDTH, BUTTON_HEIGHT);
  }

  private void initListeners() {
    this.placeListener = (eventSource) -> {
      Object source = eventSource.getSource();

      if (source.equals(COUNTER_BTN)) {
        Page.getOrderData().setPaymentPlace(PaymentPlace.COUNTER);
      } else if (source.equals(KIOSK_BTN)) {
        Page.getOrderData().setPaymentPlace(PaymentPlace.ONLINE);
      }

      this.loadNextPage();
    };
  }

  private void setListeners() {
    COUNTER_BTN.addActionListener(placeListener);

    KIOSK_BTN.addActionListener(placeListener);
  }
}
