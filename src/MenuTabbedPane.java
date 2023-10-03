import java.util.ArrayList;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
class MenuTabbedPane extends JTabbedPane {

	private final ArrayList<MenuTable> menuTableList = new ArrayList<>();

	MenuTabbedPane(MenuPage menuPage, final OrderData orderData) {
		createMenuTableOfList(menuPage, orderData);
		initTabbedPane();
		setTabTitle();
	}

	private void createMenuTableOfList(MenuPage menuPage, OrderData orderData) {
		menuTableList.add(new BurgerTable(menuPage, orderData, 0,3));
		menuTableList.add(new SnackTable(menuPage, orderData, 0, 3));
		menuTableList.add(new SetMenuTable(menuPage, orderData, 0, 3));
		menuTableList.add(new McCafeTable(menuPage, orderData, 0, 3));
		menuTableList.add(new McLunchTable(menuPage, orderData, 0, 3));
		menuTableList.add(new DrinkTable(menuPage, orderData, 0, 3));
		menuTableList.add(new McMoningTable(menuPage, orderData, 0, 3));
		menuTableList.add(new DessertTable(menuPage, orderData, 0, 3));
	}

	private void initTabbedPane() {
		this.setTabPlacement(JTabbedPane.TOP);

		for (MenuTable menuTable : menuTableList) {
			this.add(menuTable.getComponent());
		}
	}

	private void setTabTitle() {
		int menuTabIndex = 0;
		for (MenuTable menuTable : menuTableList) {
			this.setTitleAt(menuTabIndex++, menuTable.toString());
		}
	}
}
