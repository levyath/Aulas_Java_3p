package main.java;

public class Automovel{

    public String marca;
    public String modelo;
    public int anofabr;
    public int anomodel;
    public String cor;
    public float quilometragem;


    public void AddQuilometragem(float add_km){
        this.quilometragem += add_km;
    }

    public float VelMedia(float dist_percorrida, float tempo){
        return dist_percorrida/tempo;
    }

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