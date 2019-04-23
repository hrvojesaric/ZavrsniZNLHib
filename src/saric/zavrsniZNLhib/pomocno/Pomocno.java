/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saric.zavrsniZNLhib.pomocno;

import java.io.File;
import java.nio.file.Paths;

/**
 *
 * @author Profesor
 */
public class Pomocno {
    
 
    
    public static String getPutanjaAplikacije(){
       return Paths.get("").toAbsolutePath().toString() + File.separator;
    }
    
}
