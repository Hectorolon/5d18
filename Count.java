/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

import java.util.HashMap;
/**
 *
 * @author 5d
 */
public class Count {
    private String getClean(String str) {
        str = str.trim();
        return str.replaceAll(".,", "");
    }
    
    public int count(String txt) {
        return getClean(txt).split(" ").length;
    }
    
    public int unicas(String txt) {
        HashMap<String,Integer> hash = new HashMap<>();
        txt = getClean(txt);
        
        for (String s : txt.split(" ")){
            if (!hash.containsKey(s))
                hash.put(s,1);
        }
        
        return hash.size();
    }
}
