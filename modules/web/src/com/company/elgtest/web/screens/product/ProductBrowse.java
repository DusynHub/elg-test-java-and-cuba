package com.company.elgtest.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.elgtest.entity.Product;

@UiController("elgtest_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ProductBrowse extends MasterDetailScreen<Product> {
}