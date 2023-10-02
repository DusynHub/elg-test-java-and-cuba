package com.company.elgtest.web.screens.request;

import com.haulmont.cuba.gui.screen.*;
import com.company.elgtest.entity.Request;

@UiController("elgtest_Request.browse")
@UiDescriptor("request-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class RequestBrowse extends MasterDetailScreen<Request> {
}