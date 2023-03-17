public class Hamburguer {
    public String nome;
    public double valor;
    public boolean artesanal;

    public double CalcularValor(boolean hamburguerArtesanal){
        if (hamburguerArtesanal){
            return valor + 8.0;
        }
        return valor;
    }
    public String ConsultarNome(){
        return nome;

    }
}
