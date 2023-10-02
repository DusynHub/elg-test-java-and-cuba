package com.company.elgtest.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.elgtest.entity.Supplier;

@UiController("elgtest_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class SupplierBrowse extends MasterDetailScreen<Supplier> {
}