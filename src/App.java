public class App {
    public static void main(String[] args) throws Exception {
        
        boolean up = true;           // Barra superior
        boolean upRgt = false;    // Barra superior derecha
        boolean upLft = true;  // Barra superior derecha
        boolean center = true;            // Barra central
        boolean downLft = false;  // Barra inferior izquierda
        boolean downRgt = true;    // Barra inferior derecha
        boolean down = true;           // Barra inferior

        for(int i=1; i<=7; i++){
            
            for(int j=1; j<=5; j++){

                if(up == true && i == 1){
                    System.out.printf("%s",(j==1 || j==5)?" ":"*");
                }

                if(upLft == true && (i == 2 || i==3)){
                    System.out.printf("%s",(j==1)?"*":" ");
                }

                if(upRgt == true && (i == 2 || i==3)){
                    System.out.printf("%s",(j==5)?" ":"*");
                }

                if(center == true && i == 4){
                    System.out.printf("%s",(j==1 || j==5)?" ":"*");
                }
                
                if(downLft == true && (i == 5 || i==6)){
                    System.out.printf("%s",(j==1)?"*":" ");
                }

                if(downRgt == true && (i == 5 || i==6)){
                    System.out.printf("%s",(j==5)?"*":" ");
                }

                if(down == true && i == 7){
                    System.out.printf("%s",(j==1 || j==5)?" ":"*");
                }

            }

            System.out.println();
        }


    }
}
