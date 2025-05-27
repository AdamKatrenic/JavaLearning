import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulacka extends JFrame implements ActionListener {
    private JTextField display;
    private String operacia = "";
    private double prvaHodnota = 0;

    public Kalkulacka() {
        setTitle("Kalkulačka");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Zobrazovacie pole
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 28));
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        // Tlačidlá
        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] tlacidla = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : tlacidla) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String prikaz = e.getActionCommand();

        if (prikaz.matches("[0-9\\.]")) {
            display.setText(display.getText() + prikaz);
        } else if (prikaz.matches("[\\+\\-\\*/]")) {
            try {
                prvaHodnota = Double.parseDouble(display.getText());
                operacia = prikaz;
                display.setText("");
            } catch (NumberFormatException ex) {
                display.setText("Chyba");
            }
        } else if (prikaz.equals("=")) {
            try {
                double druhaHodnota = Double.parseDouble(display.getText());
                double vysledok = 0;

                switch (operacia) {
                    case "+": vysledok = prvaHodnota + druhaHodnota; break;
                    case "-": vysledok = prvaHodnota - druhaHodnota; break;
                    case "*": vysledok = prvaHodnota * druhaHodnota; break;
                    case "/":
                        if (druhaHodnota == 0) {
                            display.setText("Nulou nedelíme!");
                            return;
                        }
                        vysledok = prvaHodnota / druhaHodnota;
                        break;
                }

                display.setText(String.valueOf(vysledok));
            } catch (NumberFormatException ex) {
                display.setText("Chyba");
            }
        } else if (prikaz.equals("C")) {
            display.setText("");
            prvaHodnota = 0;
            operacia = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Kalkulacka().setVisible(true);
        });
    }
}
