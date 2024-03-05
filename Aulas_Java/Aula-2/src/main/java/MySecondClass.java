public class MySecondClass{
    
    public static void main(String[] args){
        
        String nome = new String();
        nome = "Kate";
        nome = "Bob";
        nome = "Teddy";
        
        System.out.println("My name is " + nome);
        
        Garrafa garrafa1 = new Garrafa();
        Garrafa garrafa2 = new Garrafa();
        Garrafa cerveja = new Garrafa();

        garrafa1.marca = "Coca Cola";
        garrafa1.capacidade = 600;
        //garrafa1.conteudo = "Coca";
        
        cerveja.marca = "Skol";
        cerveja.capacidade = 1000;
        
        

        System.out.println("Essa garrafa é " + garrafa1.marca + " de " + garrafa1.capacidade);

    }
}