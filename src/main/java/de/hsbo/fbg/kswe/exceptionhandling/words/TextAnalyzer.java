
package de.hsbo.fbg.kswe.exceptionhandling.words;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class TextAnalyzer {

    public TextAnalyzer() {
    }
    
    
    public String findLongestWord(String text) {
        String longestWord="";
        String[] sp_text = text.split(" ");
        
        for (String nb : sp_text) {
            if(nb.length()>longestWord.length()){
                longestWord=nb;
            }
                
        }
    return longestWord;
    }
    

}
