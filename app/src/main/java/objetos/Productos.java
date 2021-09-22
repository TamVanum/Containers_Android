package objetos;

public class Productos {

    private int id;
    private String[] productos = {"Cereales", "Arroz", "Fideos", "Ramitas", "Pie de limon"};
    private int[] precios= {6500, 2500, 2500, 1300, 6000};

    public Productos(int id, String[] productos, int[] precios) {
        this.id = id;
        this.productos = productos;
        this.precios = precios;
    }

    public Productos() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }
}

