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
        setTitle("Graphic Editor 1.3");
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

        // Center named
        JLabel ToolsName = new JLabel();
        ToolsName.setText("TOOLS:");
        ToolsName.setAlignmentX(Component.CENTER_ALIGNMENT);
        toolsPane.add(ToolsName);

        JLabel ColorsName = new JLabel();
        ColorsName.setText("COLORS:");
        ColorsName.setAlignmentX(Component.RIGHT_ALIGNMENT);
        toolsPane.add(ColorsName);

        //buttons
        ButtonGroup chooseColor = new ButtonGroup();     //group radioButton

        JRadioButton blackColorChoose = new JRadioButton();
        blackColorChoose.setSelected(true);
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

        // Center named
        JLabel SliderName = new JLabel();
        SliderName.setText("SIZE:");
        SliderName.setAlignmentX(Component.RIGHT_ALIGNMENT);
        toolsPane.add(SliderName);


        //create JSlider
        JSlider newSlider = new JSlider(5, 40, 5);
        newSlider.setOrientation(SwingConstants.VERTICAL);
        newSlider.setMajorTickSpacing(5);
        newSlider.setPaintTicks(true);
        newSlider.setPaintLabels(true);
        newSlider.setSnapToTicks(true);
        toolsPane.add(newSlider);
        newSlider.setAlignmentX(Component.LEFT_ALIGNMENT);
        newSlider.setBackground(Color.LIGHT_GRAY);
        //button RESET
        JButton reset = new JButton();
        reset.setText("RESET");
        reset.setVisible(true);
        reset.setAlignmentX(Component.CENTER_ALIGNMENT);
        toolsPane.add(reset);

//BOTTOM PANEL
        JPanel bottomPanel = new JPanel();
        bottomPanel.setVisible(true);
        bottomPanel.setBackground(Color.LIGHT_GRAY);
        bottomPanel.setLayout(new FlowLayout());

        JLabel info = new JLabel();
        info.setVisible(true);
        info.setText("Left mouse button - draw, right mouse button - delete.");
        info.setBackground(Color.LIGHT_GRAY);
        bottomPanel.add(info);
        //don't touch below
        contentPane.add(bottomPanel, BorderLayout.SOUTH);
        contentPane.add(toolsPane, BorderLayout.EAST);
        contentPane.add(paintPanel, BorderLayout.CENTER);
    }
}
