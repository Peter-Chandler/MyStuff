package tabs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import resources.life.Grid;
import resources.life.GridChanges;

public class GameOfLife extends javax.swing.JPanel {
    //todo maybe be able to select an area to save and name the saved area
    
    //todo maybe detect input image cell size?
    
    //todo draw line between drags, check outofbounds on zooming in and dragging
    
    //todo once all features here have been complete add functionality to change the ruleset, rename tab CellularAutomaton
    
    public GameOfLife() {
        initComponents();
        loadSavedVariables();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        convertImageDialog = new javax.swing.JDialog();
        selectedImageGreyscalePanel = new resources.ImageJPanel();
        selectedImagePanel = new resources.ImageJPanel();
        selectImageButton = new javax.swing.JButton();
        greaterThanTextField = new javax.swing.JTextField();
        lessThanTextField = new javax.swing.JTextField();
        lessThanLabel = new javax.swing.JLabel();
        greaterThanLabel = new javax.swing.JLabel();
        savePatternButton = new javax.swing.JButton();
        patternNameTextField = new javax.swing.JTextField();
        selectedImageConvertedPanel = new resources.ImageJPanel();
        cellSizeLabel = new javax.swing.JLabel();
        cellSizeTextField = new javax.swing.JTextField();
        grayValueLabel = new javax.swing.JLabel();
        grayValueTextField = new javax.swing.JTextField();
        selectImageFileChooser = new javax.swing.JFileChooser();
        controls = new javax.swing.JPanel();
        patternComboBox = new javax.swing.JComboBox<>();
        liveBorderButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        backwardsButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        forwardsButton = new javax.swing.JButton();
        intervalSlider = new javax.swing.JSlider();
        intervalTextField = new javax.swing.JTextField();
        intervalLabel = new javax.swing.JLabel();
        positionSlider = new javax.swing.JSlider();
        positionTextField = new javax.swing.JTextField();
        positionLabel = new javax.swing.JLabel();
        importButton = new javax.swing.JButton();
        zoomLevelLabel = new javax.swing.JLabel();
        zoomLevelSpinner = new javax.swing.JSpinner();
        patternPasteLabel = new javax.swing.JLabel();
        displayControlsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        display = new resources.ImageJPanel();

        convertImageDialog.setSize(new java.awt.Dimension(326, 201));

        selectedImageGreyscalePanel.setPreferredSize(new java.awt.Dimension(200, 200));
        selectedImageGreyscalePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                selectedImageGreyscalePanelMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout selectedImageGreyscalePanelLayout = new javax.swing.GroupLayout(selectedImageGreyscalePanel);
        selectedImageGreyscalePanel.setLayout(selectedImageGreyscalePanelLayout);
        selectedImageGreyscalePanelLayout.setHorizontalGroup(
            selectedImageGreyscalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        selectedImageGreyscalePanelLayout.setVerticalGroup(
            selectedImageGreyscalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        selectedImagePanel.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout selectedImagePanelLayout = new javax.swing.GroupLayout(selectedImagePanel);
        selectedImagePanel.setLayout(selectedImagePanelLayout);
        selectedImagePanelLayout.setHorizontalGroup(
            selectedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        selectedImagePanelLayout.setVerticalGroup(
            selectedImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        selectImageButton.setText("select image");
        selectImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageButtonActionPerformed(evt);
            }
        });

        greaterThanTextField.setText("128");
        greaterThanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greaterThanTextFieldActionPerformed(evt);
            }
        });

        lessThanTextField.setText("256");
        lessThanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessThanTextFieldActionPerformed(evt);
            }
        });

        lessThanLabel.setText("less than ");

        greaterThanLabel.setText("greater than");

        savePatternButton.setText("save pattern");
        savePatternButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePatternButtonActionPerformed(evt);
            }
        });

        patternNameTextField.setText("patternName");

        selectedImageConvertedPanel.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout selectedImageConvertedPanelLayout = new javax.swing.GroupLayout(selectedImageConvertedPanel);
        selectedImageConvertedPanel.setLayout(selectedImageConvertedPanelLayout);
        selectedImageConvertedPanelLayout.setHorizontalGroup(
            selectedImageConvertedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        selectedImageConvertedPanelLayout.setVerticalGroup(
            selectedImageConvertedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        cellSizeLabel.setText("cell size");

        cellSizeTextField.setText("1");
        cellSizeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellSizeTextFieldActionPerformed(evt);
            }
        });

        grayValueLabel.setText("gray value");

        javax.swing.GroupLayout convertImageDialogLayout = new javax.swing.GroupLayout(convertImageDialog.getContentPane());
        convertImageDialog.getContentPane().setLayout(convertImageDialogLayout);
        convertImageDialogLayout.setHorizontalGroup(
            convertImageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convertImageDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convertImageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(convertImageDialogLayout.createSequentialGroup()
                        .addComponent(selectedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedImageGreyscalePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedImageConvertedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(convertImageDialogLayout.createSequentialGroup()
                        .addComponent(selectImageButton)
                        .addGap(18, 18, 18)
                        .addComponent(savePatternButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patternNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(convertImageDialogLayout.createSequentialGroup()
                        .addComponent(lessThanLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lessThanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(greaterThanLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greaterThanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cellSizeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cellSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grayValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grayValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        convertImageDialogLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cellSizeTextField, greaterThanTextField, lessThanTextField});

        convertImageDialogLayout.setVerticalGroup(
            convertImageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convertImageDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convertImageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectImageButton)
                    .addComponent(savePatternButton)
                    .addComponent(patternNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(convertImageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greaterThanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lessThanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lessThanLabel)
                    .addComponent(greaterThanLabel)
                    .addComponent(cellSizeLabel)
                    .addComponent(cellSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grayValueLabel)
                    .addComponent(grayValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(convertImageDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedImageGreyscalePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedImageConvertedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        convertImageDialogLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cellSizeTextField, greaterThanTextField, lessThanTextField});

        selectImageFileChooser.setDialogTitle("TEST TITLE");
        selectImageFileChooser.setFileFilter(new FileNameExtensionFilter("PNG file", "png"));
        selectImageFileChooser.setFileHidingEnabled(false);

        controls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controls.setPreferredSize(new java.awt.Dimension(480, 480));

        liveBorderButton.setText("set border alive");
        liveBorderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liveBorderButtonActionPerformed(evt);
            }
        });

        resetButton.setText("reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        backwardsButton.setText("backwards");
        backwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardsButtonActionPerformed(evt);
            }
        });

        previousButton.setText("previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        pauseButton.setText("pause");
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        nextButton.setText("next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        forwardsButton.setText("forwards");
        forwardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardsButtonActionPerformed(evt);
            }
        });

        intervalSlider.setMajorTickSpacing(200);
        intervalSlider.setMaximum(1000);
        intervalSlider.setPaintLabels(true);
        intervalSlider.setPaintTicks(true);
        intervalSlider.setValue(0);
        intervalSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                intervalSliderStateChanged(evt);
            }
        });

        intervalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        intervalTextField.setText("0");
        intervalTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                intervalTextFieldFocusLost(evt);
            }
        });
        intervalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalTextFieldActionPerformed(evt);
            }
        });

        intervalLabel.setText("time interval for forwards and backwards");

        positionSlider.setMaximum(-1);
        positionSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                positionSliderStateChanged(evt);
            }
        });

        positionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        positionTextField.setText("-1");
        positionTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                positionTextFieldFocusLost(evt);
            }
        });
        positionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionTextFieldActionPerformed(evt);
            }
        });

        positionLabel.setText("current shown generation, min = -1, max = -1");

        importButton.setText("import image");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        zoomLevelLabel.setText("selected zoom level (1-100)");

        zoomLevelSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 1, 100, 1));
        zoomLevelSpinner.setOpaque(false);
        zoomLevelSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                zoomLevelSpinnerStateChanged(evt);
            }
        });

        patternPasteLabel.setText("selected pattern to paste");

        displayControlsLabel.setText("display controls");

        jLabel1.setText("import pattern from an image");

        jLabel2.setText("reset the board to all dead cells");

        jLabel3.setText("set the border of the board to alive cells");

        javax.swing.GroupLayout controlsLayout = new javax.swing.GroupLayout(controls);
        controls.setLayout(controlsLayout);
        controlsLayout.setHorizontalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patternPasteLabel)
                    .addComponent(zoomLevelLabel)
                    .addComponent(positionLabel)
                    .addComponent(displayControlsLabel)
                    .addComponent(intervalLabel)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(liveBorderButton)
                    .addGroup(controlsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patternComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zoomLevelSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(controlsLayout.createSequentialGroup()
                                .addComponent(positionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(positionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlsLayout.createSequentialGroup()
                                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(previousButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backwardsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nextButton)
                                    .addGroup(controlsLayout.createSequentialGroup()
                                        .addComponent(forwardsButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pauseButton))))
                            .addGroup(controlsLayout.createSequentialGroup()
                                .addComponent(intervalSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(intervalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(importButton)
                            .addComponent(resetButton)))
                    .addComponent(jLabel3))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backwardsButton, forwardsButton, nextButton, pauseButton, previousButton});

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {intervalSlider, positionSlider});

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {intervalTextField, positionTextField});

        controlsLayout.setVerticalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(liveBorderButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importButton)
                .addGap(18, 18, 18)
                .addComponent(patternPasteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patternComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zoomLevelLabel)
                .addGap(5, 5, 5)
                .addComponent(zoomLevelSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(intervalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(intervalTextField)
                    .addComponent(intervalSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(displayControlsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backwardsButton)
                    .addComponent(forwardsButton)
                    .addComponent(pauseButton))
                .addGap(6, 6, 6)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton)
                    .addComponent(nextButton))
                .addGap(18, 18, 18)
                .addComponent(positionLabel)
                .addGap(3, 3, 3)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(positionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backwardsButton, forwardsButton, nextButton, pauseButton, previousButton});

        controlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {positionSlider, positionTextField});

        controlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {intervalSlider, intervalTextField});

        display.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                displayMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                displayMouseMoved(evt);
            }
        });
        display.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                displayMouseWheelMoved(evt);
            }
        });
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                displayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                displayMouseReleased(evt);
            }
        });
        display.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                displayComponentResized(evt);
            }
        });

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controls, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(controls, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 223, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void displayComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_displayComponentResized
        stopGenerating();
        pause();
        width = display.getWidth();
        height = display.getHeight();
        size = width*height;
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        reset(); // todo add in stuff to reset the zoom so it is zoomed out
        //liveBorder();
    }//GEN-LAST:event_displayComponentResized

    private void displayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMousePressed
        stopGenerating();
        pause();
        currentMouseButton = evt.getButton();
        if (zoomed) {
            prevDragX = zoomedImageStartX+evt.getX()/zoom;
            prevDragY = zoomedImageStartY+evt.getY()/zoom;
        } else {
            prevDragX = evt.getX();
            prevDragY = evt.getY();
        }
        
        if (currentMouseButton == 1) {
            setAlive(prevDragX+prevDragY*width);
        } else if (currentMouseButton == 3) {
            setDead(prevDragX+prevDragY*width);
        } else if (currentMouseButton == 5) {
            pastePattern();
        } else if (currentMouseButton == 2) {
            dragDifferenceX = 0;
            dragDifferenceY = 0;
        }
        display();
    }//GEN-LAST:event_displayMousePressed

    private void displayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseMoved
        if (zoomed) {
            currX = zoomedImageStartX+evt.getX()/zoom;
            currY = zoomedImageStartY+evt.getY()/zoom;
        } else {
            currX = evt.getX();
            currY = evt.getY();
        }
    }//GEN-LAST:event_displayMouseMoved

    private void displayMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseDragged
        //todo draw line between prev and curr, if curr is out of bounds then only draw the part of the line that is in the bounds
        if (zoomed) {
            currDragX = zoomedImageStartX+evt.getX()/zoom;
            currDragY = zoomedImageStartY+evt.getY()/zoom;
            if (currentMouseButton == 2) {
                dragDifferenceX += (currDragX-prevDragX);
                dragDifferenceY += (currDragY-prevDragY);
                boolean redraw = false;
                //todo do not increase/drecrease the image variables if it would cause them to go outofbounds
                if (dragDifferenceX < 0) {
                    while (dragDifferenceX < 0) {
                        dragDifferenceX++;
                        zoomedImageStartX++;
                        zoomedImageEndX++;
                    }
                    redraw = true;
                } else if (dragDifferenceX > 0) {
                    while (dragDifferenceX > 0) {
                        dragDifferenceX--;
                        zoomedImageStartX--;
                        zoomedImageEndX--;
                    }
                    redraw = true;
                }
                if (dragDifferenceY < 0) {
                    while (dragDifferenceY < 0) {
                        dragDifferenceY++;
                        zoomedImageStartY++;
                        zoomedImageEndY++;
                    }
                    redraw = true;
                } else if (dragDifferenceY > 0) {
                    while (dragDifferenceY > 0) {
                        dragDifferenceY--;
                        zoomedImageStartY--;
                        zoomedImageEndY--;
                    }
                    redraw = true;
                }
                if (redraw) {
                    g.setColor(Color.WHITE);
                    g.fillRect(0, 0, image.getWidth(), image.getHeight()); // not sure about the +1?
                    for (int x = zoomedImageStartX; x <= zoomedImageEndX; x++) {
                        for (int y = zoomedImageStartY; y <= zoomedImageEndY; y++) {
                            if (currentGrid[x+y*width] == 1) {
                                g.setColor(Color.BLACK);
                                g.fillRect((x-zoomedImageStartX)*zoom, (y-zoomedImageStartY)*zoom, zoom, zoom);
                            }
                        }
                    }
                    currDragX = zoomedImageStartX+evt.getX()/zoom;
                    currDragY = zoomedImageStartY+evt.getY()/zoom;
                }
            } else {
                if (currDragX >= zoomedImageStartX && currDragX <= zoomedImageEndX && currDragY >= zoomedImageStartY && currDragY <= zoomedImageEndY) {
                    if (currentMouseButton == 1) {
                        setAlive(currDragX+currDragY*width);
                    } else if (currentMouseButton == 3) {
                        setDead(currDragX+currDragY*width);
                    }
                }
            }
        } else {
            currDragX = evt.getX();
            currDragY = evt.getY();
            if (currDragX >= 0 && currDragX < width && currDragY >= 0 && currDragY < height) {
                if (currentMouseButton == 1) {
                    setAlive(currDragX+currDragY*width);
                } else if (currentMouseButton == 3) {
                    setDead(currDragX+currDragY*width);
                }
            }
        }
        prevDragX = currDragX;
        prevDragY = currDragY;
        display();
    }//GEN-LAST:event_displayMouseDragged

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        currX = -1;
        currY = -1;
    }//GEN-LAST:event_displayMouseExited

    private void liveBorderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liveBorderButtonActionPerformed
        liveBorder();
    }//GEN-LAST:event_liveBorderButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        stopGenerating();
        pause();
        reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void backwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardsButtonActionPerformed
        forwardsTimer.stop();
        backwardsTimer.start();
        updatePositionSliderTimer.start();
        backwardsButton.setEnabled(false);
        forwardsButton.setEnabled(true);
        pauseButton.setEnabled(true);
    }//GEN-LAST:event_backwardsButtonActionPerformed

    private void forwardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardsButtonActionPerformed
        backwardsTimer.stop();
        forwardsTimer.start();
        updatePositionSliderTimer.start();
        forwardsButton.setEnabled(false);
        backwardsButton.setEnabled(true);
        pauseButton.setEnabled(true);
    }//GEN-LAST:event_forwardsButtonActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        pause();
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        pause();
        backward();
        updatePositionSlider();
        display();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        pause();
        forward();
        updatePositionSlider();
        display();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void positionSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_positionSliderStateChanged
        if (isSliderChangeFromUser) {
            pause();
            int difference = positionSlider.getValue() - position;
            if (difference > 0) {
                for (int i = 0; i < difference; i++) {
                    forward();
                }
            } else {
                for (int i = 0; i < -1*difference; i++) {
                    backward();
                }
            }
            display();
            positionTextField.setText(""+positionSlider.getValue());
        }
    }//GEN-LAST:event_positionSliderStateChanged

    private void displayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseReleased
        if (currentMouseButton != 2) {
            addGridChange();  
        }
    }//GEN-LAST:event_displayMouseReleased

    private void intervalSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_intervalSliderStateChanged
        interval = intervalSlider.getValue();
        intervalTextField.setText(""+interval);
        forwardsTimer.setDelay(interval);
        backwardsTimer.setDelay(interval);
    }//GEN-LAST:event_intervalSliderStateChanged

    private void intervalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalTextFieldActionPerformed
        try {
            int value = Integer.parseInt(intervalTextField.getText());
            if (value >= 0 && value <= 1000) {
                intervalSlider.setValue(value);
            } else {
                intervalTextField.setText(""+interval);
            }
        } catch (NumberFormatException e) {
            intervalTextField.setText(""+interval);
        }
    }//GEN-LAST:event_intervalTextFieldActionPerformed

    private void intervalTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_intervalTextFieldFocusLost
        try {
            int value = Integer.parseInt(intervalTextField.getText());
            if (value >= 0 && value <= 1000) {
                intervalSlider.setValue(value);
            } else {
                intervalTextField.setText(""+interval);
            }
        } catch (NumberFormatException e) {
            intervalTextField.setText(""+interval);
        }
    }//GEN-LAST:event_intervalTextFieldFocusLost

    private void positionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionTextFieldActionPerformed
        try {
            int newPosition = Integer.parseInt(positionTextField.getText());
            if (newPosition >= -1 && newPosition < gridChanges.size()) {
                positionSlider.setValue(newPosition);
            } else {
                positionTextField.setText(""+position);
            }
        } catch (NumberFormatException e) {
            positionTextField.setText(""+position);
        }
    }//GEN-LAST:event_positionTextFieldActionPerformed

    private void positionTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_positionTextFieldFocusLost
        try {
            int newPosition = Integer.parseInt(positionTextField.getText());
            if (newPosition >= -1 && newPosition < gridChanges.size()) {
                positionSlider.setValue(newPosition);
            } else {
                positionTextField.setText(""+position);
            }
        } catch (NumberFormatException e) {
            positionTextField.setText(""+position);
        }
    }//GEN-LAST:event_positionTextFieldFocusLost

    private void displayMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_displayMouseWheelMoved
        if (evt.getWheelRotation() < 0) { // mouse wheel up
            if (!zoomed) {
                zoom = inputZoom;
                zoomIn(evt.getX()+evt.getY()*width);
                display();
            }
        } else { // mouse wheel down
            if (zoomed) {
                zoomOut();
                display();
            }
        }
    }//GEN-LAST:event_displayMouseWheelMoved

    private void selectImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImageButtonActionPerformed
        int returnVal = selectImageFileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = selectImageFileChooser.getSelectedFile();
            try {
                BufferedImage selectedImage = ImageIO.read(file);
                int w = selectedImage.getWidth();
                int h = selectedImage.getHeight();
                selectedImageGreyscale = new BufferedImage(w, h, BufferedImage.TYPE_BYTE_GRAY);
                selectedImageGreyscale.createGraphics().drawImage(selectedImage, 0, 0, null);
                //could not get the dialog window to automatically resize?
                //used revalidate to set the size of the Jpanels correctly and then set the size of the dialog to the minimum size which was correct
                selectedImagePanel.setPreferredSize(new Dimension(w, h));
                selectedImagePanel.displayImage(selectedImage, 0, 0);
                selectedImagePanel.revalidate();
                        
                selectedImageGreyscalePanel.setPreferredSize(new Dimension(w, h));
                selectedImageGreyscalePanel.displayImage(selectedImageGreyscale, 0, 0);
                selectedImageGreyscalePanel.revalidate();
                
                //potential implementation detectCellSize();
                convertImage();

            } catch (IOException ex) {
              System.out.println("problem with opening image at: "+file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_selectImageButtonActionPerformed

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        convertImageDialog.pack();
        convertImageDialog.setPreferredSize(convertImageDialog.getMinimumSize());
        convertImageDialog.setVisible(true);
    }//GEN-LAST:event_importButtonActionPerformed

    private void lessThanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessThanTextFieldActionPerformed
        try {
            int newLessThan = Integer.parseInt(lessThanTextField.getText());
            if (newLessThan >= 0 && newLessThan <= 256) {
                lessThan = newLessThan;
                convertImage();
            } else {
                lessThanTextField.setText(""+lessThan);
            }
        } catch (NumberFormatException e) {
            lessThanTextField.setText(""+lessThan);
        }
    }//GEN-LAST:event_lessThanTextFieldActionPerformed

    private void greaterThanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greaterThanTextFieldActionPerformed
        try {
            int newGreaterThan = Integer.parseInt(greaterThanTextField.getText());
            if (newGreaterThan >= 0 && newGreaterThan <= 256) {
                greaterThan = newGreaterThan;
                convertImage();
            } else {
                greaterThanTextField.setText(""+greaterThan);
            }
        } catch (NumberFormatException e) {
            greaterThanTextField.setText(""+greaterThan);
        }
    }//GEN-LAST:event_greaterThanTextFieldActionPerformed

    private void savePatternButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePatternButtonActionPerformed
        String fileName = patternNameTextField.getText();
        if (!fileName.equals("")) {
            File outputfile = new File("src\\main\\java\\resources\\life\\patterns\\"+fileName+".txt");
            try (FileWriter fw = new FileWriter(outputfile)) {
                for (int y = 0; y < selectedImageConverted.getHeight(); y++) {
                    for (int x = 0; x < selectedImageConverted.getWidth(); x++) {
                        if (selectedImageConverted.getRGB(x, y) == black) {
                            fw.write("1 ");
                        } else {
                            fw.write("0 ");
                        }
                    }
                    fw.write("\n");
                }
                fw.close();
                loadSavedVariables();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_savePatternButtonActionPerformed

    private void cellSizeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellSizeTextFieldActionPerformed
        try {
            int newCellSize = Integer.parseInt(cellSizeTextField.getText());
            if (newCellSize > 0 && newCellSize <= 100) {
                cellSize = newCellSize;
                convertImage();
            } else {
                cellSizeTextField.setText(""+cellSize);
            }
        } catch (NumberFormatException e) {
            cellSizeTextField.setText(""+cellSize);
        }
    }//GEN-LAST:event_cellSizeTextFieldActionPerformed

    private void selectedImageGreyscalePanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedImageGreyscalePanelMouseMoved
        if (selectedImageGreyscale != null) {
            int gray = 255 - selectedImageGreyscale.getRGB(evt.getX(), evt.getY())& 0xFF;
            grayValueTextField.setText(""+gray);
            grayValueTextField.setColumns(grayValueTextField.getText().length());
            convertImageDialog.revalidate();
        }
    }//GEN-LAST:event_selectedImageGreyscalePanelMouseMoved

    private void zoomLevelSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_zoomLevelSpinnerStateChanged
         inputZoom = (int) zoomLevelSpinner.getValue();
    }//GEN-LAST:event_zoomLevelSpinnerStateChanged

    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backwardsButton;
    private javax.swing.JLabel cellSizeLabel;
    private javax.swing.JTextField cellSizeTextField;
    private javax.swing.JPanel controls;
    private javax.swing.JDialog convertImageDialog;
    private resources.ImageJPanel display;
    private javax.swing.JLabel displayControlsLabel;
    private javax.swing.JButton forwardsButton;
    private javax.swing.JLabel grayValueLabel;
    private javax.swing.JTextField grayValueTextField;
    private javax.swing.JLabel greaterThanLabel;
    private javax.swing.JTextField greaterThanTextField;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel intervalLabel;
    private javax.swing.JSlider intervalSlider;
    private javax.swing.JTextField intervalTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lessThanLabel;
    private javax.swing.JTextField lessThanTextField;
    private javax.swing.JButton liveBorderButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JComboBox<String> patternComboBox;
    private javax.swing.JTextField patternNameTextField;
    private javax.swing.JLabel patternPasteLabel;
    private javax.swing.JButton pauseButton;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JSlider positionSlider;
    private javax.swing.JTextField positionTextField;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton savePatternButton;
    private javax.swing.JButton selectImageButton;
    private javax.swing.JFileChooser selectImageFileChooser;
    private resources.ImageJPanel selectedImageConvertedPanel;
    private resources.ImageJPanel selectedImageGreyscalePanel;
    private resources.ImageJPanel selectedImagePanel;
    private javax.swing.JLabel zoomLevelLabel;
    private javax.swing.JSpinner zoomLevelSpinner;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Actions and Runnables">
    // Action that updates the positionSlider to reflect the current position - to be used with the updatePositionSliderTimer
    AbstractAction updatePositionSliderAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            updatePositionSlider();
        }
    };
    // Action that updates the positionSlider maximum variables which change during generation - to be used with the updatePositionSliderMaxTimer
    AbstractAction updatePositionSliderMaxAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            updatePositionSliderMax(gridChanges.size());
        }
    };
    // Action that displays the next generation - to be used with the forwardsTimer
    AbstractAction forwardsAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            forward();
            display();
        }
    };
    // Action that displays the previous generation - to be used with the backwardsTimer
    AbstractAction backwardsAction = new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            backward();
            display();
        }
    };
    // Runnable that generates the game of life generations that is run in a seperate thread when the user clicks the run button
    Runnable generate = new Runnable() {
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            HashMap<Grid, Integer> grids = new HashMap<>();
            int generation = 0;
            period = -1;
            int[] generatingGrid = new int[size];
            System.arraycopy(currentGrid, 0, generatingGrid, 0, size);
            int[] setAlive = new int[size];
            int[] setDead = new int[size];
            int[] checkCells = new int[size];
            int[] isInCheckCells = new int[size];
            int[][] neighbours = new int[size][9];
            int setAliveCounter = 0;
            int setDeadCounter = 0;
            int checkCellsCounter = 0;
            // set all neighbour table values to -1 to indicate when there are no more neighbours (0 cannot be used as this is used for the first cell)
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < 8; j++) {
                    neighbours[i][j] = -1;
                }
            }
            //create neighbour table
            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    int counter = 0;
                    @SuppressWarnings("MismatchedReadAndWriteOfArray")
                    int[] cellNeighbours = neighbours[y*width + x];
                    if (x != 0)                        { cellNeighbours[counter] = (x-1)+(y  )*width; counter++; }
                    if (x != width-1)                  { cellNeighbours[counter] = (x+1)+(y  )*width; counter++; }
                    if (y != 0)                        { cellNeighbours[counter] = (x  )+(y-1)*width; counter++; }
                    if (y != height-1)                 { cellNeighbours[counter] = (x  )+(y+1)*width; counter++; }
                    if (x != 0 && y != 0)              { cellNeighbours[counter] = (x-1)+(y-1)*width; counter++; }
                    if (x != width-1 && y != 0)        { cellNeighbours[counter] = (x+1)+(y-1)*width; counter++; }
                    if (x != 0 && y != height-1)       { cellNeighbours[counter] = (x-1)+(y+1)*width; counter++; }
                    if (x != width-1 && y != height-1) { cellNeighbours[counter] = (x+1)+(y+1)*width; counter++; }
                }
            }
            // for all live cells and neighbours in generate grid add them to checkCells for initial check and update neighbour count
            for (int cell = 0; cell < size; cell++) {
                if (generatingGrid[cell] == 1) {
                    if (isInCheckCells[cell] == 0) {
                        isInCheckCells[cell] = 1;
                        checkCells[checkCellsCounter] = cell;
                        checkCellsCounter++;
                    }
                    int[] cellNeighbours = neighbours[cell];
                    for (int i = 0; i < 8; i++) {
                        int neighbour = cellNeighbours[i];
                        if (neighbour != -1) {
                            neighbours[neighbour][8]++;
                            if (isInCheckCells[neighbour] == 0) {
                                isInCheckCells[neighbour] = 1;
                                checkCells[checkCellsCounter] = neighbour;
                                checkCellsCounter++;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            updatePositionSliderMaxTimer.start();
            while (generating) {
                for (int i = 0; i < checkCellsCounter; i++) {
                    int cell = checkCells[i];
                    int aliveNeighbours = neighbours[cell][8];
                    if (generatingGrid[cell] == 1) {
                        if (aliveNeighbours < 2 || aliveNeighbours > 3) {
                            setDead[setDeadCounter] = cell;
                            setDeadCounter++;
                        }
                    } else {
                        if (aliveNeighbours == 3) {
                            setAlive[setAliveCounter] = cell;
                            setAliveCounter++;
                        }
                    }
                    isInCheckCells[cell] = 0;
                }
                checkCellsCounter = 0;

                //this works for now but I feel like if there was any collision of keys in the hashmap then it would falsey say stability is reach
                //this is beacuase equals would return true as all grids are the same even though the grids are different, just chance if their hash is the same
                Grid g = new Grid(generatingGrid);
                if (grids.containsKey(g)) {
                    int prevGen = grids.get(g);
                    period = generation-prevGen;
                    System.out.println("Period found at generation " + generation + ", which was started on generation " + prevGen + ", which means the period length is " + period);
                    System.out.println("Time taken: " + (System.currentTimeMillis()-startTime));
                    generating = false;
                    updatePositionSliderMaxTimer.stop();
                    updatePositionSliderMax(gridChanges.size());
                } else {
                    grids.put(g, generation);
                    gridChanges.add(new GridChanges(setAlive, setAliveCounter, setDead, setDeadCounter));
                }

                for (int a = 0; a < setAliveCounter; a++) {
                    int cell = setAlive[a];
                    generatingGrid[cell] = 1;
                    if (isInCheckCells[cell] == 0) {
                        isInCheckCells[cell] = 1;
                        checkCells[checkCellsCounter] = cell;
                        checkCellsCounter++;
                    }
                    int[] cellNeighbours = neighbours[cell];
                    for (int i = 0; i < 8; i++) {
                        int neighbour = cellNeighbours[i];
                        if (neighbour != -1) {
                            neighbours[neighbour][8]++;
                            if (isInCheckCells[neighbour] == 0) {
                                isInCheckCells[neighbour] = 1;
                                checkCells[checkCellsCounter] = neighbour;
                                checkCellsCounter++;
                            }
                        } else {
                            break;
                        }
                    }
                }
                setAliveCounter = 0;

                for (int d = 0; d < setDeadCounter; d++) {
                    int cell = setDead[d];
                    generatingGrid[cell] = 0;
                    if (isInCheckCells[cell] == 0) {
                        isInCheckCells[cell] = 1;
                        checkCells[checkCellsCounter] = cell;
                        checkCellsCounter++;
                    }
                    int[] cellNeighbours = neighbours[cell];
                    for (int i = 0; i < 8; i++) {
                        int neighbour = cellNeighbours[i];
                        if (neighbour != -1) {
                            neighbours[neighbour][8]--;
                            if (isInCheckCells[neighbour] == 0) {
                                isInCheckCells[neighbour] = 1;
                                checkCells[checkCellsCounter] = neighbour;
                                checkCellsCounter++;
                            }
                        } else {
                            break;
                        }
                    }
                }
                setDeadCounter = 0;
                generation++;
            }
        }
    };
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="My Variables">
    // image variables
    private BufferedImage image;
    private Graphics2D g;
    private int width;
    private int height;
    private int size;
    private int imageOffsetX = 0;
    private int imageOffsetY = 0;
    // zoomed image variables
    private boolean zoomed = false;
    private int zoom;
    private int inputZoom = 10;
    private int zoomedImageStartX;
    private int zoomedImageStartY;
    private int zoomedImageEndX;
    private int zoomedImageEndY;
    // mouse variables
    private int prevDragX;
    private int prevDragY;
    private int currDragX;
    private int currDragY;
    private int dragDifferenceX;
    private int dragDifferenceY;  
    private int currentMouseButton;
    private int currX = -1;
    private int currY = -1;
    // saved rgb colours
    private final int white = Color.WHITE.getRGB();
    private final int black = Color.BLACK.getRGB();
    // arrays to store drawn alive/dead values
    private int[] setAlive;
    private int setAliveCounter;
    private int[] setDead;
    private int setDeadCounter;
    // generating variables
    private Thread generationThread;
    private volatile boolean generating = false;
    private int period;
    // variables for displaying the current generation
    private int[] currentGrid;
    private ArrayList<GridChanges> gridChanges; 
    private int position;
    // varibles for timers
    private int interval = 0;
    javax.swing.Timer forwardsTimer = new javax.swing.Timer(interval, forwardsAction); 
    javax.swing.Timer backwardsTimer = new javax.swing.Timer(interval, backwardsAction);
    javax.swing.Timer updatePositionSliderMaxTimer = new javax.swing.Timer(50, updatePositionSliderMaxAction);
    javax.swing.Timer updatePositionSliderTimer = new javax.swing.Timer(50, updatePositionSliderAction);
    private boolean isSliderChangeFromUser = true;
    // import image variables
    private BufferedImage selectedImageGreyscale;
    private BufferedImage selectedImageConverted;
    private int lessThan = 256;
    private int greaterThan = 128;
    private int cellSize = 1;
    //</editor-fold>    
    
    private void display() {
        display.displayImage(image, imageOffsetX, imageOffsetY);
    }
    
    private void reset() {
        image.createGraphics().fillRect(0, 0, width, height);
        display();
        setAlive = new int[size];
        setAliveCounter = 0;
        setDead = new int[size];
        setDeadCounter = 0;
        currentGrid = new int[size];
        gridChanges = new ArrayList<>();
        position = -1;
        updatePositionSlider();
        updatePositionSliderMax(-1);
        period = -1;
        zoomed = false;
    }
    
    private void loadSavedVariables() {
        patternComboBox.removeAllItems();
        for (File file : new File("src\\main\\java\\resources\\life\\patterns").listFiles()) {
            patternComboBox.addItem(file.getName().replace(".txt", ""));
        }
    }
    
    private void drawCell(int index, boolean alive) {
        if (!zoomed) {
            if (alive) {
                image.setRGB(index % width, index / width, black);
            } else {
                image.setRGB(index % width, index / width, white);
            }
        } else {
            int x = index % width;
            int y = index / width;
            if (x >= zoomedImageStartX && x <= zoomedImageEndX && y >= zoomedImageStartY && y <= zoomedImageEndY) { //check if index is inside of viewing area and draw if it is.
                if (alive) {
                    g.setColor(Color.BLACK);
                    g.fillRect((x-zoomedImageStartX)*zoom, (y-zoomedImageStartY)*zoom, zoom, zoom);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect((x-zoomedImageStartX)*zoom, (y-zoomedImageStartY)*zoom, zoom, zoom);
                }
            }
        
        }
    }
    
    private void convertImage() {
        selectedImageConverted = new BufferedImage(selectedImageGreyscale.getWidth(), selectedImageGreyscale.getHeight(), BufferedImage.TYPE_INT_ARGB);
        // threshold gray pixels to live pixels
        for (int x = 0; x < selectedImageConverted.getWidth(); x++) {
            for (int y = 0; y < selectedImageConverted.getHeight(); y++) {
                int gray = 255 - selectedImageGreyscale.getRGB(x, y)& 0xFF;
                if (gray < lessThan && gray > greaterThan) {
                    selectedImageConverted.setRGB(x, y, Color.BLACK.getRGB());
                }
            }
        }
        //crop the image to avoid dead cells padding
        int cropStartX = 0;
        int cropStartY = 0;
        int cropEndX = selectedImageConverted.getWidth();
        int cropEndY = selectedImageConverted.getHeight();
        outside1:
        for (int y = 0; y < selectedImageConverted.getHeight(); y++) {
            for (int x = 0; x < selectedImageConverted.getWidth(); x++) {
                if (selectedImageConverted.getRGB(x, y) == black) {
                    break outside1;
                }
            }
            cropStartY++;
        }
        outside2:
        for (int x = 0; x < selectedImageConverted.getWidth(); x++) {
            for (int y = 0; y < selectedImageConverted.getHeight(); y++) {
                if (selectedImageConverted.getRGB(x, y) == black) {
                    break outside2;
                }
            }
            cropStartX++;
        }
        outside3:
        for (int y = selectedImageConverted.getHeight()-1; y >= 0 ; y--) {
            for (int x = 0; x < selectedImageConverted.getWidth(); x++) {
                if (selectedImageConverted.getRGB(x, y) == black) {
                    break outside3;
                }
            }
            cropEndY--;
        }
        outside4:
        for (int x = selectedImageConverted.getWidth()-1; x >= 0 ; x--) {
            for (int y = 0; y < selectedImageConverted.getHeight(); y++) {
                if (selectedImageConverted.getRGB(x, y) == black) {
                    break outside4;
                }
            }
            cropEndX--;
        }
        if (cropStartX < cropEndX && cropStartY < cropEndY) {
            selectedImageConverted = selectedImageConverted.getSubimage(cropStartX, cropStartY, (cropEndX-cropStartX), (cropEndY-cropStartY));
        }
        // convert image to correct cell size
        if (cellSize > 1) {
            BufferedImage temp = new BufferedImage(selectedImageConverted.getWidth()/cellSize, selectedImageConverted.getHeight()/cellSize, BufferedImage.TYPE_INT_ARGB);
            for (int y = 0; y < temp.getHeight(); y++) {
                for (int x = 0; x < temp.getWidth(); x++) {
                    if (selectedImageConverted.getRGB(x*cellSize, y*cellSize) == black) {
                        temp.setRGB(x, y, black);
                    }
                }
            }
            selectedImageConverted = temp;
        }
        // set the panel to correct size
        selectedImageConvertedPanel.setPreferredSize(new Dimension(selectedImageConverted.getWidth(), selectedImageConverted.getHeight()));
        selectedImageConvertedPanel.displayImage(selectedImageConverted, 0, 0);
        selectedImageConvertedPanel.revalidate();
        // set dialog to correct size
        convertImageDialog.setSize(convertImageDialog.getMinimumSize());
    }
    
    private void pastePattern() {
        pause();
        try {
            if (currX != -1) {
                int startIndex = currY*width+currX;
                Scanner checkDimension = new Scanner(new File("src\\main\\java\\resources\\life\\patterns\\"+((String) patternComboBox.getSelectedItem())+".txt"));
                int numberOfRows = 0;
                int numberOfColumns = 0;
                if (checkDimension.hasNextLine()) {
                    Scanner checkDimensionColumns = new Scanner(checkDimension.nextLine());
                    numberOfRows++;
                    while(checkDimensionColumns.hasNextInt()) {
                        checkDimensionColumns.nextInt();
                        numberOfColumns++;
                    }
                }
                while (checkDimension.hasNextLine()) {
                    checkDimension.nextLine();
                    numberOfRows++;
                }
                if (startIndex%width+(numberOfColumns-1) >= width) {
                    System.out.println("Pattern exceeds width so pattern is not pasted");
                } else if (startIndex/width+(numberOfRows-1) >= height) {
                    System.out.println("Pattern exceeds height so pattern is not pasted");
                } else {
                    stopGenerating(); // stop generating as going to overwrite and then regenerate after the pattern paste
                    Scanner rows = new Scanner(new File("src\\main\\java\\resources\\life\\patterns\\"+((String) patternComboBox.getSelectedItem())+".txt"));
                    int offsetY = 0;
                    while(rows.hasNextLine()){
                        int offsetX = 0;
                        Scanner columns = new Scanner(rows.nextLine());
                        while(columns.hasNextInt()) {
                            if (columns.nextInt() == 1) {
                                setAlive(startIndex+offsetX+offsetY*width);
                            }
                            /*
                            //if dead cells override
                            else {
                                setDead(startIndex+offsetX+offsetY*width);
                            }
                            */
                            offsetX++;
                        }
                        offsetY++;
                    }
                    addGridChange();
                    display();
                }   
            } else {
                System.out.println("mouse is not over the display area so pattern not pasted");
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    private void liveBorder() {
        pause();
        stopGenerating();
        for (int i = 0; i < width; i++) {
            setAlive(i);
            setAlive(i+(height-1)*width);
        }
        for (int i = 0; i < height; i++) {
            setAlive(i*width);
            setAlive(i*width+width-1);
        }
        addGridChange();
        display();
    }
    
    private void setAlive(int index) {
        if (currentGrid[index] == 0) { // check the cell is dead
            currentGrid[index] = 1;
            drawCell(index, true);
            setAlive[setAliveCounter] = index;
            setAliveCounter++;
        }
    }
    
    private void setDead(int index) {
        if (currentGrid[index] == 1) { // check the cell is alive
            currentGrid[index] = 0;
            drawCell(index, false);
            setDead[setDeadCounter] = index;
            setDeadCounter++;
        }
    }
    
    private void addGridChange() {
        // stop the generating as a change has been made
        stopGenerating();
        gridChanges.add(++position, new GridChanges(setAlive, setAliveCounter, setDead, setDeadCounter));
        setAliveCounter = 0;
        setDeadCounter = 0;
        gridChanges.subList(position+1, gridChanges.size()).clear();
        updatePositionSlider();
        startGenerating();
    }
    
    private void startGenerating() {
        if (!generating) {
            generating = true;
            generationThread = new Thread(generate);
            generationThread.start();
        }
    }
    
    private void stopGenerating() {
        if (generating) {
            generating = false; // if a thread is running it will close when it completes its while loop
            updatePositionSliderMaxTimer.stop();
            if (generationThread != null) {
                while (generationThread.isAlive()) {} // make sure the thread closes if there is a current thread
            }
            updatePositionSliderMax(gridChanges.size());
        }
    }
    
    private void pause() {
        forwardsTimer.stop();
        backwardsTimer.stop();
        updatePositionSliderTimer.stop();
        backwardsButton.setEnabled(true);
        forwardsButton.setEnabled(true);
        pauseButton.setEnabled(false);
    }
    
    private void forward() {
        if (position == gridChanges.size()-1) {
            if (period != -1) {
                for (int i = 0; i < period-1; i++) {
                    backward();
                }
                display();
            } 
        } else {
            position++;
            GridChanges gc = gridChanges.get(position);
            for (int i = 0; i < gc.liveCells.length; i++) {
                int index = gc.liveCells[i];
                currentGrid[index] = 1;
                drawCell(index, true);
            }
            for (int i = 0; i < gc.deadCells.length; i++) {
                int index = gc.deadCells[i];
                currentGrid[index] = 0;
                drawCell(index, false);
            }
        }
    }
    
    private void backward() {
        if (position != -1) {
            GridChanges gc = gridChanges.get(position);
            for (int i = 0; i < gc.liveCells.length; i++) {
                int index = gc.liveCells[i];
                currentGrid[index] = 0;
                drawCell(index, false);
            }
            for (int i = 0; i < gc.deadCells.length; i++) {
                int index = gc.deadCells[i];
                currentGrid[index] = 1;
                drawCell(index, true);
            }
            position--;
        } else {
            pause();
            isSliderChangeFromUser = false;
            positionSlider.setValue(position);
            positionTextField.setText(""+position);
            isSliderChangeFromUser = true;
        }
    }
   
    private void updatePositionSlider() {
        isSliderChangeFromUser = false;
        positionSlider.setValue(position);
        positionTextField.setText(""+position);
        isSliderChangeFromUser = true;
    }
    
    private void updatePositionSliderMax(int value) {
        isSliderChangeFromUser = false;
        positionSlider.setMaximum(value);
        positionLabel.setText("current shown generation, min = -1, max = "+value);
        isSliderChangeFromUser = true;
    }
    
    private void zoomIn(int index) {
        // pause as if forward() is being done at the same time it could cause the new zoomed image to get old pixels drawn
        pause();
        //zoom = userInputZoom
        zoomed = true;
        int imageWidth = (width/zoom)*zoom;
        int imageHeight = (height/zoom)*zoom;
        image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
        g = image.createGraphics();
        imageOffsetX = (width - imageWidth) / 2;
        imageOffsetY = (height - imageHeight) / 2;
        // these are the amount of cells displayed in the image
        int amountX = imageWidth/zoom;
        int amountY = imageHeight/zoom;
        //these are the bounds that contain inclusively all cells of the zoomed image
        //todo check if any of these go out of bounds and select correct values if they do
        zoomedImageStartX = index%width-amountX/2; // check x < 0
        zoomedImageStartY = index/width-amountY/2; // check Y < 0
        zoomedImageEndX = zoomedImageStartX + amountX -1; //check x > width-1
        zoomedImageEndY = zoomedImageStartY + amountY -1; //check y > height-1
        //draw live pixels in the area
        for (int x = zoomedImageStartX; x <= zoomedImageEndX; x++) {
            for (int y = zoomedImageStartY; y <= zoomedImageEndY; y++) {
                if (currentGrid[x+y*width] == 1) {
                    g.setColor(Color.BLACK);
                    g.fillRect((x-zoomedImageStartX)*zoom, (y-zoomedImageStartY)*zoom, zoom, zoom);
                }
            }
        }
    }
    
    private void zoomOut() {
        //create max size image for paenl dimension
        pause();
        zoomed = false;
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        imageOffsetX = 0;
        imageOffsetY = 0;
        for (int i = 0; i < size; i++) {
            if(currentGrid[i] == 1) {
                image.setRGB(i % width, i / width, black);
            }
        }
    }

}