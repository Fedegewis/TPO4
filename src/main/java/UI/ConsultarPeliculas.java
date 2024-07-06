package UI;

import Controller.PeliculasController;
import DTO.PeliculaDto;
import Model.TipoGenero;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConsultarPeliculas extends JFrame  {

    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
    private JTextField txtGenero;
    private JButton btnBuscar;
    private String[] columns= new String[4];
    private String [] [] data=new String[4][4];
    PeliculasController peliculasController=null;

    public static  void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    ConsultarPeliculas frame=new ConsultarPeliculas();
                    frame.setVisible(true);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }



    public ConsultarPeliculas(){
        setTitle("Peliculas registradas");
        setSize(500,600);
        JPanel topPanel=new JPanel();
        topPanel.setLayout(new FlowLayout());
        getContentPane().add(topPanel);
        txtGenero = new JTextField(20);
        topPanel.add(txtGenero);
        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                String genero = txtGenero.getText();
                List<PeliculaDto> peliculas = peliculasController.consultarPeliculasPorGenero(TipoGenero.valueOf(genero));
                data = convertDtoToData(peliculas);
                model.setDataVector(data, columns);
                table.setModel(model);
            }
        });

        topPanel.add(btnBuscar, BorderLayout.NORTH);
        columns=new String[]{"Genero","Nombre","Duracion","Director"};
        peliculasController =PeliculasController.getInstance();
        data=convertDtoToData(peliculasController.consultarPeliculas());
        DefaultTableModel model = new DefaultTableModel(data,columns);
        table=new JTable();
        table.setModel(model);
        scrollPane=new JScrollPane(table);
        topPanel.add(scrollPane,BorderLayout.CENTER);
    }

    public String[][] convertDtoToData (Collection<PeliculaDto> dtos){
        List<PeliculaDto> dtoList=new ArrayList<>(dtos);
        String[] [] data=new String[dtos.size()][4];
        for (int i=0;i<dtoList.size();i++){
            data[i][0]=dtoList.get(i).getGenero();
            data[i][1]=dtoList.get(i).getNombrePelicula();
            data[i][2]=dtoList.get(i).getDuracionEnMinutos();
            data[i][3]=dtoList.get(i).getDirector();
        }
        return data;
    }

}
