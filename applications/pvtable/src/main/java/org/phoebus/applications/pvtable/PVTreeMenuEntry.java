/*******************************************************************************
 * Copyright (c) 2017 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.phoebus.applications.pvtable;

import org.phoebus.framework.spi.MenuEntry;
import org.phoebus.ui.docking.DockItem;
import org.phoebus.ui.docking.DockPane;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.TitledPane;

/**
 * Menu entry that starts probe
 * 
 * @author Kunal Shroff
 */
public class PVTreeMenuEntry implements MenuEntry {

    @Override
    public String getName() {
        return PVTableApplication.NAME;
    }

    /**
     * 
     * @return 
     */
    @Override
    public Void call() throws Exception {
        final PVTableApplication pv_table = new PVTableApplication();
        pv_table.start();
        return null;
    }

    @Override
    public String getMenuPath() {
        return "Display.Utility";
    }
}