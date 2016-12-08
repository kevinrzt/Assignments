import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Iterator;

public class file {

    public static void main(String args[]) throws FileNotFoundException {


        File text = new File("/home/kevinxavier/javatest.txt");


        Scanner scnr = new Scanner(text);


        String index;

        String line = scnr.nextLine();
        Hashtable<Character,String> map = new Hashtable<Character,String>();
        String[] words=line.split(" ");
        int P=0;
        int wordlength=words.length;
       // System.out.print(words[0]);
        int X=words[P].length();
        char W=words[P].charAt(0);
        for (String word : words) {
           // wordlength=word.length();
          //  System.out.println(word + word.charAt(wordlength-1));

            map.put(word.charAt(0),word);


        }
        int i=0,L;
        String AS=" ";
       try {
           while (i<wordlength) {
               if(map.get(W)!=null) {
                   System.out.print(map.get(W) + " ");
                   // System.out.println(map);
               }
               else
               {
                   P++;
                   W=words[P].charAt(0);
               }


               AS = map.get(W);
               map.remove(W);
               L = AS.length();
               W = AS.charAt(L - 1);

           }
       }catch (NullPointerException e){

       }
        Set set = map.entrySet();

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.print(entry.getValue()+" ");
        }






    }

}


