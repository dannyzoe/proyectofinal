/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daniela.guevara.mazano;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author DANIELAGM
 */
public class Persistencia {
    public static ArrayList <Papeleria> buscarTodos(){
        ArrayList<Papeleria> papelerias=new ArrayList<Papeleria>();
        try{
            File f=new File(System.getProperty("user.home")+"archivaldo.ser");
            FileInputStream fis=new FileInputStream(f);
              ObjectInputStream ois=new ObjectInputStream(fis);
            papelerias= (ArrayList<Papeleria>) ois.readObject();
        }catch (Exception e){
            
        }
        return papelerias;
    }
    public static void guardar (Papeleria u){
        ArrayList<Papeleria> papelerias= new ArrayList<Papeleria>();
      try{
          //File f=new File (System.getProperty("user.home")+"/archivaldo.ser");
          File f=new File (System.getProperty("user.home")+"archivaldo.ser");
          if(f.exists()){
              papelerias= buscarTodos();
          }
          FileOutputStream fos=new FileOutputStream (f);
          ObjectOutputStream oos= new ObjectOutputStream (fos);
          papelerias.add(u);
          oos.writeObject(papelerias);
      }catch(Exception e){}
      
    }
}
