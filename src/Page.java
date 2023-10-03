import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class Page extends JPanel {
  
  protected interface OnClickListener {
    public void onClick();
  }
  
  private OnClickListener onClickListener = null;
  
  private static final OrderData orderData = new OrderData();
  private PageData pageData;
  
  private MainFrame mainFrame;
  private final BackButton backBtn = new BackButton();
  private String bgPath;
  
  Page() {}
  
  public Page(PageData pageData) {
    this.pageData = pageData;

    initPage();
    playVoice(pageData.getAudioPath());
    setBackBtnListener();
    setMouseListener();
  }

  private void initPage() {
    this.setLayout(null);
    this.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT);
    this.setLocation(0, 0);
  }
  
  private void playVoice(final String audioPath) {
    AudioPlayer.newInstance(audioPath).play();
  }

  private void setBackBtnListener() {
    backBtn.addActionListener(e -> loadPreviousPage());
  }
  
  protected void setOnClickListener(final OnClickListener listener) {
    onClickListener = listener;
  }
  
  private void setMouseListener() {
    this.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (onClickListener != null) { onClickListener.onClick(); }
      }
    });
  }
  
  public void setMainFrame(MainFrame mainFrame) {
    this.mainFrame = mainFrame;
  }

  protected BackButton getBackButton() {
    return backBtn;
  }

  protected void setBackgroundImg(final String bgPath) {
    if (bgPath != null) { this.bgPath = bgPath; }
  }

  protected void showBackBtn() {
    setBackBtnZOrderByTop();
    this.add(backBtn);
  }

  private void setBackBtnZOrderByTop() {
    this.setComponentZOrder(backBtn, 0);
  }

  private boolean isBgImgEmpty() {
    return bgPath != null;
  }


  @Override
  protected void paintComponent(final Graphics g) {
    if (isBgImgEmpty()) {
      try {
        BufferedImage bufferImg = ImageIO.read(new File(bgPath));
        super.paintComponent(g);
        g.drawImage(bufferImg, 0, 0, Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_AVALIABLE_HEIGHT, null);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  protected void loadNextPage() {
    PageType pageType = pageData.getNextPageType();
    if (pageType != PageType.EMPTY_PAGE) {
      mainFrame.attachPage(pageType.createPage());
    }
  }

  protected void loadPreviousPage() {
    PageType pageType = pageData.getPreviousPageType();
    if (pageType != PageType.EMPTY_PAGE) {
      mainFrame.attachPage(pageType.createPage());
    }
  }

  @SuppressWarnings("deprecation")
protected void reloadPage() {
    try {
      mainFrame.attachPage(this.getClass().newInstance());
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  protected static OrderData getOrderData() {
    return orderData;
  }
}