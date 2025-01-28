public class Cliente {
      public static void main (String[] args) throws Exception{

        SmartTv smartTv= new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println(" Canal Atual : " +smartTv.canal);
        System.out.println("Volume atual :" +smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status Tv ligada? " + smartTv.ligada);
        smartTv.desligar();

        System.out.println("Novo status Tv ligada? " + smartTv.ligada);

        smartTv.avancarCanal();
        System.out.println(" Novo Status Canal Atual : " + smartTv.canal);
        
        smartTv.voltarCanal();
        System.out.println("Novo Status Canal Atual : " + smartTv.canal);


        smartTv.aumentarVolume();
        System.out.println("Novo status do Volume :" + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo status do Volume :" + smartTv.volume);
        
        smartTv.mudardecanal(13);
        System.out.println("Novo status do Canal :" + smartTv.canal);

      }
}
