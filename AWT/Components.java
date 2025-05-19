import java.awt.*;
import java.awt.event.*;

public class Components {

    public static void AwtCheckBox(){

        Frame frame = new Frame("AWT CheckboxGroup Example");
            CheckboxGroup group = new CheckboxGroup();
            Checkbox male = new Checkbox("Male", group, true);
            Checkbox female = new Checkbox("Female", group, false);
            male.setBounds(50, 100, 60, 30);
            female.setBounds(120, 100, 70, 30);
            frame.add(male);
            frame.add(female);

            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setVisible(true);
    }
    //following methods can be named differently e.g choices,etc
    public static void AwtdropDown(){
        Frame frame = new Frame("AWT Choice Example");
            Choice choice = new Choice();
            choice.setBounds(50, 100, 100, 30);
            choice.add("Java");
            choice.add("Python");
            choice.add("C++");
            frame.add(choice);
            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setVisible(true);
    }
    public static void AwtList(){
        Frame frame = new Frame("AWT List Example");
            List list = new List(3);
            list.setBounds(50, 100, 100, 80);
            list.add("Java");
            list.add("Python");
            list.add("C++");
            frame.add(list);
            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setVisible(true);
    }
    public static void AwtCanvas(){
        Frame frame = new Frame("AWT Canvas Example");
        Canvas canvas = new Canvas() {
            public void paint(Graphics g) {
                g.setColor(Color.red);
                g.fillOval(75, 75, 100, 100);
            }
        };
        canvas.setBackground(Color.gray);
        canvas.setBounds(50, 50, 200, 200);
        frame.add(canvas);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void AwtScrollBar(){
        Frame frame = new Frame("AWT Scrollbar Example");
            Scrollbar sb = new Scrollbar();
            sb.setBounds(50, 50, 20, 150);
            frame.add(sb);
            frame.setSize(200, 250);
            frame.setLayout(null);
            frame.setVisible(true);
    }

    public static void AwtMenu(){
        Frame frame = new Frame("AWT Menu Example");
            MenuBar mb = new MenuBar();
            Menu file = new Menu("File");
            MenuItem save = new MenuItem("Save");
            MenuItem exit = new MenuItem("Exit");
            file.add(save);
            file.add(exit);
            mb.add(file);
            frame.setMenuBar(mb);
            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setVisible(true);
    }
   public static void AwtPopUpMenu(){
        Frame frame = new Frame("AWT PopupMenu Example");
            PopupMenu popupMenu = new PopupMenu("Edit");

            MenuItem cut = new MenuItem("Cut");
            MenuItem copy = new MenuItem("Copy");
            MenuItem paste = new MenuItem("Paste");

            popupMenu.add(cut);
            popupMenu.add(copy);
            popupMenu.add(paste);

            frame.add(popupMenu);

            frame.addMouseListener(new MouseAdapter() {
                public void mouseReleased(java.awt.event.MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        popupMenu.show(frame, e.getX(), e.getY());
                    }
                }
            });

            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setVisible(true);
    }

    public static void AwtPannel(){
        Frame frame = new Frame("AWT Panel Example");
            Panel panel = new Panel();
            panel.setBounds(50, 50, 200, 100);
            panel.setBackground(Color.lightGray);
            panel.add(new Button("OK"));
            panel.add(new Button("Cancel"));
            frame.add(panel);
            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setVisible(true);
    }
    public static void AwtToolKit(){

        Frame frame = new Frame("AWT Toolkit Example");
            Toolkit toolkit = frame.getToolkit();
            Dimension screenSize = toolkit.getScreenSize();
            System.out.println("Screen size: " + screenSize.width + "x" + screenSize.height);

            Image icon = toolkit.getImage("bakhti.gif"); // Replace with a valid path
            frame.setIconImage(icon);
            

            frame.setSize(300, 200);
            frame.setLayout(null);
            frame.setVisible(true);
    }
    public static void main(String[] args) {

        //AwtCheckBox();
        //AwtdropDown();
        //AwtList();
        //AwtCanvas();
        //AwtScrollBar();
        //AwtMenu();
        //AwtPopUpMenu();
        //AwtPannel();
        AwtToolKit();

    }
}
