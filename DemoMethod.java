class Computer{

    public void playMusic(){
        System.out.println("Playing Music...");
    }

    public String getAPen(int cost){
        if(cost>=10)
            return "Pen";

        return "Nothing";
    }
}

public class DemoMethod {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.playMusic();
        String str = com.getAPen(2);
        System.out.println(str);
    }
}
