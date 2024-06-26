
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import daos.GradeDAO;
import daos.StudentDAO;
import helper.MyMessage;
import helper.MyValidate;
import interfaces.GradeInterface;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import models.Grade;
import models.Student;

/**
 *
 * @author Admin
 */
public class GradeForm extends javax.swing.JDialog {

    private GradeInterface<Grade> qlGrade;
    private DefaultTableModel dtm;

    /**
     * Creates new form Diem
     */
    public GradeForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        dtm = (DefaultTableModel) tblDiemSV.getModel();
        this.txtTenSV.setEditable(false);
        qlGrade = new GradeDAO();
        fillToTable();
        fillToForm(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnlTTSV = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtTA = new javax.swing.JTextField();
        txtTH = new javax.swing.JTextField();
        txtGDTC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDiemTB = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        pnlDiem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiemSV = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbbTOP = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản Lý Điểm");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("Quản Lý Điểm Sinh Viên");

        pnlSearch.setBackground(new java.awt.Color(204, 153, 255));
        pnlSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Mã SV :");

        btnSearch.setForeground(new java.awt.Color(102, 51, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchLayout = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(pnlSearchLayout);
        pnlSearchLayout.setHorizontalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch)
                .addGap(42, 42, 42)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSearchLayout.setVerticalGroup(
            pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tìm Kiếm");

        pnlTTSV.setBackground(new java.awt.Color(255, 153, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Họ tên SV: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Mã SV: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Tiếng Anh:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tin Học:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Giáo Dục TC:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Điểm TB");

        lblDiemTB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDiemTB.setForeground(new java.awt.Color(102, 51, 255));
        lblDiemTB.setText("9.0");

        javax.swing.GroupLayout pnlTTSVLayout = new javax.swing.GroupLayout(pnlTTSV);
        pnlTTSV.setLayout(pnlTTSVLayout);
        pnlTTSVLayout.setHorizontalGroup(
            pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTSVLayout.createSequentialGroup()
                .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTSVLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(pnlTTSVLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTSVLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTTSVLayout.createSequentialGroup()
                        .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTTSVLayout.createSequentialGroup()
                                .addComponent(lblDiemTB)
                                .addGap(16, 16, 16)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pnlTTSVLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtGDTC, txtMaSV, txtTA, txtTH, txtTenSV});

        pnlTTSVLayout.setVerticalGroup(
            pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTTSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTTSVLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTH, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(pnlTTSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap())
                    .addGroup(pnlTTSVLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lblDiemTB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlTTSVLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtGDTC, txtMaSV, txtTA, txtTH, txtTenSV});

        tblDiemSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ tên", "Tiếng Anh", "Tin Học", "GDTC", "Điểm TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiemSV.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDiemSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiemSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDiemSV);

        javax.swing.GroupLayout pnlDiemLayout = new javax.swing.GroupLayout(pnlDiem);
        pnlDiem.setLayout(pnlDiemLayout);
        pnlDiemLayout.setHorizontalGroup(
            pnlDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        pnlDiemLayout.setVerticalGroup(
            pnlDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setLayout(new java.awt.GridLayout(4, 1, 5, 15));

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(102, 51, 255));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Create.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel5.add(btnNew);

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(102, 51, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel5.add(btnSave);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(102, 51, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 51, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Hiển thị danh sách theo");

        cbbTOP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbTOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danh sách Lớp", "Danh sách chưa có điểm", "Top 3 Điểm cao nhất" }));
        cbbTOP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTOPItemStateChanged(evt);
            }
        });
        cbbTOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTOPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pnlTTSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnlSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbbTOP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel5, pnlTTSV});

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

    }//GEN-LAST:event_btnNewActionPerformed

    private void cbbTOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTOPActionPerformed


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        saveGrade();
        this.cbbTOP.setSelectedIndex(0);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (MyValidate.isEmpty(this.txtSearch, "Không được để trống mã sinh viên")) {
            return;
        }
        if (MyValidate.isNotStudenCode(txtSearch, "Sai Định Mã Sinh Viên,vui lòng nhập Mã Trường (vd: PH) + Mã Sinh Viên (vd: 00000)")) {
            return;
        }
        this.deleteGrade();
        this.fillToTableTop3();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateGrade();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            if (MyValidate.isEmpty(txtSearch, "Không được để trống mã sinh viên")) {
                return;
            }
            if (MyValidate.isNotStudenCode(txtSearch, "Sai Định Mã Sinh Viên,vui lòng nhập Mã Trường (vd: PH) + Mã Sinh Viên (vd: 00000)")) {
                return;
            }
            String search = this.txtSearch.getText();

            Grade grade = qlGrade.findByID(search);
            if (grade == null) {
                MyMessage.msgWarning("Mã sinh viên chưa có điểm !");
                return;
            }

            txtMaSV.setText(grade.getMaSV());
            txtTenSV.setText(dao.findByID(search).getHoTen());
            txtTA.setText(String.valueOf(grade.getTiengAnh()));
            txtTH.setText(grade.getTinHoc() + "");
            txtGDTC.setText(grade.getgDTC() + "");
            String DTB = ((grade.getTiengAnh() + grade.getTinHoc() + grade.getgDTC()) / 3) + "";
            lblDiemTB.setText(DTB);
        } catch (Exception ex) {
            Logger.getLogger(GradeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblDiemSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiemSVMouseClicked
        int r = tblDiemSV.getSelectedRow();
        if (r == -1) {
            return;
        }

        float s = (Float.parseFloat(tblDiemSV.getValueAt(r, 2).toString()) + Float.parseFloat(tblDiemSV.getValueAt(r, 3).toString())
                + Float.parseFloat(tblDiemSV.getValueAt(r, 4).toString())) / 3;
        txtMaSV.setText(dtm.getValueAt(r, 0).toString());
        txtSearch.setText(dtm.getValueAt(r, 0).toString());
        txtTA.setText(tblDiemSV.getValueAt(r, 2).toString());
        txtTH.setText(tblDiemSV.getValueAt(r, 3).toString());
        txtGDTC.setText(tblDiemSV.getValueAt(r, 4).toString());
        txtTenSV.setText(dtm.getValueAt(r, 1).toString());
        lblDiemTB.setText(String.format("%.2f", s));
    }//GEN-LAST:event_tblDiemSVMouseClicked

    private void cbbTOPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTOPItemStateChanged
        if (this.cbbTOP.getSelectedIndex() == 0) {
            this.fillToTable();
        } else if (this.cbbTOP.getSelectedIndex() == 1) {
            this.fillToTableNotGrade();
        } else {
            this.fillToTableTop3();
        }
    }//GEN-LAST:event_cbbTOPItemStateChanged

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
            java.util.logging.Logger.getLogger(GradeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GradeForm dialog = new GradeForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbTOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiemTB;
    private javax.swing.JPanel pnlDiem;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlTTSV;
    private javax.swing.JTable tblDiemSV;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTA;
    private javax.swing.JTextField txtTH;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables

    public boolean validate_Grade() {

        if (MyValidate.isEmpty(txtMaSV, "Không được để trống mã sinh viên")) {
            return true;
        }
        if (MyValidate.isEmpty(txtTA, "Không được để trống Điểm tiếng anh")) {
            return true;
        }
        if (MyValidate.isEmpty(txtTH, "Không được để trống Điểm Tin Học")) {
            return true;
        }
        if (MyValidate.isEmpty(txtGDTC, "Không được để trống Điểm Giáo Dục Thể Chất")) {
            return true;
        }
        if (MyValidate.isNotStudenCode(txtMaSV, "Sai Định Mã Sinh Viên,vui lòng nhập Mã Trường (vd: PH) + Mã Sinh Viên (vd: 00000)")) {
            return true;
        }
        if (MyValidate.isNotNumberScores(txtTA, "Sai Định Dạng Điểm, vui lòng nhập số", "Vui lòng nhập điểm lớn hơn 10 nhở hơn 0")) {
            return true;
        }
        if (MyValidate.isNotNumberScores(txtTH, "Sai Định Dạng Điểm, vui lòng nhập số", "Vui lòng nhập điểm lớn hơn 10 nhở hơn 0")) {
            return true;
        }
        if (MyValidate.isNotNumberScores(txtGDTC, "Sai Định Dạng Điểm, vui lòng nhập số", "Vui lòng nhập điểm lớn hơn 10 nhở hơn 0")) {
            return true;
        }

        return false;
    }

    private void updateGrade() {
        try {
            if (validate_Grade()) {
                return;
            }
            Grade st = new Grade();
            st.setMaSV(txtMaSV.getText());
            st.setTiengAnh(Float.parseFloat(txtTA.getText()));
            st.setTinHoc(Float.parseFloat(txtTH.getText()));
            st.setgDTC(Float.parseFloat(txtGDTC.getText()));

            if (MyMessage.question("Bạn có muốn cập nhật điểm của sinh viên?")) {
                return;
            }
            if (qlGrade.update(st)) {
                MyMessage.msgTrue("Cập nhật điểm sinh viên thành công!");
                fillToTable();
                //resetFrom();
            } else {
                MyMessage.msgWarning("Cập nhật điểm sinh viên thất bại! \nKiểm tra lại mã sinh viên!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            MyMessage.msgFalse("Cập nhật điểm sinh viên thất bại!");
        }
    }

    private void deleteGrade() {
        if (MyMessage.question("Bạn có muốn xóa điểm Sinh Viên này?")) {
            return;
        }
        String maSV = this.txtSearch.getText();

        try {
            if (qlGrade.delete(maSV)) {
                MyMessage.msgTrue("Xóa điểm thành công!");
                fillToTable();
            } else {
                MyMessage.msgWarning("Xóa điểm không thành công! \n Kiểm tra lại mã!");
            }
        } catch (Exception ex) {
            MyMessage.msgFalse(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void saveGrade() {
        try {
            if (validate_Grade()) {
                return;
            }
            Grade st = new Grade();
            st.setMaSV(txtMaSV.getText());
            st.setTiengAnh(Float.parseFloat(txtTA.getText()));
            st.setTinHoc(Float.parseFloat(txtTH.getText()));
            st.setgDTC(Float.parseFloat(txtGDTC.getText()));

            if (MyMessage.question("Bạn có muốn thêm điểm của sinh viên?")) {
                return;
            }
            if (qlGrade.add(st)) {
                MyMessage.msgTrue("Thêm điểm sinh viên thành công!");
                fillToTable();
                //resetFrom();
            } else {
                MyMessage.msgWarning("Thêm điểm sinh viên thất bại! \nKiểm tra lại mã sinh viên!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            MyMessage.msgFalse("Thêm điểm sinh viên thất bại!");
        }
    }

    private void fillToTable() {
        dtm.setRowCount(0);

        try {

            ArrayList<Grade> st = this.qlGrade.getList();
            for (Grade g : st) {
                //Lấy tên sinh viên
                Student sv = dao.findByID(g.getMaSV());
                String tenSV = sv.getHoTen();
                //tính điểm trung bình
                float dtb = (g.getTiengAnh() + g.getTinHoc() + g.getgDTC()) / 3;
                dtm.addRow(new Object[]{
                    g.getMaSV(),
                    tenSV,
                    g.getTiengAnh(),
                    g.getTinHoc(),
                    g.getgDTC(),
                    String.format("%.2f", dtb)
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void fillToTableNotGrade() {
        dtm.setRowCount(0);

        try {

            ArrayList<Grade> st = this.qlGrade.getListNotGrade();
            for (Grade g : st) {
                //Lấy tên sinh viên
                Student sv = dao.findByID(g.getMaSV());
                String tenSV = sv.getHoTen();
                //tính điểm trung bình
//                float dtb = (g.getTiengAnh() + g.getTinHoc() + g.getgDTC()) / 3;
                dtm.addRow(new Object[]{
                    g.getMaSV(),
                    tenSV,
                    0,
                    0,
                    0,
                    0
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    StudentDAO dao = new StudentDAO();

    private void fillToForm(int r) {
        String masv = null;
        try {
            masv = (String) tblDiemSV.getValueAt(r, 0);
        } catch (Exception ex) {
            //ahihi
        }
        try {
            if (masv == null) {
                return;
            }
            Grade g = qlGrade.findByID(masv);

            if (g != null) {
                Student sv = dao.findByID(g.getMaSV());
                String tenSV = sv.getHoTen();
                float s = (Float.parseFloat(tblDiemSV.getValueAt(r, 2).toString()) + Float.parseFloat(tblDiemSV.getValueAt(r, 3).toString())
                        + Float.parseFloat(tblDiemSV.getValueAt(r, 4).toString())) / 3;
                txtMaSV.setText(g.getMaSV());
                txtSearch.setText(g.getMaSV());
                txtTA.setText(tblDiemSV.getValueAt(r, 2).toString());
                txtTH.setText(tblDiemSV.getValueAt(r, 3).toString());
                txtGDTC.setText(tblDiemSV.getValueAt(r, 4).toString());
                txtTenSV.setText(tenSV);
                lblDiemTB.setText(String.format("%.2f", s));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void fillToTableTop3() {
         dtm.setRowCount(0);

        try {

            ArrayList<Grade> st = this.qlGrade.getListtop3();
            for (Grade g : st) {
                //Lấy tên sinh viên
                Student sv = dao.findByID(g.getMaSV());
                String tenSV = sv.getHoTen();
                //tính điểm trung bình
                float dtb = (g.getTiengAnh() + g.getTinHoc() + g.getgDTC()) / 3;
                dtm.addRow(new Object[]{
                    g.getMaSV(),
                    tenSV,
                    g.getTiengAnh(),
                    g.getTinHoc(),
                    g.getgDTC(),
                    String.format("%.2f", dtb)
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
