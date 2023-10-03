import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class EatPlacePage extends Page {
  
  private enum SelectType {
    EAT_PLACE, LANG;
  }

  public EatPlacePage() {
    super(new PageData.Builder("sound/place_eng.wav")
                      .nextPageType(PageType.PAYMENT_PLACE_PAGE)
                      .previousPageType(PageType.START_PAGE)
                      .build());
    
    this.setBackgroundImg("image/bg_green.png");
    this.showBackBtn();
    
    addEatPlaceGuidePanel();
  }
  
  private void addEatPlaceGuidePanel() {
    this.add(createGuidePanel(SelectType.EAT_PLACE,
        "PLEASE SELECT A PLACE TO EAT"));
  }
  
  private CommonGuidePanel createGuidePanel(final SelectType type, final String text) {
    final CommonGuidePanel guidePanel = new CommonGuidePanel(text, 0, 2);
    switch (type) {
      case EAT_PLACE : 
        guidePanel.addItem(
            createPlaceBtn(EatPlace.EAT_IN, "EAT IN", "image/icon_eat.jpg"),
            createPlaceBtn(EatPlace.TAKE_OUT, "TAKE OUT", "image/icon_take.jpg"));
        break;
      default :
    }
    return guidePanel;
  }
  
  private ImageTextButton createPlaceBtn(final EatPlace place, final String text, final String imgPath) {
    final ImageTextButton imgTextBtn = new ImageTextButton(text, new ImageIcon(imgPath));
    imgTextBtn.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(final MouseEvent e) {
        Page.getOrderData().setEatPlace(place);
        EatPlacePage.this.loadNextPage();
      }
    });

    return imgTextBtn;
  }
  
  @SuppressWarnings("unused")
private void initLangPanel(final CommonGuidePanel guidePanel) {
    final int width = Display.WINDOWS_HALF_WIDTH * 4 / 5;
    guidePanel.setGuidePanelSize(width, Display.WINDOWS_AVALIABLE_HEIGHT * 2 / 15);
    guidePanel.setGuidePanelLocation((Display.WINDOWS_HALF_WIDTH - width) / 2,
        Display.WINDOWS_AVALIABLE_HEIGHT * 3 / 4);
  }
  
  @SuppressWarnings("unused")
private ImageTextButton createLangBtn(final Language lang, final String text) {
    final ImageTextButton imgTextBtn = new ImageTextButton(text);
    imgTextBtn.setForeground(Color.BLACK);
    imgTextBtn.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(final MouseEvent e) {
        EatPlacePage.this.reloadPage();
      }
    });

    return imgTextBtn;
  }
}