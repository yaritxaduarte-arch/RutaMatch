package com.mycompany.rutamatch.view.components;

import javax.swing.JTable;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;
import java.util.function.IntConsumer;

public class TableOptionsHelper {

    public static void configurarClicOpciones(JTable tabla, int columnaOpciones,
            IntConsumer onEdit, IntConsumer onDelete) {

        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabla.rowAtPoint(evt.getPoint());
                int col = tabla.columnAtPoint(evt.getPoint());

                if (col == columnaOpciones && row >= 0) {
                    JPopupMenu popup = new JPopupMenu();
                    JMenuItem editItem = new JMenuItem("Edit");
                    JMenuItem deleteItem = new JMenuItem("Delete");

                    editItem.addActionListener(ev -> onEdit.accept(row));
                    deleteItem.addActionListener(ev -> onDelete.accept(row));

                    popup.add(editItem);
                    popup.add(deleteItem);
                    popup.show(tabla, evt.getX(), evt.getY());
                }
            }
        });
    }
}