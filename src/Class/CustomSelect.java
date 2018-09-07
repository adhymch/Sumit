/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;

/**
 *
 * @author User
 */
public class CustomSelect extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".xml");
    }

    @Override
    public String getDescription() {
        return "XML documents (*.xml)";
    }
    
}
