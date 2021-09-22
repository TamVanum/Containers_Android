package objetos;

public class Clientes {

    private int id;
    private String[] clientes = {"Pedro", "Juan", "Maria"};
    private int[] salarios = {12000, 20000, 45000};

    public Clientes(){
        id = 1;
    }

    public Clientes(int id, String[] clientes, int[] salarios) {
        this.id = id;
        this.clientes = clientes;
        this.salarios = salarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getClientes() {
        return clientes;
    }

    public void setClientes(String[] clientes) {
        this.clientes = clientes;
    }

    public int[] getSalarios() {
        return salarios;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }

    //Reglas de negocios
    public int calculoPedro(){
        int resultado = this.salarios[0] - 6500;
        return resultado;

    }
}
