import java.util.ArrayList;
//import java.util.Collections;

public class Main_Q3 {
public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        String inp=text.toLowerCase();
        System.out.println(inp);
        ArrayList<String> letters= new ArrayList<>();
        String[] s=inp.split("");
        int vowels=0;
        int consonants=0;
        int spaces=0;
        for(String i:s)
        {
            letters.add(i);
        }
        String[] vowel_letters="aeiou".split("");
        System.out.println(letters.size());
        ol:
        for(String i: letters)
        {
            for(String j:vowel_letters)
                {
                if(i.equals(j))
                {
                    vowels+=1;
                    continue ol;
                }
                }
            if(i.equals(" "))
                spaces+=1;
            else
                consonants+=1;
                }
             //System.out.println("vowels: "+vowels+" spaces: "+spaces+" consonants: "+consonants); 
             System.out.println("The text contained vowels: " + vowels + "\n"+ "consonants:" + consonants + "\n"+ "spaces:"+spaces);  
    }
         
}