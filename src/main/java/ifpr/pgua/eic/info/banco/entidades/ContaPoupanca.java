package ifpr.pgua.eic.info.banco.entidades;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;
    private double rendimento;

    public ContaPoupanca(String agencia, String numero, Pessoa cliente, double taxaRendimento) {
        
        super(agencia, numero, cliente);
        this.taxaRendimento = taxaRendimento;
        this.rendimento = 0.0;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public double getRendimento() {
        return rendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }


    @Override
    public String gerarExtrato(){
        String texto = "";

        texto = super.gerarExtrato();

        texto = texto + " Taxa de rendimento:"+taxaRendimento;
        texto = texto + " Rendimento:"+rendimento;

        return texto;
    }
}
