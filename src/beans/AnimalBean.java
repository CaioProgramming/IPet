
package beans;



public class AnimalBean {

    
    public int idAnimal;
    public String nome;
    public String raca;
    public double peso;
    
    public AnimalBean() {}
    
    public AnimalBean(int idAnimal, String nome, String raca, double peso) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
    
}
