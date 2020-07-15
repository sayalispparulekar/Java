public class BarkingDog {

    public static void shouldWakeUp(boolean barking, int hourOfDay){

        boolean barkingFinal;
        if(hourOfDay < 0 || hourOfDay >23){
            barkingFinal = false;
        }else if(hourOfDay < 8  && barking == true){
            barkingFinal = true;
        }else if(hourOfDay > 22 && barking == true){
            barkingFinal = true;
        }else{
            barkingFinal = false;
        }

        System.out.println(barkingFinal);
    }

    public static void main(String[] args){
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 22);
        shouldWakeUp(true,44);
        shouldWakeUp(true, -1);
    }
}
