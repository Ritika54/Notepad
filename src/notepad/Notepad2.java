package notepad;

/**
 *
 * @author Ritika
 */

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.RepaintManager;
import javax.swing.undo.*;

public class Notepad2 extends javax.swing.JFrame {
    UndoManager manager = new UndoManager();
    
    public Notepad2() {
        initComponents();
        manager = new UndoManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        print = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        undo = new javax.swing.JMenuItem();
        redo = new javax.swing.JMenuItem();
        selectall = new javax.swing.JMenuItem();
        format = new javax.swing.JMenu();
        wordwrap = new javax.swing.JMenuItem();
        font = new javax.swing.JMenuItem();
        view = new javax.swing.JMenu();
        zoom = new javax.swing.JMenu();
        zoomin = new javax.swing.JMenuItem();
        zoomout = new javax.swing.JMenuItem();
        statusbar = new javax.swing.JCheckBoxMenuItem();
        help = new javax.swing.JMenu();
        viewhelp = new javax.swing.JMenuItem();
        sendfeedback = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        aboutnotepad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(189, 32));

        file.setText("    File     ");
        file.setPreferredSize(new java.awt.Dimension(55, 20));

        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        file.add(New);

        open.setText("Open");
        file.add(open);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file.add(save);

        saveas.setText("Save as");
        saveas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveasActionPerformed(evt);
            }
        });
        file.add(saveas);

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        file.add(print);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        edit.setText("    Edit     ");
        edit.setPreferredSize(new java.awt.Dimension(55, 20));

        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        edit.add(cut);

        copy.setText("copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        edit.add(copy);

        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        edit.add(paste);
        edit.add(jSeparator2);

        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        edit.add(undo);

        redo.setText("Redo");
        redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoActionPerformed(evt);
            }
        });
        edit.add(redo);

        selectall.setText("Select All");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });
        edit.add(selectall);

        jMenuBar1.add(edit);

        format.setText("    Format     ");
        format.setPreferredSize(new java.awt.Dimension(70, 20));

        wordwrap.setText("Word Wrap");
        wordwrap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordwrapActionPerformed(evt);
            }
        });
        format.add(wordwrap);

        font.setText("Font...");
        font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontActionPerformed(evt);
            }
        });
        format.add(font);

        jMenuBar1.add(format);
        format.getAccessibleContext().setAccessibleName("   Format");

        view.setText("    View     ");
        view.setPreferredSize(new java.awt.Dimension(60, 20));

        zoom.setText("Zoom");

        zoomin.setText("Zoom In");
        zoom.add(zoomin);

        zoomout.setText("Zoom Out");
        zoom.add(zoomout);

        view.add(zoom);

        statusbar.setSelected(true);
        statusbar.setText("Status Bar");
        view.add(statusbar);

        jMenuBar1.add(view);

        help.setText("    Help     ");
        help.setMinimumSize(new java.awt.Dimension(55, 20));
        help.setPreferredSize(new java.awt.Dimension(60, 20));

        viewhelp.setText("View Help");
        help.add(viewhelp);

        sendfeedback.setText("Send Feedback");
        help.add(sendfeedback);
        help.add(jSeparator1);

        aboutnotepad.setText("About Notepad");
        help.add(aboutnotepad);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        // TODO add your handling code here:
        textarea.cut();
    }//GEN-LAST:event_cutActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
        textarea.copy();
    }//GEN-LAST:event_copyActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        // TODO add your handling code here:
        textarea.paste();
    }//GEN-LAST:event_pasteActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
        // TODO add your handling code here:
        textarea.selectAll();
    }//GEN-LAST:event_selectallActionPerformed

    private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
        // TODO add your handling code here:
        try {
            manager.undo();
	} catch (CannotUndoException ex) {
	}
    }//GEN-LAST:event_undoActionPerformed

    private void redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoActionPerformed
        // TODO add your handling code here:
        try {
            manager.redo();
	} catch (CannotRedoException ex) {
	}
    }//GEN-LAST:event_redoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:
        textarea.setText("");
    }//GEN-LAST:event_NewActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat pf = pj.pageDialog(pj.defaultPage());
        pj.setJobName("Print Component");
        pj.setPrintable(new Printable()
        {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex>0){
                    return (NO_SUCH_PAGE);
                }
                Graphics2D g2d = (Graphics2D)graphics;
                g2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
                double xScale = 0.9;
                double yScale = 0.9;
                g2d.scale(xScale, yScale);
                textarea.printAll(graphics);
                disablebuffering(textarea);
                enablebuffering(textarea);
                //RepaintManager cc=RepaintManager.currentManager(jPanel4);
                //cc.setDoubleBufferingEnabled(false);
                //cc.setDoubleBufferingEnabled(true);
                return (PAGE_EXISTS);
            }
            private void disablebuffering(JTextArea t){
                RepaintManager cc=RepaintManager.currentManager(t);
                cc.setDoubleBufferingEnabled(false);
            }
            private void enablebuffering(JTextArea t){
                RepaintManager cc=RepaintManager.currentManager(t);
                cc.setDoubleBufferingEnabled(true);
            }
        });
        if(pj.printDialog()==false){
            return;
        }
    }//GEN-LAST:event_printActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(rootPane, "Do you really want to save this Text Document ?","Save", WIDTH);
        if(a==JOptionPane.YES_OPTION){
            String str = JOptionPane.showInputDialog(rootPane, "Enter file name");
            JOptionPane.showMessageDialog(rootPane, "File Saved with "+str+" filename");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void saveasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveasActionPerformed
        // TODO add your handling code here   :
        int a = JOptionPane.showConfirmDialog(rootPane, "Do you really want to save this Text Document ?","Save As", WIDTH, HEIGHT);
        if(a==JOptionPane.YES_OPTION){
            String str = JOptionPane.showInputDialog(rootPane, "Enter file name");
            JOptionPane.showMessageDialog(rootPane, "File Saved with "+str+" filename");
        }
    }//GEN-LAST:event_saveasActionPerformed

    private void fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontActionPerformed
        // TODO add your handling code here:
        launchFontDialog();
    }//GEN-LAST:event_fontActionPerformed

    private void wordwrapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordwrapActionPerformed
        // TODO add your handling code here:
        String str = textarea.getText();
        textarea.setText(str+"\n");
    }//GEN-LAST:event_wordwrapActionPerformed

  private void launchFontDialog()
  {
    Font m_font;
    m_font = FontChooser.showDialog(this, "Select font");
  }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Notepad2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem aboutnotepad;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem font;
    private javax.swing.JMenu format;
    private javax.swing.JMenu help;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem paste;
    private javax.swing.JMenuItem print;
    private javax.swing.JMenuItem redo;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JMenuItem selectall;
    private javax.swing.JMenuItem sendfeedback;
    private javax.swing.JCheckBoxMenuItem statusbar;
    private javax.swing.JTextArea textarea;
    private javax.swing.JMenuItem undo;
    private javax.swing.JMenu view;
    private javax.swing.JMenuItem viewhelp;
    private javax.swing.JMenuItem wordwrap;
    private javax.swing.JMenu zoom;
    private javax.swing.JMenuItem zoomin;
    private javax.swing.JMenuItem zoomout;
    // End of variables declaration//GEN-END:variables
}
