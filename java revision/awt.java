import java.awt.*;

 class a {
    public static void main(String[] args) {

        Frame f = new Frame("AWT Demo");

        Label l = new Label("Enter Name:");
        l.setBounds(50, 50, 100, 20);

        TextField tf = new TextField();
        tf.setBounds(160, 50, 150, 20);

        Checkbox male = new Checkbox("Male");
        male.setBounds(50, 90, 60, 20);

        Checkbox female = new Checkbox("Female");
        female.setBounds(120, 90, 70, 20);

        Choice ch = new Choice();
        ch.add("Java");
        ch.add("Python");
        ch.add("C++");
        ch.setBounds(50, 130, 120, 20);

	Button b = new Button("Submit");
	b.setBounds(50, 170, 80, 30);



        f.add(l);
        f.add(tf);
        f.add(male);
        f.add(female);
        f.add(ch);
	f.add(b);


        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}