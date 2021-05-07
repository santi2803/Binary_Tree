public class BTS {
    Nodo root;

    public BTS() {
        root = null;
    }

    public String tour_in_order(Nodo x) {
        String salida = "";
        if (x != null) {
            tour_in_order(x.izq);
            salida = String.valueOf(x.key_n);
            System.out.println(salida);
            tour_in_order(x.der);
        }

        return salida;
    }

    public int tour_pre_order(Nodo x) {
        int key = 0;
        if (x != null) {
            key = x.key_n;
            System.out.println(key);
            tour_pre_order(x.izq);
            tour_pre_order(x.der);
        }

        return key;
    }

    public int tour_post_order(Nodo x) {
        int key = 0;
        if (x != null) {
            tour_post_order(x.izq);
            tour_post_order(x.der);
            key = x.key_n;
            System.out.println(key);
        }
        return key;
    }

    public void insert(int key, Object value) {
        Nodo n = new Nodo(key);
        n.value = value;

        if (root == null) {
            root = n;
        } else {
            Nodo temp = root;
            while (temp != null) {
                n.p = temp;
                if (n.key_n >= temp.key_n) {
                    temp = temp.der;
                } else {
                    temp = temp.izq;
                }
            }
            if (n.p.key_n >= n.key_n) {
                n.p.izq = n;
            } else {
                n.p.der = n;
            }
        }
    }
}
