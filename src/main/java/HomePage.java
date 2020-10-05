import tabs.*;

public class HomePage extends javax.swing.JFrame {
    
    public HomePage() {
        initComponents();
    }
    
    public static void main(String args[]) {
        try {
            // sets the look and feel to nimbus as default
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            // if windows is available then it is used
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsPane = new javax.swing.JTabbedPane();
        HomePagePanel = new javax.swing.JPanel();
        createGameOfLifeButton = new javax.swing.JButton();
        createLangtonsAntButton = new javax.swing.JButton();
        createMandelbrotButton = new javax.swing.JButton();
        createMinesweeperButton = new javax.swing.JButton();
        createTurmitesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createGameOfLifeButton.setText("Create Game Of Life");
        createGameOfLifeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGameOfLifeButtonActionPerformed(evt);
            }
        });

        createLangtonsAntButton.setText("Create Langtons Ant");
        createLangtonsAntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLangtonsAntButtonActionPerformed(evt);
            }
        });

        createMandelbrotButton.setText("Create Mandelbrot");
        createMandelbrotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMandelbrotButtonActionPerformed(evt);
            }
        });

        createMinesweeperButton.setText("Create Minesweeper");
        createMinesweeperButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMinesweeperButtonActionPerformed(evt);
            }
        });

        createTurmitesButton.setText("Create Turmites");
        createTurmitesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTurmitesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePagePanelLayout = new javax.swing.GroupLayout(HomePagePanel);
        HomePagePanel.setLayout(HomePagePanelLayout);
        HomePagePanelLayout.setHorizontalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createGameOfLifeButton)
                    .addComponent(createLangtonsAntButton)
                    .addComponent(createMandelbrotButton)
                    .addComponent(createMinesweeperButton)
                    .addComponent(createTurmitesButton))
                .addContainerGap(1019, Short.MAX_VALUE))
        );

        HomePagePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createGameOfLifeButton, createLangtonsAntButton, createMandelbrotButton, createMinesweeperButton, createTurmitesButton});

        HomePagePanelLayout.setVerticalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createGameOfLifeButton)
                .addGap(18, 18, 18)
                .addComponent(createLangtonsAntButton)
                .addGap(18, 18, 18)
                .addComponent(createMandelbrotButton)
                .addGap(18, 18, 18)
                .addComponent(createMinesweeperButton)
                .addGap(18, 18, 18)
                .addComponent(createTurmitesButton)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        HomePagePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createGameOfLifeButton, createLangtonsAntButton, createMandelbrotButton, createMinesweeperButton, createTurmitesButton});

        tabsPane.addTab("Home Page", HomePagePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabsPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createGameOfLifeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGameOfLifeButtonActionPerformed
        tabsPane.add("Game Of Life " + lifeCount, new GameOfLife());
        lifeCount++;
    }//GEN-LAST:event_createGameOfLifeButtonActionPerformed

    private void createLangtonsAntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLangtonsAntButtonActionPerformed
        tabsPane.add("Langtons Ant " + langtonsCount, new LangtonsAnt());
        langtonsCount++;
    }//GEN-LAST:event_createLangtonsAntButtonActionPerformed

    private void createMandelbrotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMandelbrotButtonActionPerformed
        tabsPane.add("Mandelbrot " + mandelbrotCount, new Mandelbrot());
        mandelbrotCount++;
    }//GEN-LAST:event_createMandelbrotButtonActionPerformed

    private void createMinesweeperButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMinesweeperButtonActionPerformed
        tabsPane.add("Minesweeper " + minesweeperCount, new Minesweeper());
        minesweeperCount++;
    }//GEN-LAST:event_createMinesweeperButtonActionPerformed

    private void createTurmitesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTurmitesButtonActionPerformed
        tabsPane.add("Turmites " + turmitesCount, new Turmites());
        turmitesCount++;
    }//GEN-LAST:event_createTurmitesButtonActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JButton createGameOfLifeButton;
    private javax.swing.JButton createLangtonsAntButton;
    private javax.swing.JButton createMandelbrotButton;
    private javax.swing.JButton createMinesweeperButton;
    private javax.swing.JButton createTurmitesButton;
    private javax.swing.JTabbedPane tabsPane;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="My Variables">
    private int mandelbrotCount = 1;
    private int langtonsCount = 1;
    private int turmitesCount = 1;
    private int minesweeperCount = 1;
    private int lifeCount = 1;
    //</editor-fold>
   
}
