import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample extends JFrame implements MouseListener,
		MouseMotionListener {

	private static final long serialVersionUID = 1L;
	JPanel mainPanel = null;

	public JPanel createContentPane() {

		JPanel totalGUI = new JPanel();

		// We create a JPanel with the GridLayout.
		mainPanel = new JPanel(new GridLayout(2, 2, 10, 10));

		JPanel blue = createSquareJPanel(Color.blue, 40);
		JPanel red = createSquareJPanel(Color.red, 40);
		JPanel yellow = createSquareJPanel(Color.yellow, 40);
		JPanel green = createSquareJPanel(Color.green, 40);

		mainPanel.addMouseListener(this);
		mainPanel.addMouseMotionListener(this);

		mainPanel.add(blue);
		mainPanel.add(red);
		mainPanel.add(yellow);
		mainPanel.add(green);

		totalGUI.add(mainPanel);
		totalGUI.setOpaque(true);
		totalGUI.setPreferredSize(new Dimension(400, 400));
		return totalGUI;
	}

	// In this method, we create a square JPanel of a colour and set size
	// specified by the arguments.

	private JPanel createSquareJPanel(Color color, int size) {
		JPanel tempPanel = new JPanel();
		tempPanel.setBackground(color);
		tempPanel.setMinimumSize(new Dimension(size, size));
		tempPanel.setMaximumSize(new Dimension(size, size));
		tempPanel.setPreferredSize(new Dimension(size, size));
		addMouseListener(this);
		return tempPanel;
	}

	private static void createAndShowGUI() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("[=] GridLayout [=]");

		SwingExample demo = new SwingExample();
		frame.setContentPane(demo.createContentPane());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);

	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("MouseClicked event");
		mainPanel.setLocation(40, 40);
	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("MouseDragged event");
		mainPanel.setLocation(80, 80);
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();

			}
		});
	}
}
