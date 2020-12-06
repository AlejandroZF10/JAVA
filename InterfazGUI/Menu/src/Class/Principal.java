package Class;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.Caret;

public class Principal extends javax.swing.JFrame {
    private String namefolder = "";
    private String namefile = "";
    private String pathfolder = ""; 
    private String cadenaTA = "";
    private String cadenaJL = "";
    
    public Principal() {
        initComponents();
        initProperties();
        this.setLocationRelativeTo(null);
    }
    
    private void initProperties(){
        titleLabel.setVisible(false);
        contentLabel.setVisible(false);
        openFileItem.setEnabled(false);
        newFileItem.setEnabled(false);
        closeFileItem.setEnabled(false);
        closeProjectItem.setEnabled(false);
        ButtonGroup group = new ButtonGroup();
        group.add(arialItem);
        group.add(calibriItem);
        group.add(consolaItem);
        group.add(timesItem);
        group.add(gothicItem);
    }
   
    private void readFile(File file){
        try{    
            String auxiliar;
            BufferedReader bufferedreader;
            try (FileReader filereader = new FileReader(file)) {
                bufferedreader = new BufferedReader(filereader);
                cadenaJL = "<html><body>";
                while((auxiliar = bufferedreader.readLine())!=null){
                    cadenaTA += auxiliar+"\n";
                    cadenaJL += auxiliar+"<br>";
                }   
                cadenaJL += "</body></html>";
            }
            bufferedreader.close();
        }catch(IOException except){
            JOptionPane.showMessageDialog(null,"File cannot be readed!");
            System.err.println(except.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewspacePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        contentLabel = new javax.swing.JLabel();
        workspacePanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBarMain = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newProjectItem = new javax.swing.JMenuItem();
        newFileItem = new javax.swing.JMenuItem();
        separatorFile1 = new javax.swing.JPopupMenu.Separator();
        openProjectItem = new javax.swing.JMenuItem();
        openFileItem = new javax.swing.JMenuItem();
        closeFileItem = new javax.swing.JMenuItem();
        closeProjectItem = new javax.swing.JMenuItem();
        separatorFile2 = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutItem = new javax.swing.JMenuItem();
        copyItem = new javax.swing.JMenuItem();
        pasteItem = new javax.swing.JMenuItem();
        refactorMenu = new javax.swing.JMenu();
        renameItem = new javax.swing.JMenuItem();
        fontMenu = new javax.swing.JMenu();
        arialItem = new javax.swing.JCheckBoxMenuItem();
        calibriItem = new javax.swing.JCheckBoxMenuItem();
        consolaItem = new javax.swing.JCheckBoxMenuItem();
        timesItem = new javax.swing.JCheckBoxMenuItem();
        gothicItem = new javax.swing.JCheckBoxMenuItem();
        deleteItem = new javax.swing.JMenuItem();
        runMenu = new javax.swing.JMenu();
        runItem = new javax.swing.JMenuItem();
        debugItem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();
        teamTool = new javax.swing.JMenu();
        addItem = new javax.swing.JMenuItem();
        commitItem = new javax.swing.JMenuItem();
        separatorTeam = new javax.swing.JPopupMenu.Separator();
        remoteMenu = new javax.swing.JMenu();
        cloneItem = new javax.swing.JMenuItem();
        pushItem = new javax.swing.JMenuItem();
        pullItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barra de menú");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewspacePanel.setBackground(new java.awt.Color(255, 255, 255));
        viewspacePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        titleLabel.setText("Nombre");
        viewspacePanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, -1));

        contentLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        contentLabel.setText("Contenido");
        contentLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        contentLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        viewspacePanel.add(contentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 420));

        getContentPane().add(viewspacePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        workspacePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textArea.setRows(5);
        scrollPane.setViewportView(textArea);

        workspacePanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        getContentPane().add(workspacePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 470));

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        newProjectItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        newProjectItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File/Project.png"))); // NOI18N
        newProjectItem.setText("New Project");
        newProjectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProjectItemActionPerformed(evt);
            }
        });
        fileMenu.add(newProjectItem);

        newFileItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        newFileItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File/File.png"))); // NOI18N
        newFileItem.setText("New File");
        newFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileItemActionPerformed(evt);
            }
        });
        fileMenu.add(newFileItem);
        fileMenu.add(separatorFile1);

        openProjectItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        openProjectItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File/OpenProject.png"))); // NOI18N
        openProjectItem.setText("Open Project");
        openProjectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectItemActionPerformed(evt);
            }
        });
        fileMenu.add(openProjectItem);

        openFileItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        openFileItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File/OpenFile.png"))); // NOI18N
        openFileItem.setText("Open File");
        openFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileItemActionPerformed(evt);
            }
        });
        fileMenu.add(openFileItem);

        closeFileItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        closeFileItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File/CloseFile.png"))); // NOI18N
        closeFileItem.setText("Close File");
        closeFileItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFileItemActionPerformed(evt);
            }
        });
        fileMenu.add(closeFileItem);

        closeProjectItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        closeProjectItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File/CloseFolder.png"))); // NOI18N
        closeProjectItem.setText("Close Project");
        closeProjectItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeProjectItemActionPerformed(evt);
            }
        });
        fileMenu.add(closeProjectItem);
        fileMenu.add(separatorFile2);

        exitItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        exitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/File/Exit.png"))); // NOI18N
        exitItem.setText("Salir");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitItem);

        menuBarMain.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        cutItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        cutItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit/Cut.png"))); // NOI18N
        cutItem.setText("Cut");
        cutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutItemActionPerformed(evt);
            }
        });
        editMenu.add(cutItem);

        copyItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        copyItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit/Copy.png"))); // NOI18N
        copyItem.setText("Copy");
        copyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyItemActionPerformed(evt);
            }
        });
        editMenu.add(copyItem);

        pasteItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        pasteItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit/Paste.png"))); // NOI18N
        pasteItem.setText("Paste");
        pasteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteItemActionPerformed(evt);
            }
        });
        editMenu.add(pasteItem);

        menuBarMain.add(editMenu);

        refactorMenu.setText("Refactor");
        refactorMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        renameItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        renameItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Refactor/Rename.png"))); // NOI18N
        renameItem.setText("Rename");
        renameItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameItemActionPerformed(evt);
            }
        });
        refactorMenu.add(renameItem);

        fontMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Refactor/Font.png"))); // NOI18N
        fontMenu.setText("Font");
        fontMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        arialItem.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        arialItem.setText("Arial");
        arialItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arialItemActionPerformed(evt);
            }
        });
        fontMenu.add(arialItem);

        calibriItem.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        calibriItem.setText("Calibri");
        calibriItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calibriItemActionPerformed(evt);
            }
        });
        fontMenu.add(calibriItem);

        consolaItem.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        consolaItem.setText("Consolas");
        consolaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consolaItemActionPerformed(evt);
            }
        });
        fontMenu.add(consolaItem);

        timesItem.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        timesItem.setText("Times New Roman");
        timesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesItemActionPerformed(evt);
            }
        });
        fontMenu.add(timesItem);

        gothicItem.setFont(new java.awt.Font("Yu Gothic", 0, 16)); // NOI18N
        gothicItem.setText("Yu Gothic");
        gothicItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gothicItemActionPerformed(evt);
            }
        });
        fontMenu.add(gothicItem);

        refactorMenu.add(fontMenu);

        deleteItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        deleteItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Refactor/Delete.png"))); // NOI18N
        deleteItem.setText("Delete");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        refactorMenu.add(deleteItem);

        menuBarMain.add(refactorMenu);

        runMenu.setText("Run");
        runMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        runItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        runItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Run/Run.png"))); // NOI18N
        runItem.setText("Run");
        runMenu.add(runItem);

        debugItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        debugItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Run/Debug.png"))); // NOI18N
        debugItem.setText("Debug");
        runMenu.add(debugItem);

        saveItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        saveItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Run/Save.png"))); // NOI18N
        saveItem.setText("Save");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        runMenu.add(saveItem);

        menuBarMain.add(runMenu);

        teamTool.setText("Team");
        teamTool.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        addItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Team/Add.png"))); // NOI18N
        addItem.setText("Add");
        teamTool.add(addItem);

        commitItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        commitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Team/Commit.png"))); // NOI18N
        commitItem.setText("Commit");
        teamTool.add(commitItem);
        teamTool.add(separatorTeam);

        remoteMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Team/Remote.png"))); // NOI18N
        remoteMenu.setText("Remote");
        remoteMenu.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        cloneItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        cloneItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Team/Clone.png"))); // NOI18N
        cloneItem.setText("Clone");
        remoteMenu.add(cloneItem);

        pushItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        pushItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Team/Upload.png"))); // NOI18N
        pushItem.setText("Push");
        remoteMenu.add(pushItem);

        pullItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        pullItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Team/Download.png"))); // NOI18N
        pullItem.setText("Pull");
        remoteMenu.add(pullItem);

        teamTool.add(remoteMenu);

        menuBarMain.add(teamTool);

        setJMenuBar(menuBarMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newProjectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProjectItemActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = filechooser.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File folder = filechooser.getSelectedFile();
            pathfolder = folder.getPath();
            namefolder = JOptionPane.showInputDialog("Enter the name of the folder!");
            pathfolder = pathfolder+"\\"+namefolder;
            File directorio = new File(pathfolder);
            if(!directorio.exists()){
                if(directorio.mkdirs()){
                    JOptionPane.showMessageDialog(null,"Folder created successfully!");
                    openFileItem.setEnabled(true);
                    newFileItem.setEnabled(true);
                    closeFileItem.setEnabled(true);
                    closeProjectItem.setEnabled(true);
                    titleLabel.setVisible(true);
                    titleLabel.setText("/"+namefolder);
                }else{
                    JOptionPane.showMessageDialog(null,"Folder cannot be created!");
                }
            }
        }              
    }//GEN-LAST:event_newProjectItemActionPerformed

    private void newFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileItemActionPerformed
        try{
            namefile = JOptionPane.showInputDialog("Enter the name of the file!");
            if(namefile != null){
                File archivo = new File (pathfolder+"\\"+namefile+".txt");
                archivo.createNewFile();
                JOptionPane.showMessageDialog(null,"File created successfully!");    
            }else{
                JOptionPane.showMessageDialog(null,"Introduce a name for file!");    
            }
        }catch(IOException except){
            JOptionPane.showMessageDialog(null,"File cannot be created!");
            System.err.println(except.getMessage());
        }
    }//GEN-LAST:event_newFileItemActionPerformed

    private void openProjectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectItemActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = filechooser.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File folder = filechooser.getSelectedFile();
            pathfolder = folder.getPath();
            namefolder = folder.getName();
            openFileItem.setEnabled(true);
            newFileItem.setEnabled(true);
            closeFileItem.setEnabled(true);
            closeProjectItem.setEnabled(true);
            titleLabel.setVisible(true);
            titleLabel.setText("/"+namefolder);
        }              
    }//GEN-LAST:event_openProjectItemActionPerformed

    private void openFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileItemActionPerformed
        JFileChooser filechooser = new JFileChooser(pathfolder);
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int seleccion = filechooser.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File file = filechooser.getSelectedFile();
            namefile = file.getName();
            titleLabel.setVisible(true);
            titleLabel.setText("/"+namefolder+"/"+namefile);
            contentLabel.setVisible(true);
            readFile(file);
            contentLabel.setText(cadenaJL);
            textArea.setText(cadenaTA);
        }
    }//GEN-LAST:event_openFileItemActionPerformed

    private void closeFileItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFileItemActionPerformed
        namefile = "";
        titleLabel.setText("/"+namefolder);
        contentLabel.setText("");
        textArea.setText("");
    }//GEN-LAST:event_closeFileItemActionPerformed

    private void closeProjectItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeProjectItemActionPerformed
        namefolder = pathfolder = namefile = "";
        titleLabel.setText("");
        contentLabel.setText("");
        textArea.setText("");
    }//GEN-LAST:event_closeProjectItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void cutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutItemActionPerformed
        Caret selection = textArea.getCaret();
        if(selection.getDot() != selection.getMark()){
            String textTotal = textArea.getText();
            String textSelected = textTotal.substring(selection.getMark(),selection.getDot());
            String textset = textTotal.replaceAll(textSelected,"");
            textArea.setText(textset);
        }
    }//GEN-LAST:event_cutItemActionPerformed

    private void copyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyItemActionPerformed
        Caret selection = textArea.getCaret();
        if(selection.getDot() != selection.getMark()){
            String textTotal = textArea.getText();
            String textoSelected = textTotal.substring(selection.getMark(),selection.getDot());
            StringSelection sselection = new StringSelection(textoSelected);
            Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
            board.setContents(sselection,null);
        }
    }//GEN-LAST:event_copyItemActionPerformed

    private void pasteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteItemActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transfer = board.getContents(null);
        if(transfer.isDataFlavorSupported(DataFlavor.stringFlavor)){
            try{
                Caret selection = textArea.getCaret();
                String textTotal = textArea.getText();
                String result = (String)transfer.getTransferData(DataFlavor.stringFlavor);
                String antes = textTotal.substring(0,selection.getMark());
                String despues = textTotal.substring(textArea.getCaretPosition(),textTotal.length());
                textArea.setText(antes+result+despues);
            }catch (UnsupportedFlavorException | IOException except){
                System.err.println(except.getMessage());
            }
        }
    }//GEN-LAST:event_pasteItemActionPerformed

    private void renameItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameItemActionPerformed
        String name = JOptionPane.showInputDialog("Introduce the new name for file")+".txt";
        File file = new File(pathfolder+"\\"+namefile);
        File renamefile = new File(pathfolder+"\\"+name);
        if(file.renameTo(renamefile)){
            namefile = name;
            JOptionPane.showMessageDialog(null,"File renamed successfully!");
            titleLabel.setText("/"+namefolder+"/"+name);
        }
        else
            JOptionPane.showMessageDialog(null,"Can't rename file!");
    }//GEN-LAST:event_renameItemActionPerformed

    private void arialItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arialItemActionPerformed
       titleLabel.setFont(new Font("Arial",Font.PLAIN,18));
       contentLabel.setFont(new Font("Arial",Font.PLAIN,14));
    }//GEN-LAST:event_arialItemActionPerformed

    private void calibriItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calibriItemActionPerformed
        titleLabel.setFont(new Font("Calibri",Font.PLAIN,18));
        contentLabel.setFont(new Font("Calibri",Font.PLAIN,14));
    }//GEN-LAST:event_calibriItemActionPerformed

    private void consolaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consolaItemActionPerformed
        titleLabel.setFont(new Font("Consolas",Font.PLAIN,18));
        contentLabel.setFont(new Font("Consolas",Font.PLAIN,14));
    }//GEN-LAST:event_consolaItemActionPerformed

    private void timesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesItemActionPerformed
        titleLabel.setFont(new Font("Times New Roman",Font.PLAIN,18));
        contentLabel.setFont(new Font("Times New Roman",Font.PLAIN,14));
    }//GEN-LAST:event_timesItemActionPerformed

    private void gothicItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gothicItemActionPerformed
        titleLabel.setFont(new Font("YU Gothic",Font.PLAIN,18));
        contentLabel.setFont(new Font("YU Gothic",Font.PLAIN,14));
    }//GEN-LAST:event_gothicItemActionPerformed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        File file = new File(pathfolder+"\\"+namefile); 
        if(file.delete())
            JOptionPane.showMessageDialog(null,"File deleted successfully!");
        else
            JOptionPane.showMessageDialog(null,"Can't delete file!");
    }//GEN-LAST:event_deleteItemActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        try{
            File archivo = new File(pathfolder+"\\"+namefile);
            BufferedWriter bufferedwriter;
            if(archivo.exists()){
                bufferedwriter = new BufferedWriter(new FileWriter(archivo));
                bufferedwriter.write(textArea.getText());
                bufferedwriter.close();
                readFile(archivo);
                contentLabel.setText(cadenaJL);
                textArea.setText("");
                textArea.setText(cadenaTA);
                JOptionPane.showMessageDialog(null,"File saved successfully!");
            }
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null,"Can't delete file!");
        }
    }//GEN-LAST:event_saveItemActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addItem;
    private javax.swing.JCheckBoxMenuItem arialItem;
    private javax.swing.JCheckBoxMenuItem calibriItem;
    private javax.swing.JMenuItem cloneItem;
    private javax.swing.JMenuItem closeFileItem;
    private javax.swing.JMenuItem closeProjectItem;
    private javax.swing.JMenuItem commitItem;
    private javax.swing.JCheckBoxMenuItem consolaItem;
    private javax.swing.JLabel contentLabel;
    private javax.swing.JMenuItem copyItem;
    private javax.swing.JMenuItem cutItem;
    private javax.swing.JMenuItem debugItem;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu fontMenu;
    private javax.swing.JCheckBoxMenuItem gothicItem;
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenuItem newFileItem;
    private javax.swing.JMenuItem newProjectItem;
    private javax.swing.JMenuItem openFileItem;
    private javax.swing.JMenuItem openProjectItem;
    private javax.swing.JMenuItem pasteItem;
    private javax.swing.JMenuItem pullItem;
    private javax.swing.JMenuItem pushItem;
    private javax.swing.JMenu refactorMenu;
    private javax.swing.JMenu remoteMenu;
    private javax.swing.JMenuItem renameItem;
    private javax.swing.JMenuItem runItem;
    private javax.swing.JMenu runMenu;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPopupMenu.Separator separatorFile1;
    private javax.swing.JPopupMenu.Separator separatorFile2;
    private javax.swing.JPopupMenu.Separator separatorTeam;
    private javax.swing.JMenu teamTool;
    private javax.swing.JTextArea textArea;
    private javax.swing.JCheckBoxMenuItem timesItem;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel viewspacePanel;
    private javax.swing.JPanel workspacePanel;
    // End of variables declaration//GEN-END:variables
}