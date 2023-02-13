public class stringfumction {
    public static void main(String[] args){
        String first = "khushi";
        String second = "khushi";
        String fullname = first + second;//concatenation
        System.out.println("fullname:" +fullname);
        System.out.println(fullname.length());//length
        //character
        for(int i=0;i<fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));        
        }
        if(first.compareTo(second)== 0){ //1 s1>s2:+ve value
          System.out.println("equal string");                               //2 s1<s2:-ve value
                                        }
        else{
            System.out.println("string are not equal");
        }                                //3 s1==s2:0

    
}
}