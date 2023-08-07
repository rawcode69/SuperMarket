/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket.View;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import supermarket.Controller.CustomerController;
import supermarket.Controller.ItemController;
import supermarket.Controller.OrderController;
import supermarket.Model.CustomerModel;
import supermarket.Model.ItemModel;
import supermarket.Model.OrderDetailModel;
import supermarket.Model.OrderModel;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderView extends javax.swing.JFrame {

    CustomerController customerController;
    ItemController itemController;
    OrderController orderController;
    ArrayList<OrderDetailModel> orderDetailModels;

    /**
     * Creates new form OrderView
     */
    public OrderView() {
        initComponents();
        customerController = new CustomerController();
        itemController = new ItemController();
        orderDetailModels = new ArrayList<>();
        loadTable();
        addItemButton.setEnabled(false);
        orderController = new OrderController();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        orderIDLabel = new javax.swing.JLabel();
        orderIdText = new javax.swing.JTextField();
        customerLabel = new javax.swing.JLabel();
        cutomerText = new javax.swing.JTextField();
        itemIDLabel = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        qtyText = new javax.swing.JTextField();
        qtyLabel = new javax.swing.JLabel();
        discountLabel = new javax.swing.JLabel();
        discountText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        addItemButton = new javax.swing.JButton();
        customerSearchButton = new javax.swing.JButton();
        itemSearchButton = new javax.swing.JButton();
        customerViewLabel = new javax.swing.JLabel();
        itemViewLabel = new javax.swing.JLabel();
        addErrorLabel = new javax.swing.JLabel();
        qtyNumberMsgLabel = new javax.swing.JLabel();
        discountNumberMsgLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        placeOrderButton = new javax.swing.JButton();
        totalAmountLabel = new javax.swing.JLabel();
        totalAmountValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerlabel.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Order");

        orderIDLabel.setText("Order ID");

        orderIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextActionPerformed(evt);
            }
        });

        customerLabel.setText("Customer");

        cutomerText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cutomerTextKeyReleased(evt);
            }
        });

        itemIDLabel.setText("Item ID");

        itemText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemTextKeyReleased(evt);
            }
        });

        qtyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyTextKeyReleased(evt);
            }
        });

        qtyLabel.setText("QTY");

        discountLabel.setText("Discount");

        discountText.setText("0");
        discountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discountTextKeyPressed(evt);
            }
        });

        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        customerSearchButton.setText("Search");
        customerSearchButton.setEnabled(false);
        customerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchButtonActionPerformed(evt);
            }
        });

        itemSearchButton.setText("Search");
        itemSearchButton.setEnabled(false);
        itemSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(itemIDLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addComponent(qtyLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(customerLabel))
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(cutomerText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customerSearchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 136, Short.MAX_VALUE))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(qtyNumberMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(discountNumberMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addItemButton))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(formPanelLayout.createSequentialGroup()
                                                .addComponent(itemSearchButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(itemViewLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(addErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(orderIDLabel)
                        .addGap(18, 18, 18)
                        .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIDLabel)
                    .addComponent(orderIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerViewLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerLabel)
                        .addComponent(cutomerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerSearchButton)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemViewLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(itemIDLabel)
                        .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemSearchButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLabel)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyNumberMsgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountLabel)
                    .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountNumberMsgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addItemButton)
                    .addComponent(addErrorLabel)))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablePanel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        placeOrderButton.setText("Place Order");
        placeOrderButton.setEnabled(false);
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        totalAmountLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalAmountLabel.setText("TOTAL AMOUNT");

        totalAmountValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalAmountValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placeOrderButton)))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placeOrderButton)
                    .addComponent(totalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAmountValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orderIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIdTextActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        addToItem();
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void customerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSearchButtonActionPerformed
        searchCustomer();
    }//GEN-LAST:event_customerSearchButtonActionPerformed

    private void itemSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchButtonActionPerformed
        searchItem();
    }//GEN-LAST:event_itemSearchButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        placeOrder();
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void itemTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTextKeyReleased
        if (itemText.getText().length() >= 4) {
            itemSearchButton.setEnabled(true);
        } else {
            itemSearchButton.setEnabled(false);
        }
    }//GEN-LAST:event_itemTextKeyReleased

    private void qtyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextKeyReleased
        if (qtyText.getText().length() > 0) {
            addItemButton.setEnabled(true);
        } else {
            addItemButton.setEnabled(false);
        }
    }//GEN-LAST:event_qtyTextKeyReleased

    private void cutomerTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cutomerTextKeyReleased
        if (cutomerText.getText().length() >= 4) {
            customerSearchButton.setEnabled(true);
        } else {
            customerSearchButton.setEnabled(false);
        }
    }//GEN-LAST:event_cutomerTextKeyReleased

    private void qtyTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            qtyText.setEditable(false);
            qtyNumberMsgLabel.setText("Input Only Numbers");
        } else {
            qtyText.setEditable(true);
            qtyNumberMsgLabel.setText("");
        }
    }//GEN-LAST:event_qtyTextKeyPressed

    private void discountTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountTextKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            discountText.setEditable(false);
            discountNumberMsgLabel.setText("Input Only Numbers");
        } else {
            discountText.setEditable(true);
            discountNumberMsgLabel.setText("");
        }
    }//GEN-LAST:event_discountTextKeyPressed

    private void itemTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemTableKeyReleased


    }//GEN-LAST:event_itemTableKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addErrorLabel;
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JButton customerSearchButton;
    private javax.swing.JLabel customerViewLabel;
    private javax.swing.JTextField cutomerText;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JLabel discountNumberMsgLabel;
    private javax.swing.JTextField discountText;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel itemIDLabel;
    private javax.swing.JButton itemSearchButton;
    private javax.swing.JTable itemTable;
    private javax.swing.JTextField itemText;
    private javax.swing.JLabel itemViewLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JTextField orderIdText;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JLabel qtyNumberMsgLabel;
    private javax.swing.JTextField qtyText;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JLabel totalAmountValueLabel;
    // End of variables declaration//GEN-END:variables

    private void clearItem() {

        itemText.setText("");
        qtyText.setText("");
        discountText.setText("");
        itemViewLabel.setText("");
    }

    private void searchCustomer() {

        try {
            String custId = cutomerText.getText();
            CustomerModel customer = customerController.getCustomer(custId);

            if (customer != null) {
                customerViewLabel.setText(customer.getCustName() + " ," + customer.getCustAddress());
            } else {
                customerViewLabel.setText("Customer Not Found");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void searchItem() {

        try {
            String itemCode = itemText.getText();
            ItemModel item = itemController.getItem(itemCode);

            if (item != null) {
                itemViewLabel.setText(item.getDescription() + " ," + item.getPackSize() + " ," + item.getUnitPrice());
            } else {
                itemViewLabel.setText("Item Not Found");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void loadTable() {

        String[] colunmNames = {"Item Code", "Description", "Pack Size", "Unit Price", "Discount", "Quantity", "Total"};
        DefaultTableModel dtm = new DefaultTableModel(colunmNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        dtm.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (dtm.getRowCount() > 0) {
                    placeOrderButton.setEnabled(true);
                } else {
                    placeOrderButton.setEnabled(false);
                }
            }
        });
        itemTable.setModel(dtm);
    }

    private void addToItem() {

        try {
            ItemModel item = itemController.getItem(itemText.getText());
            CustomerModel customer = customerController.getCustomer(cutomerText.getText());

            if (item != null && customer != null) {

                if (Integer.valueOf(qtyText.getText()) < item.getQuantityOnHand()) {

                    Double total = ((item.getUnitPrice()) - Double.valueOf(discountText.getText())) * Double.valueOf(qtyText.getText());

                    OrderDetailModel orderDetailModel = new OrderDetailModel(
                            orderIdText.getText(),
                            item.getItemCode(),
                            item.getDescription(),
                            item.getPackSize(),
                            item.getUnitPrice(),
                            Double.valueOf(discountText.getText()),
                            Integer.valueOf(qtyText.getText()),
                            total);

                    orderDetailModels.add(orderDetailModel);

                    DefaultTableModel dtm = (DefaultTableModel) itemTable.getModel();
                    if (Integer.valueOf(qtyText.getText()) < item.getQuantityOnHand()) {

                    }
                    Object[] rowDate = {orderDetailModel.getItemCode(), orderDetailModel.getDescription(), orderDetailModel.getPackSize(), orderDetailModel.getUnitPrice(), orderDetailModel.getDiscount(), orderDetailModel.getQuantity(), orderDetailModel.getTotal()};
                    dtm.addRow(rowDate);
                    totalAmount();
                    clearItem();
                    discountText.setText("0");
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient Balance In " + item.getItemCode() + " | QTY On Hand: " + item.getQuantityOnHand());
                }
            } else {

                if (item == null) {
                    JOptionPane.showMessageDialog(this, "Item " + itemText.getText() + " Not Found");
                }else if(customer == null){
                    JOptionPane.showMessageDialog(this, "Customer " + cutomerText.getText() + " Not Found");
                }else{
                    JOptionPane.showMessageDialog(this, "Item " + itemText.getText()+" AND "+"Customer " + cutomerText.getText() + " Not Found");
                }
                        

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void placeOrder() {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            OrderModel orderModel = new OrderModel(
                    orderIdText.getText(),
                    sdf.format(new Date()),
                    cutomerText.getText());

            String resp = orderController.placeOrder(orderModel, orderDetailModels);
            JOptionPane.showMessageDialog(this, resp);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private void totalAmount() {
        Double total = 0.0;
        for (OrderDetailModel orderDetailModel : orderDetailModels) {
            total += orderDetailModel.getTotal();
        }

        totalAmountValueLabel.setText(Double.toString(total));
    }
}
