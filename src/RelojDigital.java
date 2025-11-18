import java.time.LocalTime;
public class RelojDigital {

    static boolean up = false;           // Barra superior
    static boolean upRgt = false;    // Barra superior derecha
    static boolean upLft = false;  // Barra superior derecha
    static boolean center = false;            // Barra central
    static boolean downLft = false;  // Barra inferior izquierda
    static boolean downRgt = false;    // Barra inferior derecha
    static boolean down = false;           // Barra inferior

    static int digit = 0;

    static LocalTime ahora = LocalTime.now(); 
    static int hora = ahora.getHour();
    static int minuto = ahora.getMinute();
    static int segundo = ahora.getSecond();

    static int hora1 = hora / 10;
    static int hora2 = hora % 10;
    static int minuto1 = minuto / 10;
    static int minuto2 = minuto % 10;
    static int segundo1 = segundo / 10;
    static int segundo2 = segundo % 10;

    public static void getTime(){

        ahora = LocalTime.now(); 
        hora = ahora.getHour();
        minuto = ahora.getMinute();
        segundo = ahora.getSecond();

        hora1 = hora / 10;
        hora2 = hora % 10;
        minuto1 = minuto / 10;
        minuto2 = minuto % 10;
        segundo1 = segundo / 10;
        segundo2 = segundo % 10;

    }

    public static void setDigit(int cont){

        switch (cont) {
            case 0:
                digit = hora1;
                break;
            case 1:
                digit = hora2;
                break;
            case 2:
                digit = minuto1;
                break;
            case 3:
                digit = minuto2;
                break;
            case 4:
                digit = segundo1;
                break;
            case 5:
                digit = segundo2;
                break;
            default:
                break;
        }

    }
    
    public static void printBox(){

        System.out.println("         **********************************************");
        System.out.println("         ********** R E L O J  D I G I T A L **********");
        System.out.println("         **********************************************");


    }

    public static void setNumber(int digit){

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

    public static void printNums(){

        for(int i=1; i<=7; i++){
            System.out.print("         ");
            for(int cont=0; cont<6; cont++){

                setDigit(cont);

                setNumber(digit);
                
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
                    }
    
                    if(down == true && i == 7){
                        System.out.printf("%s",(j==1 || j==5)?" ":"*");
                    }else if(down == false && i==7) System.out.print(" ");
    
                }

                if(cont%2 != 0) System.out.printf("%s", ((i==3 || i==6) && cont<=3)?" * ":"   ");
                else System.out.printf("%s", "  ");
            }

            System.out.println();
        }

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws Exception {
        
        do{
            getTime();
            printBox();
            printNums();
            System.out.println("         **********************************************");
            Thread.sleep(100);
            limpiarPantalla();
        }while(true);
    }
}
