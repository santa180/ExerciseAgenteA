/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.agentea.model.controller;

import co.edu.sena.agentea.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 * fecha: 28/10/2026
 * @author Santiago Santa
 * obj:controlador de galpón
 */
public class ShedController implements IShedController{
    
    public static List<Shed> shedlist = new ArrayList<>();
    
    public ShedController(){
        shedlist.add(new Shed(1, "DISPONIBLE"));
        shedlist.add(new Shed(2, "DISPONIBLE"));
        shedlist.add(new Shed(3, "OCUPADO"));
        
    }

    @Override
    public void insert(Shed shed) throws Exception {
       if (shed == null)
       {
           throw new Exception("El galpón esta vacío");
       }
       
       if(shed.getNumber()== 0)
       {
          throw new Exception("El número es obligatorio"); 
       }
       
       if ("".equals(shed.getStatus()))
       {
           throw new Exception("El estado es obligatorio"); 
       }
       
       shedlist.add(shed);//guarda los galpones registrados
    }

    @Override
    public void update(Shed shed) throws Exception {
       if (shed == null)
       {
           throw new Exception("El galpón esta vacío");
       }
       
       if(shed.getNumber()== 0)
       {
          throw new Exception("El número es obligatorio"); 
       }
       
       if ("".equals(shed.getStatus()))
       {
           throw new Exception("El estado es obligatorio"); 
       }
       
       //Verificar existencia del galpón a actulizar
       boolean exist = false;
        for (int i = 0; i < shedlist.size(); i++) {
            if(shedlist.get(i).getNumber() == shed.getNumber())
           {
               shedlist.set(i, shed); //actualiza
               exist = true;
               break;
           }
        }
        
        if (!exist)
        {
            throw new Exception("El galpón no existe");
        }
 
    }

    @Override
    public void delete(int number) throws Exception {
        if (number == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        //Verificar existencia del galpón a eliminar
        boolean exist = false;
        for (int i = 0; i < shedlist.size(); i++) {
            if(shedlist.get(i).getNumber() == number)
           {
               shedlist.remove(i); //eliminar
               exist = true;
               break;
           }
        }
        
        if (!exist)
        {
            throw new Exception("El galpón no existe");
        }
    }

    @Override
    public Shed find(int number) throws Exception {
        if (number == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        Shed shed = null;
        for(Shed s : shedlist){
            if(s.getNumber() == number)
            {
                shed = s;
                break;
            }
        
        }
        
        return shed;
    }

    @Override
    public List<Shed> findAll() throws Exception {
        return shedlist;
    }
    
}
