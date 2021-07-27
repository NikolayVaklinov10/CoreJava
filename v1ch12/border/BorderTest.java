package border;

import java.awt.*;
import javax.swing.*;

/**
 * @version 1.34 2021-07-27
 * @author Nikolay Vaklinov
 */
public class BorderTest
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(() -> {
         JFrame frame = new BorderFrame();
         frame.setTitle("BorderTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
