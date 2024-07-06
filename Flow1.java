import java.awt.*;
import java.applet.*;

/* <applet code="Flow1.class" width=200 height = 300> </applet> */
public class Flow1 extends Applet {
    String str;
    Checkbox java, net, php, dwm, se;

    Button b1, b2, b3, b4;
    TextArea ta;

    public void init() {
        FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 20, 20);
        setLayout(f);
        java = new Checkbox("JAVA");
        net = new Checkbox(".NET");
        php = new Checkbox("PHP");
        dwm = new Checkbox("DWM");
        se = new Checkbox("SE");
        add(java);
        add(net);
        add(php);
        add(dwm);
        add(se);

        setLayout(new BorderLayout());
        // setLayout(new BorderLayout(10, 10));
        ta = new TextArea();
        b1 = new Button("TOP");
        b2 = new Button("BOTTOM");
        b3 = new Button("LEFT");
        b4 = new Button("RIGHT");
        add(b1, "North");
        add(b2, "South");
        add(b3, "West");
        add(b4, BorderLayout.EAST);
        add(ta, BorderLayout.CENTER);
    }
}