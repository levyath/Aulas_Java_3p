public class Garrafa{
    
    // int capacidade = 0;
    // String material = "Plástico";
    // float diametro = 0.5f;
    // String marca = "Crystal";
    // String conteudo = "Água";
    // String validade = "15/02/2128";
    // Boolean estaVazia = true;

    private int capacidade;
    private String material;
    private float diametro;
    private String marca;
    private String conteudo;
    private String validade;
    private boolean estaVazia;

    //Set'rs
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public void setDiametro(float diametro){
        this.diametro = diametro;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public void setValidade(String validade){
        this.validade = validade;
    }

    public void setEstaVazia(boolean estaVazia){
        this.estaVazia = estaVazia;
    }


    //Get'rs
    public int getCapacidade(){
        return this.capacidade;
    }

    public String getMaterial(){
        return this.material;
    }

    public float getDiametro(){
        return this.diametro;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getConteudo(){
        return this.conteudo;
    }

    public String getValidade(){
        return this.validade;
    }

    public boolean getEstaVazia(){
        return this.estaVazia;
    }
}
