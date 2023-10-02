package com.company.elgtest.web.screens.requestitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.elgtest.entity.RequestItem;

@UiController("elgtest_RequestItem.edit")
@UiDescriptor("request-item-edit.xml")
@EditedEntityContainer("requestItemDc")
@LoadDataBeforeShow
public class RequestItemEdit extends StandardEditor<RequestItem> {
}