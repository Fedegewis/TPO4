package UI;

import Controller.PeliculasController;
import DTO.PeliculaDto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ConsultarPeliculas extends JFrame  {

    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;
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
        setSize(400,400);
        JPanel topPanel=new JPanel();

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

    /* private String genero;
    private String nombrePelicula;
    private String duracionEnMinutos;
    private String director;
    private List<String> actores=*/
}
