import java.awt.*;
import javax.swing.*;

public class LayoutDemo {
    
    public static void FlowLayout(){

        Frame f = new Frame("FlowLayout Example");

            f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

            f.add(new Button("Button 1"));
            f.add(new Button("Button 2"));
            f.add(new Button("Button 3"));

            f.setSize(300, 200);
            f.setVisible(true);

    }
    public static void GridLayout(){
        Frame f = new Frame("GridLayout Example");
            f.setLayout(new GridLayout(2, 2, 10, 10));

            f.add(new Label("Username:"));
            f.add(new TextField(10));

            f.add(new Label("Password:"));
            f.add(new TextField(10));

            f.setSize(300, 150);
            f.setVisible(true);

    }

    public static void BorderLayout(){
        Frame f = new Frame("BorderLayout Example");
            f.setLayout(new BorderLayout(10, 10)); // Gaps between regions

            f.add(new Button("North"), BorderLayout.NORTH);
            f.add(new Button("South"), BorderLayout.SOUTH);
            f.add(new Button("East"), BorderLayout.EAST);
            f.add(new Button("West"), BorderLayout.WEST);
            f.add(new Button("Center"), BorderLayout.CENTER);

            f.setSize(400, 300);
            f.setVisible(true);

    } 

    public static void CardLayout(){
        Frame f = new Frame("CardLayout Example");
            CardLayout cl = new CardLayout();
            f.setLayout(cl);

            Button card1 = new Button("Card 1");
            Button card2 = new Button("Card 2");

            f.add(card1, "First");
            f.add(card2, "Second");

            card1.addActionListener(e -> cl.show(f, "Second"));
            card2.addActionListener(e -> cl.show(f, "First"));

            f.setSize(300, 200);
            f.setVisible(true);

    }
    public static void main(String[] args) {

        FlowLayout();
        GridLayout();
        BorderLayout();
        CardLayout();
    }
}
