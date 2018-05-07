package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleView {

    private JButton createButton(String text, int width, int height) {
        final JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(width, height));
        return button;
    }

    private JComponent createNorthPanel() {
        final JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.red);

        panel.add(createButton("a", 40, 40));
        panel.add(createButton("b", 40, 40));
        panel.add(createButton("c", 40, 40));
        panel.add(createButton("d", 40, 40));
        panel.add(createButton("e", 40, 40));
        panel.add(createButton("f", 40, 40));
        panel.add(createButton("g", 40, 40));
        panel.add(createButton("h", 40, 40));

        return panel;
    }

    private JComponent createCenterPanel() {
        final JLabel label = new JLabel();
        label.setBackground(Color.white);

        return label;
    }

    private JComponent createSouthPanel() {
        final JButton button = new JButton("<html><u>Close</u><br><b>window</html>");
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return button;
    }

    public JComponent createMainPanel() {
        final JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(createNorthPanel(), BorderLayout.NORTH);
        mainPanel.add(createCenterPanel(), BorderLayout.CENTER);
        mainPanel.add(createSouthPanel(), BorderLayout.SOUTH);

        return mainPanel;
    }
}
