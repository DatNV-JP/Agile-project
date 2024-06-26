/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import daos.StudentDAO;

import helper.MyMessage;
import helper.MyValidate;
import interfaces.StudentInterface;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import models.Student;

/**
 *
 * @author Admin
 */
public class StudentDiaLog extends javax.swing.JDialog {

    private StudentInterface<Student> qlStudent;
    private DefaultTableModel dtm;

    public StudentDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        qlStudent = new StudentDAO();
        this.dtm = (DefaultTableModel) tblSV.getModel();
        fillToTable();
        FillToForm(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản Lý Sinh Viên");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Quản Lý Sinh Viên");

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Email");

        jLabel5.setText("Số DT");

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam ");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel6.setText("Giới Tính");

        jLabel7.setText("Địa Chỉ");

        txtDiaChi.setColumns(20);
        txtDiaChi.setLineWrap(true);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LyLX.jpg"))); // NOI18N
        jLabel8.setText("IMG");
        jPanel4.add(jLabel8);

        pnlButton.setBackground(new java.awt.Color(255, 102, 255));
        pnlButton.setLayout(new java.awt.GridLayout(2, 2, 3, 3));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        pnlButton.add(btnNew);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save as.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlButton.add(btnSave);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        pnlButton.add(btnUpdate);

        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete.png"))); // NOI18N
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        pnlButton.add(btnDel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(41, 41, 41)
                                .addComponent(rdoNu))
                            .addComponent(txtTen)
                            .addComponent(txtEmail)
                            .addComponent(txtSDT)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, txtEmail, txtMaSV, txtSDT, txtTen});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam)
                            .addComponent(jLabel6)
                            .addComponent(rdoNu)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtMaSV, txtSDT, txtTen});

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ tên", "Email", "Số ĐT", "Giới tính", "Địa chỉ", "Hình"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSV.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSV);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        jLabel9.setText("Mã SV:");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(btnSearch))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(194, 194, 194))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        resetFrom();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        addStudent();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateStudent();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        deleteStudent();
    }//GEN-LAST:event_btnDelActionPerformed


    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        resetFrom();
        int r = this.tblSV.getSelectedRow();
        if (r == -1) {
            return;
        }
        FillToForm(r);
    }//GEN-LAST:event_tblSVMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String maSV = this.txtSearch.getText();
        if (maSV.equals("")){
            MyValidate.isEmpty(txtSearch, "Bạn phải nhập Mã Sinh viên");
            return;
        }
        try {
            Student sv = this.qlStudent.findByID(maSV);
            if (sv == null) {
                MyMessage.msgFalse("Không tìm thấy mã sinh viên: "+maSV);
                return;
            }
            this.txtMaSV.setText(sv.getMaSV());
            this.txtTen.setText(sv.getHoTen());
            this.txtEmail.setText(sv.getEmail());
            this.txtSDT.setText(sv.getSdt());
            this.txtDiaChi.setText(sv.getDiaChi());
            if (sv.isGt()) {
                this.rdoNam.setSelected(true);
            } else {
                this.rdoNu.setSelected(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnSearch.doClick();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

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
            java.util.logging.Logger.getLogger(StudentDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentDiaLog dialog = new StudentDiaLog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });

                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void fillToTable() {
        this.dtm.setRowCount(0);
        try {
            ArrayList<Student> list = this.qlStudent.getDanhSachSV();
            for (Student s : list) {
                String gt = (s.isGt() ? "Nam" : "Nữ");
                Object[] data = new Object[]{
                    s.getMaSV(),
                    s.getHoTen(),
                    s.getEmail(),
                    s.getSdt(),
                    gt,
                    s.getDiaChi(),
                    s.getHinh()
                };
                this.dtm.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void FillToForm(int r) {
        
        this.txtMaSV.setText(this.tblSV.getValueAt(r, 0).toString());
        this.txtTen.setText(this.tblSV.getValueAt(r, 1).toString());
        this.txtEmail.setText(this.tblSV.getValueAt(r, 2).toString());
        this.txtSDT.setText(this.tblSV.getValueAt(r, 3).toString());
        this.txtDiaChi.setText(this.tblSV.getValueAt(r, 5).toString());
        if (this.tblSV.getValueAt(r, 4).equals("Nữ")) {
            this.rdoNu.setSelected(true);
        } else {
            this.rdoNam.setSelected(true);
        }
    }

    public boolean checkValid() {
        if (MyValidate.isEmpty(txtMaSV, "Không được để trống mã sinh viên")) {
            return true;
        }
        if (MyValidate.isEmpty(txtTen, "Không được để trống tên")) {
            return true;
        }
        if (MyValidate.isEmpty(txtEmail, "Không được để trống Email")) {
            return true;
        }
        if (MyValidate.isEmpty(txtSDT, "Không được để trống số điện thoại")) {
            return true;
        }
        if (MyValidate.isEmpty(txtDiaChi, "Không được để trống địa chỉ")) {
            return true;
        }
        if (MyValidate.isNotEmail(txtEmail, "Sai định dạng email")) {
            return true;
        }
        if (MyValidate.isNotNumberPhone(txtSDT, "Sai định dạng số điện thoại")) {
            return true;
        }
        if (MyValidate.isNotStudenCode(txtMaSV, "Sai Định Mã Sinh Viên,vui lòng nhập Mã Trường (vd: PH) + Mã Sinh Viên (vd: 00000)")) {
            return true;
        }
        return false;

    }

    private void resetFrom() {
        txtMaSV.setText("");
        txtTen.setText("");
        txtSDT.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        rdoNam.setSelected(true);
        txtDiaChi.setBackground(Color.white);
        txtTen.setBackground(Color.white);
        txtSDT.setBackground(Color.white);
        txtMaSV.setBackground(Color.white);
        txtEmail.setBackground(Color.white);
        txtSearch.setBackground(Color.white);
    }

    private void addStudent() {
        if (checkValid()) {
            return;
        }
        String ma = txtMaSV.getText();
        String ten = txtTen.getText();
        String sdt = txtSDT.getText();
        String email = txtEmail.getText();
        String diaChi = txtDiaChi.getText();
        boolean gt = rdoNam.isSelected();
        Student st = new Student(ma, ten, email, sdt, diaChi, gt, null);
        try {
            if (qlStudent.add(st)) {
                MyMessage.msgTrue("Thêm mơi sinh viên thành công! ");
                fillToTable();
                resetFrom();
            } else {
                MyMessage.msgWarning("Thêm mới sinh viên không thành công\n Kiểm tra lại mã sinh viên!");
            }
        } catch (Exception ex) {
            MyMessage.msgFalse("Mã Sinh Viên đã tồn tại!");
            ex.printStackTrace();
        }
    }

    private void updateStudent() {
        if (checkValid()) {
            return;
        }
        String ma = txtMaSV.getText();
        String ten = txtTen.getText();
        String sdt = txtSDT.getText();
        String email = txtEmail.getText();
        String diaChi = txtDiaChi.getText();
        boolean gt = rdoNam.isSelected();
        Student st = new Student(ma, ten, email, sdt, diaChi, gt, null);
        if (MyMessage.question("Bạn có muốn cập nhật sinh viên này?")) {
            return;
        }
        try {
            if (qlStudent.update(st)) {
                MyMessage.msgTrue("Cập nhật sinh viên thành công!");
                fillToTable();

                resetFrom();
            } else {
                MyMessage.msgWarning("Cập nhật sinh viên không thành công!\nKiểm tra lại mã sinh viên hoặc thêm mới!");
            }
        } catch (Exception ex) {
            MyMessage.msgFalse(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public void deleteStudent() {
        if (MyValidate.isEmpty(txtMaSV, "Điền mã sinh viên cần xoá!")) {
            return;
        }

        if (MyMessage.question("Bạn có muốn xoá sinh viên này?")) {
            return;
        }
        String maSV = txtMaSV.getText();
        try {
            if (qlStudent.delete(maSV)) {
                MyMessage.msgTrue("Xóa sinh viên thành công!");
                fillToTable();

                resetFrom();
            } else {
                MyMessage.msgWarning("Xóa sinh viên không thành công!\nKiểm tra lại mã sinh viên!");
            }
        } catch (Exception e) {
            MyMessage.msgFalse(e.getMessage());
            e.printStackTrace();
        }
    }

}
