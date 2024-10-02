package GaleriaArteMarcos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JLabel label1, label2, label3, label4, label5, label6;
    private JButton boton1;
    public static String texto = "";

    public Bienvenida() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("¡Bienvenido GALERÍA ARTE MARCOS!");
        getContentPane().setBackground(new Color(44, 62, 80));
        setIconImage(new ImageIcon("C:/Users/jesne/Desktop/JESNER JAVA/SegundoParcial/src/main/java/images/icon.png").getImage());

        ImageIcon imagen = new ImageIcon("C:/Users/jesne/Desktop/JESNER JAVA/SegundoParcial/src/main/java/images/marcos.png");
        Image imagenEscalada = imagen.getImage().getScaledInstance(400, 150, Image.SCALE_SMOOTH);
        ImageIcon imagenFinal = new ImageIcon(imagenEscalada);

        label1 = new JLabel(imagenFinal);
        label1.setBounds(68, 15, 400, 220);
        add(label1);

        label2 = new JLabel("Sistema De Control Vacacional");
        label2.setBounds(140, 135, 300, 250);
        label2.setFont(new Font("Andale Mono", Font.ITALIC, 21));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("Ingrese Su Nombre");
        label3.setBounds(130, 212, 200, 200);
        label3.setFont(new Font("Andale Mono", Font.BOLD, 14));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel(" 2000 GALERIA ARTE MARCOS");
        label4.setBounds(180, 400, 300, 190);
        label4.setFont(new Font("Andale Mono", Font.BOLD, 13));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);
        
        label6 = new JLabel("JESNER EDILCON CHALI ESPAÑA");
        label6.setBounds(170, 410, 310, 200);
        label6.setFont(new Font("Andale Mono", Font.BOLD, 13));
        label6.setForeground(new Color(255, 255, 255));
        add(label6);
        
        label5 = new JLabel("PROGRAMACION II A");
        label5.setBounds(210, 420, 320, 210);
        label5.setFont(new Font("Andale Mono", Font.BOLD, 13));
        label5.setForeground(new Color(255, 255, 255));
        add(label5);

        textfield1 = new JTextField();
        textfield1.setBounds(130, 335, 255, 26);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Andale Mono", Font.BOLD, 14));
        textfield1.setForeground(new Color(28, 40, 51));
        add(textfield1);

        boton1 = new JButton("Ingresar");
        boton1.setBounds(210, 410, 100, 30);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Andale Mono", Font.BOLD, 14));
        boton1.setForeground(new Color(0, 0, 0));
        boton1.addActionListener(this);
        add(boton1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String nombre = textfield1.getText().trim();
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por Favor, Ingrese Su Nombre.");
            } else {
                JOptionPane.showMessageDialog(this, "¡Bienvenido, " + nombre + "!");
                texto = nombre;
                Licencia ventanalicencia = new Licencia();
                ventanalicencia.setBounds(0, 0, 700, 450);
                ventanalicencia.setVisible(true);
                ventanalicencia.setResizable(false);
                ventanalicencia.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]) {
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(0, 0, 550, 600);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
    }
}
