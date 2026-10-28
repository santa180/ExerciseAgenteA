/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.agentea.model.controller;

import co.edu.sena.agentea.model.Shed;
import java.util.List;

/**
 * fecha: 28/10/2026
 * @author Santiago Santa
 * obj:interface de galpón
 */
public interface IShedController {
    public void insert(Shed shed)throws Exception;
    public void update(Shed shed) throws Exception;
    public void delete(int number) throws Exception;
    public Shed find (int number) throws Exception;
    public List<Shed> findAll() throws Exception;
}
