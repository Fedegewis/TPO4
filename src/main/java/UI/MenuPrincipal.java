package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;


    public static void main(String [] args){
        MenuPrincipal menu=new MenuPrincipal();
        menu.setVisible(true);
    }

    public MenuPrincipal(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,400);
        contentPane=new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);



/*Registrar una nueva función por género.
Registrar una película por género.
Consultar las películas por género.
Emitir un reporte de las películas con mayor recaudación.
*/


        JButton btnRegistrarFuncion =new JButton("Registrar Nueva Funcion");
        JButton btnRegistrarPelicula=new JButton("Registrar Nueva Pelicula");
        JButton btnConsultarPeliculas=new JButton("Consultar Peliculas");
        JButton btnReporteDePeliculas=new JButton("Reporte de Peliculas");



        btnRegistrarFuncion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrarFuncion registrarFuncion;
                try{
                    registrarFuncion=new RegistrarFuncion();
                }catch (Exception ex){
                    throw new RuntimeException(ex);
                }
               registrarFuncion.setVisible(true);
            }
        });
        btnRegistrarFuncion.setBounds(100,79,210,23);
        contentPane.add(btnRegistrarFuncion);



        btnRegistrarPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistrarPelicula registrarPelicula;
                try{
                    registrarPelicula=new RegistrarPelicula();
                }catch (Exception ex){
                    throw new RuntimeException(ex);
                }
                registrarPelicula.setVisible(true);
            }
        });
        btnRegistrarPelicula.setBounds(100,131,210,23);
        contentPane.add(btnRegistrarPelicula);


        btnConsultarPeliculas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ConsultarPeliculas consultarPeliculas;
                try{
                    consultarPeliculas=new ConsultarPeliculas();
                }catch (Exception ex){
                    throw new RuntimeException(ex);
                }
                consultarPeliculas.setVisible(true);
            }
        });
        btnConsultarPeliculas.setBounds(100,182,210,23);
        contentPane.add(btnConsultarPeliculas);



        btnReporteDePeliculas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReportePeliculas reportePeliculas;
                try{
                    reportePeliculas=new ReportePeliculas();
                }catch (Exception ex){
                    throw new RuntimeException(ex);
                }
                reportePeliculas.setVisible(true);
            }
        });
        btnReporteDePeliculas.setBounds(100,234,210,23);
        contentPane.add(btnReporteDePeliculas);





    }

}
