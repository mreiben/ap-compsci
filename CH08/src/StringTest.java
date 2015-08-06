
/**
 * This class is excellent for working with String methods
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    // ... insert code to process str or call a method here
    // str = _______________________________ ;
    // str = process3(str);
    // str = process4A(str);
    str = process4B(str);

    result.setText(str);
    input.selectAll();
  }

  public String process3(String s)
  {
    // return s.substring(0, 3) + s.substring(4,6) + s.substring(7);
    return s.replace("-", "");
  }

  public String process4A(String s)
  {
    String month = s.substring(0, 2);
    String day = s.substring(3, 5);
    String year = s.substring(6);
    return day + "-" + month + "-" + year;
  }

  public String process4B(String s)
  {
    int slash1 = s.indexOf("/");
    int slash2 = s.lastIndexOf("/");

    String month = s.substring(0, slash1);
    String day = s.substring((slash1 + 1), slash2);
    String year = s.substring((slash2 + 1));

    if (month.length() == 1)
      month = "0" + month;
    if (day.length() == 1)
      day = "0" + day;

    return day + "-" + month + "-" + year;

  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
