    
    /**
     * Write a description of class FullSystem here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    import java.util.Scanner;
    import java.lang.Math;
    public class FullSystem
    {
        // instance variables - replace the example below with your own
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            char[] CHARCTERS={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            int baseStart=0;
            String testForType = "";
            boolean test=false;
            
            while(baseStart>CHARCTERS.length||baseStart<1){
                System.out.println("What do you want your starting base to be?(1-"+CHARCTERS.length+")");
                testForType = input.next();
                for(int i = 0; i < testForType.length();i++){
                    
                }
                if(test){
                    System.out.println("Yo dumb ass don't use letters");
                }else{
                    baseStart = input.nextInt();
                }
            }
            int converted = 0;
            boolean foundChar = false;
            int value = 0;
            boolean foundAll = true;
            String number;
            String convertable;
            
            if(baseStart == 1){
                System.out.println("Write a number using the digits 1:");
                number = input.next();
                converted = 0;
                foundChar = false;
                value = 1;
                foundAll = true;
                convertable = number.toUpperCase();
                //conversion function
                for(int i=0;i<convertable.length();i++){
                    if(convertable.charAt(i)=='1'){
                        foundChar = true;
                    }
                    if(!foundChar){
                        System.out.println("Char "+convertable.charAt(i)+" at "+i+" not found in vailable digits");
                        foundAll = false;
                    }else{
                        converted+=((int)Math.pow((double)baseStart,(double)i)*value);
                    }
                }
                
            }else{
                System.out.print("Write a number using the digits 0");
                for(int i=1;i<baseStart;i++){
                    System.out.print(", "+CHARCTERS[i]);
                }
                System.out.println(":");
                number = input.next();
                converted = 0;
                foundChar = false;
                value = 0;
                foundAll = true;
                convertable = number.toUpperCase();
                //conversion function
                for(int i=0;i<convertable.length();i++){
                    foundChar = false; 
                    for(int c=0;c<baseStart;c++){
                        if(convertable.charAt(i)==CHARCTERS[c]){
                            value=c;
                            foundChar = true;
                        }
                    }
                    if(!foundChar){
                        System.out.println("The number "+convertable.charAt(i)+" at "+i+" not found in available digits");
                        foundAll = false;
                    }else{
                        converted+=((int)Math.pow((double)baseStart,(double)i)*value);
                        
                    }
                    
                }
            }
            if(converted>Integer.MAX_VALUE){
                System.out.println("This number is too large to convert");
            }
            if(foundAll&&converted<Integer.MAX_VALUE){
                System.out.println(convertable+" in baseStart "+baseStart+" = "+converted+" in base 10 numbering.");
            
             
                int base=0;
                while(base>CHARCTERS.length||base<1){
                    System.out.println("What do you want your number to be turned to?(1-"+CHARCTERS.length+")");
                    base = input.nextInt();
                }
                /*int converted = 0;
                boolean foundChar = false;
                int value = 0;
                boolean foundAll = true;
                String convertable;*/
                
                
                convertable = "";
                if(base==1){
                    for(int i=0; i<converted;i++){
                        convertable = "1" + convertable;
                    }
                }else{
                while (converted > 0) {
                    int digit = converted % base;              // rightmost digit
                    convertable = CHARCTERS[digit] + convertable;  // string concatenation
                    converted = converted / base;
                }
                   
                System.out.println(number+" in baseStart "+baseStart+" = "+convertable+" in base "+base+" numbering.");  
               }
            
        
         }else{
             System.out.println("This number has error(s)");
         }
     }
}
