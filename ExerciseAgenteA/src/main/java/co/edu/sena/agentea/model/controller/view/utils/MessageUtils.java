/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.agentea.model.controller.view.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Aprendiz
 */
public class MessageUtils {
    private static MessageUtils instance = null;

    public MessageUtils() { 
    }

    public static MessageUtils getInstance() {
         if (instance == null)
        {
            instance = new MessageUtils();
        }
         
        return instance;
    }
    
    public void showInfo(String message)
    {
        JOptionPane.showMessageDialog(null, message, "información",JOptionPane.INFORMATION_MESSAGE);
    }
    public void showWarning(String message)
    {
        
        JOptionPane.showMessageDialog(null, message, "Advertencia",JOptionPane.WARNING_MESSAGE);
    }
    public void showError(String message)
    {
        
        JOptionPane.showMessageDialog(null, message, "Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public int showConfirm(String message)
    {
        return JOptionPane.showConfirmDialog(null, message, "Confirmación", JOptionPane.YES_NO_OPTION);
    }
}
