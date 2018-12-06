package marcos.com.cantina;

import com.orm.SugarRecord;

public class Produto extends SugarRecord{
    private String nome;
    private double valor;

    public Produto() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", preço=" + valor;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
