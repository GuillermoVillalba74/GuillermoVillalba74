/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tour.main;

import tour.entity.Files;

/**
 *
 * @author sistemas
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
        
    Files filesTour = new Files();
        
        System.out.println(filesTour.readUsers("/home/sistemas/Documentos/YoProgramoCESSI/TourUser.csv"));  
       

// TODO code application logic here
    }
    
    
        
}
