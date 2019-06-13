public class Car extends JPanel {
    int x;
    int y;

    public Car(int x,int y){
        this.x=x;
        this.y=y;
    }


    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 20, 20);
    }

    public void move_right(){
        x=x+20;
    }

    public void move_left(){
        x=x-20;
    }

}



public class Form extends JFrame {

    //private JPanel contentPane;
    Car car1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Form frame = new Form();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Form() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 727, 550);
        getContentPane().setLayout(null);
        car1 = new Car(350, 480);
        car1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_KP_LEFT) {
                    car1.move_left();
                    car1.repaint();
                }
                if (key == KeyEvent.VK_KP_RIGHT) {
                    car1.move_right();
                    car1.repaint();
                }
            }
        });
        car1.setBounds(0, 0, 700, 500);
        car1.setBackground(new Color(255, 255, 255));
        getContentPane().add(car1);
    }

}