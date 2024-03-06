
public class Automovel{


    private String marca;
    private String modelo;
    private int anofabr;
    private int anomodel;
    private  String cor;
    private float quilometragem;

        //Set'rs
        public void setMarca(String marca){
            this.marca = marca;
        }

        public void setModelo(String modelo){
            this.modelo = modelo;
        }
        public void setAnofabr(int anofabr){
            this.anofabr = anofabr;
        }
        public void setAnomodel(int anomodel){
            this.anomodel = anomodel;
        }
        public void setCor(String cor){
            this.cor = cor;
        }
        public void setQuilometragem(float quilometragem){
            this.quilometragem = quilometragem;

        }
    
        //Get'rs
        public String getMarca(){
            return this.marca;
        }
        public String getModelo(){
            return this.modelo;
        }
    
        public int getAnofabr(){
            return this.anofabr;
        }
        public int getAnomodel(){
            return this.anomodel;
        }
        public String getCor(){
            return this.cor;
        }
    
        public float getQuilometragem(){
            return this.quilometragem;
        }

        public float getVeloMedia(float distancia, float tempo){
            return distancia/tempo;
        }
        
        //Metodos da Classe Automovel
        public void Acelerar(){
            System.out.println("Acelerei");
        }
    
        public void Frear(){
            System.out.println("Freiei");
        }
    
        public void MoverDireita(){
            System.out.println("Movi para direita");
        }
    
        public void MoverEsquerda(){
            System.out.println("Movi para esquerda");
        }
}
