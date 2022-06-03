public class Cliente extends Pessoa {

    String cpf,endereco,cidade,bairro,email,estado,cep,telefone;
    double num,cm;

    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }

    public void setCidade(String cidade){
        this.cidade=cidade;
    }

    public void setBairro(String bairro){
        this.bairro=bairro;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }  
    
    public void setNumero(double num){
        this.num=num;
    }

    public void setCM(double cm){
        this.cm=cm;
    }

    public void setCep(String cep){
        this.cep=cep;
    }

    public void setTelefone(String telefone){
        this.telefone=telefone;
    } 
    
    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    } 

    public String getCidade(){
        return this.cidade;
    } 

    public String getBairro(){
        return this.bairro;
    } 

    public String getEmail(){
        return this.email;
    } 

    public String getEstado(){
        return this.estado;
    }

    public double getNumero(){
        return this.num;
    }

    public double getCM(){
        return this.cm;
    }

    public String getCep(){
        return this.cep;
    }

    public String getTelefone(){
        return this.telefone;
    }
    
}
