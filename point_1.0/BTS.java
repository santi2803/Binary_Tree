public class BTS {
    Nodo root;

    public BTS() {
        root = null;
    }

    public String tour_in_order(Nodo x) {
        String salida = "";
        if (x != null) {
            tour_in_order(x.izq);
            salida = salida + String.valueOf(x.key_n);
            System.out.println(salida);
            tour_in_order(x.der);
            return salida;
        }

        return "salida";
    }

    public String tour_pre_order(Nodo x) {
        String salida = "";
        if (x != null) {
            salida = salida + String.valueOf(x.key_n);
            System.out.println(salida);
            tour_pre_order(x.izq);
            tour_pre_order(x.der);
            return salida;
        }

        return "salida";
    }

    public String tour_post_order(Nodo x) {
        String salida = "";
        if (x != null) {
            tour_post_order(x.izq);
            tour_post_order(x.der);
            salida = salida + String.valueOf(x.key_n);
            System.out.println(salida);
            return salida;
        }
        return "salida";
    }

    public void insert(int salida, Object value) {
        Nodo n = new Nodo(salida);
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
