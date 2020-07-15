public class MethodOverloading {

    public static void main(String[] args){

        System.out.println(getDurationString(280, 50));
        System.out.println(getDurationString(130));
    }

    public static String getDurationString(int minutes, int seconds){

        String result = new String();
        if(minutes < 0 || seconds < 0 || seconds > 59){
            result = "Invalid Value";
        }else{
            int hours = minutes /60;
            int minute =  minutes % 60;

            if(minute >= 60){
                hours += 1;
                minute -= 60;
            }
            result = hours + "h " + minute + "m " + seconds + "s";
        }
        return result;
    }
    public static String getDurationString(int seconds) {

        String result = new String();
        int minutes = seconds / 60;
        int second = seconds % 60;

        if(second >= 60){
            minutes += 1;
            second -= 60;
        }
        result =  minutes + "m " + second + "s";
        return result;

    }

}
