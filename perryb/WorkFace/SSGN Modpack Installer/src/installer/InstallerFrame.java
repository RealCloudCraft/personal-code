package installer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;


public class InstallerFrame extends JFrame
{
	private JLabel ivjLabelOfVersion = null;
	private JLabel ivjLabelMcVersion = null;
	private JPanel ivjPanelCenter = null;
	private JButton ivjButtonInstall = null;
	private JButton ivjButtonClose = null;
	private JPanel ivjPanelBottom = null;
	private JPanel ivjPanelContentPane = null;
	IvjEventHandler ivjEventHandler = new IvjEventHandler();
	private JTextArea ivjTextArea = null;
	
	 class IvjEventHandler
	implements ActionListener
	{
		IvjEventHandler() {}
		
		public void actionPerformed(ActionEvent e)	{
			if (e.getSource() == InstallerFrame.this.getButtonClose()) {
				InstallerFrame.this.connEtoC2(e);
			}
			if (e.getSource() == InstallerFrame.this.getButtonInstall()) {
				InstallerFrame.this.connEtoC1(e);
			}
	}

	
	
}
public InstallerFrame()
{
	initialize();
}

private void customInit()
{
	try
	{
		setDefaultCloseOperation(3);
		
		getButtonInstall().setEnabled(false);
		
		String ofVer = Installer.getSSGNVersion();
		installUtil.dbg("SSGN Version: " + ofVer);
		String[] ofVers = installUtil.tokenize(ofVer, "_");
		
		String mcVer = ofVers[1];
		installUtil.dbg("Minecraft Version: " + mcVer);
		
		String ofEd = Installer.getSSGNEdition(ofVers);
		installUtil.dbg("SSGN Edition: " + ofEd);
		
		String ofEdClear = ofEd.replace("_", " ");
		ofEdClear = ofEdClear.replace(" Hello", " Hi");
		ofEdClear = ofEdClear.replace("You There", "Hi, Hows it going?");
		
		getLabelOfVersion().setText("SSGN " + ofEdClear);
		getLabelMcVersion().setText("For Minecraft: " + mcVer);
		
		getButtonInstall().setEnabled(true);
		
	
		getButtonInstall().requestFocus();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}
public static void main(String []args) {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		InstallerFrame frm = new InstallerFrame();
		
		installUtil.centerWindow(frm, null);
		
		frm.show();
		
	}	
	catch (Exception e) {
		String msg = e.getMessage();
		if ((msg != null) && (msg.equals("QUIET"))) {
			return;
		}
	e.printStackTrace();
	String str = installUtil.getExceptionStackTrace(e);
	
	}
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
