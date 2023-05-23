import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        setBounds(dimension.width / 2 - 300, dimension.height / 2 - 300, 600, 600);
        setTitle("Graphic Editor 1.1");
        setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        JPanel paintPanel = new JPanel();
        paintPanel.setLayout(null);
        paintPanel.setBackground(Color.WHITE);

//tools
        JPanel toolsPane = new JPanel();            //main TOOls pane
        toolsPane.setBackground(Color.LIGHT_GRAY);
        toolsPane.setVisible(true);
        toolsPane.setLayout(new BoxLayout(toolsPane, BoxLayout.Y_AXIS));

        JTextPane ToolsName = new JTextPane();

        //buttons
        ButtonGroup chooseColor = new ButtonGroup();     //group radioButton

        JRadioButton blackColorChoose = new JRadioButton();
        blackColorChoose.setText("                      ");
        blackColorChoose.setBackground(Color.BLACK);
        chooseColor.add(blackColorChoose);
        toolsPane.add(blackColorChoose);
        blackColorChoose.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton whiteColorChoose = new JRadioButton();
        whiteColorChoose.setText("                      ");
        whiteColorChoose.setBackground(Color.white);
        chooseColor.add(whiteColorChoose);
        toolsPane.add(whiteColorChoose);
        whiteColorChoose.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton redColorChoose = new JRadioButton();
        redColorChoose.setText("                       ");
        redColorChoose.setBackground(Color.RED);
        chooseColor.add(redColorChoose);
        toolsPane.add(redColorChoose);
        redColorChoose.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton greenColorChoose = new JRadioButton();
        greenColorChoose.setText("                       ");
        greenColorChoose.setBackground(Color.GREEN);
        chooseColor.add(greenColorChoose);
        toolsPane.add(greenColorChoose);
        greenColorChoose.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton blueColorChoose = new JRadioButton();
        blueColorChoose.setText("                       ");
        blueColorChoose.setBackground(Color.BLUE);
        chooseColor.add(blueColorChoose);
        toolsPane.add(blueColorChoose);
        blueColorChoose.setAlignmentX(Component.CENTER_ALIGNMENT);

        contentPane.add(toolsPane, BorderLayout.EAST);
        contentPane.add(paintPanel, BorderLayout.CENTER);
    }
}
