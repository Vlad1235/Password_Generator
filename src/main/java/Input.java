import java.util.Random;

public class Input{
    private int count_value;

    public Input(int number){
        if(number>1) {
            this.count_value = number;
        } else {
            System.err.print("Password length is too short");
        }
    }

    public String getCount_value(){
        return passwGen();
    }

    private  String passwGen() {
        //if (this.count_value < 1) return "";
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '@', '!', '#', '$', '%', '&', '*'};
        for (int index = 0; index < this.count_value; index++) {
            s.append(arr[r.nextInt(arr.length)]);
        }
        return s.toString();
    }
}
