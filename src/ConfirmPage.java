import java.awt.Color;
import java.awt.Component;

@SuppressWarnings("serial")
public class ConfirmPage extends Page {

  private final CommonGuidePanel ORDER_CONFIRM_GUIDE_PANEL = new CommonGuidePanel(
     "IS THIS ORDER CORRECT?", 0, 1);

  private OrderTotalDataPanel orderTotalDataPanel;


  private final CommonGuidePanel YES_NO_SELECT_PANEL = new CommonGuidePanel(0, 2);
  private final ConfirmButton NO_BUTTON = new ConfirmButton("NO");
  private final ConfirmButton YES_BUTTON = new ConfirmButton("YES");

  public ConfirmPage() {
    super(new PageData.Builder("sound/check_eng.wav")
                      .nextPageType(Page.getOrderData().getPaymentPlace().equals(PaymentPlace.COUNTER)
                                       ? PageType.END_PAGE : PageType.PAYMENT_CARD_PAGE)
                      .previousPageType(PageType.MENU_PAGE)
                      .build());
    orderTotalDataPanel = new OrderTotalDataPanel(Page.getOrderData());

    initPage();
    initOrderTotalListPanel();
    initYesNoSelectPanel();
    setListener();
  }

  private void initPage() {
    this.setBackgroundImg("image/bg_green.png");

    this.add(ORDER_CONFIRM_GUIDE_PANEL);
    this.add(YES_NO_SELECT_PANEL);
  }

  private void initOrderTotalListPanel() {
    ORDER_CONFIRM_GUIDE_PANEL.setTitleColor(Color.GREEN);
    ORDER_CONFIRM_GUIDE_PANEL.addItem(orderTotalDataPanel);
  }

  private void initYesNoSelectPanel() {
    YES_NO_SELECT_PANEL.addItem(NO_BUTTON, YES_BUTTON);

    final int PANEL_WIDTH = Display.WINDOWS_HALF_WIDTH * 2 / 5;
    final int PANEL_HEIGHT = Display.WINDOWS_AVALIABLE_HEIGHT * 2 / 25;
    Component yesNoSelectComp = YES_NO_SELECT_PANEL;
    yesNoSelectComp.setSize(PANEL_WIDTH, PANEL_HEIGHT);
    yesNoSelectComp
        .setLocation((Display.WINDOWS_HALF_WIDTH - PANEL_WIDTH) / 2, Display.WINDOWS_AVALIABLE_HEIGHT
            * 3 / 4);
  }


  private void setListener() {
    this.NO_BUTTON.addActionListener((e) -> this.loadPreviousPage());

    this.YES_BUTTON.addActionListener((e) -> this.loadNextPage());
  }
}
