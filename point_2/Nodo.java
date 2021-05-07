public class Nodo {
    public Nodo p;
    public Nodo der;
    public Nodo izq;
    public int key_n;
    public Object value;

    public Nodo(int key) {
        key_n = key;
        der = null;
        izq = null;
        p = null;
        value = null;
    }
}
