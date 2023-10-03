import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class StartPage extends Page {
  
  public StartPage() {
    super(new PageData.Builder("sound/start_eng.wav")
                      .nextPageType(PageType.EAT_PLACE_PAGE)
                      .build());
    
    addImageTextPanel();
    setNextPage();
  }
  
  private void addImageTextPanel() {
    this.add(createImageTextPanel());
  }
  
  private ImageTextPanel createImageTextPanel() {
    final ImageTextPanel imgTextPanel = new ImageTextPanel(new ImageIcon("image/bg_info2.jpg"),"TOUCH TO START");
    imgTextPanel.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
    imgTextPanel.setLocation(0, 0);
    
    return imgTextPanel;
  }
  
  private void setNextPage() {
    this.setOnClickListener(() -> StartPage.this.loadNextPage());
  }
}