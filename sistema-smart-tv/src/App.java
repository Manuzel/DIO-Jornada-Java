public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Qual Volume " + smartTv.volume);
    
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(50);
        smartTv.diminuirCanal();
        smartTv.mudarCanal(30);
        smartTv.aumentarCanal();

    }
}
