public class Main_Q4 {
public static void main(String[] args)
    {
        //String text = "a b f y g t u";
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        String[] s=text.split(" ");
        int n=s.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if((s[j].compareToIgnoreCase(s[j+1]))>0)
                {
                    String t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                }
            }
        }
        for(String i:s) 
            System.out.print(i+" ");
        
    }
         
}