import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public abstract class MenuTable {

  private final JScrollPane scroll = new JScrollPane();
  private final JPanel menuPanel = new JPanel();
  private final MenuPage menuPage;

  MenuTable(MenuPage menuPage, final int rows, final int cols) {
    this.menuPage = menuPage;

    initScroll();
    initPanel(rows, cols);
  }

  private void initScroll() {
    scroll.getVerticalScrollBar().setUnitIncrement(10);
    scroll.getHorizontalScrollBar().setUnitIncrement(10);
    scroll.setViewportView(menuPanel);
  }

  private void initPanel(int rows, int cols) {
    rows = (rows > 0) ? rows : 0;
    cols = (cols > 0) ? cols : 0;
    menuPanel.setLayout(new GridLayout(rows, cols));
    menuPanel.setBackground(Color.WHITE);
  }

  Menu createMenu(final String name, final int price, final int kCal) {
    return new Menu(name, price, kCal);
  }

  MenuButton createMenuButton(final String imgPath, final Menu menu, final OrderData orderData) {
    return new MenuButton(imgPath, menu, menuPage, orderData);
  }


  void addMenu(final MenuButton... buttons) {
    for (MenuButton button : buttons) {
      menuPanel.add(button);
    }
  }

  public Component getComponent() {
    return scroll;
  }

  public abstract String toString();
}
