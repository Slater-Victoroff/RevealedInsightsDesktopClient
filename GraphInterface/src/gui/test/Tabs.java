package gui.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Tabs extends JPanel{

	public Tabs() {
		
		JPanel dataEntry = new JPanel();
		JPanel graphView = new JPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Data Entry",dataEntry);
		tabbedPane.addTab("Graph View",graphView);
	}
	
	public static void createAndShowGUI(){
		JFrame tabs = new JFrame("Tab Demo");
		tabs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Tabs
	}
	
	public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
}
