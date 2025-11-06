package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */

     // count the words ending in y or z
     // words do not count unless they end in y
     // y is the last letter if it is followed by non-alphanumeric char

    public Integer countYZ(String input) {
        String[] words = input.split("\\P{Alnum}+");
    
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            char lastCharInEachWord = words[i].charAt(words[i].length() - 1);

            if (lastCharInEachWord == 'y' || lastCharInEachWord == 'z') {
                count += 1;
            }
            
        }

        return count;
        
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */ 
    // given the strings base and remove 
    // remove characters from string via substring()
    // print the result of "remove" and see if it is true 
    // String base does not print case sensitive characters, so need to find a way to remove the capital H and T
    // implement a toLowerCase() and toUpperCase() loops somewhere (still figuring that out)
    // base = "Hello There"
    // remove = "llo"
    public String removeString(String base, String remove){
        return base.replace(remove, "");
        
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    // count how many "is" in string
    //count how many "not" in string
    // return true if they are equal, false if not
    public Boolean containsEqualNumberOfIsAndNot(String input){
          int numIs = 0;
          int numNot = 0;
          
          do {
          }
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        return null;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        return null;
    }
}
