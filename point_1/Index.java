import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Index
 */
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
    JButton pre, in, pos;
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

        }
    }
}

class adminComponentes implements LayoutManager {
    int x,y=20;

    @Override
    public void addLayoutComponent(String string, Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeLayoutComponent(Component cmpnt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension preferredLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension minimumLayoutSize(Container cntnr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void layoutContainer(Container miContenedor) {
        int d=miContenedor.getWidth();
        x=d/2;
        int contador=0;
        int n=miContenedor.getComponentCount();
        for(int i=0;i<n;i++){
            contador++;
            Component c=miContenedor.getComponent(i);
            c.setBounds(x-160,y,160,20);
            x+=200;
            if(contador%2==0){
                x=d/2;
                y+=40;
            }
        }
    }
}