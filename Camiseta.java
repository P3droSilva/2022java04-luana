public class Camiseta extends Roupa{
    private String estampa;
    private String marca;

    public Camiseta(String cor, String tecido, String estampa, String marca){
        super(cor, tecido);
        this.estampa = estampa;
        this.marca = marca;
    }

    public String GetEstampa(){
        return this.estampa;
    }
    public String GetMarca(){
        return this.marca;
    }

    public void PrintCamiseta(){
        System.out.print("Camiseta de cor " + cor + " feito com " + tecido + " com estampa de " + estampa + " e da marca " + marca + " !\n");
    }
}
