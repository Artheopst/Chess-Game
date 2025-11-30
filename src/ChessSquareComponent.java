import java.awt.*;
import javax.swing.*;

public class ChessSquareComponent extends JButton {
  private int row;
  private int col;

  public ChessSquareComponent(int row, int col) {
      this.row = row;
      this.col = col;
      initButton();
  }

  private void initButton() {
      setPreferredSize(new Dimension(75, 75));

      if ((row + col) % 2 == 0) {
          setBackground(Color.RED);
      } else {
          setBackground(new Color(34, 139, 34));
      }

      setHorizontalAlignment(SwingConstants.CENTER);
      setVerticalAlignment(SwingConstants.CENTER);
      setFont(new Font("Serif", Font.BOLD, 36));
  }

  public void setPieceSymbol(String symbol, Color color) {
      this.setText(symbol);
      this.setForeground(color);
  }

  public void clearPieceSymbol() {
      this.setText("");
  }
}