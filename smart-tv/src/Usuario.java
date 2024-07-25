public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        //Liga a TV.
        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        
        //Altera o canal para 10.
        smartTv.mudarCanal(10);
        System.out.println("A TV está no canal: " + smartTv.canal);
        
        //Aumenta o volume 3 vezes e diminui 1.
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume da TV: " + smartTv.volume);
        
        //Passa o canal 2 vezes.
        smartTv.passarCanal();
        smartTv.passarCanal();
        System.out.println("A TV está no canal: " + smartTv.canal);
        
        //Desliga a TV.
        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

    }
}
