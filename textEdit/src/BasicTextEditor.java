/**
	BasicTextEditor
*/
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class BasicTextEditor 
	extends JFrame 
{

	public static final String FONTS[] = { "Serif", "SansSerif", 
		"Courier" };
	protected Font m_fonts[];

	protected JTextArea m_monitor;
	protected JMenuItem[] m_fontMenus;
	protected JCheckBoxMenuItem m_bold;
	protected JCheckBoxMenuItem m_italic;

	protected JFileChooser m_chooser;

        protected JToolBar m_toolBar;

        protected JComboBox m_cbFonts;
        protected SmallToggleButton m_bBold;
        protected SmallToggleButton m_bItalic;

	public BasicTextEditor()
	{
		super("Basic text editor: part IV - custom menu");
		setSize(450, 350);

		m_fonts = new Font[FONTS.length];
		for (int k=0; k<FONTS.length; k++)
			m_fonts[k] = new Font(FONTS[k], Font.PLAIN, 12);

		m_monitor = new JTextArea();
		JScrollPane ps = new JScrollPane(m_monitor);
		getContentPane().add(ps, BorderLayout.CENTER);

		m_monitor.append("Basic text editor");

		JMenuBar menuBar = createMenuBar();
		setJMenuBar(menuBar);

		m_chooser = new JFileChooser(); 
		m_chooser.setCurrentDirectory(new File("."));

		WindowListener wndCloser = new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		};
		addWindowListener(wndCloser);
		
		updateMonitor();
		setVisible(true);
	}

	protected JMenuBar createMenuBar()
	{
		final JMenuBar menuBar = new JMenuBar();
		
		JMenu mFile = new JMenu("File");
		mFile.setMnemonic('f');

                ImageIcon iconNew = new ImageIcon("file_new.gif");
                Action actionNew = new AbstractAction("New", iconNew) 
 		{ 
			public void actionPerformed(ActionEvent e)
			{
				m_monitor.setText("");
			}
		};
                JMenuItem item =  mFile.add(actionNew); 
		mFile.add(item);

                ImageIcon iconOpen = new ImageIcon("file_open.gif");
                Action actionOpen = new AbstractAction("Open...", iconOpen)
		{ 
			public void actionPerformed(ActionEvent e)
			{
                                BasicTextEditor.this.repaint();
				if (m_chooser.showOpenDialog(BasicTextEditor.this) != 
					JFileChooser.APPROVE_OPTION)
					return;
                                Thread runner = new Thread() {
                                  public void run() {
				    File fChoosen = m_chooser.getSelectedFile();
				    try
				    {
					FileReader in = new FileReader(fChoosen);
					m_monitor.read(in, null);
					in.close();
				    } 
				    catch (IOException ex) 
				    {
					ex.printStackTrace();
				    }
                                  }
                                };
                                runner.start();
			}
		};
                item =  mFile.add(actionOpen); 
		mFile.add(item);

                ImageIcon iconSave = new ImageIcon("file_save.gif");
                Action actionSave = new AbstractAction("Save...", iconSave) 
		{ 
			public void actionPerformed(ActionEvent e)
			{
                                BasicTextEditor.this.repaint();
				if (m_chooser.showSaveDialog(BasicTextEditor.this) != 
					JFileChooser.APPROVE_OPTION)
					return;
                                Thread runner = new Thread() {
                                  public void run() {
			 	    File fChoosen = m_chooser.getSelectedFile();
				    try
				    {
					FileWriter out = new 
						FileWriter(fChoosen);
					m_monitor.write(out);
					out.close();
				    } 
				    catch (IOException ex) 
				    {
					ex.printStackTrace();
				    }
                                  }
                                };
                                runner.start();
			}
		};
                item =  mFile.add(actionSave);
		mFile.add(item);

		mFile.addSeparator();

                Action actionExit = new AbstractAction("Exit")
		{ 
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		};
                item =  mFile.add(actionExit);
                item.setMnemonic('x');
		menuBar.add(mFile);

                m_toolBar = new JToolBar();
                JButton bNew = new SmallButton(actionNew, 
                  "New text");
                m_toolBar.add(bNew);

                JButton bOpen = new SmallButton(actionOpen, 
                  "Open text file");
                m_toolBar.add(bOpen);
        
                JButton bSave = new SmallButton(actionSave, 
                  "Save text file");
                m_toolBar.add(bSave);

		ActionListener fontListener = new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent e)
			{
				updateMonitor();
			}
		};
		
		JMenu mFont = new JMenu("Font");
		mFont.setMnemonic('o');

		ButtonGroup group = new ButtonGroup();
		m_fontMenus = new JMenuItem[FONTS.length];
		for (int k=0; k<FONTS.length; k++)
		{
			int m = k+1;
			m_fontMenus[k] = new JRadioButtonMenuItem(
				m+" "+FONTS[k]);
			boolean selected = (k == 0);
			m_fontMenus[k].setSelected(selected);
			m_fontMenus[k].setMnemonic('1'+k);
			m_fontMenus[k].setFont(m_fonts[k]);
			m_fontMenus[k].addActionListener(fontListener);
			group.add(m_fontMenus[k]);
			mFont.add(m_fontMenus[k]);
		}
		
		mFont.addSeparator();

                m_toolBar.addSeparator();
                m_cbFonts = new JComboBox(FONTS);
                m_cbFonts.setMaximumSize(m_cbFonts.getPreferredSize());
                m_cbFonts.setToolTipText("Available fonts");
                ActionListener lst = new ActionListener() { 
                  public void actionPerformed(ActionEvent e) {
                    int index = m_cbFonts.getSelectedIndex();
                    if (index < 0)
                      return;
                    m_fontMenus[index].setSelected(true);
                    updateMonitor();
                  }
                };
                m_cbFonts.addActionListener(lst);
                m_toolBar.add(m_cbFonts);

		m_bold = new JCheckBoxMenuItem("Bold");
		m_bold.setMnemonic('b');
		Font fn = m_fonts[1].deriveFont(Font.BOLD);
		m_bold.setFont(fn);
		m_bold.setSelected(false);
		m_bold.addActionListener(fontListener);
		mFont.add(m_bold);

		m_italic = new JCheckBoxMenuItem("Italic");
		m_italic.setMnemonic('i');
		fn = m_fonts[1].deriveFont(Font.ITALIC);
		m_italic.setFont(fn);
		m_italic.setSelected(false);
		m_italic.addActionListener(fontListener);
		mFont.add(m_italic);

		menuBar.add(mFont);

                m_toolBar.addSeparator();

                ImageIcon img1 = new ImageIcon("font_bold1.gif");
                ImageIcon img2 = new ImageIcon("font_bold2.gif");
                m_bBold = new SmallToggleButton(false, img1, img2, 
                  "Bold font");
                lst = new ActionListener() { 
                  public void actionPerformed(ActionEvent e) {
                    m_bold.setSelected(m_bBold.isSelected());
                    updateMonitor();
                  }
                };
                m_bBold.addActionListener(lst);
                m_toolBar.add(m_bBold);

                img1 = new ImageIcon("font_italic1.gif");
                img2 = new ImageIcon("font_italic2.gif");
                m_bItalic = new SmallToggleButton(false, img1, img2, 
                  "Italic font");
                lst = new ActionListener() { 
                  public void actionPerformed(ActionEvent e) {
                    m_italic.setSelected(m_bItalic.isSelected());
                    updateMonitor();
                  }
                };
                m_bItalic.addActionListener(lst);
                m_toolBar.add(m_bItalic);

                JMenu mOpt = new JMenu("Options");
                mOpt.setMnemonic('p');
 
                ColorMenu cm = new ColorMenu("Foreground");
                cm.setColor(m_monitor.getForeground());
                cm.setMnemonic('f');
                lst = new ActionListener() { 
                  public void actionPerformed(ActionEvent e) {
                    ColorMenu m = (ColorMenu)e.getSource();
                    m_monitor.setForeground(m.getColor());
                  }
                };
                cm.addActionListener(lst);
                mOpt.add(cm);

                cm = new ColorMenu("Background");
                cm.setColor(m_monitor.getBackground());
                cm.setMnemonic('b');
                lst = new ActionListener() { 
                  public void actionPerformed(ActionEvent e) {
                    ColorMenu m = (ColorMenu)e.getSource();
                    m_monitor.setBackground(m.getColor());
                  }
                };
                cm.addActionListener(lst);
                mOpt.add(cm);
                menuBar.add(mOpt);

                getContentPane().add(m_toolBar, BorderLayout.NORTH);

		return menuBar;
	}

	protected void updateMonitor()
	{
		int index = -1;
		for (int k=0; k<m_fontMenus.length; k++)
		{
			if (m_fontMenus[k].isSelected())
			{
				index = k;
				break;
			}
		}
		if (index == -1)
			return;
                boolean isBold = m_bold.isSelected();
                boolean isItalic = m_italic.isSelected();

                m_cbFonts.setSelectedIndex(index);

		if (index==2)  // Courier
		{
			m_bold.setSelected(false);
			m_bold.setEnabled(false);
			m_italic.setSelected(false);
			m_italic.setEnabled(false);
                        m_bBold.setSelected(false);
                        m_bBold.setEnabled(false);
                        m_bItalic.setSelected(false);
                        m_bItalic.setEnabled(false);
		}
		else
		{
			m_bold.setEnabled(true);
			m_italic.setEnabled(true);
                        m_bBold.setEnabled(true);
                        m_bItalic.setEnabled(true);
		}

                if (m_bBold.isSelected() != isBold)
                  m_bBold.setSelected(isBold);
                if (m_bItalic.isSelected() != isItalic)
                  m_bItalic.setSelected(isItalic);

		int style = Font.PLAIN;
		if (m_bold.isSelected())
			style |= Font.BOLD;
		if (m_italic.isSelected())
			style |= Font.ITALIC;
		Font fn = m_fonts[index].deriveFont(style);
		m_monitor.setFont(fn);
		m_monitor.repaint();
	}

	public static void main(String argv[]) 
	{
		new BasicTextEditor();
	}
}

class SmallButton extends JButton implements MouseListener
{
  protected Border m_raised;
  protected Border m_lowered;
  protected Border m_inactive;

  public SmallButton(Action act, String tip) {
    super((Icon)act.getValue(Action.SMALL_ICON));
    m_raised = new BevelBorder(BevelBorder.RAISED);
    m_lowered = new BevelBorder(BevelBorder.LOWERED);
    m_inactive = new EmptyBorder(2, 2, 2, 2);
    setBorder(m_inactive);
    setMargin(new Insets(1,1,1,1));
    setToolTipText(tip);
    addActionListener(act);
    addMouseListener(this);
    setRequestFocusEnabled(false);
  }

  public float getAlignmentY() { return 0.5f; }

  public void mousePressed(MouseEvent e) { 
    setBorder(m_lowered);
  }
  public void mouseReleased(MouseEvent e) {
    setBorder(m_inactive);
  }
  public void mouseClicked(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {
    setBorder(m_raised);
  }
  public void mouseExited(MouseEvent e) {
    setBorder(m_inactive);
  }
}

class SmallToggleButton extends JToggleButton
  implements ItemListener 
{
  protected Border m_raised;
  protected Border m_lowered;

  public SmallToggleButton(boolean selected, 
   ImageIcon imgUnselected, ImageIcon imgSelected, String tip) {
    super(imgUnselected, selected);
    setHorizontalAlignment(CENTER);
    setBorderPainted(true);
    m_raised = new BevelBorder(BevelBorder.RAISED);
    m_lowered = new BevelBorder(BevelBorder.LOWERED);
    setBorder(selected ? m_lowered : m_raised);
    setMargin(new Insets(1,1,1,1));
    setToolTipText(tip);
    setRequestFocusEnabled(false);
    setSelectedIcon(imgSelected);
    addItemListener(this);
  }

  public float getAlignmentY() { return 0.5f; }

  public void itemStateChanged(ItemEvent e) {
    setBorder(isSelected() ? m_lowered : m_raised);
  }
}

class ColorMenu extends JMenu
{
  protected Border m_unselectedBorder;
  protected Border m_selectedBorder;
  protected Border m_activeBorder;

  protected Hashtable m_panes;
  protected ColorPane m_selected;

  public ColorMenu(String name) {
    super(name);
    m_unselectedBorder = new CompoundBorder(
      new MatteBorder(1, 1, 1, 1, getBackground()),
    new BevelBorder(BevelBorder.LOWERED, 
      Color.white, Color.gray));
    m_selectedBorder = new CompoundBorder(
      new MatteBorder(2, 2, 2, 2, Color.red),
      new MatteBorder(1, 1, 1, 1, getBackground()));
    m_activeBorder = new CompoundBorder(
      new MatteBorder(2, 2, 2, 2, Color.blue),
      new MatteBorder(1, 1, 1, 1, getBackground()));
        
    JPanel p = new JPanel();
    p.setBorder(new EmptyBorder(5, 5, 5, 5));
    p.setLayout(new GridLayout(8, 8));
    m_panes = new Hashtable();

    int[] values = new int[] { 0, 128, 192, 255 };
    for (int r=0; r<values.length; r++) {
      for (int g=0; g<values.length; g++) {
        for (int b=0; b<values.length; b++) {
          Color c = new Color(values[r], values[g], values[b]);
          ColorPane pn = new ColorPane(c);
          p.add(pn);
          m_panes.put(c, pn);
        }
      }
    }
    add(p);
  }

  public void setColor(Color c) {
    Object obj = m_panes.get(c);
    if (obj == null)
      return;
    if (m_selected != null)
      m_selected.setSelected(false);
    m_selected = (ColorPane)obj;
    m_selected.setSelected(true);
  }

  public Color getColor() {
    if (m_selected == null)
      return null;
    return m_selected.getColor();
  }

  public void doSelection() {
    fireActionPerformed(new ActionEvent(this, 
      ActionEvent.ACTION_PERFORMED, getActionCommand()));
  }

  class ColorPane extends JPanel implements MouseListener
  {
    protected Color m_c;
    protected boolean m_selected;

    public ColorPane(Color c) {
      m_c = c;
      setBackground(c);
      setBorder(m_unselectedBorder);
      String msg = "R "+c.getRed()+", G "+c.getGreen()+
        ", B "+c.getBlue();
      setToolTipText(msg);
      addMouseListener(this);
    }

    public Color getColor() { return m_c; }

    public Dimension getPreferredSize() {
      return new Dimension(15, 15);
    }
    public Dimension getMaximumSize() { return getPreferredSize(); }
    public Dimension getMinimumSize() { return getPreferredSize(); }

    public void setSelected(boolean selected) {
      m_selected = selected;
      if (m_selected)
        setBorder(m_selectedBorder);
      else
        setBorder(m_unselectedBorder);
    }

    public boolean isSelected() { return m_selected; }

    public void mousePressed(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {
      setColor(m_c);
      MenuSelectionManager.defaultManager().clearSelectedPath();
      doSelection();
    }

    public void mouseEntered(MouseEvent e) {
      setBorder(m_activeBorder);
    }

    public void mouseExited(MouseEvent e) {
      setBorder(m_selected ? m_selectedBorder : 
        m_unselectedBorder);
    }
  }
}


