package Exercicio;

public class Ave {

    private String especie;
    public String getespecie() {
		return especie;
}
    public String getEspecie() {
        return this.especie;
    }
    public String setespecie(String especie) {
        this.especie = especie;
    }
    
    public class Ave1 extends Ave;
    public class Ave2 extends Ave;

}