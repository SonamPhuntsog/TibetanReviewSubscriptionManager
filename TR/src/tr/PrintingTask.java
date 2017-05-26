/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr;

import java.awt.Component;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

/**
 *
 * @author spsither
 */
class PrintingTask extends SwingWorker<Object, Object> {
        private final MessageFormat headerFormat;
        private final MessageFormat footerFormat;
        private final boolean interactive;
        private volatile boolean complete = false;
        private volatile String message;
        private JTextArea text;
    private  Component rootPane;
        
        public PrintingTask(MessageFormat header, MessageFormat footer,
                            boolean interactive,JTextArea text,Component rootPane) {
            this.headerFormat = header;
            this.footerFormat = footer;
            this.interactive = interactive;
            this.text = text;
            this.rootPane = rootPane;
        }
        
        @Override
        protected Object doInBackground() {
            try {
                complete = text.print(headerFormat, footerFormat,
                        true, null, null, interactive);
                message = "Printing " + (complete ? "complete" : "canceled");
            } catch (PrinterException ex) {
                message = "Sorry, a printer error occurred";
            } catch (SecurityException ex) {
                message =
                    "Sorry, cannot access the printer due to security reasons";
            }
            return null;
        }
        
        @Override
        protected void done() {
            message(!complete, message);
        }
    
    
    static MessageFormat createFormat(JTextField source) {
        String text = source.getText();
        if (text != null && text.length() > 0) {
            try {
                return new MessageFormat(text);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(source, "Sorry,this header and/or footer format is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }
    
    private void message(boolean error, String msg) {
        int type = (error ? JOptionPane.ERROR_MESSAGE :
                            JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(rootPane, msg, "Printing", type);
    }
    
    private void error(String msg) {
        message(true, msg);
    }

    
}

