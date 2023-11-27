import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author romy
 */
public class ScrollableLabelPanel   extends javax.swing.JFrame {
     public ScrollableLabelPanel() {
    setTitle("Scrollable Label Panel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400, 800);

        // Create a panel to hold the labels
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));

        // Add 10 labels to the panel with different colors and size
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            JLabel label = createColoredLabel("Label " + i, random);
            label.setSize(180,230 );
            labelPanel.add(label);
        }

        // Create a scroll pane and add the label panel to it
        JScrollPane scrollPane = new JScrollPane(labelPanel);

        // Set the scroll pane's viewport size
        scrollPane.setPreferredSize(new Dimension(200, 200));

        // Add the scroll pane to the main frame
        add(scrollPane);

        // Display the frame
        setVisible(true);
    }

    private JLabel createColoredLabel(String text, Random random) {
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        // Set a random background color
        Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        label.setBackground(randomColor);
        label.setOpaque(true);

        // Set the size to 180x230
        label.setPreferredSize(new Dimension(180, 230));

        // Set a random foreground color for better visibility
        Color contrastColor = getContrastColor(randomColor);
        label.setForeground(contrastColor);

        return label;
    }

    private Color getContrastColor(Color color) {
        // Calculate the contrast color for better visibility
        int y = (299 * color.getRed() + 587 * color.getGreen() + 114 * color.getBlue()) / 1000;
        return y >= 128 ? Color.BLACK : Color.WHITE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new ScrollableLabelPanel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
