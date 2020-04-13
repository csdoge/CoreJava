public class Welcome{
    public static void main(String[] args){
        String greeting = "Welcome to core java!";
        System.out.println(greeting);
        for(int i = 0; i < greeting.length(); i++){     // greeting.length() rather than greeting.length
            System.out.print("=");
        }
        System.out.println("");
    }
}