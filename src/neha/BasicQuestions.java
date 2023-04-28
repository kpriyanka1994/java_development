package neha;

public class BasicQuestions {
    public static void main(String[] args) {
        for(int i=0;i<6;i++)
        {for(int j=i;0<=j;j--)
            {
               // System.out.print("*");
            }
            System.out.println();
        }
        for(int i= 0; i<5;i++){
            if(i>2){
                for(int j=0;j<2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");

            }else {
                for(int j=0;j<5; j++){
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
    }
}
