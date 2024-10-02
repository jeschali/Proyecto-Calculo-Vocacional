package GaleriaArteMarcos;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombre = "";

    public Licencia() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia De Uso");
        setIconImage(new ImageIcon("C:/Users/jesne/Desktop/JESNER JAVA/SegundoParcial/src/main/java/images/icon.png").getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombre = ventanaBienvenida.texto;
        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(230, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setFont(new Font("Andale Mono", 0, 11));
        textarea1.setText("\n          TÉRMINOS Y CONDICIONES"
                + "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO."
                + "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."
                + "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."
                + "\n\n          LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"
                + "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED"
                + "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO)"
                + "\n          SI USTED NO ACEPTA ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."
                + "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"
                + "\n          https://www.facebook.com/profile.php?id=100019763671406s");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 40, 665, 240);
        add(scrollpane1);

        check1 = new JCheckBox("Yo " + nombre + " Acepto");
        check1.setBounds(10, 300, 300, 30);
        check1.setFont(new Font("Andale Mono", 1, 18));
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 350, 120, 30);
        boton1.setFont(new Font("Andale Mono", 1, 15));
        //boton1.setBackground(new Color(51, 128, 255));//
        //boton1.setForeground(new Color(0, 0, 0)); //
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(150, 350, 120, 30);
        boton2.setFont(new Font("Andale Mono", 1, 15));
        //boton2.setBackground(new Color(255, 0, 0));//
        //boton2.setForeground(new Color(255, 255, 255));//
        boton2.addActionListener(this);
        add(boton2);

        ImageIcon imagen = new ImageIcon("C:/Users/jesne/Desktop/JESNER JAVA/SegundoParcial/src/main/java/images/arte-marcos.png");
        int anchoImagen = imagen.getIconWidth();
        int altoImagen = imagen.getIconHeight();

        label2 = new JLabel(imagen);
        label2.setBounds(270, 325, anchoImagen, altoImagen);
        add(label2);
    }

    public void stateChanged(ChangeEvent e) {
        if (check1.isSelected() == true) {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0, 0, 655, 800);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == boton2) {
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0, 0, 550, 600);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0, 0, 700, 450);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}
