package tour.entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Files {

    private File userFile;

    private File attractionsFile;

    private File packsFile;
    
    
    
    public List<User> readUsers(String path){
        FileReader fr = null;
	BufferedReader br = null;
	List<User> users= new ArrayList();
        try {
            fr=new FileReader (path);
            br= new BufferedReader(fr);
            String linea =br.readLine();
            linea=br.readLine();
            while(linea!=null) {
                String [] datos= linea.split(";");
		String name= datos[0];
		Double budget = Double.parseDouble(datos[1]);
		Double availability= Double.parseDouble(datos[2]);
                
                //Color color = Color.valueOf(datos[3].toUpperCase());
		users.add(new User(name, budget, availability));
		linea=br.readLine();
	}
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
		if (fr != null) {
			
		}
	}
        return users;
        
        
    }
    
//    public List<User> readPacks(String path){
//        FileReader fr = null;
//	BufferedReader br = null;
//	List<Promotions> packs= new ArrayList();
//        try {
//            fr=new FileReader (path);
//            br= new BufferedReader(fr);
//            String linea =br.readLine();
//            while(linea!=null) {
//                String [] datos= linea.split(",");
//		String name= datos[0];
//		Double budget = Double.parseDouble(datos[1]);
//		Double availability= Double.parseDouble(datos[2]);
//                
//                //Color color = Color.valueOf(datos[3].toUpperCase());
//		users.add(new User(name, budget, availability));
//		linea=br.readLine();
//	}
//	}catch (IOException e) {
//		e.printStackTrace();
//	}finally {
//		if (fr != null) {
//			
//		}
//	}
//        return users;
//        
//        
//    }
    
//      public List<User> printItinerary(String path){
//          
//          return itinerary;
//      }  

}
