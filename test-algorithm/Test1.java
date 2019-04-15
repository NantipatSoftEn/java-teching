public class Test1 {

    public static void main(String[] args) {
        start_pyramid();

    }

    public  static void number(){
        for(int i=0; i<8 ; i++){
            for(int j =1;j<=i;j++)
                System.out.print(j);
            System.out.println();
        } 
    }
    /*
    1
    12
    123
    1234
    12345
    123456
    1234567
    */ 
    public static void number_invsert(){
        for(int i=7; i > 0 ; i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
    /*
    1234567
    123456
    12345
    1234
    123
    12
    1
    */ 
    
}