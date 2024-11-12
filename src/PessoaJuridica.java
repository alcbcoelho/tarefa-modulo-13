import java.time.LocalDate;
import java.util.Objects;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String nomeFantasia;
    private LocalDate dataDeAbertura;
    private SituacaoCadastral situacaoCadastral;

    public PessoaJuridica(String nome, Endereco endereco, String telefone, String email, String cnpj, String nomeFantasia, LocalDate dataDeAbertura, SituacaoCadastral situacaoCadastral) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.dataDeAbertura = dataDeAbertura;
        this.situacaoCadastral = situacaoCadastral;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public LocalDate getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(LocalDate dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public SituacaoCadastral getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(SituacaoCadastral situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return cnpj.equals(that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataDeAbertura=" + dataDeAbertura +
                ", situacaoCadastral=" + situacaoCadastral +
                '}';
    }
}
