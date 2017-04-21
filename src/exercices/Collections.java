/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Administrateur
 */
public class Collections {
    public static void main(String[] args) {
        List liste=new ArrayList();
        liste.add("salom");
        liste.add(10);
        liste.add(new Date());
       for(Object l:liste){
           System.out.println("exercices.Collections.main()"+l);
       }
      List<String> listypee=new ArrayList<>();
        listypee.add("salom");
        listypee.add("allo");
        listypee.add("dddd");
       for(String l:listypee){
           System.out.println("exercices.Collections.main()"+l);
       }
    }
}
