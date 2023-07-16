import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;


public class CovetedCloset extends JFrame implements ActionListener{
    Color buttonMagenta = new Color(204, 98, 123);
    Color textNavy = new Color(15, 20, 59);
    Color bgOffYellow = new Color(252, 241, 220);
    Color bgPeriwinkle = new Color(212, 208, 242);
    Color textWineRed = new Color(69, 13, 34);
    Color buttonBlue = new Color(64, 147, 214);
    Font pacifico = new Font("Pacifico", Font.PLAIN, 50);
    Font raleway = new Font("Raleway ExtraLight", Font.PLAIN, 20);
    Font ralewayButton = new Font("Raleway ExtraLight", Font.PLAIN, 30);
    JButton lookbookButton = new JButton("The LookBook");
    JButton paletteButton = new JButton("The Swatches");
    JTextField placeholder = new JTextField("Placeholder");
    JTextArea descText = new JTextArea("Welcome to The Coveted Closet! Are your outfits feeling drab? Here, you can not only find inspiration for your outfits with our LookBook, but if those don't pique your interest, you can find outfits that work for you using our Outfit Color Palette generator! Enter in the colors you have in your closet, and we'll pick out outfit themes based on the color wheel! Or, if you're not feeling those, there's also a randomly generated palette that may be what you're looking for! So, what do you want to do?");
    JLabel titleText = new JLabel("The Coveted Closet");
    EmptyBorder bord = new EmptyBorder(0, 30, 30, 30);
    JLabel imgLabel = new JLabel(new ImageIcon("C:/Users/nyuma/programmingII/project/closet.png"));

    public CovetedCloset(String name){
        super(name);
        setSize(900,800);
        setLocationRelativeTo(null);
        JPanel buttons = new JPanel();
        JPanel textImage = new JPanel();
        JPanel imageLoc = new JPanel();
        JPanel titleCenter = new JPanel();
        textImage.setSize(600, 400);
        textImage.setBorder(bord);
        imgLabel.setSize(300, 300);
        descText.setLineWrap(true);
        descText.setWrapStyleWord(true);
        descText.setFont(raleway);
        descText.setEditable(false);
        descText.setBackground(bgPeriwinkle);
        descText.setForeground(textWineRed);
        buttons.add(lookbookButton);
        buttons.add(paletteButton);
        buttons.setBackground(bgPeriwinkle);
        lookbookButton.setBackground(buttonMagenta);
        lookbookButton.setForeground(textNavy);
        lookbookButton.setFont(ralewayButton);
        lookbookButton.addActionListener(this);
        paletteButton.addActionListener(this);
        paletteButton.setBackground(buttonMagenta);
        paletteButton.setForeground(textNavy);
        paletteButton.setFont(ralewayButton);
        imageLoc.add(imgLabel);
        imageLoc.setBackground(bgPeriwinkle);
        textImage.setLayout(new BorderLayout());
        textImage.add(imageLoc, BorderLayout.NORTH);
        textImage.add(descText, BorderLayout.CENTER);
        textImage.setBackground(bgPeriwinkle);
        titleText.setFont(pacifico);
        titleText.setForeground(buttonBlue);
        titleCenter.setBackground(bgPeriwinkle);
        titleCenter.add(titleText);
        add(titleCenter, BorderLayout.NORTH);
        add(textImage, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == lookbookButton){
            LookBook lb = new LookBook("The LookBook");
            lb.setVisible(true);
        } else if (e.getSource() == paletteButton){
            ColorPalette cp = new ColorPalette("Color Palette");
            cp.setVisible(true);
        }
    }

    public static void main(String args[]){
        CovetedCloset mainFrame = new CovetedCloset("The Coveted Closet");
        mainFrame.setVisible(true);
    }
}