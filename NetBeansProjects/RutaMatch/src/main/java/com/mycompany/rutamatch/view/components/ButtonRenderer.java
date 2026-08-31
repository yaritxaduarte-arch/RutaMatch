package com.mycompany.rutamatch.view.components;

import javax.swing.*;
import java.awt.*;

public class ButtonRenderer extends JButton implements javax.swing.table.TableCellRenderer {
    public ButtonRenderer() {
          setText("...");
          setFocusPainted(false);
      }

      @Override
      public Component getTableCellRendererComponent(JTable table, Object value,
              boolean isSelected, boolean hasFocus, int row, int column) {
          return this;
      }
  }