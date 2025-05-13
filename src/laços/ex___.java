package laços;
public class ex___ {
    public static void main(String[] args) {

        for(int h = 0; h<=23; h++){

            if (h == 12 ) {
                System.out.println("Hora de almoçar");
                break;
            }


            for(int m = 0; m <=59; m++){

                if (h == 12 && m == 01) {
                    System.out.println("Hora de almoçar");
                    break;
                }
    

                for(int s = 0; s<=59; s++){

                    System.out.printf("%d:%d:%d \n", h,m,s);

                    if (h == 12 && m == 01 && s == 01) {
                        System.out.println("Hora de almoçar");
                        break;
                        
                    }
                }

            }

        }
      
    }
    
}
  