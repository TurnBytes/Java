### Layout : In Java AWT, layout managers control how components are arranged in a container (Frame, Panel, etc.).

1. FlowLayout
Default layout of Panel.
    ***Components are added left-to-right, top-to-bottom.***
    Align: LEFT, CENTER, RIGHT.
    Simple and best for small UI.

    **Example**
    Frame f = new Frame("FlowLayout Example");
    f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // Align center with gaps

    f.add(new Button("Button 1"));
    f.add(new Button("Button 2"));
    f.add(new Button("Button 3"));

    f.setSize(300, 200);
    f.setVisible(true);


2. GridLayout
    **Arranges components in a grid of rows & columns.**
    All cells are of equal size.
    Simple to align forms like Label-TextField pairs.

    **Example**
    Frame f = new Frame("GridLayout Example");
    f.setLayout(new GridLayout(2, 2, 10, 10)); // 2 rows, 2 columns, 10px gaps

    f.add(new Label("Username:"));
    f.add(new TextField(10));

    f.add(new Label("Password:"));
    f.add(new TextField(10));

    f.setSize(300, 150);
    f.setVisible(true);

3. BorderLayout
**Divides the container into 5 regions:**
    NORTH, SOUTH, EAST, WEST, CENTER.
    Common for headers, footers, sidebars, main content.

    **Example**
    Frame f = new Frame("BorderLayout Example");
        f.setLayout(new BorderLayout(10, 10)); // Gaps between regions

        f.add(new Button("North"), BorderLayout.NORTH);
        f.add(new Button("South"), BorderLayout.SOUTH);
        f.add(new Button("East"), BorderLayout.EAST);
        f.add(new Button("West"), BorderLayout.WEST);
        f.add(new Button("Center"), BorderLayout.CENTER);

        f.setSize(400, 300);
        f.setVisible(true);

4. CardLayout
    **Stack of components, one visible at a time**
        Used for wizards, tab-like screens, step-by-step forms.
    **Example**
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


