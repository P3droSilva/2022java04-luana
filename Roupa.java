class Roupa{
    protected String cor;
    protected String tecido;
    public Roupa(String cor,String tecido){
        this.cor=cor;
        this.tecido=tecido;
    }
    public String getCor(){
        return cor;
    }
    public String getTecido(){
        return tecido;
    }
}
//da para criar tipo camiseta, calca,vestido,casaco,etc que podem ter tipo tamanho,estampa,etc
