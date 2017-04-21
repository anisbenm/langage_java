/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Administrateur
 */
public class ExempleMap {
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("je", "suis");
        map.put("vous", "etes");
        
        System.out.println("je "+map.get("je"));
        
        Set<String> set=map.keySet();
        for(String key :set){
            System.out.println(key+" : "+map.get(key));
        }
        map.remove("vous");
        System.out.println("exercices.ExempleMap.main()"+map);
    }
}
