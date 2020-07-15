public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes / 1024;
            int rKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + rKiloBytes + " KB" );
        }

    }
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
