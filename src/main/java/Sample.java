import model.SampleModel;
import presenter.SamplePresenter;
import view.SampleView;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public final class Sample {
    private Sample() {
        // empty
    }

	private static void createAndShowGUI() {
        final SampleModel model = new SampleModel();
        final SamplePresenter presenter = new SamplePresenter();
        final SampleView view = new SampleView();

        final JFrame frame = new JFrame(Sample.class.getName());
        frame.getContentPane().add(view.createMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
	}

    public static void main(String [] args) {
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
		}
		catch (Exception e) {
		    throw new RuntimeException(e); 
		}

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
