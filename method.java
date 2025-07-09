class Computer{

public void playMusic(){
    System.out.println("Playing music...");
}

public String getMeAPen(int cost){
    if(cost > 10){
        return "Here is your pen";
    } else {
        return "You need to pay more for the pen";
    }
}
}

public class method {
    public static void main(String[] args) {
       Computer computer = new Computer();
       computer.playMusic();
       String penMessage = computer.getMeAPen(5);
       System.out.println(penMessage);
    }
}

    

