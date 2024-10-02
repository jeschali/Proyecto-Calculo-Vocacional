package GaleriaArteMarcos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miVerde, miRosado, miAzul, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
            labelDepartamento, labelAntiguedad, labelResultado, labelfooter, label1, label2, label3;
    private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;
    private JComboBox<String> comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombreAdministrador = "";

    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(44, 62, 80));
        setIconImage(new ImageIcon("C:/Users/jesne/Desktop/JESNER JAVA/SegundoParcial/src/main/java/images/icon.png").getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdministrador = ventanaBienvenida.texto;
        mb = new JMenuBar();
        mb.setBackground(new Color(18, 27, 231));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255, 255, 255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca De");
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color De Fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(0, 0, 0));
        menuOpciones.add(menuColorFondo);

        // Elementos del menú de cálculo
        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono", 1, 14));
        miCalculo.setForeground(new Color(0, 0, 0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miVerde = new JMenuItem("Verde");
        miVerde.setFont(new Font("Andale Mono", 1, 14));
        miVerde.setForeground(new Color(0, 0, 0));
        menuColorFondo.add(miVerde);
        miVerde.addActionListener(this);

        miRosado = new JMenuItem("Rosado");
        miRosado.setFont(new Font("Andale Mono", 1, 14));
        miRosado.setForeground(new Color(0, 0, 0));
        menuColorFondo.add(miRosado);
        miRosado.addActionListener(this);

        miAzul = new JMenuItem("Azul");
        miAzul.setFont(new Font("Andale Mono", 1, 14));
        miAzul.setForeground(new Color(0, 0, 0));
        menuColorFondo.add(miAzul);
        miAzul.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));
        miNuevo.setForeground(new Color(0, 0, 0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El Creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));
        miElCreador.setForeground(new Color(0, 0, 0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));
        miSalir.setForeground(new Color(0, 0, 0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon imagen = new ImageIcon("C:/Users/jesne/Desktop/JESNER JAVA/SegundoParcial/src/main/java/images/marcos.png");
        Image imagenEscalada = imagen.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH);
        ImageIcon imagenFinal = new ImageIcon(imagenEscalada);

        label1 = new JLabel(imagenFinal);
        label1.setBounds(68, 15, 500, 260);
        add(label1);

        labelBienvenido = new JLabel("¡Bienvenido! " + nombreAdministrador);
        labelBienvenido.setBounds(160, 270, 300, 50);
        labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
        labelBienvenido.setForeground(new Color(255, 255, 255));
        add(labelBienvenido);

        labelTitle = new JLabel("Cálculo De Vacaciones");
        labelTitle.setBounds(190, 350, 900, 25);
        labelTitle.setFont(new Font("Andale Mono", 0, 24));
        labelTitle.setForeground(new Color(255, 255, 255));
        add(labelTitle);

        labelNombre = new JLabel("Nombre Completo:");
        labelNombre.setBounds(25, 418, 180, 25);
        labelNombre.setFont(new Font("Andale Mono", 1, 12));
        labelNombre.setForeground(new Color(255, 255, 255));
        add(labelNombre);

        txtNombreTrabajador = new JTextField();
        txtNombreTrabajador.setBounds(25, 444, 150, 25);
        txtNombreTrabajador.setBackground(new Color(244, 224, 224));
        txtNombreTrabajador.setFont(new Font("Anda4le Mono", 1, 14));
        txtNombreTrabajador.setForeground(new Color(0, 0, 0));
        add(txtNombreTrabajador);

        labelAPaterno = new JLabel("Apellido Paterno:");
        labelAPaterno.setBounds(25, 478, 180, 25);
        labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAPaterno.setForeground(new Color(255, 255, 255));
        add(labelAPaterno);

        txtAPaternoTrabajador = new JTextField();
        txtAPaternoTrabajador.setBounds(25, 505, 150, 25);
        txtAPaternoTrabajador.setBackground(new Color(224, 224, 224));
        txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtAPaternoTrabajador.setForeground(new Color(0, 0, 0));
        add(txtAPaternoTrabajador);

        labelAMaterno = new JLabel("Apellido Materno:");
        labelAMaterno.setBounds(25, 538, 180, 25);
        labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
        labelAMaterno.setForeground(new Color(255, 255, 255));
        add(labelAMaterno);

        txtAMaternoTrabajador = new JTextField();
        txtAMaternoTrabajador.setBounds(25, 564, 150, 25);
        txtAMaternoTrabajador.setBackground(new Color(224, 224, 224));
        txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
        txtAMaternoTrabajador.setForeground(new Color(0, 0, 0));
        add(txtAMaternoTrabajador);

        labelDepartamento = new JLabel("Selecciona El Departamento:");
        labelDepartamento.setBounds(220, 412, 220, 25);
        labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
        labelDepartamento.setForeground(new Color(255, 255, 255));
        add(labelDepartamento);

        comboDepartamento = new JComboBox<>();
        comboDepartamento.setBounds(220, 443, 220, 25);
        comboDepartamento.setBackground(new Color(224, 224, 224));
        comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
        comboDepartamento.setForeground(new Color(0, 0, 0));
        add(comboDepartamento);
        comboDepartamento.addItem("");
        comboDepartamento.addItem("Atención Al Cliente");
        comboDepartamento.addItem("Departamento De Fábrica");
        comboDepartamento.addItem("Departamento De Gerencia");

        labelAntiguedad = new JLabel("Selecciona La Antigüedad:");
        labelAntiguedad.setBounds(220, 478, 220, 25);
        labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        labelAntiguedad.setForeground(new Color(255, 255, 255));
        add(labelAntiguedad);

        comboAntiguedad = new JComboBox<>();
        comboAntiguedad.setBounds(220, 505, 220, 25);
        comboAntiguedad.setBackground(new Color(224, 224, 224));
        comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
        comboAntiguedad.setForeground(new Color(0, 0, 0));
        add(comboAntiguedad);
        comboAntiguedad.addItem("");
        comboAntiguedad.addItem("1 Año De Servicio");
        comboAntiguedad.addItem("2 A 6 Años De Servicio");
        comboAntiguedad.addItem("7 Años O Más De Servicio");

        labelResultado = new JLabel("Resultado Del Cálculo:");
        labelResultado.setBounds(220, 543, 180, 25);
        labelResultado.setFont(new Font("Andale Mono", 1, 12));
        labelResultado.setForeground(new Color(255, 255, 255));
        add(labelResultado);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);
        textarea1.setBackground(new Color(224, 224, 224));
        textarea1.setFont(new Font("Andale Mono", 1, 11));
        textarea1.setForeground(new Color(0, 0, 0));
        textarea1.setText("\n   Aquí Aparece El Resultado Del Cálculo De Las Vacaciones.");
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(220, 573, 385, 90);
        add(scrollpane1);

        labelfooter = new JLabel(" 2000 GALERIA ARTE MARCOS | Todos Los Derechos Reservados");
        labelfooter.setBounds(135, 665, 500, 45);
        labelfooter.setFont(new Font("Andale Mono", 1, 12));
        labelfooter.setForeground(new Color(255, 255, 255));
        add(labelfooter);
        
        label2 = new JLabel("JESNER EDILSON CHALI ESPAÑA");
        label2.setBounds(230, 680, 500, 45);
        label2.setFont(new Font("Andale Mono", Font.BOLD, 13));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);
        
        label3 = new JLabel("PROGRAMACION II A");
        label3.setBounds(270, 700, 500, 45);
        label3.setFont(new Font("Andale Mono", Font.BOLD, 13));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {
            String nombreTrabajador = txtNombreTrabajador.getText();
            String AP = txtAPaternoTrabajador.getText();
            String AM = txtAMaternoTrabajador.getText();
            String Departamento = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString();

            if (nombreTrabajador.equals("") || AP.equals("") || AM.equals("")
                    || Departamento.equals("") || Antiguedad.equals("")) {

                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
            } else {
                calcularVacaciones(nombreTrabajador, AP, AM, Departamento, Antiguedad);
            }
        }

        if (e.getSource() == miVerde) {
            getContentPane().setBackground(new Color(25, 111, 61));
        }
        if (e.getSource() == miRosado) {
            getContentPane().setBackground(new Color(241, 24, 77));
        }
        if (e.getSource() == miAzul) {
            getContentPane().setBackground(new Color(26, 82, 118));
        }

        if (e.getSource() == miNuevo) {
            txtNombreTrabajador.setText("");
            txtAPaternoTrabajador.setText("");
            txtAMaternoTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textarea1.setText("\n   Aquí Aparece El Resultado Del Cálculo De Las Vacaciones.");
        }

        if (e.getSource() == miSalir) {
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0, 0, 550, 600);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }

        if (e.getSource() == miElCreador) {
            JOptionPane.showMessageDialog(this, "Aplicación Creada Por JESNER EDILSON CHALÍ ESPAÑA");
        }
    }

    private void calcularVacaciones(String nombreTrabajador, String AP, String AM, String Departamento, String Antiguedad) {
        String resultado = "\n   El Trabajador " + nombreTrabajador + " " + AP + " " + AM
                + "\n   Quien Labora En " + Departamento + " \n   Con " + Antiguedad;

        switch (Departamento) {
            case "Atención Al Cliente":
                if (Antiguedad.equals("1 Año De Servicio")) {
                    resultado += "\n   Recibe 6 Días De Vacaciones.";
                } else if (Antiguedad.equals("2 A 6 Años De Servicio")) {
                    resultado += "\n   Recibe 14 días De Vacaciones.";
                } else if (Antiguedad.equals("7 Años O Más De Servicio")) {
                    resultado += "\n   Recibe 20 días De Vacaciones.";
                }
                break;
            case "Departamento De Fábrica":
                if (Antiguedad.equals("1 Año De Servicio")) {
                    resultado += "\n   Recibe 7 Días De Vacaciones.";
                } else if (Antiguedad.equals("2 A 6 Años De Servicio")) {
                    resultado += "\n   Recibe 15 días De Vacaciones.";
                } else if (Antiguedad.equals("7 Años O Más De Servicio")) {
                    resultado += "\n   Recibe 22 días De Vacaciones.";
                }
                break;
            case "Departamento De Gerencia":
                if (Antiguedad.equals("1 Año De Servicio")) {
                    resultado += "\n   Recibe 10 Días De Vacaciones.";
                } else if (Antiguedad.equals("2 A 6 Años De Servicio")) {
                    resultado += "\n   Recibe 20 Días De Vacaciones.";
                } else if (Antiguedad.equals("7 Años O Más De Servicio")) {
                    resultado += "\n   Recibe 30 Días De Vacaciones.";
                }
                break;
        }

        textarea1.setText(resultado);
    }

    public static void main(String args[]) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0, 0, 655, 800);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
}
