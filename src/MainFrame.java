import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
  
  MainFrame() {
    init();
    setLocationByCenter();
    addPage(new StartPage());
  }

  private void init() {
    this.setLayout(null);
    this.setTitle("ORDER HERE!");
    this.setSize(Display.WINDOWS_HALF_WIDTH, Display.WINDOWS_HEIGHT);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  private void setLocationByCenter() {
    this.setLocation(Display.WINDOWS_HALF_WIDTH / 2, 0);
  }
  
  public void attachPage(Page page) {
    removeAllComponents();
    addPage(page);
    refresh();
  }
  
  private void removeAllComponents() {
    this.getContentPane().removeAll();
  }
  
  private void addPage(Page page) {
    page.setMainFrame(this);
    this.getContentPane().add(page);
  }
  
  private void refresh() {
    this.revalidate();
    this.repaint();
  }
}