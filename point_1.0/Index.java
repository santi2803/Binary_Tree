
/**
 * Index
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Index {
    public static void main(String[] args) {
        Marco marco = new Marco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame {
    public Marco() {
        setBounds(300, 200, 650, 450);
        Lamina myLamina = new Lamina();
        add(myLamina);
        setVisible(true);
    }
}

class Lamina extends JPanel {
    JButton pre, in, pos, load;

    public Lamina() {
        setLayout(new adminComponentes());
        pre = new JButton("preorden");
        in = new JButton("inorden");
        pos = new JButton("posorden");

        pre.addActionListener(new options());
        in.addActionListener(new options());
        pos.addActionListener(new options());
        add(pre);
        add(in);
        add(pos);
    }

    private class options implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            BTS tree = new BTS();

            if (e.getSource() == pre) {
                int[] arr = { 65, 41, 60, 73, 75, 67, 66, 70, 75, 62, 50, 20, 55, 51, 58, 45, 80, 77, 90, 76, 78, };
                for (int i = 0; i < arr.length; i++) {
                    tree.insert(arr[i], null);
                }
                System.out.println("Recorrido en preorden");
                JOptionPane.showMessageDialog(null, tree.tour_pre_order(tree.root));
            }

            if (e.getSource() == in) {
                int[] arr = { 65, 41, 60, 73, 75, 67, 66, 70, 75, 62, 50, 20, 55, 51, 58, 45, 80, 77, 90, 76, 78, };
                for (int i = 0; i < arr.length; i++) {
                    tree.insert(arr[i], null);
                }
                System.out.println("Recorrido en inorden");
                JOptionPane.showMessageDialog(null, tree.tour_in_order(tree.root));
            }

            if (e.getSource() == pos) {
                int[] arr = { 65, 41, 60, 73, 75, 67, 66, 70, 75, 62, 50, 20, 55, 51, 58, 45, 80, 77, 90, 76, 78, };
                for (int i = 0; i < arr.length; i++) {
                    tree.insert(arr[i], null);
                }
                System.out.println("Recorrido en postorden");
                JOptionPane.showMessageDialog(null, tree.tour_post_order(tree.root));
            }
        }
    }
}

class adminComponentes implements LayoutManager {
    int x, y = 20;

    @Override
    public void addLayoutComponent(String string, Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void removeLayoutComponent(Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public Dimension preferredLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void layoutContainer(Container miContenedor) {
        int d = miContenedor.getWidth();
        x = d / 2;
        int contador = 0;
        int n = miContenedor.getComponentCount();
        for (int i = 0; i < n; i++) {
            contador++;
            Component c = miContenedor.getComponent(i);
            c.setBounds(x - 160, y, 160, 20);
            x += 200;
            if (contador % 2 == 0) {
                x = d / 2;
                y += 40;
            }
        }
    }
}