public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(35);

        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" +  smartTv.volume);
        System.out.println("Tv Ligada ?" + smartTv.ligada);
        
    
        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada?" + smartTv.ligada);
    }
}
