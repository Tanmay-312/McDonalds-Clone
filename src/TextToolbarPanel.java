import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TextToolbarPanel {

  private final JPanel TEXT_TOOLBAR_PANEL = new JPanel();

  private final Color BG_COLOR = Color.BLACK;
  private final Color TEXT_COLOR = Color.WHITE;

  private int textCnt;

  TextToolbarPanel() {
    initTextToolbarPanel();
  }

  private void initTextToolbarPanel() {
    TEXT_TOOLBAR_PANEL.setBackground(BG_COLOR);
  }

  TextToolbarPanel addText(String text) {
    TEXT_TOOLBAR_PANEL.setLayout(new GridLayout(0, ++textCnt));
    TEXT_TOOLBAR_PANEL.add(createDesignedLabel(text));

    return this;
  }

  private JLabel createDesignedLabel(String text) {
    JLabel label = new JLabel(text, JLabel.CENTER);
    label.setForeground(TEXT_COLOR);

    return label;
  }

  Component getPanel() {
    return TEXT_TOOLBAR_PANEL;
  }
}
