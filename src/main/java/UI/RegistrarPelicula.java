package UI;

import Controller.FuncionController;
import Controller.PeliculasController;
import DTO.FuncionDto;
import DTO.PeliculaDto;
import DTO.SalaDto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

public class RegistrarPelicula extends JFrame {



    public static  void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    RegistrarPelicula frame=new RegistrarPelicula();
                    frame.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }




    public RegistrarPelicula(){
        setTitle("Registrar Pelicula");
        setBounds(100, 100, 700, 300);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JLabel lblGenero = new JLabel("Genero: ");
        lblGenero.setBounds(10, 20, 150, 14);
        contentPane.add(lblGenero);

        JTextField txtGenero = new JTextField();
        txtGenero.setBounds(200, 20, 305, 20);
        contentPane.add(txtGenero);
        txtGenero.setColumns(10);


        JLabel lblnombrePelicula = new JLabel("Nombre Pelicula:");
        lblnombrePelicula.setBounds(10, 50, 150, 14);
        contentPane.add(lblnombrePelicula);

        JTextField txtNombrePelicula = new JTextField();
        txtNombrePelicula.setBounds(200, 50, 305, 20);
        contentPane.add(txtNombrePelicula);
        txtNombrePelicula.setColumns(10);


        JLabel lblDirector = new JLabel("Director:");
        lblDirector.setBounds(10, 80, 150, 14);
        contentPane.add(lblDirector);

        JTextField txtDirector = new JTextField();
        txtDirector.setBounds(200, 80, 305, 20);
        contentPane.add(txtDirector);
        txtDirector.setColumns(10);

        JLabel lblDuracionEnMinutos = new JLabel("Duracion:");
        lblDuracionEnMinutos.setBounds(10, 110, 150, 14);
        contentPane.add(lblDuracionEnMinutos);

        JTextField txtDuracionEnMinutos = new JTextField();
        txtDuracionEnMinutos.setBounds(200, 110, 305, 20);
        contentPane.add(txtDuracionEnMinutos);
        txtDuracionEnMinutos.setColumns(10);


        JLabel lblPeliculaID = new JLabel("Pelicula ID:");
        lblPeliculaID.setBounds(10, 140, 150, 14);
        contentPane.add(lblPeliculaID);

        JTextField txtPeliculaID = new JTextField();
        txtPeliculaID.setBounds(200, 140, 305, 20);
        contentPane.add(txtPeliculaID);
        txtPeliculaID.setColumns(10);

        JLabel lblProyeccion = new JLabel("Proyeccion:");
        lblProyeccion.setBounds(10, 170, 150, 14);
        contentPane.add(lblProyeccion);

        JTextField txtProyeccion = new JTextField();
        txtProyeccion.setBounds(200, 170, 305, 20);
        contentPane.add(txtProyeccion);
        txtProyeccion.setColumns(10);



        JButton btnAceptar=new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombrePelicula = txtNombrePelicula.getText();
                String genero = txtGenero.getText();
                String duracionEnMinutos = txtDuracionEnMinutos.getText();
                String director = txtDirector.getText();
                String proyeccion = txtProyeccion.getText();
                String peliculaID = txtPeliculaID.getText();



                PeliculaDto peliculaDto=new PeliculaDto(genero,nombrePelicula,duracionEnMinutos,director,new ArrayList<String>(),proyeccion,peliculaID);
                PeliculasController peliculasController=PeliculasController.getInstance();


                boolean existe;
                existe=peliculasController.agregarPelicula(peliculaDto);

                if(existe) {
                    JOptionPane.showMessageDialog(null, "La pelicula: "+nombrePelicula+" fue creado correctamente");
                }
                else {
                    JOptionPane.showMessageDialog(null, "La  pelicula: "+nombrePelicula+" no fue creada correctamente");
                }


            }
        });
        btnAceptar.setBounds(63, 200, 116, 23);
        contentPane.add(btnAceptar);

        JButton btnLimpiar=new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombrePelicula.setText("");
                txtGenero.setText("");
                txtDirector.setText("");
                txtDuracionEnMinutos.setText("");
                txtPeliculaID.setText("");
                txtProyeccion.setText("");
            }
        });
        btnLimpiar.setBounds(200, 200, 116, 23);
        contentPane.add(btnLimpiar);



        JButton btnSalir=new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnSalir.setBounds(340, 200, 116, 23);
        contentPane.add(btnSalir);


    }
}
