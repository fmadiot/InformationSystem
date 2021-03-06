/*******************************************************************************
 *  Copyright (c) 2016 Obeo. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *******************************************************************************/
package org.obeonetwork.database.m2doc.services;

import java.util.ArrayList;
import java.util.List;

import org.obeonetwork.dsl.database.AbstractTable;
import org.obeonetwork.dsl.database.Table;
import org.obeonetwork.dsl.database.TableContainer;
import org.obeonetwork.dsl.database.View;

/**
 * AQL services for M2Doc on table containers.
 * 
 * @author Romain Guider
 */
public class TableContainerServices {

    /**
     * Returns the list of tables contained in the specified table container (database of schema)
     * 
     * @param container
     * @return the list of tables
     */
    public List<Table> tables(TableContainer container) {
        final List<Table> res = new ArrayList<Table>();
        for (AbstractTable abstractTable : container.getTables()) {
            if (abstractTable instanceof Table) {
                res.add((Table) abstractTable);
            }
        }

        return res;
    }

    /**
     * Returns the list of views contained in a table container (database or schema)
     * 
     * @param container
     * @return the list of views.
     */
    public List<View> views(TableContainer container) {
        final List<View> res = new ArrayList<View>();

        for (AbstractTable abstractTable : container.getTables()) {
            if (abstractTable instanceof View) {
                res.add((View) abstractTable);
            }
        }

        return res;
    }
}
