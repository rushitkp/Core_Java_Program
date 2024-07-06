import javax.swing.*;
import java.awt.*;

public class Layout {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("FlowLayout and BorderLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with FlowLayout
        JPanel flowPanel = new JPanel();
        flowPanel.setLayout(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));

        // Create a JPanel with BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);

        // Add panels to the frame
        frame.add(flowPanel, BorderLayout.NORTH); // FlowLayout panel in BorderLayout.NORTH
        frame.add(borderPanel, BorderLayout.CENTER); // BorderLayout panel in BorderLayout.CENTER

        // Display the frame
        frame.setVisible(true);
    }
}
