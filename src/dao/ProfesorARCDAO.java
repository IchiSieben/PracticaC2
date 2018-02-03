/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Profesor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import service.EntidadService;
import util.AgeException;

/**
 *
 * @author DesktopN°1
 */
public class ProfesorARCDAO implements EntidadService<Profesor>{
    
    List<Profesor> ListaProfesors = new ArrayList<>();
    
    // try to change try catch
    @Override
    public int crearEntidad(Profesor t){
        File file;
        FileWriter write;
        PrintWriter line;
        
        file = new File("bdProfesores.txt");
        
        if (!file.exists()){
            try {
                file.createNewFile();
                write = new FileWriter(file,true);
                line = new PrintWriter(write);
                        
                
                line.println(t.atributosProfesor());
                line.close();
                write.close();
                ListaProfesors.add(t);
                
                
                
            } catch (IOException e) {
            }
            
        }else{
            try {
                write = new FileWriter(file,true);
                line = new PrintWriter(write);
                line.println(t.atributosProfesor());
                line.close();
                write.close();
                ListaProfesors.add(t);
            } catch (IOException e) {
            }
        }
        
        return ListaProfesors.size();
    }

    @Override
    public int eliminarEntidad(int codigo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        File inputFile;
        File tempFile;
        BufferedReader reader;
        BufferedWriter writer;
        Profesor tempProfesor;
        ListaProfesors.clear();
        inputFile = new File("bdProfesores.txt");
        tempFile = new File("bdPRofesorsTemp.txt");

        try {
            
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(tempFile));
            
            tempProfesor = buscarEntidad(codigo);
            
            String lineToRemove = tempProfesor.atributosProfesor();
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) {
                    continue;
                }else{
                    
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
                
            }
            writer.close();
            reader.close();
           
            inputFile.delete();
            tempFile.renameTo(inputFile);
            
            //inputFile.delete();
            //tempFile = new File("bdProfesores.txt");
                    
            
        } catch (IOException e) {
        }
        //return ListaProfesors.size();
        
        return 0;
        
    }

    @Override
    public int actualizarEntidad(Profesor t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        File inputFile;
        File tempFile;
        BufferedReader reader;
        BufferedWriter writer;
        Profesor tempProfesor;
        int codigo; 
        ListaProfesors.clear();
        inputFile = new File("bdProfesores.txt");
        tempFile = new File("bdPRofesorsTemp.txt");
        codigo = t.getIdProfesor();

        try {
            
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(tempFile));
            
            tempProfesor = buscarEntidad(codigo);
            
            String lineToModify = tempProfesor.atributosProfesor();
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToModify)) {
                    
                    writer.write(t.atributosProfesor() + System.getProperty("line.separator"));
                }else{
                    
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
                
            }
            writer.close();
            reader.close();
           
            inputFile.delete();
            tempFile.renameTo(inputFile);
            
            //inputFile.delete();
            //tempFile = new File("bdProfesores.txt");
                    
            
        } catch (IOException e) {
        }
        return ListaProfesors.size();
        
        //return 0;
        
    }

    @Override
    public List<Profesor> obtenerEntidades() {
        File file;
        FileReader read;
        BufferedReader buffer;
        String chain;
        ListaProfesors.clear();
        file = new File("bdProfesores.txt");
        
        try {
            read = new FileReader(file);
            buffer = new BufferedReader(read);
            chain ="";
            while (chain != null) {
                
                try{
                    chain = buffer.readLine();
                    if (chain != null){
                        System.out.println(chain);
                        
                        String[] items = chain.split("\\|");
                        List<String> itemList =Arrays.asList(items);
                        System.out.println(itemList);
                        
                        Profesor temp = new Profesor();
                        
                        temp.setIdProfesor(Integer.parseInt(itemList.get(0)));
                        temp.setNombres(itemList.get(1));
                        temp.setApellidos(itemList.get(2));
                        temp.setSueldo(Integer.parseInt(itemList.get(3)));
                        temp.setEdad(Integer.parseInt(itemList.get(4)));
                        
                        ListaProfesors.add(temp);
                        
                    }
                }catch (IOException ex) {

                }
                
            }
            buffer.close();
            read.close();
            
            
        } catch (IOException e) {
            
        }
        
        return ListaProfesors;
        
    }

    @Override
    public Profesor buscarEntidad(int codigo) {
        
        File file;
        FileReader read;
        BufferedReader buffer;
        String chain;
        ListaProfesors.clear();
        file = new File("bdProfesores.txt");
        Profesor profesorDeseado = new Profesor();
        try {
            read = new FileReader(file);
            buffer = new BufferedReader(read);
            chain ="";
            
            while (chain != null) {
                
                try{
                    chain = buffer.readLine();
                    if (chain != null){
                        System.out.println(chain);
                        
                        String[] items = chain.split("\\|");
                        List<String> itemList =Arrays.asList(items);
                        System.out.println(itemList);
                        
                        Profesor temp = new Profesor();
                        
                        temp.setIdProfesor(Integer.parseInt(itemList.get(0)));
                        temp.setNombres(itemList.get(1));
                        temp.setApellidos(itemList.get(2));
                        temp.setSueldo(Integer.parseInt(itemList.get(3)));
                        temp.setEdad(Integer.parseInt(itemList.get(4)));
                        
                        ListaProfesors.add(temp);
                        if (codigo == temp.getIdProfesor()){
                            profesorDeseado.setIdProfesor(temp.getIdProfesor());
                            profesorDeseado.setNombres(temp.getNombres());
                            profesorDeseado.setApellidos(temp.getApellidos());
                            profesorDeseado.setSueldo(temp.getSueldo());
                            profesorDeseado.setEdad(temp.getEdad());
                        }
                        
                    }
                    
                 
                 
                    
                }catch (IOException ex) {

                }
                
            }
            
            read.close();
            buffer.close();
            
        } catch (IOException e) {
            
        }

        
        return profesorDeseado;
    }
//  @Override  
//  public Profesor buscarEntidad(int codigo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }  

    @Override
    public List<Profesor> mostrarPrimerElemento() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        File file;
        FileReader read;
        BufferedReader buffer;
        String chain;
        ListaProfesors.clear();
        file = new File("bdProfesores.txt");
        Profesor profesorDeseado = new Profesor();
        try {
            read = new FileReader(file);
            buffer = new BufferedReader(read);
            chain ="";
            
            while (chain != null) {
                
                try{
                    chain = buffer.readLine();
                    if (chain != null){
                        System.out.println(chain);
                        
                        String[] items = chain.split("\\|");
                        List<String> itemList =Arrays.asList(items);
                        System.out.println(itemList);
                        
                                           
                        profesorDeseado.setIdProfesor(Integer.parseInt(itemList.get(0)));
                        profesorDeseado.setNombres(itemList.get(1));
                        profesorDeseado.setApellidos(itemList.get(2));
                        profesorDeseado.setSueldo(Integer.parseInt(itemList.get(3)));
                        profesorDeseado.setEdad(Integer.parseInt(itemList.get(4)));
                        ListaProfesors.add(profesorDeseado);
                        break;
                        
                    }
                    
                 
                 
                    
                }catch (IOException ex) {

                }
                
            }
            
            read.close();
            buffer.close();
            
        } catch (IOException e) {
            
        }

        
        return ListaProfesors;
        
    }

    @Override
    public boolean todosMas2500() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Boolean todosMayorA2500 = Boolean.TRUE;
        File file;
        FileReader read;
        BufferedReader buffer;
        String chain;
        ListaProfesors.clear();
        file = new File("bdProfesores.txt");
        
        try {
            read = new FileReader(file);
            buffer = new BufferedReader(read);
            chain ="";
            while (chain != null) {
                
                try{
                    chain = buffer.readLine();
                    if (chain != null){
                        System.out.println(chain);
                        
                        String[] items = chain.split("\\|");
                        List<String> itemList =Arrays.asList(items);
                        System.out.println(itemList);
                        
                        Profesor temp = new Profesor();
                        
                        temp.setIdProfesor(Integer.parseInt(itemList.get(0)));
                        temp.setNombres(itemList.get(1));
                        temp.setApellidos(itemList.get(2));
                        temp.setSueldo(Integer.parseInt(itemList.get(3)));
                        temp.setEdad(Integer.parseInt(itemList.get(4)));
                        
                        ListaProfesors.add(temp);
                        if (temp.getSueldo()<2500){
                            todosMayorA2500 = Boolean.FALSE;
                            break;
                        }
                    }
                }catch (IOException ex) {

                }
                
            }
            buffer.close();
            read.close();
            
            
        } catch (IOException e) {
            
        }
        
        return todosMayorA2500;
    }

    @Override
    public List<Profesor> mas1500Menos40NoA() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        File file;
        FileReader read;
        BufferedReader buffer;
        String chain;
        ListaProfesors.clear();
        file = new File("bdProfesores.txt");
        
        try {
            read = new FileReader(file);
            buffer = new BufferedReader(read);
            chain ="";
            while (chain != null) {
                
                try{
                    chain = buffer.readLine();
                    if (chain != null){
                        System.out.println(chain);
                        
                        String[] items = chain.split("\\|");
                        List<String> itemList =Arrays.asList(items);
                        System.out.println(itemList);
                        
                        Profesor temp = new Profesor();
                        
                        temp.setIdProfesor(Integer.parseInt(itemList.get(0)));
                        temp.setNombres(itemList.get(1));
                        temp.setApellidos(itemList.get(2));
                        temp.setSueldo(Integer.parseInt(itemList.get(3)));
                        temp.setEdad(Integer.parseInt(itemList.get(4)));
                        
                        //last condition care
                        boolean flag=true;
                        if ( (temp.getApellidos().substring(0, 1)).equals("a")||(temp.getApellidos().substring(0, 1)).equals("A") ){
                            flag =false;
                        }
                        
                        
                        if (temp.getSueldo()>1500 && temp.getEdad()<40 && flag ){
                            ListaProfesors.add(temp);
                        }
                            
                        
                    }
                }catch (IOException ex) {

                }
                
            }
            buffer.close();
            read.close();
            
            
        } catch (IOException e) {
            
        }
        
        return ListaProfesors;
        
    }

    @Override
    public double promedioMayor40() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double promedioEdadMayor40= 0;
        File file;
        FileReader read;
        BufferedReader buffer;
        String chain;
        ListaProfesors.clear();
        file = new File("bdProfesores.txt");
        Profesor profesorDeseado = new Profesor();
        int c=0;
        try {
            read = new FileReader(file);
            buffer = new BufferedReader(read);
            chain ="";
            
            while (chain != null) {
                
                try{
                    chain = buffer.readLine();
                    if (chain != null){
                        System.out.println(chain);
                        
                        String[] items = chain.split("\\|");
                        List<String> itemList =Arrays.asList(items);
                        System.out.println(itemList);
                        
                        Profesor temp = new Profesor();
                        
                        temp.setIdProfesor(Integer.parseInt(itemList.get(0)));
                        temp.setNombres(itemList.get(1));
                        temp.setApellidos(itemList.get(2));
                        temp.setSueldo(Integer.parseInt(itemList.get(3)));
                        temp.setEdad(Integer.parseInt(itemList.get(4)));
                        
                        ListaProfesors.add(temp);
                        if (temp.getEdad()> 40){
                            promedioEdadMayor40 = promedioEdadMayor40+temp.getSueldo();
                            c++;
                            
                        }
                        
                    }
                    
                 
                 
                    
                }catch (IOException ex) {

                }
                
            }
            
            read.close();
            buffer.close();
            
        } catch (IOException e) {
            
        }

        
        return promedioEdadMayor40/c;
    }

    @Override
    public List<Integer> sueldoBrutoAnual() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        File file;
        FileReader read;
        BufferedReader buffer;
        String chain;
        List<Integer> ListaSueldosBRutos = new ArrayList<>();
        ListaProfesors.clear();
        file = new File("bdProfesores.txt");
        
        try {
            read = new FileReader(file);
            buffer = new BufferedReader(read);
            chain ="";
            
            while (chain != null) {
                
                try{
                    chain = buffer.readLine();
                    if (chain != null){
                        System.out.println(chain);
                        
                        String[] items = chain.split("\\|");
                        List<String> itemList =Arrays.asList(items);
                        System.out.println(itemList);
                        
                        Profesor temp = new Profesor();
                        
                        temp.setIdProfesor(Integer.parseInt(itemList.get(0)));
                        temp.setNombres(itemList.get(1));
                        temp.setApellidos(itemList.get(2));
                        temp.setSueldo(Integer.parseInt(itemList.get(3)));
                        temp.setEdad(Integer.parseInt(itemList.get(4)));
                        
                        ListaSueldosBRutos.add(temp.getSueldo()*15);
                        
                    }
                }catch (IOException ex) {

                }
                
            }
            buffer.close();
            read.close();
            
            
        } catch (IOException e) {
            
        }
        
        return ListaSueldosBRutos;
    }
    
    
}
