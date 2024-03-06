public class MyProgram{
    
    public static void main(String[] args){
                
        Garrafa garrafa1 = new Garrafa(1500,"vidro",4.0f,"coca","Coca Cola","2025",false);
        Garrafa garrafa2 = new Garrafa(2500,"Plastico",6.0f,"fanta","Fanta Laranja","2025",false);
        Garrafa cerveja = new Garrafa(600,"alumínio",4.0f,"heineken","cerveja","2025",true);

        // garrafa1.setMarca("Coca Cola");
        // garrafa1.setCapacidade(600);

        
        // cerveja.setMarca("Skol");
        // cerveja.setCapacidade(1000);
        
        

        System.out.println("Essa garrafa é " + garrafa1.getMarca() + " de " + garrafa1.getCapacidade());

    }
}