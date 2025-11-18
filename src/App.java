public class App {

    static boolean up = false;           // Barra superior
    static boolean upRgt = false;    // Barra superior derecha
    static boolean upLft = false;  // Barra superior derecha
    static boolean center = false;            // Barra central
    static boolean downLft = false;  // Barra inferior izquierda
    static boolean downRgt = false;    // Barra inferior derecha
    static boolean down = false;           // Barra inferior

    static int num = 0;
    static int numDigits = 0;
    static int digit = 0;
    static int aux = 0;

    static int start = 1;
    static int end = 5;

    public static void requestNum(){
        do{
            System.out.print("Introduce el dígito que quieres imprimir(0-9): ");
            digit = Integer.parseInt(System.console().readLine());
            if(num<0 || num>9) System.out.println("Introduce numero válido");

        }while(num<0 || num>9);
    }

    public static void requestNums(){
        do{
            System.out.print("Introduce un número del 0 al 9: ");
            num = Integer.parseInt(System.console().readLine());
            if(num<0 || num>9) System.out.println("Introduce numero válido");

        }while(num<0 || num>9);
    }

    public static void setNumber(){

        switch (digit) {
            case 0:
                up = true;
                upLft = true;
                upRgt = true;
                center = false;
                downLft = true;
                downRgt = true;
                down = true;
                break;
            case 1:
                up = false;
                upLft = false;
                upRgt = true;
                center = false;
                downLft = false;
                downRgt = true;
                down = false;
                break;
            case 2:
                up = true;
                upLft = false;
                upRgt = true;
                center = true;
                downLft = true;
                downRgt = false;
                down = true;
                break;
            case 3:
                up = true;
                upLft = false;
                upRgt = true;
                center = true;
                downLft = false;
                downRgt = true;
                down = true;
                break;
            case 4:
                up = false;
                upLft = true;
                upRgt = true;
                center = true;
                downLft = false;
                downRgt = true;
                down = false;
                break;
            case 5:
                up = true;
                upLft = true;
                upRgt = false;
                center = true;
                downLft = false;
                downRgt = true;
                down = true;
                break;
            case 6:
                up = false;
                upLft = true;
                upRgt = false;
                center = true;
                downLft = true;
                downRgt = true;
                down = true;
                break;
            case 7:
                up = true;
                upLft = false;
                upRgt = true;
                center = false;
                downLft = false;
                downRgt = true;
                down = false;
                break;
            case 8:
                up = true;
                upLft = true;
                upRgt = true;
                center = true;
                downLft = true;
                downRgt = true;
                down = true;
                break;
            case 9:
                up = true;
                upLft = true;
                upRgt = true;
                center = true;
                downLft = false;
                downRgt = true;
                down = false;
                break;
            default:
                System.out.println("Introduce un numero correcto");
                break;
        }

    }

    public static void printNum(){

        for(int i=1; i<=7; i++){
            
            for(int j=1; j<=5; j++){

                if(up == true && i == 1){
                    System.out.printf("%s",(j==1 || j==5)?" ":"*");
                }

                if(upLft == true && (i == 2 || i==3)){
                    System.out.printf("%s",(j==1)?"*":(j==5)?"":" ");
                }

                if(upRgt == true && (i == 2 || i==3)){
                    if(upLft == false) System.out.printf("%s", (j<5)?" ":"");
                    System.out.printf("%s",(j==5)?"*":"");
                }

                if(center == true && i == 4){
                    System.out.printf("%s",(j==1 || j==5)?" ":"*");
                }
                
                if(downLft == true && (i == 5 || i==6)){
                    System.out.printf("%s",(j==1)?"*":(downRgt == false && j==5)?" ":(j==5)?"":" ");
                }

                if(downRgt == true && (i == 5 || i==6)){
                    if(downLft == false) System.out.printf("%s", (j<5)?" ":"");
                    System.out.printf("%s",(j==5)?"*":"");
                }

                if(down == true && i == 7){
                    System.out.printf("%s",(j==1 || j==5)?" ":"*");
                }

            }

            System.out.println();
        }

    }

    public static void printNums(){

        for(int i=1; i<=7; i++){
            
            for(digit=0; digit<=num; digit++){

                setNumber();
                
                for(int j=1; j<=5; j++){

                    if(up == true && i == 1){
                        System.out.printf("%s",(j==1 || j==5)?" ":"*");
                    }else if(up == false && i==1) System.out.print(" ");
    
                    if(upLft == true && (i == 2 || i==3)){
                        System.out.printf("%s",(j==1)?"*":(upRgt == false && j==5)?" ":(j==5)?"":" ");
                    }
    
                    if(upRgt == true && (i == 2 || i==3)){
                        if(upLft == false) System.out.printf("%s", (j<5)?" ":"");
                        System.out.printf("%s",(j==5)?"*":"");
                    }
    
                    if(center == true && i == 4){
                        System.out.printf("%s",(j==1 || j==5)?" ":"*");
                    }else if(center == false && i==4) System.out.print(" ");
                    
                    if(downLft == true && (i == 5 || i==6)){
                        System.out.printf("%s",(j==1)?"*":(downRgt == false && j==5)?" ":(j==5)?"":" ");
                    }
    
                    if(downRgt == true && (i == 5 || i==6)){
                        if(downLft == false) System.out.printf("%s", (j<5)?" ":"");
                        System.out.printf("%s",(j==5)?"*":"");
                    }else if(downRgt == false && j==5) System.out.print(" ");
    
                    if(down == true && i == 7){
                        System.out.printf("%s",(j==1 || j==5)?" ":"*");
                    }else if(down == false && i==7) System.out.print(" ");
    
                }
                System.out.print(" ");
            }

            System.out.println();
        }

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws Exception {
        
        //do{
            //limpiarPantalla();
            requestNums();

            setNumber();

            printNums();
        //}while(digit != -1);
    }
}
