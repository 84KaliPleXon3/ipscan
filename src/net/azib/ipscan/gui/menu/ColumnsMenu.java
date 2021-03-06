package net.azib.ipscan.gui.menu;

import net.azib.ipscan.gui.actions.ColumnsActions;
import net.azib.ipscan.gui.actions.ToolsActions;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

/**
 * ColumnsMenu wrapper for type-safety.
 * This is the menu when clicking on a column header.
 */
public class ColumnsMenu extends ExtendableMenu {
	public ColumnsMenu(Shell parent,
					   ColumnsActions.SortBy sortByListener,
					   ColumnsActions.AboutFetcher aboutListener,
					   ColumnsActions.FetcherPreferences preferencesListener,
					   ToolsActions.ChooseFetchers chooseFetchersListener) {

		super(parent, SWT.POP_UP);

		initMenuItem(this, "menu.columns.sortBy", null, null, sortByListener);
		initMenuItem(this, "menu.columns.preferences", null, null, preferencesListener);
		initMenuItem(this, "menu.columns.about", null, null, aboutListener);
		initMenuItem(this, null, null, null, null);
		initMenuItem(this, "title.fetchers.select", null, null, chooseFetchersListener);
	}
}
