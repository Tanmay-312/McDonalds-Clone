import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class EndPage extends Page {

  public EndPage() {
    super(new PageData.Builder(Page.getOrderData()
    									.getPaymentPlace().equals(PaymentPlace.COUNTER)
    									? "sound/counter_eng.wav" : "sound/end_eng.wav")
                      					.nextPageType(PageType.START_PAGE)
                      					.build());

    emptyOrder();
    addImgTextPanel();
    setNextPage();
  }
  
  private void emptyOrder() {
    Page.getOrderData().emptyOrder();
  }
  
  private void addImgTextPanel() {
    this.add(createImgTextPanel());
  }
  
  private ImageTextPanel createImgTextPanel() {
    final ImageTextPanel imgTextPanel = new ImageTextPanel(new ImageIcon("image/bg_info3.jpg"), "YOUR ORDER IS COMPLETE");
    imgTextPanel.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
    imgTextPanel.setLocation(0, 0);
    imgTextPanel.setTextBackground(Color.BLUE);
    
    return imgTextPanel;
  }

  private void setNextPage() {
    this.setOnClickListener(() -> EndPage.this.loadNextPage());
  }
}
