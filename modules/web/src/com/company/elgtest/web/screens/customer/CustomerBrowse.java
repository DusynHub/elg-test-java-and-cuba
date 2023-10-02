package com.company.elgtest.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.elgtest.entity.Customer;

@UiController("elgtest_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CustomerBrowse extends MasterDetailScreen<Customer> {
}