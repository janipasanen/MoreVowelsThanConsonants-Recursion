/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiveprogrammorevowelsthanconsonants;

/**
 *
 * @author Jani Pasanen
 * 
 * Recursive methods to determine if a string s has more vowels than consonants.
 * 
 */

public class RecursiveProgramMoreVowelsThanConsonants {

    static final String[] VOWELS = new String[] {"a","e","i","o","u","y","å","ä","ö"};
    static final String[] CONSONANTS = new String[] {"b","c","d","f","g","h","j","k","l","m","n","q","r","s","t","v","w","x","z"};
    static private int nrvwls = 0;
    static private int nrcnsnts = 0;
    static private int l; 
    static private int i = 0;
    static private int ii = 0;
    static private int iii = 0;
    static final String S = "vioajdosivwjoswjvodjvoivjoiewjvoijoidsajvoijvoajovejvoiajofdivjoa"
            + "vaivjoijviorjoiaejvoirejåäaäådåsöålfaqaåpölfkjewpjäjfewölpajfasdoijfcolas"
            + "voiawejvwpvjweporjvweoivjwoeirjvwoeijvoweijwuopäöaeouiuåaediöäaioeoeijåää";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Characters(S);
            
        if (nrvwls > nrcnsnts){
            System.out.println("String S has more vowels than consonants."); 
            System.out.println("Number of vowels = " + nrvwls);
            System.out.println("Number of consonants = " + nrcnsnts);
            
            
        }
        else
        {
            System.out.println("String S has more consonants than vowels."); 
            System.out.println("Number of vowels = " + nrvwls);
            System.out.println("Number of consonants = " + nrcnsnts);
        }
            
    }
    
    
    public static void Characters(String s) {
        
        String str;     
        l = s.length();
        
        if (l == 1) {
            str = (s.substring(0, 1));
            Vowels(VOWELS, str);
            Consonants(CONSONANTS, str);
        }
        else
        {
            str = (s.substring(0, 1));
            Vowels(VOWELS, str);
            Consonants(CONSONANTS, str);
            ii = 0;
            iii = 0;
            // Recursion 1
            Characters(s.substring(1, l));
        }
    }
    
    
    public static void Vowels(String[] vwl, String strV) {
        int vwlsL = VOWELS.length;
        
        
        if (ii == vwlsL-1) {
            if (strV.equals(VOWELS[ii])) {
            nrvwls++; 
            }
        }
        else
        {
            if (strV.equals(VOWELS[ii])) {
            nrvwls++;
            }
            ii++;
             // Recursion 2
            Vowels(VOWELS, strV);
        }
    }
    
    public static void Consonants(String[] cnt, String strC) {
        int cnsntsL = CONSONANTS.length;
        
        if (iii == cnsntsL-1) {
            if (strC.equals(CONSONANTS[iii])) {
            nrcnsnts++; 
            }
        }
        else
        {
            if (strC.equals(CONSONANTS[iii])) {
            nrcnsnts++; 
            }
            iii++;
             // Recursion 3
            Consonants(CONSONANTS, strC);
        }
    }
            
    
}
       
    
