import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.HashMap;

public class ConversorMoneda extends JFrame implements ActionListener {
    private JLabel lblTitulo, lblCantidad, lblMonedaDestino;
    private JTextField txtCantidad;
    private JComboBox<String> cmbMonedaDestino;
    private JButton btnConvertir;
    private HashMap<String, Double> monedas;

    public ConversorMoneda() {
        super("Conversor de Moneda");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Crear componentes
        lblTitulo = new JLabel("Conversor de Moneda", SwingConstants.CENTER);
        lblCantidad = new JLabel("Cantidad (MXN): ");
        lblMonedaDestino = new JLabel("Moneda de Destino: ");
        txtCantidad = new JTextField();
        cmbMonedaDestino = new JComboBox<>();
        btnConvertir = new JButton("Convertir");

        // Agregar opciones al JComboBox de Moneda de Destino
        String[] monedasDestino = {"ARS - Peso Argentino", "BRL - Real Brasileño", "CLP - Peso Chileno", "COP - Peso Colombiano", "PEN - Sol Peruano", "UYU - Peso Uruguayo"};
        cmbMonedaDestino.setModel(new DefaultComboBoxModel<>(monedasDestino));

        // Agregar componentes al JFrame
        add(lblTitulo);
        add(new JLabel());
        add(lblCantidad);
        add(txtCantidad);
        add(lblMonedaDestino);
        add(cmbMonedaDestino);
        add(new JLabel());
        add(btnConvertir);

        // Inicializar HashMap con los tipos de cambio
        monedas = new HashMap<>();
        monedas.put("ARS", 0.066);
        monedas.put("BRL", 0.24);
        monedas.put("CLP", 10.50);
        monedas.put("COP", 80.40);
        monedas.put("PEN", 0.22);
        monedas.put("UYU", 7.16);

        // Agregar ActionListener al botón de Convertir
        btnConvertir.addActionListener(this);

        // Hacer visible el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        ConversorMoneda conversor = new ConversorMoneda();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConvertir) {
            double cantidadMXN;
            try {
                cantidadMXN = Double.parseDouble(txtCantidad.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida en MXN");
                return;
            }
            String monedaDestino = cmbMonedaDestino.getSelectedItem().toString().substring(0, 3);
            double tipoCambio = monedas.get(monedaDestino);
            double cantidadDestino = cantidadMXN * tipoCambio;

            DecimalFormat df = new DecimalFormat("#.##");

            JOptionPane.showMessageDialog(this, "$" + df.format(cantidadMXN) + " MXN son " + df.format(cantidadDestino) + " " + monedaDestino);
        }
    }
}
