package ifpr.pgua.eic.info.banco.entidades;

public class ContaCorrente extends Conta {

    private double limite;
    private double taxaManutencao;

    public ContaCorrente(String agencia, String numero, Pessoa cliente, double limite, double taxaManutencao) {

        super(agencia, numero, cliente);
        this.limite = limite;
        this.taxaManutencao = taxaManutencao;
    }
    
    public double getTaxaManutencao() {
        return taxaManutencao;
    }
    public double getLimite() {
        return limite;
    }
    
    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }    
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String gerarExtrato(){
        String texto = "";

        texto = super.gerarExtrato();

        texto = texto + " Taxa de manutenção:"+taxaManutencao;
        texto = texto + " Limite:"+limite;

        return texto;
    }


}
