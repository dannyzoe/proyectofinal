/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daniela.guevara.mazano.CompresorJava;

import daniela.guevara.mazano.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Persistencia {
    public static ArrayList <Archivaldo> buscarTodos(){
        ArrayList<Archivaldo> usuarios=new ArrayList<Archivaldo>();
        try{
            File f=new File("archivos.ser");
            FileInputStream fis=new FileInputStream(f);
              ObjectInputStream ois=new ObjectInputStream(fis);
            usuarios= (ArrayList<Archivaldo>) ois.readObject();
        }catch (Exception e){
            
        }
        return usuarios;
    }
    public static void guardar (Archivaldo u){
        ArrayList<Archivaldo> usuarios= new ArrayList<Archivaldo>();
      try{
          //File f=new File (System.getProperty("user.home")+"/archivaldo.ser");
          File f=new File ("archivos.ser");
          if(f.exists()){
              usuarios= buscarTodos();
          }
          FileOutputStream fos=new FileOutputStream (f);
          ObjectOutputStream oos= new ObjectOutputStream (fos);
          usuarios.add(u);
          oos.writeObject(usuarios);
      }catch(Exception e){}
      
    }
}
