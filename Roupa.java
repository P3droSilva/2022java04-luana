class Roupa{
    private String cor;
    private String tipoDeTecido;
    public Tecido(){
        cor="";
        tipoDeTecido="";
    }
    public String getCor(){
        return cor;
    }
    public String getTipoDeTecido(){
        return tipoDeTecido;
    }
}
//da para criar tipo camiseta, calca,vestido,casaco,etc que podem ter tipo tamanho,estampa,etc