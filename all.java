public class all{
    public static void pattern(int n){
        for(int i = 0; i <= n; i++){
            //star
            for(int s = 0; s <= n; s++){
                System.out.print("*");
            }
            System.out.println();
            //spaces
            for(int spc =0; spc <= n-2;spc++){
                System.out.print(" ");
            }
            //star
            for(int s = 0; s <= n-1+1; s++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void inverted(int n){
        for(int i = 1; i<= n; i++){
            for(int count  = 1; count <= i; count++){
                System.out.print(count);
            }
            System.out.println();
        }
      
    }
    public static void reverse(int n){
        for(int i = 0; i <= n; i++){
            for( int count  = 0; count <=n-i  ;count++ ){
                System.out.print(count);
                
            }
            for(int j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public  static  void  fat(int n){
        int count = 1;
        for(int i = 1; i <= n; i++){
            for( count = 1; count <= i; count++){
                System.out.print(count);
                count++;
                
            }
            System.out.println();
        }
    }
    public static void  rectangle(int n ){
        int star = n;
        int spaces =n-2;
        int numberoflines = 1;
        while(numberoflines <= n-1){
            //star
            if(numberoflines == 1 || numberoflines == n-1){
                for(int i = 1; i <= star; i++){
                System.out.print("* ");
                }
            }
            //star
            System.out.print("* ");
            //spaces
            for(int j = 0; j <= spaces; j++){
                System.out.print("  ");
            }
            //stsar
            System.out.print("* ");
            //next line 
            System.out.println();
            numberoflines++;



        }
    }

    public static  void butterfly(int n){
        int star = 0;
        int spaces = 2*n-2;
        //int last = n-1;
        int numberoflines = 0;
        while(numberoflines <= n-1){
            //star
            for(int i =0; i <= star; i++){
                System.out.print("* ");
            }
            //sapces
            for(int j = 0; j <= spaces; j++){
                System.out.print("  ");
            }
            //satr
            for(int i =0; i <= star; i++){
                System.out.print("* ");
            }
            //next line
            System.out.println();
            star++;
            spaces = spaces - 2;
            
            numberoflines++;

        }  
         star = n;
         spaces = 0;
         numberoflines =1;
        while(numberoflines <= n){
            //star
            for(int i =0; i < star; i++){
                System.out.print("* ");
            }
            //sapces
            for(int j = 0; j <= spaces; j++){
                System.out.print("  ");
            }
            //satr
            for(int i =0; i < star; i++){
                System.out.print("* ");
            }
            //next line
            System.out.println();
            star--;
            spaces = spaces + 2;
            
            numberoflines++;

        }  
    }   
    public static  void  dimon(int n ){
        int spaces = n-1;
        int star = 1;
        int numberoflines = 1;
        while(numberoflines <= n ){
            
            for(int i = 0; i <= spaces; i++){
                System.out.print("  ");
            }
            
            for(int  j = 0; j < star; j++){
                System.out.print( "* ");
            }
            for(int i = 0; i <= spaces; i++){
                System.out.print("  ");
            }
            System.out.println();
            numberoflines++;
            spaces--;
            star = star + 2;
            
            
        }
        star =n;
        spaces=1;
        numberoflines=1;
        while(numberoflines <= n ){
            
            for(int i = 0; i <= spaces; i++){
                System.out.print("  ");
            }
            
            for(int  j = 0; j <= star; j++){
                System.out.print( "* ");
            }
            for(int i = 0; i <= spaces; i++){
                System.out.print("  ");
            }
            System.out.println();
            numberoflines++;
            spaces++;
            star = star - 2;
            
            
        }
    }
    public static void main(String[] args) {
        int n = 4;
        //inverted(n);
        //reverse(n);
       // fat(n);
      // butterfly(n);
      //rectangle(n);
      dimon(n);
    }
}