import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
class OrderListPanel extends JScrollPane {

	public final JList<Menu> J_LIST = new JList<>();

	public OrderListPanel() {
		initScrollPane();
	}

	private void initScrollPane() {
		this.setViewportView(J_LIST);
		this.setBorder(
				BorderFactory.createTitledBorder("Select Menu"));
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	}

	void setJListMenu(Menu[] menuArray) {
		J_LIST.setListData(menuArray);
		scrollDown();
	}

	private void scrollDown() {
		getVerticalScrollBar().setValue(getVerticalScrollBar().getMaximum());
	}
}
