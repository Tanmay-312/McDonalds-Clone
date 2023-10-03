import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

@SuppressWarnings("serial")
class ConfirmButton extends JButton {

  private final Color BG_COLOR = Color.WHITE;

  private final Color BASE_COLOR = Color.WHITE;
  private final Color HOVER_COLOR = Color.ORANGE;

  ConfirmButton(final String text) {
    super(text);

    initBackground();
    setListener();
  }

  private void initBackground() {
    this.setBackground(BG_COLOR);
  }

  private void setListener() {
    this.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(final MouseEvent e) {
        ConfirmButton.this.setBackground(HOVER_COLOR);
      }

      @Override
      public void mouseExited(final MouseEvent e) {
        ConfirmButton.this.setBackground(BASE_COLOR);
      }
    });
  }
}
