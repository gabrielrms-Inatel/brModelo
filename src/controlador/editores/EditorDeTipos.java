/*
 * Copyright (C) 2017 chcan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package controlador.editores;

import controlador.apoios.TreeItem;
import desenho.formas.Forma;
import diagramas.logico.Campo;
import diagramas.logico.DiagramaLogico;
import diagramas.logico.Tabela;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author chcan
 */
public class EditorDeTipos extends javax.swing.JDialog {

    /**
     * Creates new form EditorDeCampos
     */
    public EditorDeTipos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().registerKeyboardAction(e -> {
            setResultado(JOptionPane.CANCEL_OPTION);
            setVisible(false);

        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    private int resultado = JOptionPane.CANCEL_OPTION;

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Principal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("principal/Formularios_pt_BR"); // NOI18N
        setTitle(bundle.getString("EditorDeTipos.title")); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("EditorDeTipos.tituloTabela"))); // NOI18N

        jLabel1.setText(bundle.getString("EditorDeTipos.info")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jSplitPane1.setDividerLocation(220);

        Principal.setBackground(new java.awt.Color(204, 204, 204));
        Principal.setLayout(null);
        jScrollPane1.setViewportView(Principal);

        jSplitPane1.setRightComponent(jScrollPane1);

        jScrollPane2.setViewportView(tree);

        jSplitPane1.setLeftComponent(jScrollPane2);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnFechar.setText(bundle.getString("EditorDeCampos.Fechar")); // NOI18N
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnOK.setText(bundle.getString("EditorDeTipos.btnContinuar")); // NOI18N
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnOK)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        setResultado(JOptionPane.CANCEL_OPTION);
        this.setVisible(false);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        setResultado(JOptionPane.OK_OPTION);
        this.setVisible(false);
    }//GEN-LAST:event_btnOKActionPerformed

    int v = 0;

    private int largura = 0;

    public void AdicionarPainel(Campo cmp) {
        javax.swing.JPanel ItemPan = new javax.swing.JPanel();
        final int altura = 37;

        ItemPan.setSize(largura, altura);
        java.awt.FlowLayout lay = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5);
        ItemPan.setLayout(lay);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("principal/Formularios_pt_BR");
        javax.swing.JTextField txtNome = new javax.swing.JTextField();
        txtNome.setEditable(false);
        javax.swing.JLabel lblNome = new javax.swing.JLabel();
        javax.swing.JComboBox<String> comboTipo = new javax.swing.JComboBox<>();
        javax.swing.JLabel lblTipo = new javax.swing.JLabel();

        lblNome.setText(bundle.getString("EditorDeCampos.lblCampo")); // NOI18N
        lblNome.setSize(new Dimension(37, 14));
        ItemPan.add(lblNome);

        txtNome.setToolTipText("");
        txtNome.setPreferredSize(new Dimension(190, 20));
        ItemPan.add(txtNome);

        lblTipo.setText(bundle.getString("EditorDeCampos.lblTipo")); // NOI18N
        lblTipo.setSize(new Dimension(24, 14));
        ItemPan.add(lblTipo);

        comboTipo.setEditable(true);
        String tipo_txt = cmp.getTipo();
        if (!tipo_txt.trim().isEmpty() && tipos.indexOf(tipo_txt) < 0) {
            tipos.add(tipo_txt);
        }
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(tipos.toArray()));
        comboTipo.setPreferredSize(new Dimension(73, 20));
        ItemPan.add(comboTipo);

        Principal.add(ItemPan);
        if (largura == 0) {
            largura = lay.preferredLayoutSize(ItemPan).width;
        }
        ItemPan.setBounds(0, v, largura, altura);
        v += altura + 3;
        Principal.setPreferredSize(new Dimension(largura, v));

        txtNome.setText(cmp.getTexto());
        comboTipo.setSelectedItem(tipo_txt);

        comboTipo.addActionListener((ActionEvent e) -> {
            String txt = comboTipo.getSelectedItem().toString();
            if (!txt.equals(cmp.getTipo())) {
                cmp.setTipo(txt);
                cmp.getTabela().DoMuda();
                cmp.InvalidateArea();
                tipoAlterado();
                if (tipos.indexOf(txt) < 0) {
                    tipos.add(0, txt);
                }
            }
        });

        comboTipo.getEditor().addActionListener((ActionEvent e) -> {
            String txt = comboTipo.getSelectedItem().toString();
            if (!txt.equals(cmp.getTipo())) {
                cmp.setTipo(txt);
                cmp.getTabela().DoMuda();
                cmp.InvalidateArea();
                tipoAlterado();
                if (tipos.indexOf(txt) < 0) {
                    tipos.add(0, txt);
                }
            }
        });

        comboTipo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            @Override
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                comboTipo.setSelectedItem(cmp.getTipo());
            }

            @Override
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboTipo.setSelectedItem(cmp.getTipo());
            }

            @Override
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                comboTipo.setModel(new javax.swing.DefaultComboBoxModel(tipos.toArray()));
            }
        });

        ItemPan.validate();
        Principal.validate();
    }

    ArrayList<String> tipos = new ArrayList<>();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

    DiagramaLogico diagrama = null;
    List<Tabela> tabelas = null;

    public void Inicie(DiagramaLogico diag) {
        diagrama = diag;
        tabelas = diagrama.getListaDeTabelas();
        for (int i = 0; i < tabelas.size(); i++) {
            Tabela t = tabelas.get(i);

            t.getCampos().forEach(c -> {
                String tp = c.getTipo();
                if (!tp.isEmpty() && tipos.indexOf(tp) < 0) {
                    tipos.add(tp);
                }
            });
        }

        tipos.addAll(diag.getDataModel().getDataTypes());

        tree.setCellRenderer(new DefaultTreeCellRenderer() {
            @Override
            public Component getTreeCellRendererComponent(JTree tree,
                    Object value, boolean selected, boolean expanded,
                    boolean isLeaf, int row, boolean focused) {
                Component c = super.getTreeCellRendererComponent(tree, value,
                        selected, expanded, isLeaf, row, focused);
                if (value instanceof TreeItem) {
                    int id = ((TreeItem) value).getId();
                    if (id == 0) {
                        setIcon(diagrama.getEditor().getControler().ImagemDeDiagrama.get(diagrama.getTipo().name()));
                    } else {
                        ImageIcon img = diagrama.getEditor().getControler().getImagem(((TreeItem) value).getExtraInfo());
                        if (img != null) {
                            setIcon(img);
                        }
                    }
                }
                return c;
            }
        });

        tree.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeValueChanged(null);
            }
        });
        tree.addTreeSelectionListener((javax.swing.event.TreeSelectionEvent evt) -> {
            treeValueChanged(evt);
        });
        AtualizeTreeNavegacao();

        setSelecionada(null);
    }

    private void treeValueChanged(javax.swing.event.TreeSelectionEvent evt) {
        if (tree.getLastSelectedPathComponent() != null) {
            int v = ((TreeItem) tree.getLastSelectedPathComponent()).getId();
            if (v > 0) {
                setSelecionada((Tabela) diagrama.FindByID(v));
            } else {
                setSelecionada(null);
            }
        }
    }

    private transient TreeItem TreeRoot = null;

    public void AtualizeTreeNavegacao() {
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        TreeRoot = new TreeItem(diagrama.getNomeFormatado());
        diagrama.getListaDeItens().stream().filter((it) -> (it instanceof Tabela)).map(it -> (Tabela) it).forEach((it) -> {
            String tp = it.getCampos().stream().filter(c -> c.getTipo().isEmpty()).anyMatch(c -> c.getTipo().isEmpty()) ? "error" : "ok";
            TreeRoot.add(new TreeItem(it.getTexto(), it.getID(), tp));
        });

        tree.setModel(new DefaultTreeModel(TreeRoot));
    }

    private Tabela selecionada = null;

    public Tabela getSelecionada() {
        return selecionada;
    }

    public void setSelecionada(Tabela selecionada) {
        if (this.selecionada != selecionada) {
            this.selecionada = selecionada;
            Popule(selecionada);
        }
    }

    private void Popule(Tabela sel) {
        Principal.removeAll();
        Principal.validate();
        v = 0;
        if (sel != null) {
            sel.getCampos().stream().forEach(c -> AdicionarPainel(c));
        }
        Principal.repaint();
    }

    private void tipoAlterado() {
        if (getSelecionada() == null) {
            return;
        }
        TreeItem root = TreeRoot;
        for (int i = 0; i < root.getChildCount(); i++) {
            TreeItem item = (TreeItem) root.getChildAt(i);
            Tabela tbl = (Tabela) diagrama.FindByID(item.getId());

            String tp = tbl.getCampos().stream().filter(c -> c.getTipo().isEmpty()).anyMatch(c -> c.getTipo().isEmpty()) ? "error" : "ok";
            item.setExtraInfo(tp);

//            if (item.getId() == getSelecionada().getID()) {
//                String tp = getSelecionada().getCampos().stream().filter(c -> c.getTipo().isEmpty()).anyMatch(c -> c.getTipo().isEmpty()) ? "error" : "ok";
//                item.setExtraInfo(tp);
//                tree.repaint();
//                break;
//            }
        }
        tree.repaint();
    }

    public void SelecioneByDiagramaSelecionado() {
        DefaultTreeModel df = (DefaultTreeModel) tree.getModel();
        if (df.getRoot() instanceof TreeItem) {
            TreeItem root = (TreeItem) df.getRoot();
            TreePath pt = new TreePath(root);
            if (diagrama.getSelecionado() == null || !(diagrama.getSelecionado() instanceof Forma)) {
                return;
            }

            for (int i = 0; i < root.getChildCount(); i++) {
                TreeItem item = (TreeItem) root.getChildAt(i);
                if (item.getId() == diagrama.getSelecionado().getID()) {
                    tree.setSelectionPath(pt.pathByAddingChild(item));
                    break;
                }
            }
        }
        btnOK.setText("OK");
        btnFechar.setVisible(false);
    }
}
