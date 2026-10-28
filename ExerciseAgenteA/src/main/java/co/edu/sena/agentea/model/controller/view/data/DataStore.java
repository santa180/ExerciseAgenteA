/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.agentea.model.controller.view.data;

import co.edu.sena.agentea.model.Shed;
import static co.edu.sena.agentea.model.controller.ShedController.shedlist;
import java.util.ArrayList;
import java.util.List;

/**
 *fecha:28/10/2026
 * @author Aprendiz
 * obj:almacen de datos con lista de datos
 */
public class DataStore {
    private static List<Shed> ShedList = new ArrayList<>();
    
    static //carga inicial de datos
    {
        shedlist.add(new Shed(1, "DISPONIBLE"));
        shedlist.add(new Shed(2, "DISPONIBLE"));
        shedlist.add(new Shed(3, "OCUPADO"));
    }

    public static List<Shed> getShedList() {
        return ShedList;
    }
    
    
}
