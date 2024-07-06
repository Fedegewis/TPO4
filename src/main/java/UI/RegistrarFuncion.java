package UI;

import Controller.FuncionController;
import Controller.SucursalController;
import DTO.FuncionDto;
import DTO.PeliculaDto;
import DTO.SalaDto;
import Model.Pelicula;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

public class RegistrarFuncion extends JFrame {

    public static  void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    RegistrarFuncion frame=new RegistrarFuncion();
                    frame.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }




    public RegistrarFuncion() {
        setTitle("Registrar Funcion");
        setBounds(100, 100, 600, 450);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel lblnombrePelicula = new JLabel("Nombre Pelicula:");
        lblnombrePelicula.setBounds(10, 11, 150, 14);
        contentPane.add(lblnombrePelicula);

        JTextField txtNombrePelicula = new JTextField();
        txtNombrePelicula.setBounds(200, 11, 305, 20);
        contentPane.add(txtNombrePelicula);
        txtNombrePelicula.setColumns(10);

        JLabel lblGenero = new JLabel("Genero: ");
        lblGenero.setBounds(10, 41, 150, 14);
        contentPane.add(lblGenero);

        JTextField txtGenero = new JTextField();
        txtGenero.setBounds(200, 41, 305, 20);
        contentPane.add(txtGenero);
        txtGenero.setColumns(10);

        JLabel lblDirector = new JLabel("Director:");
        lblDirector.setBounds(10, 71, 150, 14);
        contentPane.add(lblDirector);

        JTextField txtDirector = new JTextField();
        txtDirector.setBounds(200, 71, 305, 20);
        contentPane.add(txtDirector);
        txtDirector.setColumns(10);

        JLabel lblDuracionEnMinutos = new JLabel("Duracion:");
        lblDuracionEnMinutos.setBounds(10, 101, 150, 14);
        contentPane.add(lblDuracionEnMinutos);

        JTextField txtDuracionEnMinutos = new JTextField();
        txtDuracionEnMinutos.setBounds(200, 101, 305, 20);
        contentPane.add(txtDuracionEnMinutos);
        txtDuracionEnMinutos.setColumns(10);

        JLabel lblSala = new JLabel("Sala:");
        lblSala.setBounds(10, 131, 150, 14);
        contentPane.add(lblSala);

        JTextField txtSala = new JTextField();
        txtSala.setBounds(200, 131, 305, 20);
        contentPane.add(txtSala);
        txtSala.setColumns(10);

        JLabel lblPeliculaID = new JLabel("Pelicula ID:");
        lblPeliculaID.setBounds(10, 161, 150, 14);
        contentPane.add(lblPeliculaID);

        JTextField txtPeliculaID = new JTextField();
        txtPeliculaID.setBounds(200, 161, 305, 20);
        contentPane.add(txtPeliculaID);
        txtPeliculaID.setColumns(10);

        JLabel lblFuncionID = new JLabel("Numero de funcion:");
        lblFuncionID.setBounds(10, 191, 150, 14);
        contentPane.add(lblFuncionID);

        JTextField txtFuncionID = new JTextField();
        txtFuncionID.setBounds(200, 191, 305, 20);
        contentPane.add(txtFuncionID);
        txtFuncionID.setColumns(10);

        JLabel lblHorario = new JLabel("Horario:");
        lblHorario.setBounds(10, 221, 150, 14);
        contentPane.add(lblHorario);

        JTextField txtHorario = new JTextField();
        txtHorario.setBounds(200, 221, 305, 20);
        contentPane.add(txtHorario);
        txtHorario.setColumns(10);

        JLabel lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(10, 251, 150, 14);
        contentPane.add(lblFecha);

        JTextField txtFecha = new JTextField();
        txtFecha.setBounds(200, 251, 305, 20);
        contentPane.add(txtFecha);
        txtFecha.setColumns(10);

        JLabel lblProyeccion = new JLabel("Proyeccion:");
        lblProyeccion.setBounds(10, 281, 150, 14);
        contentPane.add(lblProyeccion);

        JTextField txtProyeccion = new JTextField();
        txtProyeccion.setBounds(200, 281, 305, 20);
        contentPane.add(txtProyeccion);
        txtProyeccion.setColumns(10);

        JButton btnAceptar=new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombrePelicula = txtNombrePelicula.getText();
                String genero = txtGenero.getText();
                String sala = txtSala.getText();
                String duracionEnMinutos = txtDuracionEnMinutos.getText();
                String director = txtDirector.getText();
                String proyeccion = txtProyeccion.getText();
                String peliculaID = txtPeliculaID.getText();
                String funcionID = txtFuncionID.getText();
                String horario = txtHorario.getText();
                String fecha = txtFecha.getText();


                FuncionDto funcionDto=new FuncionDto(horario,funcionID,fecha);
                PeliculaDto peliculaDto=new PeliculaDto(genero,nombrePelicula,duracionEnMinutos,director,new ArrayList<String>(),proyeccion,peliculaID);


                SucursalController sucursalController=SucursalController.getInstancia();


                boolean existe;
                try {
                     existe=sucursalController.registrarFuncionPorGenero(funcionDto,peliculaDto,Integer.parseInt(sala));
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }


                if(existe) {
                    JOptionPane.showMessageDialog(null, "La funcion:"+ funcionID+ " con la pelicula "+nombrePelicula+" fue creado correctamente");
                }
                else {
                    JOptionPane.showMessageDialog(null, "La funcion:"+ funcionID+ " con la pelicula "+nombrePelicula+" no fue creada correctamente");
                }


            }
        });
        btnAceptar.setBounds(63, 320, 116, 23);
        contentPane.add(btnAceptar);



        JButton btnLimpiar=new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombrePelicula.setText("");
                txtGenero.setText("");
                txtDirector.setText("");
                txtDuracionEnMinutos.setText("");
                txtSala.setText("");
                txtPeliculaID.setText("");
                txtFuncionID.setText("");
                txtHorario.setText("");
                txtFecha.setText("");
                txtProyeccion.setText("");
            }
        });
        btnLimpiar.setBounds(200, 320, 116, 23);
        contentPane.add(btnLimpiar);



        JButton btnSalir=new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnSalir.setBounds(340, 320, 116, 23);
        contentPane.add(btnSalir);

    }
}
