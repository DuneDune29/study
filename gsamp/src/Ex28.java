import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex28 {
	public static void main(String[] args) {
		Frame f = new Frame("FlowLayoutTest");
		f.setSize(200, 200);	
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		Menu mOthers = new Menu("Others"); // MenuItem�� �ƴ϶� Menu�ӿ� ����
		MenuItem miExit = new MenuItem("Exit");
		mFile.add(miNew); // Menu�� MenuItem���� �߰�
		mFile.add(miOpen);
		mFile.add(mOthers); // Menu�� Menu�� �߰�
		mFile.addSeparator(); // �޴� �и����� �߰�
		mFile.add(miExit);
		
		MenuItem miPrint = new MenuItem("Print ...");
		MenuItem miPreview = new MenuItem("Print Preview");
		mOthers.add(miPrint); 		mOthers.add(miPreview);
		
		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		mView.add(miStatusbar);
		
		Menu mHelp = new Menu("Help");
		MenuItem mAbout = new MenuItem("About ...");
		mHelp.add(mAbout);
		
		mb.add(mFile); //MenuBar�� Menu�� �߰�
		mb.add(mEdit); 		mb.add(mView);  	 mb.add(mHelp);
		f.setMenuBar(mb); 		f.setVisible(true);
		f.addWindowListener(new EventHandler36());
	}
}
class EventHandler36 extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e); 	System.exit(0);
	}
}